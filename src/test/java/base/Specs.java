package base;

import com.sun.net.httpserver.Request;
import data.Route;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class Specs {


    public static String getEnv()
    {
        String env = System.getProperty("env","PRODUCTION");
        String baseURL;
        switch (env)
        {
            case"PRODUCTION":
                baseURL = "https://mock.example.com";
                break;
            case "LOCAL":
                    baseURL = "";
                    break;
            default:
                throw new RuntimeException("Environment not supported");
        }
        return baseURL;
    }


    public static RequestSpecification getRequestSpec()
    {
        return given()
                .baseUri(Route.BaseUrl);
    }


}
