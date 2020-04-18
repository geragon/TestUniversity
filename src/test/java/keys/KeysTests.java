package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {

    @Test
    public void testBackspace(){
        keyPressesPage = homePage.clickKeyPressesLink();
        keyPressesPage.enterText("A" + Keys.F5);
        assertEquals(keyPressesPage.getResult(), "You entered: F5");
    }

}
