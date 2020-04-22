package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.*;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;

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
        driver = new ChromeDriver(getChromeOptions());
        driver.get("https://the-internet.herokuapp.com/");

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

    @AfterMethod
    public void recordFailure(ITestResult result){

        if (ITestResult.FAILURE == result.getStatus()){
            TakesScreenshot camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public WindowManager getWindowManager(){
         return new WindowManager(driver);
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        //options.setHeadless(true);//Ejecuta las pruebas sin abrir el broser
        options.addArguments("--start-maximized");
        options.addArguments("disable-infobars"); //DEsabilita el mensaje que dice que chrome está siendo controlado por algo automatizado
        return options;
    }

}