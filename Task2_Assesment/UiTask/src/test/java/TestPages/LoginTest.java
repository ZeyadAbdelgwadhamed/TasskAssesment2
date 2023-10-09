package TestPages;

import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.JavascriptExecutor;


import java.time.Duration;

public class LoginTest extends BaseTestPage{
    LoginPage loginPage;
    SoftAssert softAssert;

    @Test
    public void UserCanLoginSuccessfully()
    {
        loginPage=new LoginPage(driver);
        loginPage.UserCanLogin("zeyad@gmail.com","1232434");
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String text = (String) jsExecutor.executeScript("return document.getElementById('ctl00_CPHContainer_lblOutput').textContent");
        Assert.assertTrue(text.contains("Userid or Password did Not Match !!"));
    }
}
