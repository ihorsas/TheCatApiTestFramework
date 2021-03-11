package client.request;

import client.config.Paths;
import model.ImageShort;
import org.apache.http.HttpStatus;

import java.util.List;

import static client.config.HeaderConfigs.getAuthorizedHeaders;
import static io.restassured.RestAssured.given;

public class ImageRequest extends BaseRequest {

    public static List<ImageShort> getAllPublicImages() {
        return given()
                .headers(getAuthorizedHeaders())
                .get(Paths.PUBLIC_IMAGES_V1)
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .body()
                .jsonPath()
                .getList("", ImageShort.class);

    }
}
