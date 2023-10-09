package Pages;

import dev.failsafe.internal.util.Assert;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;




public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    WebElement EmailText = driver.findElement(By.cssSelector("input[id=\"ctl00_CPHContainer_txtUserLogin\"]"));
    WebElement PasswordText = driver.findElement(By.cssSelector("input[id=\"ctl00_CPHContainer_txtPassword\"]"));
    WebElement LoginButton = driver.findElement(By.xpath("//input[@id=\"ctl00_CPHContainer_btnLoginn\"]"));

    public void UserCanLogin(String Email, String Pass) {
        SendDataInInFiled(EmailText, Email);
        SendDataInInFiled(PasswordText, Pass);
        ClackingElements(LoginButton);
    }

}

