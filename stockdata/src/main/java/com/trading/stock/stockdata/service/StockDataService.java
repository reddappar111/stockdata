package com.trading.stock.stockdata.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.trading.stock.model.MostActivelyTraded;
import com.trading.stock.model.StockOverview;
import com.trading.stock.model.TopLoosersAndGainersData;
import com.trading.stock.stockdata.mapper.StockTickerMapper;
import com.trading.stock.stockdata.model.StockEntity;
import com.trading.stock.stockdata.repositary.StockEntityRepositary;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StockDataService {
    @Autowired
    StockTickerMapper stockTickerMapper;
    @Autowired
    StockEntityRepositary stockEntityRepositary;

    @PostConstruct
    public void init(){
        getStockData();
    }
    public void getStockData()  {
        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.getForEntity("https://www.alphavantage.co/query?function=TOP_GAINERS_LOSERS&apikey=demo", String.class);
            ObjectMapper topLoosergainerMapper = new ObjectMapper();
            TopLoosersAndGainersData topLoosersAndGainersData = topLoosergainerMapper.readValue(response.getBody(),TopLoosersAndGainersData.class);
            List<MostActivelyTraded> activivelyTraded = topLoosersAndGainersData.getMostActivelyTraded();
            for (MostActivelyTraded mostActivelyTraded : activivelyTraded) {
                System.out.println(mostActivelyTraded.getTicker());
                    ResponseEntity<String> fundementals = restTemplate.getForEntity("https://www.alphavantage.co/query?function=OVERVIEW&symbol=" + mostActivelyTraded.getTicker() + "&apikey=demo", String.class);
                    if(!fundementals.getBody().contains("Information")) {
                        ObjectMapper mapper = new ObjectMapper();
                        StockOverview stockOverview = mapper.readValue(fundementals.getBody(), StockOverview.class);
                        String responseString = fundementals.getBody().toString();
                        JsonNode jsonNode = mapper.readTree(responseString);
                        StockEntity stockEntity = stockTickerMapper.sourceToDestination(stockOverview);
                        Optional.ofNullable(jsonNode.get("52WeekHigh").asText()).ifPresent(_52weekHigh -> stockEntity.set_52WeekHigh(_52weekHigh));
                        Optional.ofNullable(jsonNode.get("52WeekLow").asText()).ifPresent(_52WeekLow -> stockEntity.set_52WeekLow(_52WeekLow));
                        Optional.ofNullable(jsonNode.get("50DayMovingAverage").asText()).ifPresent(_50DayMovingAverage -> stockEntity.set_50DayMovingAverage(_50DayMovingAverage));
                        Optional.ofNullable(jsonNode.get("200DayMovingAverage").asText()).ifPresent(_200DayMovingAverage -> stockEntity.set_200DayMovingAverage(_200DayMovingAverage));
                        Optional.ofNullable(jsonNode.get("PERatio").asText()).ifPresent(peRatio -> stockEntity.setpERatio(peRatio));
                        Optional.ofNullable(jsonNode.get("PEGRatio").asText()).ifPresent(peGRatio -> stockEntity.setpEGRatio(peGRatio));
                        Optional.ofNullable(jsonNode.get("EVToRevenue").asText()).ifPresent(evToRevenue -> stockEntity.seteVToRevenue(evToRevenue));
                        Optional.ofNullable(jsonNode.get("EVToEBITDA").asText()).ifPresent(evToEBITDA -> stockEntity.seteVToEBITDA(evToEBITDA));
                        stockEntityRepositary.save(stockEntity);
                        System.out.println(stockEntity.getSymbol() + " - Data Saved or updated to DB sucessfully.");
                    }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
