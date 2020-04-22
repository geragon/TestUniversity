package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;
import utils.WindowManager;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;
    protected DropdownPage dropdownPage;
    protected HoverPage hoverPage;
    protected KeyPressesPage keyPressesPage;
    protected AlertsPage alertsPage;
    protected FileUploadPage fileUploadPage;
    protected WysiwyEditorPage wysiwyEditorPage;
    protected DynamicLoadingPage dynamicLoadingPage;
    protected DynamicLoadingExample1Page dynamicLoadingExample1Page;
    protected LargeAndDeepDomPage largeAndDeepDomPage;
    protected InfiniteScrollPage infiniteScrollPage;
    protected MultipleWindowsPage multipleWindowsPage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        dropdownPage = new DropdownPage(driver);
        hoverPage = new HoverPage(driver);
        //keyPressesPage = new KeyPressesPage(driver);
        alertsPage = new AlertsPage(driver);
        fileUploadPage = new FileUploadPage(driver);
        wysiwyEditorPage = new WysiwyEditorPage(driver);
        dynamicLoadingPage = new DynamicLoadingPage(driver);
        dynamicLoadingExample1Page = new DynamicLoadingExample1Page(driver);
        largeAndDeepDomPage = new LargeAndDeepDomPage(driver);
        infiniteScrollPage = new InfiniteScrollPage(driver);
        multipleWindowsPage = new MultipleWindowsPage(driver);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    public WindowManager getWindowManager(){
         return new WindowManager(driver);
    }

}