package TestPages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestPage {
    WebDriver driver;

    @BeforeClass
    public void OpenBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" http://www.testyou.in/Login.aspx");
    }

    @AfterClass
    public void CloseBrowser()
    {
     driver.close();
    }


}
