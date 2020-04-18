package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;
    protected DropdownPage dropdownPage;
    protected HoverPage hoverPage;
    protected KeyPressesPage keyPressesPage;
    protected AlertsPage alertsPage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);
        dropdownPage = new DropdownPage(driver);
        hoverPage = new HoverPage(driver);
        //keyPressesPage = new KeyPressesPage(driver);
        alertsPage = new AlertsPage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}