package model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "weight",
        "id",
        "name",
        "cfa_url",
        "vetstreet_url",
        "vcahospitals_url",
        "temperament",
        "origin",
        "country_codes",
        "country_code",
        "description",
        "life_span",
        "indoor",
        "alt_names",
        "adaptability",
        "affection_level",
        "child_friendly",
        "dog_friendly",
        "energy_level",
        "grooming",
        "health_issues",
        "intelligence",
        "shedding_level",
        "social_needs",
        "stranger_friendly",
        "vocalisation",
        "experimental",
        "hairless",
        "natural",
        "rare",
        "rex",
        "suppressed_tail",
        "short_legs",
        "wikipedia_url",
        "hypoallergenic",
        "reference_image_id"
})
public class Breed {
    @JsonProperty("weight")
    private Weight weight;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("cfa_url")
    private String cfa_url;
    @JsonProperty("vetstreet_url")
    private String vetstreet_url;
    @JsonProperty("vcahospitals_url")
    private String vcahospitals_url;
    @JsonProperty("temperament")
    private String temperament;
    @JsonProperty("origin")
    private String origin;
    @JsonProperty("country_codes")
    private String country_codes;
    @JsonProperty("country_code")
    private String country_code;
    @JsonProperty("description")
    private String description;
    @JsonProperty("life_span")
    private String life_span;
    @JsonProperty("indoor")
    private int indoor;
    @JsonProperty("alt_names")
    private String alt_names;
    @JsonProperty("adaptability")
    private int adaptability;
    @JsonProperty("affection_level")
    private int affection_level;
    @JsonProperty("child_friendly")
    private int child_friendly;
    @JsonProperty("dog_friendly")
    private int dog_friendly;
    @JsonProperty("energy_level")
    private int energy_level;
    @JsonProperty("grooming")
    private int grooming;
    @JsonProperty("health_issues")
    private int health_issues;
    @JsonProperty("intelligence")
    private int intelligence;
    @JsonProperty("shedding_level")
    private int shedding_level;
    @JsonProperty("social_needs")
    private int social_needs;
    @JsonProperty("stranger_friendly")
    private int stranger_friendly;
    @JsonProperty("vocalisation")
    private int vocalisation;
    @JsonProperty("experimental")
    private int experimental;
    @JsonProperty("hairless")
    private int hairless;
    @JsonProperty("natural")
    private int natural;
    @JsonProperty("rare")
    private int rare;
    @JsonProperty("rex")
    private int rex;
    @JsonProperty("suppressed_tail")
    private int suppressed_tail;
    @JsonProperty("short_legs")
    private int short_legs;
    @JsonProperty("wikipedia_url")
    private String wikipedia_url;
    @JsonProperty("hypoallergenic")
    private int hypoallergenic;
    @JsonProperty("reference_image_id")
    private String reference_image_id;

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

    @JsonProperty("cfa_url")
    public String getCfa_url() {
        return cfa_url;
    }

    @JsonProperty("cfa_url")
    public void setCfa_url(String cfa_url) {
        this.cfa_url = cfa_url;
    }

    @JsonProperty("vetstreet_url")
    public String getVetstreet_url() {
        return vetstreet_url;
    }

    @JsonProperty("vetstreet_url")
    public void setVetstreet_url(String vetstreet_url) {
        this.vetstreet_url = vetstreet_url;
    }

    @JsonProperty("vcahospitals_url")
    public String getVcahospitals_url() {
        return vcahospitals_url;
    }

