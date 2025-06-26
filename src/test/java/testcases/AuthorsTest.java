package testcases;

import apis.AuthorsApi;
import data.ErrorMessages;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.Authors;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


@Feature(" Api Author Test")
public class AuthorsTest {

    @Story("Create Author")
    @Test(description = "Api Test for Author Book")
    public void CreateAuthor()
    {
       Authors authors = new Authors("Robert C. Martin","Author of Clean Code series");

        Response response = AuthorsApi.CreateAuthorApi(authors);

        Authors returnedAuthors = response.body().as(Authors.class);
        assertThat(response.statusCode(), equalTo(200));
        assertThat(returnedAuthors.getName(),equalTo(returnedAuthors.getBio()));
    }

    public void ShouldNotBeAbleToCreateAuthor()
    {
        Authors authors = new Authors("Martin","Author of Clean Code series");

        Response response = AuthorsApi.CreateAuthorApi(authors);

        assertThat(response.statusCode(), equalTo(401));
        Error returnedError = response.body().as(Error.class);
        assertThat(returnedError.getMessage(), equalTo(ErrorMessages.name_is_rejected));

    }


    @Story("Get Author")
    @Test(description = "Api Test for Get Book")
    public void GetAuthor()
    {
        Response response = AuthorsApi.GetAuthorApi();

        Authors returnedAuthors = response.body().as(Authors.class);
        assertThat(response.statusCode(), equalTo(200));
        assertThat(returnedAuthors.getName(),equalTo(returnedAuthors.getBio()));
    }


    @Story("List Author")
    @Test(description = "Api Test for List Book")
    public void ListAuthor()
    {
        Response response = AuthorsApi.ListAuthorApi();

        Authors returnedAuthors = response.body().as(Authors.class);
        assertThat(response.statusCode(), equalTo(200));
        assertThat(returnedAuthors.getName(),equalTo(returnedAuthors.getBio()));
    }










}
