package testCases;

import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class APITests {

    @Test
    void verifyProductElementAttribute() {
        baseURI = "https://automationexercise.com/api";

        String jsonString = given().when().get("/productsList").then().extract().body().asString();
        JsonPath jsonPath = JsonPath.from(jsonString);

        String expectedResultPath = "products[10].name";
        String expectedResult = "Frozen Tops For Kids";

        assertEquals(expectedResult,jsonPath.getString(expectedResultPath));
    }
}
