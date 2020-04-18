package pages;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    protected By jsAlertButton = By.xpath("/html/body/div[2]/div/div/ul/li[1]/button");
    protected By jsConfirmButton = By.xpath("/html/body/div[2]/div/div/ul/li[2]/button");
    protected By jsPromptButton = By.xpath("/html/body/div[2]/div/div/ul/li[3]/button");
    protected By results = By.id("result");

    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void jsAlertButtonClick(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(jsAlertButton).click();
    }

    public void alert_clickToAccept() throws InterruptedException {
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
    }

    public String getResult(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.findElement(results).getText();
    }

    public void jsConfirmButtonClick(){
        driver.findElement(jsConfirmButton).click();
    }

    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public void jsPromptButtonClick(){
        driver.findElement(jsPromptButton).click();
    }

    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }

}
