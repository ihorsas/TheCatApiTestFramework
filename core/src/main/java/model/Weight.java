package model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "imperial",
        "metric"
})
public class Weight {
    @JsonProperty("imperial")
    private String imperial;
    @JsonProperty("metric")
    private String metric;
    @JsonProperty("imperial")
    public String getImperial() {
        return imperial;
    }
    @JsonProperty("imperial")
    public void setImperial(String imperial) {
        this.imperial = imperial;
    }
    @JsonProperty("metric")
    public String getMetric() {
        return metric;
    }
    @JsonProperty("metric")
    public void setMetric(String metric) {
        this.metric = metric;
    }
}
