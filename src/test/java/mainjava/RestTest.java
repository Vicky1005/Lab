package mainjava;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;


public class RestTest {

    @Test
    @Tag("API-TEST")
    void simpleTest() {
        RestAssured.filters(new AllureRestAssured());
        Response res= get("https://reqres.in//api/users?page=2");
        Assertions.assertEquals(200, res.getStatusCode());

    }
}
