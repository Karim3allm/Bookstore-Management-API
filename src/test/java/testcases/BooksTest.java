package testcases;

import apis.AuthorsApi;
import apis.BooksApi;
import data.ErrorMessages;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import models.Authors;
import models.Books;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;



@Feature("Api book test")
public class BooksTest {

    @Story("Create Book")
    @Test(description = "Api Test for Create Book")
    public void CreateBooK()

    {
        Books books = new Books("Clean Code", 10, 45, 42.0, 1, 2);

        Response response = BooksApi.CreateBooKApi(books);

        Books returnedBooks = response.body().as(Books.class);
        assertThat(response.statusCode(), equalTo(200));
        assertThat(returnedBooks.getTitle(),equalTo(returnedBooks.getIsbn()));

    }


    public void ShouldNotBeAbleToCreateBooK()

    {
        Books books = new Books("coding", 10, 45, 42.0, 1, 2);

        Response response = BooksApi.CreateBooKApi(books);

        assertThat(response.statusCode(), equalTo(401));
        Error returnedError = response.body().as(Error.class);
        assertThat(returnedError.getMessage(), equalTo(ErrorMessages.title_is_wrong));

    }



    @Story("Get Book")
    @Test(description = "Api Test for Get Book")
    public void GetBooK()
{

    Response response = BooksApi.GetBooKKApi();
    Books returnedBooks = response.body().as(Books.class);
    assertThat(response.statusCode(), equalTo(200));
    assertThat(returnedBooks.getTitle(),equalTo(returnedBooks.getIsbn()));

}


    @Story("Update Book")
    @Test(description = "Api Test for Update Book")
    public void UpdateBooK()
{

    Books books = new Books("Clean Code", 10, 45, 42.0, 1, 2);

    Response response = BooksApi.UpdateBooKApi(books);

    Books returnedBooks = response.body().as(Books.class);
    assertThat(response.statusCode(), equalTo(200));
    assertThat(returnedBooks.getTitle(),equalTo(returnedBooks.getIsbn()));
}


    @Story("Delete Book")
    @Test(description = "Api Test for Delete Book")
public void DeleteBooK()
{
    Response response = BooksApi.DeleteBooKApi();
    Books returnedBooks = response.body().as(Books.class);
    assertThat(response.statusCode(), equalTo(200));
    assertThat(returnedBooks.getTitle(),equalTo(returnedBooks.getIsbn()));
}


    @Story("List Book")
    @Test(description = "Api Test for List Book")
 public void ListBooK()
{

    Response response = BooksApi.ListBooKApi();
    Books returnedBooks = response.body().as(Books.class);
    assertThat(response.statusCode(), equalTo(200));
    assertThat(returnedBooks.getTitle(),equalTo(returnedBooks.getIsbn()));
}








}
