package client.request;

import io.restassured.RestAssured;

public class BaseRequest {
    static {
        RestAssured.baseURI = "https://api.thecatapi.com";
    }
}
