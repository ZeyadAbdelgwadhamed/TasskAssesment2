package API;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserApi {
    public static Response Valid()
    {
        Response response  = given()
                .baseUri("https://api.agify.io")
                .when()
                .get("/?name=meelad")
                .then()
                .log()
                .all()
                .extract().response();
        return  response;
    }
    public static Response InvalidNotInDAtaBase()
    {
        Response response  = given()
                .baseUri("https://api.agify.io")
                .when()
                .get("/?name=ZeyadAbdElgwad")
                .then()
                .log()
                .all()
                .extract().response();
        return response;
    }
    public static Response InValidNotPram()
    {
        Response response  = given()
                .baseUri("https://api.agify.io")
                .when()
                .get("")
                .then()
                .log()
                .all()
                .extract().response();
        return response;
    }
    public static Response InValidNotHavingName()
    {
        Response response  = given()
                .baseUri("https://api.agify.io")
                .when()
                .get("/?name=")
                .then()
                .log()
                .all()
                .extract().response();
        return  response;
    }
}
