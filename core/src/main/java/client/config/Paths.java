package client.config;

public final class Paths {

    public static final String BREEDS_V1 = "/v1/breeds";
    public static final String SPECIFIC_BREED_V1 = "/v1/breeds/search";
    public static final String CATEGORIES_V1 = "/v1/categories";
    public static final String VOTES_V1 = "/v1/votes";
    public static final String SPECIFIC_VOTE_V1 = "/v1/votes/%s";
    public static final String FAVOURITE_V1 = "/v1/favourites";
    public static final String SPECIFIC_FAVOURITE_V1 = "/v1/favourites/%s";
    public static final String PUBLIC_IMAGES_V1 = "/v1/images/search";
    public static final String UPLOADED_IMAGES_V1 = "/v1/images";
    public static final String UPLOAD_IMAGE_V1 = "/v1/images/upload";
    public static final String SPECIFIC_IMAGE_V1 = "/v1/images/%s";
    public static final String ANALYSIS_SPECIFIC_IMAGE_V1 = "/v1/images/%s/analysis";

    private Paths() {
    }
}
