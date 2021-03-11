package model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "weight",
        "id",
        "name",
        "temperament",
        "origin",
        "country_codes",
        "country_code",
        "description",
        "life_span",
        "alt_names",
        "indoor",
        "hairless",
        "natural",
        "rare",
        "wikipedia_url",
        "hypoallergenic",
        "reference_image_id",
        "image"
})
public class Breed {
    @JsonProperty("weight")
    private Weight weight;
    @JsonProperty("image")
    private ImageShort image;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("temperament")
    private String temperament;
    @JsonProperty("origin")
    private String origin;
    @JsonProperty("country_codes")
    private String countryCodes;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("description")
    private String description;
    @JsonProperty("life_span")
    private String lifeSpan;
    @JsonProperty("alt_names")
    private String altNames;
    @JsonProperty("hairless")
    private int hairless;
    @JsonProperty("natural")
    private int natural;
    @JsonProperty("rare")
    private int rare;
    @JsonProperty("wikipedia_url")
    private String wikipediaUrl;
    @JsonProperty("hypoallergenic")
    private int hypoallergenic;
    @JsonProperty("reference_image_id")
    private String referenceImageId;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("weight")
    public Weight getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("temperament")
    public String getTemperament() {
        return temperament;
    }

    @JsonProperty("temperament")
    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @JsonProperty("country_codes")
    public String getCountryCodes() {
        return countryCodes;
    }

    @JsonProperty("country_codes")
    public void setCountryCodes(String countryCodes) {
        this.countryCodes = countryCodes;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("life_span")
    public String getLifeSpan() {
        return lifeSpan;
    }

    @JsonProperty("life_span")
    public void setLifeSpan(String lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    @JsonProperty("hairless")
    public int getHairless() {
        return hairless;
    }

    @JsonProperty("hairless")
    public void setHairless(int hairless) {
        this.hairless = hairless;
    }

    @JsonProperty("natural")
    public int getNatural() {
        return natural;
    }

    @JsonProperty("natural")
    public void setNatural(int natural) {
        this.natural = natural;
    }

    @JsonProperty("rare")
    public int getRare() {
        return rare;
    }

    @JsonProperty("rare")
    public void setRare(int rare) {
        this.rare = rare;
    }

    @JsonProperty("wikipedia_url")
    public String getWikipediaUrl() {
        return wikipediaUrl;
    }

    @JsonProperty("wikipedia_url")
    public void setWikipediaUrl(String wikipediaUrl) {
        this.wikipediaUrl = wikipediaUrl;
    }

    @JsonProperty("hypoallergenic")
    public int getHypoallergenic() {
        return hypoallergenic;
    }

    @JsonProperty("hypoallergenic")
    public void setHypoallergenic(int hypoallergenic) {
        this.hypoallergenic = hypoallergenic;
    }

    public ImageShort getImage() {
        return image;
    }

    public void setImage(ImageShort image) {
        this.image = image;
    }

    public String getAltNames() {
        return altNames;
    }

    public void setAltNames(String altNames) {
        this.altNames = altNames;
    }

    @JsonProperty("reference_image_id")
    public String getReferenceImageId() {
        return referenceImageId;
    }

    @JsonProperty("reference_image_id")
    public void setReferenceImageId(String referenceImageId) {
        this.referenceImageId = referenceImageId;
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
        return "Breed{" +
                "weight=" + weight +
                ", image=" + image +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", temperament='" + temperament + '\'' +
                ", origin='" + origin + '\'' +
                ", country_codes='" + countryCodes + '\'' +
                ", country_code='" + countryCode + '\'' +
                ", description='" + description + '\'' +
                ", life_span='" + lifeSpan + '\'' +
                ", hairless=" + hairless +
                ", natural=" + natural +
                ", rare=" + rare +
                ", wikipedia_url='" + wikipediaUrl + '\'' +
                ", hypoallergenic=" + hypoallergenic +
                ", reference_image_id='" + referenceImageId + '\'' +
                '}';
    }
}
