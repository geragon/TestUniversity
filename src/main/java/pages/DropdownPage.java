package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class DropdownPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,5);
    }

    public void selectFromDropDown(String option) throws InterruptedException {

        Select dropdonwElement = new Select(driver.findElement(dropdown));
        Thread.sleep(1000);
        dropdonwElement.selectByVisibleText("Option 2");
        Thread.sleep(1000);
    }


}
