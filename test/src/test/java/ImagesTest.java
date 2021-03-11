import client.config.Paths;
import io.restassured.response.Response;
import model.ImageShort;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Collections;
import java.util.List;

import static client.request.ImageRequest.*;
import static utils.ImageUtils.getJpgImage;


public class ImagesTest {

    @Test
    public void getRandomCatTest() {
        SoftAssert softAssert = new SoftAssert();
        List<ImageShort> images = getAllPublicImages();
        String nullErrorMessage = "Image field %s is empty for image %s";
        for (ImageShort image : images) {
            softAssert.assertNotNull(image.getId(), String.format(nullErrorMessage, "id", image));
            softAssert.assertNotNull(image.getUrl(), String.format(nullErrorMessage, "url", image));
            softAssert.assertNotEquals(image.getHeight(), 0, String.format(nullErrorMessage, "height", image));
            softAssert.assertNotEquals(image.getWidth(), 0, String.format(nullErrorMessage, "width", image));
            softAssert.assertTrue(image.getUrl().contains(image.getId()));
        }

        softAssert.assertAll();

    }

    @Test
    public void getUploadedImagesTest() {
        SoftAssert softAssert = new SoftAssert();
        List<ImageShort> images = getUploadedImages();
        String nullErrorMessage = "Image field %s is empty for image %s";
        for (ImageShort image : images) {
            softAssert.assertNotNull(image.getId(), String.format(nullErrorMessage, "id", image));
            softAssert.assertNotNull(image.getUrl(), String.format(nullErrorMessage, "url", image));
            softAssert.assertNotEquals(image.getHeight(), 0, String.format(nullErrorMessage, "height", image));
            softAssert.assertNotEquals(image.getWidth(), 0, String.format(nullErrorMessage, "width", image));
            softAssert.assertTrue(image.getUrl().contains(image.getId()));
        }

        softAssert.assertAll();

    }

    @Test
    public void uploadImageTest() {
        Response uploadImageResponse = uploadImage(getJpgImage(), "image/jpeg");
        uploadImageResponse
                .then()
                .assertThat()
                .body("approved", Matchers.equalTo(1));

        String uploadedImageId = uploadImageResponse.path("id");
        performAnalysisOnImage(uploadedImageId)
                .then()
                .assertThat()
                .body("image_id", Matchers.equalTo(Collections.singletonList(uploadedImageId)));
    }

    @Test
    public void deleteImageTest() {
        List<ImageShort> images = getUploadedImages();
        if(images.isEmpty()){
            uploadImage(getJpgImage(), "image/jpeg");
            images = getUploadedImages();
        }

        Response response = deleteImage(images.get(0).getId());
        response.asString();
    }
}
