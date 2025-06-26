package testcases;

import apis.CategoriesApi;
import data.ErrorMessages;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import models.Books;
import models.Categories;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;




@Feature("Api Categories Test")
public class CategoriesTest {



    @Story("Create Category")
    @Test(description = "Api Test for Create Category")
    public void CreateCategory()

    {
        Categories categories = new Categories("Software Craft","Software engineering best practices");

        Response response = CategoriesApi.CreateCategoriesApi(categories);

        Categories returnedCategories = response.body().as(Categories.class);
        assertThat(response.statusCode(), equalTo(200));
        assertThat(returnedCategories.getName(),equalTo(returnedCategories.getDescription()));

    }

    public void ShouldNotBeAbleToCreateCategory()
    {
        Categories categories = new Categories("Software Craft","engineering");

        Response response = CategoriesApi.CreateCategoriesApi(categories);
        assertThat(response.statusCode(), equalTo(401));
        Error returnedError = response.body().as(Error.class);
        assertThat(returnedError.getMessage(), equalTo(ErrorMessages.description_is_rejected));
    }




    @Story("Get Category")
    @Test(description = "Api Test for Get Category")
    public void GetCategory()

    {
        Response response = CategoriesApi.GetCategoriesApi();

        Categories returnedCategories = response.body().as(Categories.class);
        assertThat(response.statusCode(), equalTo(200));
        assertThat(returnedCategories.getName(),equalTo(returnedCategories.getDescription()));
    }

    @Story("List Category")
    @Test(description = "Api Test for List Category")
    public void ListCategory()

    {
        Response response = CategoriesApi.ListCategoryApi();

        Categories returnedCategories = response.body().as(Categories.class);
        assertThat(response.statusCode(), equalTo(200));
        assertThat(returnedCategories.getName(),equalTo(returnedCategories.getDescription()));

    }





}
