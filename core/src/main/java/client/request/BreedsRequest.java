package client.request;

import client.config.Paths;
import model.Breed;
import org.apache.http.HttpStatus;

import java.util.List;

import static client.config.HeaderConfigs.getAuthorizedHeaders;
import static io.restassured.RestAssured.given;

public class BreedsRequest extends BaseRequest {

    public static List<Breed> getBreeds() {
        return given()
                .headers(getAuthorizedHeaders())
                .get(Paths.BREEDS_V1)
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .body()
                .jsonPath()
                .getList("", Breed.class);
    }

    public static List<Breed> getSpecificBreed(String name) {
        return given()
                .headers(getAuthorizedHeaders())
                .param("q", name)
                .get(Paths.SPECIFIC_BREED_V1)
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .body()
                .jsonPath()
                .getList("", Breed.class);
    }
}
