package apis;

import data.Route;
import io.restassured.response.Response;
import models.Books;

import static io.restassured.RestAssured.given;

public class BooksApi {

    public static Response CreateBooKApi(Books books)

    {
        return given()
                .baseUri(Route.BaseUrl)
                .contentType(Route.jsonContentType)
                .body(books)
                .when().post("/books")
                .then()
                .log().all()
                .extract().response();
    }

    public static Response GetBooKKApi()
    {
        return given()
                .baseUri(Route.BaseUrl)
                .when().get("/books/1")
                .then()
                .log().all()
                .extract().response();
    }

    public static Response UpdateBooKApi(Books books)
    {
        return given()
                .baseUri(Route.BaseUrl)
                .contentType(Route.jsonContentType)
                .body(books)
                .when().put("/books/1")
                .then()
                .log().all()
                .extract().response();
    }

    public static Response DeleteBooKApi()
    {
        return given()
                .baseUri(Route.BaseUrl)
                .when().delete("/books/1")
                .then()
                .log().all()
                .extract().response();
    }


    public static Response ListBooKApi()
    {
        return given()
                .baseUri(Route.BaseUrl)
                .when().get("/books?authorId=1&categoryId=2")
                .then()
                .log().all()
                .extract().response();
    }


}
