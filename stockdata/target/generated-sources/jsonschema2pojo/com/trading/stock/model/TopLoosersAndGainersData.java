
package com.trading.stock.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Generated schema for Root
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "last_updated",
    "top_gainers",
    "top_losers",
    "most_actively_traded"
})
@Generated("jsonschema2pojo")
public class TopLoosersAndGainersData {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("metadata")
    private String metadata;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("last_updated")
    private String lastUpdated;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("top_gainers")
    private List<TopGainer> topGainers = new ArrayList<TopGainer>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("top_losers")
    private List<TopLoser> topLosers = new ArrayList<TopLoser>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("most_actively_traded")
    private List<MostActivelyTraded> mostActivelyTraded = new ArrayList<MostActivelyTraded>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("metadata")
    public String getMetadata() {
        return metadata;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("last_updated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("last_updated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("top_gainers")
    public List<TopGainer> getTopGainers() {
        return topGainers;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("top_gainers")
    public void setTopGainers(List<TopGainer> topGainers) {
        this.topGainers = topGainers;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("top_losers")
    public List<TopLoser> getTopLosers() {
        return topLosers;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("top_losers")
    public void setTopLosers(List<TopLoser> topLosers) {
        this.topLosers = topLosers;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("most_actively_traded")
    public List<MostActivelyTraded> getMostActivelyTraded() {
        return mostActivelyTraded;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("most_actively_traded")
    public void setMostActivelyTraded(List<MostActivelyTraded> mostActivelyTraded) {
        this.mostActivelyTraded = mostActivelyTraded;
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
        sb.append(TopLoosersAndGainersData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("lastUpdated");
        sb.append('=');
        sb.append(((this.lastUpdated == null)?"<null>":this.lastUpdated));
        sb.append(',');
        sb.append("topGainers");
        sb.append('=');
        sb.append(((this.topGainers == null)?"<null>":this.topGainers));
        sb.append(',');
        sb.append("topLosers");
        sb.append('=');
        sb.append(((this.topLosers == null)?"<null>":this.topLosers));
        sb.append(',');
        sb.append("mostActivelyTraded");
        sb.append('=');
        sb.append(((this.mostActivelyTraded == null)?"<null>":this.mostActivelyTraded));
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
        result = ((result* 31)+((this.topGainers == null)? 0 :this.topGainers.hashCode()));
        result = ((result* 31)+((this.lastUpdated == null)? 0 :this.lastUpdated.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.mostActivelyTraded == null)? 0 :this.mostActivelyTraded.hashCode()));
        result = ((result* 31)+((this.topLosers == null)? 0 :this.topLosers.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TopLoosersAndGainersData) == false) {
            return false;
        }
        TopLoosersAndGainersData rhs = ((TopLoosersAndGainersData) other);
        return (((((((this.topGainers == rhs.topGainers)||((this.topGainers!= null)&&this.topGainers.equals(rhs.topGainers)))&&((this.lastUpdated == rhs.lastUpdated)||((this.lastUpdated!= null)&&this.lastUpdated.equals(rhs.lastUpdated))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.mostActivelyTraded == rhs.mostActivelyTraded)||((this.mostActivelyTraded!= null)&&this.mostActivelyTraded.equals(rhs.mostActivelyTraded))))&&((this.topLosers == rhs.topLosers)||((this.topLosers!= null)&&this.topLosers.equals(rhs.topLosers))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
