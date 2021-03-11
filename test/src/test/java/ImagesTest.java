import model.ImageShort;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static client.request.ImageRequest.getAllPublicImages;


public class ImagesTest {

    @Test
    public void getRandomCatTest() {
        SoftAssert softAssert = new SoftAssert();
        List<ImageShort> images = getAllPublicImages();
        String nullErrorMessage = "Image field %s is empty for image %s";
        for(ImageShort image : images) {
            softAssert.assertNotNull(image.getId(), String.format(nullErrorMessage, "id", image));
            softAssert.assertNotNull(image.getUrl(), String.format(nullErrorMessage, "url", image));
            softAssert.assertNotEquals(image.getHeight(), 0, String.format(nullErrorMessage, "height", image));
            softAssert.assertNotEquals(image.getWidth(), 0, String.format(nullErrorMessage, "width", image));
            softAssert.assertTrue(image.getUrl().contains(image.getId()));
        }

        softAssert.assertAll();

    }
}
