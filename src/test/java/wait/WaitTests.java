package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        homePage.clickDinamicLoadingLink();
        dynamicLoadingPage.clickExample1();
        dynamicLoadingExample1Page.clickStartBtton();
        assertEquals(dynamicLoadingExample1Page.getLoadeText(), "Hello World!", "Loaded text incorrect");

    }

}
