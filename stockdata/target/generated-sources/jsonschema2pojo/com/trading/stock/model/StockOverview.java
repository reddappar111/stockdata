
package com.trading.stock.model;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Symbol",
    "AssetType",
    "Name",
    "Description",
    "CIK",
    "Exchange",
    "Currency",
    "Country",
    "Sector",
    "Industry",
    "Address",
    "OfficialSite",
    "FiscalYearEnd",
    "LatestQuarter",
    "MarketCapitalization",
    "EBITDA",
    "PERatio",
    "PEGRatio",
    "BookValue",
    "DividendPerShare",
    "DividendYield",
    "EPS",
    "RevenuePerShareTTM",
    "ProfitMargin",
    "OperatingMarginTTM",
    "ReturnOnAssetsTTM",
    "ReturnOnEquityTTM",
    "RevenueTTM",
    "GrossProfitTTM",
    "DilutedEPSTTM",
    "QuarterlyEarningsGrowthYOY",
    "QuarterlyRevenueGrowthYOY",
    "AnalystTargetPrice",
    "AnalystRatingStrongBuy",
    "AnalystRatingBuy",
    "AnalystRatingHold",
    "AnalystRatingSell",
    "AnalystRatingStrongSell",
    "TrailingPE",
    "ForwardPE",
    "PriceToSalesRatioTTM",
    "PriceToBookRatio",
    "EVToRevenue",
    "EVToEBITDA",
    "Beta",
    "52WeekHigh",
    "52WeekLow",
    "50DayMovingAverage",
    "200DayMovingAverage",
    "SharesOutstanding",
    "DividendDate",
    "ExDividendDate"
})
@Generated("jsonschema2pojo")
public class StockOverview {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Symbol")
    private String symbol;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AssetType")
    private String assetType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Description")
    private String description;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("CIK")
    private String cik;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Exchange")
    private String exchange;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Currency")
    private String currency;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Country")
    private String country;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Sector")
    private String sector;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Industry")
    private String industry;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Address")
    private String address;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("OfficialSite")
    private String officialSite;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("FiscalYearEnd")
    private String fiscalYearEnd;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("LatestQuarter")
    private String latestQuarter;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("MarketCapitalization")
    private String marketCapitalization;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("EBITDA")
    private String ebitda;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("PERatio")
    private String pERatio;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("PEGRatio")
    private String pEGRatio;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("BookValue")
    private String bookValue;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("DividendPerShare")
    private String dividendPerShare;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("DividendYield")
    private String dividendYield;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("EPS")
    private String eps;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("RevenuePerShareTTM")
    private String revenuePerShareTTM;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ProfitMargin")
    private String profitMargin;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("OperatingMarginTTM")
    private String operatingMarginTTM;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ReturnOnAssetsTTM")
    private String returnOnAssetsTTM;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ReturnOnEquityTTM")
    private String returnOnEquityTTM;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("RevenueTTM")
    private String revenueTTM;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("GrossProfitTTM")
    private String grossProfitTTM;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("DilutedEPSTTM")
    private String dilutedEPSTTM;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("QuarterlyEarningsGrowthYOY")
    private String quarterlyEarningsGrowthYOY;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("QuarterlyRevenueGrowthYOY")
    private String quarterlyRevenueGrowthYOY;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AnalystTargetPrice")
    private String analystTargetPrice;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AnalystRatingStrongBuy")
    private String analystRatingStrongBuy;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AnalystRatingBuy")
    private String analystRatingBuy;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AnalystRatingHold")
    private String analystRatingHold;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AnalystRatingSell")
    private String analystRatingSell;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AnalystRatingStrongSell")
    private String analystRatingStrongSell;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("TrailingPE")
    private String trailingPE;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ForwardPE")
    private String forwardPE;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("PriceToSalesRatioTTM")
    private String priceToSalesRatioTTM;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("PriceToBookRatio")
    private String priceToBookRatio;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("EVToRevenue")
    private String eVToRevenue;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("EVToEBITDA")
    private String eVToEBITDA;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Beta")
    private String beta;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("52WeekHigh")
    private String _52WeekHigh;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("52WeekLow")
    private String _52WeekLow;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("50DayMovingAverage")
    private String _50DayMovingAverage;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("200DayMovingAverage")
    private String _200DayMovingAverage;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("SharesOutstanding")
    private String sharesOutstanding;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("DividendDate")
    private String dividendDate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ExDividendDate")
    private String exDividendDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Symbol")
    public String getSymbol() {
        return symbol;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AssetType")
    public String getAssetType() {
        return assetType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AssetType")
    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("CIK")
    public String getCik() {
        return cik;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("CIK")
    public void setCik(String cik) {
        this.cik = cik;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Exchange")
    public String getExchange() {
        return exchange;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Exchange")
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Sector")
    public String getSector() {
        return sector;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Sector")
    public void setSector(String sector) {
        this.sector = sector;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Industry")
    public String getIndustry() {
        return industry;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Industry")
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Address")
    public String getAddress() {
        return address;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("OfficialSite")
    public String getOfficialSite() {
        return officialSite;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("OfficialSite")
    public void setOfficialSite(String officialSite) {
        this.officialSite = officialSite;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("FiscalYearEnd")
    public String getFiscalYearEnd() {
        return fiscalYearEnd;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("FiscalYearEnd")
    public void setFiscalYearEnd(String fiscalYearEnd) {
        this.fiscalYearEnd = fiscalYearEnd;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("LatestQuarter")
    public String getLatestQuarter() {
        return latestQuarter;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("LatestQuarter")
    public void setLatestQuarter(String latestQuarter) {
        this.latestQuarter = latestQuarter;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("MarketCapitalization")
    public String getMarketCapitalization() {
        return marketCapitalization;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("MarketCapitalization")
    public void setMarketCapitalization(String marketCapitalization) {
        this.marketCapitalization = marketCapitalization;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("EBITDA")
    public String getEbitda() {
        return ebitda;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("EBITDA")
    public void setEbitda(String ebitda) {
        this.ebitda = ebitda;
    }

    @JsonProperty("PERatio")
    public String getPERatio() {
        return pERatio;
    }

    @JsonProperty("PERatio")
    public void setPERatio(String pERatio) {
        this.pERatio = pERatio;
    }

    @JsonProperty("PEGRatio")
    public String getPEGRatio() {
        return pEGRatio;
    }

    @JsonProperty("PEGRatio")
    public void setPEGRatio(String pEGRatio) {
        this.pEGRatio = pEGRatio;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("BookValue")
    public String getBookValue() {
        return bookValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("BookValue")
    public void setBookValue(String bookValue) {
        this.bookValue = bookValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("DividendPerShare")
    public String getDividendPerShare() {
        return dividendPerShare;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("DividendPerShare")
    public void setDividendPerShare(String dividendPerShare) {
        this.dividendPerShare = dividendPerShare;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("DividendYield")
    public String getDividendYield() {
        return dividendYield;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("DividendYield")
    public void setDividendYield(String dividendYield) {
        this.dividendYield = dividendYield;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("EPS")
    public String getEps() {
        return eps;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("EPS")
    public void setEps(String eps) {
        this.eps = eps;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("RevenuePerShareTTM")
    public String getRevenuePerShareTTM() {
        return revenuePerShareTTM;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("RevenuePerShareTTM")
    public void setRevenuePerShareTTM(String revenuePerShareTTM) {
        this.revenuePerShareTTM = revenuePerShareTTM;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ProfitMargin")
    public String getProfitMargin() {
        return profitMargin;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ProfitMargin")
    public void setProfitMargin(String profitMargin) {
        this.profitMargin = profitMargin;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("OperatingMarginTTM")
    public String getOperatingMarginTTM() {
        return operatingMarginTTM;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("OperatingMarginTTM")
    public void setOperatingMarginTTM(String operatingMarginTTM) {
        this.operatingMarginTTM = operatingMarginTTM;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ReturnOnAssetsTTM")
    public String getReturnOnAssetsTTM() {
        return returnOnAssetsTTM;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ReturnOnAssetsTTM")
    public void setReturnOnAssetsTTM(String returnOnAssetsTTM) {
        this.returnOnAssetsTTM = returnOnAssetsTTM;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ReturnOnEquityTTM")
    public String getReturnOnEquityTTM() {
        return returnOnEquityTTM;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ReturnOnEquityTTM")
    public void setReturnOnEquityTTM(String returnOnEquityTTM) {
        this.returnOnEquityTTM = returnOnEquityTTM;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("RevenueTTM")
    public String getRevenueTTM() {
        return revenueTTM;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("RevenueTTM")
    public void setRevenueTTM(String revenueTTM) {
        this.revenueTTM = revenueTTM;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("GrossProfitTTM")
    public String getGrossProfitTTM() {
        return grossProfitTTM;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("GrossProfitTTM")
    public void setGrossProfitTTM(String grossProfitTTM) {
        this.grossProfitTTM = grossProfitTTM;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("DilutedEPSTTM")
    public String getDilutedEPSTTM() {
        return dilutedEPSTTM;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("DilutedEPSTTM")
    public void setDilutedEPSTTM(String dilutedEPSTTM) {
        this.dilutedEPSTTM = dilutedEPSTTM;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("QuarterlyEarningsGrowthYOY")
    public String getQuarterlyEarningsGrowthYOY() {
        return quarterlyEarningsGrowthYOY;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("QuarterlyEarningsGrowthYOY")
    public void setQuarterlyEarningsGrowthYOY(String quarterlyEarningsGrowthYOY) {
        this.quarterlyEarningsGrowthYOY = quarterlyEarningsGrowthYOY;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("QuarterlyRevenueGrowthYOY")
    public String getQuarterlyRevenueGrowthYOY() {
        return quarterlyRevenueGrowthYOY;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("QuarterlyRevenueGrowthYOY")
    public void setQuarterlyRevenueGrowthYOY(String quarterlyRevenueGrowthYOY) {
        this.quarterlyRevenueGrowthYOY = quarterlyRevenueGrowthYOY;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AnalystTargetPrice")
    public String getAnalystTargetPrice() {
        return analystTargetPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AnalystTargetPrice")
    public void setAnalystTargetPrice(String analystTargetPrice) {
        this.analystTargetPrice = analystTargetPrice;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AnalystRatingStrongBuy")
    public String getAnalystRatingStrongBuy() {
        return analystRatingStrongBuy;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AnalystRatingStrongBuy")
    public void setAnalystRatingStrongBuy(String analystRatingStrongBuy) {
        this.analystRatingStrongBuy = analystRatingStrongBuy;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AnalystRatingBuy")
    public String getAnalystRatingBuy() {
        return analystRatingBuy;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AnalystRatingBuy")
    public void setAnalystRatingBuy(String analystRatingBuy) {
        this.analystRatingBuy = analystRatingBuy;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AnalystRatingHold")
    public String getAnalystRatingHold() {
        return analystRatingHold;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AnalystRatingHold")
    public void setAnalystRatingHold(String analystRatingHold) {
        this.analystRatingHold = analystRatingHold;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AnalystRatingSell")
    public String getAnalystRatingSell() {
        return analystRatingSell;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AnalystRatingSell")
    public void setAnalystRatingSell(String analystRatingSell) {
        this.analystRatingSell = analystRatingSell;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AnalystRatingStrongSell")
    public String getAnalystRatingStrongSell() {
        return analystRatingStrongSell;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("AnalystRatingStrongSell")
    public void setAnalystRatingStrongSell(String analystRatingStrongSell) {
        this.analystRatingStrongSell = analystRatingStrongSell;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("TrailingPE")
    public String getTrailingPE() {
        return trailingPE;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("TrailingPE")
    public void setTrailingPE(String trailingPE) {
        this.trailingPE = trailingPE;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ForwardPE")
    public String getForwardPE() {
        return forwardPE;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ForwardPE")
    public void setForwardPE(String forwardPE) {
        this.forwardPE = forwardPE;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("PriceToSalesRatioTTM")
    public String getPriceToSalesRatioTTM() {
        return priceToSalesRatioTTM;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("PriceToSalesRatioTTM")
    public void setPriceToSalesRatioTTM(String priceToSalesRatioTTM) {
        this.priceToSalesRatioTTM = priceToSalesRatioTTM;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("PriceToBookRatio")
    public String getPriceToBookRatio() {
        return priceToBookRatio;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("PriceToBookRatio")
    public void setPriceToBookRatio(String priceToBookRatio) {
        this.priceToBookRatio = priceToBookRatio;
    }

    @JsonProperty("EVToRevenue")
    public String getEVToRevenue() {
        return eVToRevenue;
    }

    @JsonProperty("EVToRevenue")
    public void setEVToRevenue(String eVToRevenue) {
        this.eVToRevenue = eVToRevenue;
    }

    @JsonProperty("EVToEBITDA")
    public String getEVToEBITDA() {
        return eVToEBITDA;
    }

    @JsonProperty("EVToEBITDA")
    public void setEVToEBITDA(String eVToEBITDA) {
        this.eVToEBITDA = eVToEBITDA;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Beta")
    public String getBeta() {
        return beta;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Beta")
    public void setBeta(String beta) {
        this.beta = beta;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("52WeekHigh")
    public String get52WeekHigh() {
        return _52WeekHigh;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("52WeekHigh")
    public void set52WeekHigh(String _52WeekHigh) {
        this._52WeekHigh = _52WeekHigh;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("52WeekLow")
    public String get52WeekLow() {
        return _52WeekLow;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("52WeekLow")
    public void set52WeekLow(String _52WeekLow) {
        this._52WeekLow = _52WeekLow;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("50DayMovingAverage")
    public String get50DayMovingAverage() {
        return _50DayMovingAverage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("50DayMovingAverage")
    public void set50DayMovingAverage(String _50DayMovingAverage) {
        this._50DayMovingAverage = _50DayMovingAverage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("200DayMovingAverage")
    public String get200DayMovingAverage() {
        return _200DayMovingAverage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("200DayMovingAverage")
    public void set200DayMovingAverage(String _200DayMovingAverage) {
        this._200DayMovingAverage = _200DayMovingAverage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("SharesOutstanding")
    public String getSharesOutstanding() {
        return sharesOutstanding;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("SharesOutstanding")
    public void setSharesOutstanding(String sharesOutstanding) {
        this.sharesOutstanding = sharesOutstanding;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("DividendDate")
    public String getDividendDate() {
        return dividendDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("DividendDate")
    public void setDividendDate(String dividendDate) {
        this.dividendDate = dividendDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ExDividendDate")
    public String getExDividendDate() {
        return exDividendDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ExDividendDate")
    public void setExDividendDate(String exDividendDate) {
        this.exDividendDate = exDividendDate;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StockOverview.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("assetType");
        sb.append('=');
        sb.append(((this.assetType == null)?"<null>":this.assetType));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("cik");
        sb.append('=');
        sb.append(((this.cik == null)?"<null>":this.cik));
        sb.append(',');
        sb.append("exchange");
        sb.append('=');
        sb.append(((this.exchange == null)?"<null>":this.exchange));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("sector");
        sb.append('=');
        sb.append(((this.sector == null)?"<null>":this.sector));
        sb.append(',');
        sb.append("industry");
        sb.append('=');
        sb.append(((this.industry == null)?"<null>":this.industry));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("officialSite");
        sb.append('=');
        sb.append(((this.officialSite == null)?"<null>":this.officialSite));
        sb.append(',');
        sb.append("fiscalYearEnd");
        sb.append('=');
        sb.append(((this.fiscalYearEnd == null)?"<null>":this.fiscalYearEnd));
        sb.append(',');
        sb.append("latestQuarter");
        sb.append('=');
        sb.append(((this.latestQuarter == null)?"<null>":this.latestQuarter));
        sb.append(',');
        sb.append("marketCapitalization");
        sb.append('=');
        sb.append(((this.marketCapitalization == null)?"<null>":this.marketCapitalization));
        sb.append(',');
        sb.append("ebitda");
        sb.append('=');
        sb.append(((this.ebitda == null)?"<null>":this.ebitda));
        sb.append(',');
        sb.append("pERatio");
        sb.append('=');
        sb.append(((this.pERatio == null)?"<null>":this.pERatio));
        sb.append(',');
        sb.append("pEGRatio");
        sb.append('=');
        sb.append(((this.pEGRatio == null)?"<null>":this.pEGRatio));
        sb.append(',');
        sb.append("bookValue");
        sb.append('=');
        sb.append(((this.bookValue == null)?"<null>":this.bookValue));
        sb.append(',');
        sb.append("dividendPerShare");
        sb.append('=');
        sb.append(((this.dividendPerShare == null)?"<null>":this.dividendPerShare));
        sb.append(',');
        sb.append("dividendYield");
        sb.append('=');
        sb.append(((this.dividendYield == null)?"<null>":this.dividendYield));
        sb.append(',');
        sb.append("eps");
        sb.append('=');
        sb.append(((this.eps == null)?"<null>":this.eps));
        sb.append(',');
        sb.append("revenuePerShareTTM");
        sb.append('=');
        sb.append(((this.revenuePerShareTTM == null)?"<null>":this.revenuePerShareTTM));
        sb.append(',');
        sb.append("profitMargin");
        sb.append('=');
        sb.append(((this.profitMargin == null)?"<null>":this.profitMargin));
        sb.append(',');
        sb.append("operatingMarginTTM");
        sb.append('=');
        sb.append(((this.operatingMarginTTM == null)?"<null>":this.operatingMarginTTM));
        sb.append(',');
        sb.append("returnOnAssetsTTM");
        sb.append('=');
        sb.append(((this.returnOnAssetsTTM == null)?"<null>":this.returnOnAssetsTTM));
        sb.append(',');
        sb.append("returnOnEquityTTM");
        sb.append('=');
        sb.append(((this.returnOnEquityTTM == null)?"<null>":this.returnOnEquityTTM));
        sb.append(',');
        sb.append("revenueTTM");
        sb.append('=');
        sb.append(((this.revenueTTM == null)?"<null>":this.revenueTTM));
        sb.append(',');
        sb.append("grossProfitTTM");
        sb.append('=');
        sb.append(((this.grossProfitTTM == null)?"<null>":this.grossProfitTTM));
        sb.append(',');
        sb.append("dilutedEPSTTM");
        sb.append('=');
        sb.append(((this.dilutedEPSTTM == null)?"<null>":this.dilutedEPSTTM));
        sb.append(',');
        sb.append("quarterlyEarningsGrowthYOY");
        sb.append('=');
        sb.append(((this.quarterlyEarningsGrowthYOY == null)?"<null>":this.quarterlyEarningsGrowthYOY));
        sb.append(',');
        sb.append("quarterlyRevenueGrowthYOY");
        sb.append('=');
        sb.append(((this.quarterlyRevenueGrowthYOY == null)?"<null>":this.quarterlyRevenueGrowthYOY));
        sb.append(',');
        sb.append("analystTargetPrice");
        sb.append('=');
        sb.append(((this.analystTargetPrice == null)?"<null>":this.analystTargetPrice));
        sb.append(',');
        sb.append("analystRatingStrongBuy");
        sb.append('=');
        sb.append(((this.analystRatingStrongBuy == null)?"<null>":this.analystRatingStrongBuy));
        sb.append(',');
        sb.append("analystRatingBuy");
        sb.append('=');
        sb.append(((this.analystRatingBuy == null)?"<null>":this.analystRatingBuy));
        sb.append(',');
        sb.append("analystRatingHold");
        sb.append('=');
        sb.append(((this.analystRatingHold == null)?"<null>":this.analystRatingHold));
        sb.append(',');
        sb.append("analystRatingSell");
        sb.append('=');
        sb.append(((this.analystRatingSell == null)?"<null>":this.analystRatingSell));
        sb.append(',');
        sb.append("analystRatingStrongSell");
        sb.append('=');
        sb.append(((this.analystRatingStrongSell == null)?"<null>":this.analystRatingStrongSell));
        sb.append(',');
        sb.append("trailingPE");
        sb.append('=');
        sb.append(((this.trailingPE == null)?"<null>":this.trailingPE));
        sb.append(',');
        sb.append("forwardPE");
        sb.append('=');
        sb.append(((this.forwardPE == null)?"<null>":this.forwardPE));
        sb.append(',');
        sb.append("priceToSalesRatioTTM");
        sb.append('=');
        sb.append(((this.priceToSalesRatioTTM == null)?"<null>":this.priceToSalesRatioTTM));
        sb.append(',');
        sb.append("priceToBookRatio");
        sb.append('=');
        sb.append(((this.priceToBookRatio == null)?"<null>":this.priceToBookRatio));
        sb.append(',');
        sb.append("eVToRevenue");
        sb.append('=');
        sb.append(((this.eVToRevenue == null)?"<null>":this.eVToRevenue));
        sb.append(',');
        sb.append("eVToEBITDA");
        sb.append('=');
        sb.append(((this.eVToEBITDA == null)?"<null>":this.eVToEBITDA));
        sb.append(',');
        sb.append("beta");
        sb.append('=');
        sb.append(((this.beta == null)?"<null>":this.beta));
        sb.append(',');
        sb.append("_52WeekHigh");
        sb.append('=');
        sb.append(((this._52WeekHigh == null)?"<null>":this._52WeekHigh));
        sb.append(',');
        sb.append("_52WeekLow");
        sb.append('=');
        sb.append(((this._52WeekLow == null)?"<null>":this._52WeekLow));
        sb.append(',');
        sb.append("_50DayMovingAverage");
        sb.append('=');
        sb.append(((this._50DayMovingAverage == null)?"<null>":this._50DayMovingAverage));
        sb.append(',');
        sb.append("_200DayMovingAverage");
        sb.append('=');
        sb.append(((this._200DayMovingAverage == null)?"<null>":this._200DayMovingAverage));
        sb.append(',');
        sb.append("sharesOutstanding");
        sb.append('=');
        sb.append(((this.sharesOutstanding == null)?"<null>":this.sharesOutstanding));
        sb.append(',');
        sb.append("dividendDate");
        sb.append('=');
        sb.append(((this.dividendDate == null)?"<null>":this.dividendDate));
        sb.append(',');
        sb.append("exDividendDate");
        sb.append('=');
        sb.append(((this.exDividendDate == null)?"<null>":this.exDividendDate));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this._50DayMovingAverage == null)? 0 :this._50DayMovingAverage.hashCode()));
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.dividendDate == null)? 0 :this.dividendDate.hashCode()));
        result = ((result* 31)+((this.dividendPerShare == null)? 0 :this.dividendPerShare.hashCode()));
        result = ((result* 31)+((this.operatingMarginTTM == null)? 0 :this.operatingMarginTTM.hashCode()));
        result = ((result* 31)+((this._200DayMovingAverage == null)? 0 :this._200DayMovingAverage.hashCode()));
        result = ((result* 31)+((this.dividendYield == null)? 0 :this.dividendYield.hashCode()));
        result = ((result* 31)+((this.analystRatingBuy == null)? 0 :this.analystRatingBuy.hashCode()));
        result = ((result* 31)+((this.analystRatingHold == null)? 0 :this.analystRatingHold.hashCode()));
        result = ((result* 31)+((this.revenueTTM == null)? 0 :this.revenueTTM.hashCode()));
        result = ((result* 31)+((this.quarterlyEarningsGrowthYOY == null)? 0 :this.quarterlyEarningsGrowthYOY.hashCode()));
        result = ((result* 31)+((this.sector == null)? 0 :this.sector.hashCode()));
        result = ((result* 31)+((this.pERatio == null)? 0 :this.pERatio.hashCode()));
        result = ((result* 31)+((this.bookValue == null)? 0 :this.bookValue.hashCode()));
        result = ((result* 31)+((this.marketCapitalization == null)? 0 :this.marketCapitalization.hashCode()));
        result = ((result* 31)+((this.latestQuarter == null)? 0 :this.latestQuarter.hashCode()));
        result = ((result* 31)+((this.dilutedEPSTTM == null)? 0 :this.dilutedEPSTTM.hashCode()));
        result = ((result* 31)+((this.eps == null)? 0 :this.eps.hashCode()));
        result = ((result* 31)+((this.assetType == null)? 0 :this.assetType.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this._52WeekHigh == null)? 0 :this._52WeekHigh.hashCode()));
        result = ((result* 31)+((this.exchange == null)? 0 :this.exchange.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.analystRatingSell == null)? 0 :this.analystRatingSell.hashCode()));
        result = ((result* 31)+((this.eVToEBITDA == null)? 0 :this.eVToEBITDA.hashCode()));
        result = ((result* 31)+((this.analystRatingStrongSell == null)? 0 :this.analystRatingStrongSell.hashCode()));
        result = ((result* 31)+((this.cik == null)? 0 :this.cik.hashCode()));
        result = ((result* 31)+((this.analystTargetPrice == null)? 0 :this.analystTargetPrice.hashCode()));
        result = ((result* 31)+((this.analystRatingStrongBuy == null)? 0 :this.analystRatingStrongBuy.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.industry == null)? 0 :this.industry.hashCode()));
        result = ((result* 31)+((this.returnOnAssetsTTM == null)? 0 :this.returnOnAssetsTTM.hashCode()));
        result = ((result* 31)+((this.officialSite == null)? 0 :this.officialSite.hashCode()));
        result = ((result* 31)+((this.fiscalYearEnd == null)? 0 :this.fiscalYearEnd.hashCode()));
        result = ((result* 31)+((this.eVToRevenue == null)? 0 :this.eVToRevenue.hashCode()));
        result = ((result* 31)+((this.trailingPE == null)? 0 :this.trailingPE.hashCode()));
        result = ((result* 31)+((this.returnOnEquityTTM == null)? 0 :this.returnOnEquityTTM.hashCode()));
        result = ((result* 31)+((this.profitMargin == null)? 0 :this.profitMargin.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.priceToBookRatio == null)? 0 :this.priceToBookRatio.hashCode()));
        result = ((result* 31)+((this._52WeekLow == null)? 0 :this._52WeekLow.hashCode()));
        result = ((result* 31)+((this.sharesOutstanding == null)? 0 :this.sharesOutstanding.hashCode()));
        result = ((result* 31)+((this.beta == null)? 0 :this.beta.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.exDividendDate == null)? 0 :this.exDividendDate.hashCode()));
        result = ((result* 31)+((this.ebitda == null)? 0 :this.ebitda.hashCode()));
        result = ((result* 31)+((this.pEGRatio == null)? 0 :this.pEGRatio.hashCode()));
        result = ((result* 31)+((this.revenuePerShareTTM == null)? 0 :this.revenuePerShareTTM.hashCode()));
        result = ((result* 31)+((this.forwardPE == null)? 0 :this.forwardPE.hashCode()));
        result = ((result* 31)+((this.quarterlyRevenueGrowthYOY == null)? 0 :this.quarterlyRevenueGrowthYOY.hashCode()));
        result = ((result* 31)+((this.grossProfitTTM == null)? 0 :this.grossProfitTTM.hashCode()));
        result = ((result* 31)+((this.priceToSalesRatioTTM == null)? 0 :this.priceToSalesRatioTTM.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StockOverview) == false) {
            return false;
        }
        StockOverview rhs = ((StockOverview) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((this._50DayMovingAverage == rhs._50DayMovingAverage)||((this._50DayMovingAverage!= null)&&this._50DayMovingAverage.equals(rhs._50DayMovingAverage)))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country))))&&((this.dividendDate == rhs.dividendDate)||((this.dividendDate!= null)&&this.dividendDate.equals(rhs.dividendDate))))&&((this.dividendPerShare == rhs.dividendPerShare)||((this.dividendPerShare!= null)&&this.dividendPerShare.equals(rhs.dividendPerShare))))&&((this.operatingMarginTTM == rhs.operatingMarginTTM)||((this.operatingMarginTTM!= null)&&this.operatingMarginTTM.equals(rhs.operatingMarginTTM))))&&((this._200DayMovingAverage == rhs._200DayMovingAverage)||((this._200DayMovingAverage!= null)&&this._200DayMovingAverage.equals(rhs._200DayMovingAverage))))&&((this.dividendYield == rhs.dividendYield)||((this.dividendYield!= null)&&this.dividendYield.equals(rhs.dividendYield))))&&((this.analystRatingBuy == rhs.analystRatingBuy)||((this.analystRatingBuy!= null)&&this.analystRatingBuy.equals(rhs.analystRatingBuy))))&&((this.analystRatingHold == rhs.analystRatingHold)||((this.analystRatingHold!= null)&&this.analystRatingHold.equals(rhs.analystRatingHold))))&&((this.revenueTTM == rhs.revenueTTM)||((this.revenueTTM!= null)&&this.revenueTTM.equals(rhs.revenueTTM))))&&((this.quarterlyEarningsGrowthYOY == rhs.quarterlyEarningsGrowthYOY)||((this.quarterlyEarningsGrowthYOY!= null)&&this.quarterlyEarningsGrowthYOY.equals(rhs.quarterlyEarningsGrowthYOY))))&&((this.sector == rhs.sector)||((this.sector!= null)&&this.sector.equals(rhs.sector))))&&((this.pERatio == rhs.pERatio)||((this.pERatio!= null)&&this.pERatio.equals(rhs.pERatio))))&&((this.bookValue == rhs.bookValue)||((this.bookValue!= null)&&this.bookValue.equals(rhs.bookValue))))&&((this.marketCapitalization == rhs.marketCapitalization)||((this.marketCapitalization!= null)&&this.marketCapitalization.equals(rhs.marketCapitalization))))&&((this.latestQuarter == rhs.latestQuarter)||((this.latestQuarter!= null)&&this.latestQuarter.equals(rhs.latestQuarter))))&&((this.dilutedEPSTTM == rhs.dilutedEPSTTM)||((this.dilutedEPSTTM!= null)&&this.dilutedEPSTTM.equals(rhs.dilutedEPSTTM))))&&((this.eps == rhs.eps)||((this.eps!= null)&&this.eps.equals(rhs.eps))))&&((this.assetType == rhs.assetType)||((this.assetType!= null)&&this.assetType.equals(rhs.assetType))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this._52WeekHigh == rhs._52WeekHigh)||((this._52WeekHigh!= null)&&this._52WeekHigh.equals(rhs._52WeekHigh))))&&((this.exchange == rhs.exchange)||((this.exchange!= null)&&this.exchange.equals(rhs.exchange))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.analystRatingSell == rhs.analystRatingSell)||((this.analystRatingSell!= null)&&this.analystRatingSell.equals(rhs.analystRatingSell))))&&((this.eVToEBITDA == rhs.eVToEBITDA)||((this.eVToEBITDA!= null)&&this.eVToEBITDA.equals(rhs.eVToEBITDA))))&&((this.analystRatingStrongSell == rhs.analystRatingStrongSell)||((this.analystRatingStrongSell!= null)&&this.analystRatingStrongSell.equals(rhs.analystRatingStrongSell))))&&((this.cik == rhs.cik)||((this.cik!= null)&&this.cik.equals(rhs.cik))))&&((this.analystTargetPrice == rhs.analystTargetPrice)||((this.analystTargetPrice!= null)&&this.analystTargetPrice.equals(rhs.analystTargetPrice))))&&((this.analystRatingStrongBuy == rhs.analystRatingStrongBuy)||((this.analystRatingStrongBuy!= null)&&this.analystRatingStrongBuy.equals(rhs.analystRatingStrongBuy))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.industry == rhs.industry)||((this.industry!= null)&&this.industry.equals(rhs.industry))))&&((this.returnOnAssetsTTM == rhs.returnOnAssetsTTM)||((this.returnOnAssetsTTM!= null)&&this.returnOnAssetsTTM.equals(rhs.returnOnAssetsTTM))))&&((this.officialSite == rhs.officialSite)||((this.officialSite!= null)&&this.officialSite.equals(rhs.officialSite))))&&((this.fiscalYearEnd == rhs.fiscalYearEnd)||((this.fiscalYearEnd!= null)&&this.fiscalYearEnd.equals(rhs.fiscalYearEnd))))&&((this.eVToRevenue == rhs.eVToRevenue)||((this.eVToRevenue!= null)&&this.eVToRevenue.equals(rhs.eVToRevenue))))&&((this.trailingPE == rhs.trailingPE)||((this.trailingPE!= null)&&this.trailingPE.equals(rhs.trailingPE))))&&((this.returnOnEquityTTM == rhs.returnOnEquityTTM)||((this.returnOnEquityTTM!= null)&&this.returnOnEquityTTM.equals(rhs.returnOnEquityTTM))))&&((this.profitMargin == rhs.profitMargin)||((this.profitMargin!= null)&&this.profitMargin.equals(rhs.profitMargin))))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this.priceToBookRatio == rhs.priceToBookRatio)||((this.priceToBookRatio!= null)&&this.priceToBookRatio.equals(rhs.priceToBookRatio))))&&((this._52WeekLow == rhs._52WeekLow)||((this._52WeekLow!= null)&&this._52WeekLow.equals(rhs._52WeekLow))))&&((this.sharesOutstanding == rhs.sharesOutstanding)||((this.sharesOutstanding!= null)&&this.sharesOutstanding.equals(rhs.sharesOutstanding))))&&((this.beta == rhs.beta)||((this.beta!= null)&&this.beta.equals(rhs.beta))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.exDividendDate == rhs.exDividendDate)||((this.exDividendDate!= null)&&this.exDividendDate.equals(rhs.exDividendDate))))&&((this.ebitda == rhs.ebitda)||((this.ebitda!= null)&&this.ebitda.equals(rhs.ebitda))))&&((this.pEGRatio == rhs.pEGRatio)||((this.pEGRatio!= null)&&this.pEGRatio.equals(rhs.pEGRatio))))&&((this.revenuePerShareTTM == rhs.revenuePerShareTTM)||((this.revenuePerShareTTM!= null)&&this.revenuePerShareTTM.equals(rhs.revenuePerShareTTM))))&&((this.forwardPE == rhs.forwardPE)||((this.forwardPE!= null)&&this.forwardPE.equals(rhs.forwardPE))))&&((this.quarterlyRevenueGrowthYOY == rhs.quarterlyRevenueGrowthYOY)||((this.quarterlyRevenueGrowthYOY!= null)&&this.quarterlyRevenueGrowthYOY.equals(rhs.quarterlyRevenueGrowthYOY))))&&((this.grossProfitTTM == rhs.grossProfitTTM)||((this.grossProfitTTM!= null)&&this.grossProfitTTM.equals(rhs.grossProfitTTM))))&&((this.priceToSalesRatioTTM == rhs.priceToSalesRatioTTM)||((this.priceToSalesRatioTTM!= null)&&this.priceToSalesRatioTTM.equals(rhs.priceToSalesRatioTTM))));
    }

}
