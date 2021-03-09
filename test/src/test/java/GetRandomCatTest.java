import io.restassured.RestAssured;
import io.restassured.response.Response;
import model.ImageShort;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;


public class GetRandomCatTest {

    @BeforeMethod
    public void setup() {
        RestAssured.baseURI = "https://api.thecatapi.com";
    }

    @Test
    public void getRandomCatTest() {
        Response response = given()
                .get("/v1/images/search");
        response.then()
                .assertThat()
                .body("id", notNullValue(), "url", notNullValue());

        ImageShort image = response.getBody().jsonPath().getList("", ImageShort.class).get(0);
        Assert.assertTrue(image.getUrl().contains(image.getId()));

    }
}