    @JsonProperty("vcahospitals_url")
    public void setVcahospitals_url(String vcahospitals_url) {
        this.vcahospitals_url = vcahospitals_url;
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
    public String getCountry_codes() {
        return country_codes;
    }

    @JsonProperty("country_codes")
    public void setCountry_codes(String country_codes) {
        this.country_codes = country_codes;
    }

    @JsonProperty("country_code")
    public String getCountry_code() {
        return country_code;
    }

    @JsonProperty("country_code")
    public void setCountry_code(String country_code) {
        this.country_code = country_code;
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
    public String getLife_span() {
        return life_span;
    }

    @JsonProperty("life_span")
    public void setLife_span(String life_span) {
        this.life_span = life_span;
    }

    @JsonProperty("indoor")
    public int getIndoor() {
        return indoor;
    }

    @JsonProperty("indoor")
    public void setIndoor(int indoor) {
        this.indoor = indoor;
    }

    @JsonProperty("alt_names")
    public String getAlt_names() {
        return alt_names;
    }

    @JsonProperty("alt_names")
    public void setAlt_names(String alt_names) {
        this.alt_names = alt_names;
    }

    @JsonProperty("adaptability")
    public int getAdaptability() {
        return adaptability;
    }

    @JsonProperty("adaptability")
    public void setAdaptability(int adaptability) {
        this.adaptability = adaptability;
    }

    @JsonProperty("affection_level")
    public int getAffection_level() {
        return affection_level;
    }

    @JsonProperty("affection_level")
    public void setAffection_level(int affection_level) {
        this.affection_level = affection_level;
    }

    @JsonProperty("child_friendly")
    public int getChild_friendly() {
        return child_friendly;
    }

    @JsonProperty("child_friendly")
    public void setChild_friendly(int child_friendly) {
        this.child_friendly = child_friendly;
    }

    @JsonProperty("dog_friendly")
    public int getDog_friendly() {
        return dog_friendly;
    }

    @JsonProperty("dog_friendly")
    public void setDog_friendly(int dog_friendly) {
        this.dog_friendly = dog_friendly;
    }

    @JsonProperty("energy_level")
    public int getEnergy_level() {
        return energy_level;
    }

    @JsonProperty("energy_level")
    public void setEnergy_level(int energy_level) {
        this.energy_level = energy_level;
    }

    @JsonProperty("grooming")
    public int getGrooming() {
        return grooming;
    }

    @JsonProperty("grooming")
    public void setGrooming(int grooming) {
        this.grooming = grooming;
    }

    @JsonProperty("health_issues")
    public int getHealth_issues() {
        return health_issues;
    }

    @JsonProperty("health_issues")
    public void setHealth_issues(int health_issues) {
        this.health_issues = health_issues;
    }

    @JsonProperty("intelligence")
    public int getIntelligence() {
        return intelligence;
    }

    @JsonProperty("intelligence")
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @JsonProperty("shedding_level")
    public int getShedding_level() {
        return shedding_level;
    }

    @JsonProperty("shedding_level")
    public void setShedding_level(int shedding_level) {
        this.shedding_level = shedding_level;
    }

    @JsonProperty("social_needs")
    public int getSocial_needs() {
        return social_needs;
    }

    @JsonProperty("social_needs")
    public void setSocial_needs(int social_needs) {
        this.social_needs = social_needs;
    }

    @JsonProperty("stranger_friendly")
    public int getStranger_friendly() {
        return stranger_friendly;
    }

    @JsonProperty("stranger_friendly")
    public void setStranger_friendly(int stranger_friendly) {
        this.stranger_friendly = stranger_friendly;
    }

    @JsonProperty("vocalisation")
    public int getVocalisation() {
        return vocalisation;
    }

    @JsonProperty("vocalisation")
    public void setVocalisation(int vocalisation) {
        this.vocalisation = vocalisation;
    }

    @JsonProperty("experimental")
    public int getExperimental() {
        return experimental;
    }

    @JsonProperty("experimental")
    public void setExperimental(int experimental) {
        this.experimental = experimental;
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

    @JsonProperty("rex")
    public int getRex() {
        return rex;
    }

    @JsonProperty("rex")
    public void setRex(int rex) {
        this.rex = rex;
    }

    @JsonProperty("suppressed_tail")
    public int getSuppressed_tail() {
        return suppressed_tail;
    }

    @JsonProperty("suppressed_tail")
    public void setSuppressed_tail(int suppressed_tail) {
        this.suppressed_tail = suppressed_tail;
    }

    @JsonProperty("short_legs")
    public int getShort_legs() {
        return short_legs;
    }

    @JsonProperty("short_legs")
    public void setShort_legs(int short_legs) {
        this.short_legs = short_legs;
    }

    @JsonProperty("wikipedia_url")
    public String getWikipedia_url() {
        return wikipedia_url;
    }

    @JsonProperty("wikipedia_url")
    public void setWikipedia_url(String wikipedia_url) {
        this.wikipedia_url = wikipedia_url;
    }

    @JsonProperty("hypoallergenic")
    public int getHypoallergenic() {
        return hypoallergenic;
    }

    @JsonProperty("hypoallergenic")
    public void setHypoallergenic(int hypoallergenic) {
        this.hypoallergenic = hypoallergenic;
    }

    @JsonProperty("reference_image_id")
    public String getReference_image_id() {
        return reference_image_id;
    }

    @JsonProperty("reference_image_id")
    public void setReference_image_id(String reference_image_id) {
        this.reference_image_id = reference_image_id;
    }
}
