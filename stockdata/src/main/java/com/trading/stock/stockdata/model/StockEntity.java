package com.trading.stock.stockdata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stock_entity")
public class StockEntity {
    @Id
    private String symbol;

    private String assetType;

    private String name;

    private String description;

    private String cik;

    private String exchange;

    private String currency;

    private String country;

    private String sector;

    private String industry;

    private String address;

    private String officialSite;

    private String fiscalYearEnd;

    private String latestQuarter;

    private String marketCapitalization;

    private String ebitda;

    private String pERatio;

    private String pEGRatio;

    private String bookValue;

    private String dividendPerShare;

    private String dividendYield;

    private String eps;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCik() {
        return cik;
    }

    public void setCik(String cik) {
        this.cik = cik;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOfficialSite() {
        return officialSite;
    }

    public void setOfficialSite(String officialSite) {
        this.officialSite = officialSite;
    }

    public String getFiscalYearEnd() {
        return fiscalYearEnd;
    }

    public void setFiscalYearEnd(String fiscalYearEnd) {
        this.fiscalYearEnd = fiscalYearEnd;
    }

    public String getLatestQuarter() {
        return latestQuarter;
    }

    public void setLatestQuarter(String latestQuarter) {
        this.latestQuarter = latestQuarter;
    }

    public String getMarketCapitalization() {
        return marketCapitalization;
    }

    public void setMarketCapitalization(String marketCapitalization) {
        this.marketCapitalization = marketCapitalization;
    }

    public String getEbitda() {
        return ebitda;
    }

    public void setEbitda(String ebitda) {
        this.ebitda = ebitda;
    }

    public String getpERatio() {
        return pERatio;
    }

    public void setpERatio(String pERatio) {
        this.pERatio = pERatio;
    }

    public String getpEGRatio() {
        return pEGRatio;
    }

    public void setpEGRatio(String pEGRatio) {
        this.pEGRatio = pEGRatio;
    }

    public String getBookValue() {
        return bookValue;
    }

    public void setBookValue(String bookValue) {
        this.bookValue = bookValue;
    }

    public String getDividendPerShare() {
        return dividendPerShare;
    }

    public void setDividendPerShare(String dividendPerShare) {
        this.dividendPerShare = dividendPerShare;
    }

    public String getDividendYield() {
        return dividendYield;
    }

    public void setDividendYield(String dividendYield) {
        this.dividendYield = dividendYield;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getRevenuePerShareTTM() {
        return revenuePerShareTTM;
    }

    public void setRevenuePerShareTTM(String revenuePerShareTTM) {
        this.revenuePerShareTTM = revenuePerShareTTM;
    }

    public String getProfitMargin() {
        return profitMargin;
    }

    public void setProfitMargin(String profitMargin) {
        this.profitMargin = profitMargin;
    }

    public String getOperatingMarginTTM() {
        return operatingMarginTTM;
    }

    public void setOperatingMarginTTM(String operatingMarginTTM) {
        this.operatingMarginTTM = operatingMarginTTM;
    }

    public String getReturnOnAssetsTTM() {
        return returnOnAssetsTTM;
    }

    public void setReturnOnAssetsTTM(String returnOnAssetsTTM) {
        this.returnOnAssetsTTM = returnOnAssetsTTM;
    }

    public String getReturnOnEquityTTM() {
        return returnOnEquityTTM;
    }

    public void setReturnOnEquityTTM(String returnOnEquityTTM) {
        this.returnOnEquityTTM = returnOnEquityTTM;
    }

    public String getRevenueTTM() {
        return revenueTTM;
    }

    public void setRevenueTTM(String revenueTTM) {
        this.revenueTTM = revenueTTM;
    }

    public String getGrossProfitTTM() {
        return grossProfitTTM;
    }

    public void setGrossProfitTTM(String grossProfitTTM) {
        this.grossProfitTTM = grossProfitTTM;
    }

    public String getDilutedEPSTTM() {
        return dilutedEPSTTM;
    }

    public void setDilutedEPSTTM(String dilutedEPSTTM) {
        this.dilutedEPSTTM = dilutedEPSTTM;
    }

    public String getQuarterlyEarningsGrowthYOY() {
        return quarterlyEarningsGrowthYOY;
    }

    public void setQuarterlyEarningsGrowthYOY(String quarterlyEarningsGrowthYOY) {
        this.quarterlyEarningsGrowthYOY = quarterlyEarningsGrowthYOY;
    }

    public String getQuarterlyRevenueGrowthYOY() {
        return quarterlyRevenueGrowthYOY;
    }

    public void setQuarterlyRevenueGrowthYOY(String quarterlyRevenueGrowthYOY) {
        this.quarterlyRevenueGrowthYOY = quarterlyRevenueGrowthYOY;
    }

    public String getAnalystTargetPrice() {
        return analystTargetPrice;
    }

    public void setAnalystTargetPrice(String analystTargetPrice) {
        this.analystTargetPrice = analystTargetPrice;
    }

    public String getAnalystRatingStrongBuy() {
        return analystRatingStrongBuy;
    }

    public void setAnalystRatingStrongBuy(String analystRatingStrongBuy) {
        this.analystRatingStrongBuy = analystRatingStrongBuy;
    }

    public String getAnalystRatingBuy() {
        return analystRatingBuy;
    }

    public void setAnalystRatingBuy(String analystRatingBuy) {
        this.analystRatingBuy = analystRatingBuy;
    }

    public String getAnalystRatingHold() {
        return analystRatingHold;
    }

    public void setAnalystRatingHold(String analystRatingHold) {
        this.analystRatingHold = analystRatingHold;
    }

    public String getAnalystRatingSell() {
        return analystRatingSell;
    }

    public void setAnalystRatingSell(String analystRatingSell) {
        this.analystRatingSell = analystRatingSell;
    }

    public String getAnalystRatingStrongSell() {
        return analystRatingStrongSell;
    }

    public void setAnalystRatingStrongSell(String analystRatingStrongSell) {
        this.analystRatingStrongSell = analystRatingStrongSell;
    }

    public String getTrailingPE() {
        return trailingPE;
    }

    public void setTrailingPE(String trailingPE) {
        this.trailingPE = trailingPE;
    }

    public String getForwardPE() {
        return forwardPE;
    }

    public void setForwardPE(String forwardPE) {
        this.forwardPE = forwardPE;
    }

    public String getPriceToSalesRatioTTM() {
        return priceToSalesRatioTTM;
    }

    public void setPriceToSalesRatioTTM(String priceToSalesRatioTTM) {
        this.priceToSalesRatioTTM = priceToSalesRatioTTM;
    }

    public String getPriceToBookRatio() {
        return priceToBookRatio;
    }

    public void setPriceToBookRatio(String priceToBookRatio) {
        this.priceToBookRatio = priceToBookRatio;
    }

    public String geteVToRevenue() {
        return eVToRevenue;
    }

    public void seteVToRevenue(String eVToRevenue) {
        this.eVToRevenue = eVToRevenue;
    }

    public String geteVToEBITDA() {
        return eVToEBITDA;
    }

    public void seteVToEBITDA(String eVToEBITDA) {
        this.eVToEBITDA = eVToEBITDA;
    }

    public String getBeta() {
        return beta;
    }

    public void setBeta(String beta) {
        this.beta = beta;
    }

    public String get_52WeekHigh() {
        return _52WeekHigh;
    }

    public void set_52WeekHigh(String _52WeekHigh) {
        this._52WeekHigh = _52WeekHigh;
    }

    public String get_52WeekLow() {
        return _52WeekLow;
    }

    public void set_52WeekLow(String _52WeekLow) {
        this._52WeekLow = _52WeekLow;
    }

    public String get_50DayMovingAverage() {
        return _50DayMovingAverage;
    }

    public void set_50DayMovingAverage(String _50DayMovingAverage) {
        this._50DayMovingAverage = _50DayMovingAverage;
    }

    public String get_200DayMovingAverage() {
        return _200DayMovingAverage;
    }

    public void set_200DayMovingAverage(String _200DayMovingAverage) {
        this._200DayMovingAverage = _200DayMovingAverage;
    }

    public String getSharesOutstanding() {
        return sharesOutstanding;
    }

    public void setSharesOutstanding(String sharesOutstanding) {
        this.sharesOutstanding = sharesOutstanding;
    }

    public String getDividendDate() {
        return dividendDate;
    }

    public void setDividendDate(String dividendDate) {
        this.dividendDate = dividendDate;
    }

    public String getExDividendDate() {
        return exDividendDate;
    }

    public void setExDividendDate(String exDividendDate) {
        this.exDividendDate = exDividendDate;
    }

    private String revenuePerShareTTM;

    private String profitMargin;

    private String operatingMarginTTM;

    private String returnOnAssetsTTM;

    private String returnOnEquityTTM;

    private String revenueTTM;

    private String grossProfitTTM;

    private String dilutedEPSTTM;

    private String quarterlyEarningsGrowthYOY;

    private String quarterlyRevenueGrowthYOY;

    private String analystTargetPrice;

    private String analystRatingStrongBuy;

    private String analystRatingBuy;

    private String analystRatingHold;

    private String analystRatingSell;

    private String analystRatingStrongSell;

    private String trailingPE;

    private String forwardPE;

    private String priceToSalesRatioTTM;

    private String priceToBookRatio;

    private String eVToRevenue;

    private String eVToEBITDA;

    private String beta;

    private String _52WeekHigh;

    private String _52WeekLow;

    private String _50DayMovingAverage;

    private String _200DayMovingAverage;

    private String sharesOutstanding;

    private String dividendDate;

    private String exDividendDate;
}