package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample1Page {

    private WebDriver driver;
    private WebDriverWait wait;
    private By startButton = By.cssSelector("#start button");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.id("finish");


    public DynamicLoadingExample1Page(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

    public void clickStartBtton(){
        driver.findElement(startButton).click();
        wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(loadedText)));

    }

    public String getLoadeText(){
        return driver.findElement(loadedText).getText();
    }
}
