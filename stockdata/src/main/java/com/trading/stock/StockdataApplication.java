package com.trading.stock;

import com.trading.stock.model.StockOverview;
import com.trading.stock.stockdata.mapper.StockTickerMapper;
import com.trading.stock.stockdata.mapper.StockTickerMapperImpl;
import com.trading.stock.stockdata.model.StockEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
public class StockdataApplication {

	public static void main(String[] args) {

		SpringApplication.run(StockdataApplication.class, args);
	}
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}



}
