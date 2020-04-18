package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By dropDownLink = By.linkText("Dropdown");
    private By hoverLink = By.linkText("Hovers");
    private By keyPressesLink = By.linkText("Key Presses");

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

}