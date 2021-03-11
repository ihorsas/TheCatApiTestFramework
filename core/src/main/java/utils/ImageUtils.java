package utils;

import org.apache.commons.io.FileUtils;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;

import static io.restassured.RestAssured.given;

public class ImageUtils {
    public static File getJpgImage() {
        SoftAssert softAssert = new SoftAssert();
        File imageFile = getFileFromResource("cat_image.jpg");
        byte[] imageBytes = given()
                .get("https://undark.org/wp-content/uploads/2020/02/GettyImages-1199242002-1-scaled.jpg")
                .getBody()
                .asByteArray();
        try {
            FileUtils.writeByteArrayToFile(imageFile, imageBytes);
            FileUtils.forceDeleteOnExit(imageFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageFile;
    }

    private static File getFileFromResource(String filePath) {
        return new File("src/main/resources/" + filePath);
    }
}
