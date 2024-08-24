
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
    "ticker",
    "price",
    "change_amount",
    "change_percentage",
    "volume"
})
@Generated("jsonschema2pojo")
public class MostActivelyTraded {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ticker")
    private String ticker;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("price")
    private String price;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("change_amount")
    private String changeAmount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("change_percentage")
    private String changePercentage;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("volume")
    private String volume;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ticker")
    public String getTicker() {
        return ticker;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ticker")
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("change_amount")
    public String getChangeAmount() {
        return changeAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("change_amount")
    public void setChangeAmount(String changeAmount) {
        this.changeAmount = changeAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("change_percentage")
    public String getChangePercentage() {
        return changePercentage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("change_percentage")
    public void setChangePercentage(String changePercentage) {
        this.changePercentage = changePercentage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("volume")
    public String getVolume() {
        return volume;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("volume")
    public void setVolume(String volume) {
        this.volume = volume;
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
        sb.append(MostActivelyTraded.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ticker");
        sb.append('=');
        sb.append(((this.ticker == null)?"<null>":this.ticker));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("changeAmount");
        sb.append('=');
        sb.append(((this.changeAmount == null)?"<null>":this.changeAmount));
        sb.append(',');
        sb.append("changePercentage");
        sb.append('=');
        sb.append(((this.changePercentage == null)?"<null>":this.changePercentage));
        sb.append(',');
        sb.append("volume");
        sb.append('=');
        sb.append(((this.volume == null)?"<null>":this.volume));
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
        result = ((result* 31)+((this.volume == null)? 0 :this.volume.hashCode()));
        result = ((result* 31)+((this.ticker == null)? 0 :this.ticker.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.changeAmount == null)? 0 :this.changeAmount.hashCode()));
        result = ((result* 31)+((this.changePercentage == null)? 0 :this.changePercentage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MostActivelyTraded) == false) {
            return false;
        }
        MostActivelyTraded rhs = ((MostActivelyTraded) other);
        return (((((((this.volume == rhs.volume)||((this.volume!= null)&&this.volume.equals(rhs.volume)))&&((this.ticker == rhs.ticker)||((this.ticker!= null)&&this.ticker.equals(rhs.ticker))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.changeAmount == rhs.changeAmount)||((this.changeAmount!= null)&&this.changeAmount.equals(rhs.changeAmount))))&&((this.changePercentage == rhs.changePercentage)||((this.changePercentage!= null)&&this.changePercentage.equals(rhs.changePercentage))));
    }

}
