package apis;

import data.Route;
import io.restassured.response.Response;
import models.Books;
import models.Categories;

import static data.Route.jsonContentType;
import static io.restassured.RestAssured.given;

public class CategoriesApi {

    public static Response CreateCategoriesApi(Categories categories)
    {
        return given()
                .baseUri(Route.BaseUrl)
                .contentType(jsonContentType)
                .body(categories)
                .when().post("/categories")
                .then()
                .log().all()
                .extract().response();
    }

    public static Response GetCategoriesApi()
    {
        return given()
                .baseUri(Route.BaseUrl)
                .when().get("/categories/2")
                .then()
                .log().all()
                .extract().response();
    }

    public static Response ListCategoryApi()
    {
        return given()
                .baseUri(Route.BaseUrl)
                .when().get("/categories")
                .then()
                .log().all()
                .extract().response();
    }





}
