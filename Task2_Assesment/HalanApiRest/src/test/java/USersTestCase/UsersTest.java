package USersTestCase;

import API.UserApi;
import UserMedul.UsersData;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.request;

public class UsersTest {
    UsersData ReturnData;

    @Test
    public void GetValidName()
    {
        Response response= UserApi.Valid();
        response.then()
                .assertThat().statusCode(200);
        ReturnData=response.body().as(UsersData.class);
        Assert.assertEquals(ReturnData.getName(),"meelad");
        Assert.assertEquals(ReturnData.getCount(),21);
        Assert.assertEquals(ReturnData.getAge(),33);

    }
    @Test
    public void GetInValidTheNameNotExistInDatabase()
    {
        Response response=UserApi.InvalidNotInDAtaBase();
        response.then()
                .assertThat().statusCode(200);
        ReturnData=response.body().as(UsersData.class);
        Assert.assertEquals(ReturnData.getName(),"ZeyadAbdElgwad");
        Assert.assertEquals(ReturnData.getCount(),0);
    }
    @Test
    public void GetInValidNotHavingPram()
    {
        Response response=UserApi.InValidNotPram();
        response.then()
                .assertThat().statusCode(422);
        ReturnData=response.body().as(UsersData.class);
        Assert.assertEquals(ReturnData.getError(),"Missing 'name' parameter");

    }
    @Test
    public void GetInValidNotHavingSpecificName()
    {
        Response response=UserApi.InValidNotHavingName();
        response.then()
                .assertThat().statusCode(200);
        ReturnData=response.body().as(UsersData.class);
        Assert.assertEquals(ReturnData.getCount(),0);
        Assert.assertEquals(ReturnData.getName(),"");
    }

}
