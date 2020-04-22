package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By dropDownLink = By.linkText("Dropdown");
    private By hoverLink = By.linkText("Hovers");
    private By keyPressesLink = By.linkText("Key Presses");
    private By javascriptAlertsLink = By.linkText("JavaScript Alerts");
    private By fileUploadLink = By.linkText("File Upload");
    private By wysiwyEditorLink = By.linkText("WYSIWYG Editor");
    private By dinamicLoadingLink = By.linkText("Dynamic Loading");
    private By largeDeepDomLink = By.linkText("Large & Deep DOM");
    private By infiniteScrollLink = By.linkText("Infinite Scroll");
    private By multipleWindowsLink = By.linkText("Multiple Windows");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdownLink(){
        driver.findElement(dropDownLink).click();
        return new DropdownPage(driver);
    }

    public HoverPage clickHoverLink(){
        driver.findElement(hoverLink).click();
        return new HoverPage(driver);
    }

    public KeyPressesPage clickKeyPressesLink(){
        driver.findElement(keyPressesLink).click();
        return new KeyPressesPage(driver);
    }

    public AlertsPage clickJavascriptAlertsLink(){
        driver.findElement(javascriptAlertsLink).click();
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUploadLink(){
        driver.findElement(fileUploadLink).click();
        return new FileUploadPage(driver);
    }

    public WysiwyEditorPage clickWysiwyEditorLink(){
        driver.findElement(wysiwyEditorLink).click();
        return new WysiwyEditorPage(driver);
    }

    public DynamicLoadingPage clickDinamicLoadingLink(){
        driver.findElement(dinamicLoadingLink).click();
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDomPage clickLargeDeepDomLink(){
        driver.findElement(largeDeepDomLink).click();
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScrollLink(){
        driver.findElement(infiniteScrollLink).click();
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindows(){
        driver.findElement(multipleWindowsLink).click();
        return new MultipleWindowsPage(driver);
    }

}