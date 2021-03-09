package model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name"
})
public class Category {
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private int name;

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }
    @JsonProperty("name")
    public int getName() {
        return name;
    }
    @JsonProperty("name")
    public void setName(int name) {
        this.name = name;
    }
}
