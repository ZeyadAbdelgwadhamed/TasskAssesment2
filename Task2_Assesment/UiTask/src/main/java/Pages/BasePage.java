package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.lang.model.element.Element;

public class BasePage {

   protected WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

     protected void SendDataInInFiled(WebElement element,String string)
    {
           element.sendKeys(string);
    }
    protected void ClackingElements(WebElement element)
    {
        element.click();
    }
}
