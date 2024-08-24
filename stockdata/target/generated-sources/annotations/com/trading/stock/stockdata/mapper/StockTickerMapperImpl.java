package com.trading.stock.stockdata.mapper;

import com.trading.stock.model.StockOverview;
import com.trading.stock.stockdata.model.StockEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-24T11:27:39-0500",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class StockTickerMapperImpl implements StockTickerMapper {

    @Override
    public StockEntity sourceToDestination(StockOverview stockOverview) {
        if ( stockOverview == null ) {
            return null;
        }

        StockEntity stockEntity = new StockEntity();

        stockEntity.setDescription( checkLength( stockOverview.getDescription() ) );
        stockEntity.setSymbol( stockOverview.getSymbol() );
        stockEntity.setAssetType( stockOverview.getAssetType() );
        stockEntity.setName( stockOverview.getName() );
        stockEntity.setCik( stockOverview.getCik() );
        stockEntity.setExchange( stockOverview.getExchange() );
        stockEntity.setCurrency( stockOverview.getCurrency() );
        stockEntity.setCountry( stockOverview.getCountry() );
        stockEntity.setSector( stockOverview.getSector() );
        stockEntity.setIndustry( stockOverview.getIndustry() );
        stockEntity.setAddress( stockOverview.getAddress() );
        stockEntity.setOfficialSite( stockOverview.getOfficialSite() );
        stockEntity.setFiscalYearEnd( stockOverview.getFiscalYearEnd() );
        stockEntity.setLatestQuarter( stockOverview.getLatestQuarter() );
        stockEntity.setMarketCapitalization( stockOverview.getMarketCapitalization() );
        stockEntity.setEbitda( stockOverview.getEbitda() );
        stockEntity.setBookValue( stockOverview.getBookValue() );
        stockEntity.setDividendPerShare( stockOverview.getDividendPerShare() );
        stockEntity.setDividendYield( stockOverview.getDividendYield() );
        stockEntity.setEps( stockOverview.getEps() );
        stockEntity.setRevenuePerShareTTM( stockOverview.getRevenuePerShareTTM() );
        stockEntity.setProfitMargin( stockOverview.getProfitMargin() );
        stockEntity.setOperatingMarginTTM( stockOverview.getOperatingMarginTTM() );
        stockEntity.setReturnOnAssetsTTM( stockOverview.getReturnOnAssetsTTM() );
        stockEntity.setReturnOnEquityTTM( stockOverview.getReturnOnEquityTTM() );
        stockEntity.setRevenueTTM( stockOverview.getRevenueTTM() );
        stockEntity.setGrossProfitTTM( stockOverview.getGrossProfitTTM() );
        stockEntity.setDilutedEPSTTM( stockOverview.getDilutedEPSTTM() );
        stockEntity.setQuarterlyEarningsGrowthYOY( stockOverview.getQuarterlyEarningsGrowthYOY() );
        stockEntity.setQuarterlyRevenueGrowthYOY( stockOverview.getQuarterlyRevenueGrowthYOY() );
        stockEntity.setAnalystTargetPrice( stockOverview.getAnalystTargetPrice() );
        stockEntity.setAnalystRatingStrongBuy( stockOverview.getAnalystRatingStrongBuy() );
        stockEntity.setAnalystRatingBuy( stockOverview.getAnalystRatingBuy() );
        stockEntity.setAnalystRatingHold( stockOverview.getAnalystRatingHold() );
        stockEntity.setAnalystRatingSell( stockOverview.getAnalystRatingSell() );
        stockEntity.setAnalystRatingStrongSell( stockOverview.getAnalystRatingStrongSell() );
        stockEntity.setTrailingPE( stockOverview.getTrailingPE() );
        stockEntity.setForwardPE( stockOverview.getForwardPE() );
        stockEntity.setPriceToSalesRatioTTM( stockOverview.getPriceToSalesRatioTTM() );
        stockEntity.setPriceToBookRatio( stockOverview.getPriceToBookRatio() );
        stockEntity.setBeta( stockOverview.getBeta() );
        stockEntity.setSharesOutstanding( stockOverview.getSharesOutstanding() );
        stockEntity.setDividendDate( stockOverview.getDividendDate() );
        stockEntity.setExDividendDate( stockOverview.getExDividendDate() );

        return stockEntity;
    }

    @Override
    public StockOverview destinationToSource(StockEntity stockEntity) {
        if ( stockEntity == null ) {
            return null;
        }

        StockOverview stockOverview = new StockOverview();

        stockOverview.setSymbol( stockEntity.getSymbol() );
        stockOverview.setAssetType( stockEntity.getAssetType() );
        stockOverview.setName( stockEntity.getName() );
        stockOverview.setDescription( stockEntity.getDescription() );
        stockOverview.setCik( stockEntity.getCik() );
        stockOverview.setExchange( stockEntity.getExchange() );
        stockOverview.setCurrency( stockEntity.getCurrency() );
        stockOverview.setCountry( stockEntity.getCountry() );
        stockOverview.setSector( stockEntity.getSector() );
        stockOverview.setIndustry( stockEntity.getIndustry() );
        stockOverview.setAddress( stockEntity.getAddress() );
        stockOverview.setOfficialSite( stockEntity.getOfficialSite() );
        stockOverview.setFiscalYearEnd( stockEntity.getFiscalYearEnd() );
        stockOverview.setLatestQuarter( stockEntity.getLatestQuarter() );
        stockOverview.setMarketCapitalization( stockEntity.getMarketCapitalization() );
        stockOverview.setEbitda( stockEntity.getEbitda() );
        stockOverview.setBookValue( stockEntity.getBookValue() );
        stockOverview.setDividendPerShare( stockEntity.getDividendPerShare() );
        stockOverview.setDividendYield( stockEntity.getDividendYield() );
        stockOverview.setEps( stockEntity.getEps() );
        stockOverview.setRevenuePerShareTTM( stockEntity.getRevenuePerShareTTM() );
        stockOverview.setProfitMargin( stockEntity.getProfitMargin() );
        stockOverview.setOperatingMarginTTM( stockEntity.getOperatingMarginTTM() );
        stockOverview.setReturnOnAssetsTTM( stockEntity.getReturnOnAssetsTTM() );
        stockOverview.setReturnOnEquityTTM( stockEntity.getReturnOnEquityTTM() );
        stockOverview.setRevenueTTM( stockEntity.getRevenueTTM() );
        stockOverview.setGrossProfitTTM( stockEntity.getGrossProfitTTM() );
        stockOverview.setDilutedEPSTTM( stockEntity.getDilutedEPSTTM() );
        stockOverview.setQuarterlyEarningsGrowthYOY( stockEntity.getQuarterlyEarningsGrowthYOY() );
        stockOverview.setQuarterlyRevenueGrowthYOY( stockEntity.getQuarterlyRevenueGrowthYOY() );
        stockOverview.setAnalystTargetPrice( stockEntity.getAnalystTargetPrice() );
        stockOverview.setAnalystRatingStrongBuy( stockEntity.getAnalystRatingStrongBuy() );
        stockOverview.setAnalystRatingBuy( stockEntity.getAnalystRatingBuy() );
        stockOverview.setAnalystRatingHold( stockEntity.getAnalystRatingHold() );
        stockOverview.setAnalystRatingSell( stockEntity.getAnalystRatingSell() );
        stockOverview.setAnalystRatingStrongSell( stockEntity.getAnalystRatingStrongSell() );
        stockOverview.setTrailingPE( stockEntity.getTrailingPE() );
        stockOverview.setForwardPE( stockEntity.getForwardPE() );
        stockOverview.setPriceToSalesRatioTTM( stockEntity.getPriceToSalesRatioTTM() );
        stockOverview.setPriceToBookRatio( stockEntity.getPriceToBookRatio() );
        stockOverview.setBeta( stockEntity.getBeta() );
        stockOverview.setSharesOutstanding( stockEntity.getSharesOutstanding() );
        stockOverview.setDividendDate( stockEntity.getDividendDate() );
        stockOverview.setExDividendDate( stockEntity.getExDividendDate() );

        return stockOverview;
    }
}
