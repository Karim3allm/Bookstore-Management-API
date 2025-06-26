package apis;

import data.Route;
import io.restassured.response.Response;
import models.Authors;

import static io.restassured.RestAssured.given;

public class AuthorsApi {


    public static Response CreateAuthorApi (Authors authors)

    {
        return given()
            .baseUri(Route.BaseUrl)
            .contentType(Route.jsonContentType)
            .body(authors)
            .when().post("/authors")
            .then()
            .log().all()
            .extract().response();
    }

    public static Response GetAuthorApi ()
    {
        return  given()
                .baseUri(Route.BaseUrl)
                .when().get("/authors/1")
                .then()
                .log().all()
                .extract().response();
    }

    public static Response ListAuthorApi ()
    {
        return   given()
                .baseUri(Route.BaseUrl)
                .when().get("/authors")
                .then()
                .log().all()
                .extract().response();
    }


}
