package client.request;

import client.config.Paths;
import io.restassured.response.Response;
import model.ImageShort;
import org.apache.http.HttpStatus;

import javax.activation.MimeType;
import java.io.File;
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

    public static List<ImageShort> getUploadedImages() {
        return given()
                .headers(getAuthorizedHeaders())
                .get(Paths.UPLOADED_IMAGES_V1)
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .body()
                .jsonPath()
                .getList("", ImageShort.class);

    }

    public static Response uploadImage(File file, String mimeType) {
        return given()
                .headers(getAuthorizedHeaders())
                .multiPart("file", file, mimeType)
                .post(Paths.UPLOAD_IMAGE_V1)
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_CREATED)
                .extract()
                .response();
    }

    public static Response performAnalysisOnImage(String imageId) {
        return given()
                .headers(getAuthorizedHeaders())
                .get(String.format(Paths.ANALYSIS_SPECIFIC_IMAGE_V1, imageId))
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();

    }

    public static Response deleteImage(String imageId) {
        return given()
                .headers(getAuthorizedHeaders())
                .delete(String.format(Paths.SPECIFIC_IMAGE_V1, imageId))
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();

    }
}
