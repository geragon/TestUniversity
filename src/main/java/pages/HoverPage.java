package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {

    private WebDriver driver;
    private By figureBox = By.className("figure");
    private By boxCaption = By.className("figcaption");

    public HoverPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     *
     * @param index starts at 1
     */
    public FigureCaption hoverOverFigure(int index) throws InterruptedException {

        WebElement figure = driver.findElements(figureBox).get(index - 1);

        Actions actions = new Actions(driver);//Clase para mover el mouse
        Thread.sleep(1000);
        actions.moveToElement(figure).perform();//Muevase al elemento X
        Thread.sleep(1000);
        return new FigureCaption(figure.findElement(boxCaption));

    }

    //Inner class para obtener el webelement que contiene los datos que se muestran cuando hago el hover.
    public class FigureCaption{

        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");


        public  FigureCaption(WebElement caption){
            this.caption = caption;
        }

        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        public String getTitle(){
            return caption.findElement(header).getText();
        }

        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }

        public String getLinkText(){
            return caption.findElement(link).getText();
        }
    }


}
