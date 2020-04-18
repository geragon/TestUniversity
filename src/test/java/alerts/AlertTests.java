package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert() throws InterruptedException {
        homePage.clickJavascriptAlertsLink();
        alertsPage.jsAlertButtonClick();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfuly clicked an alert", "Allert no funciona");
    }

    @Test
    public void textDismissAlert(){
        homePage.clickJavascriptAlertsLink();
        alertsPage.jsConfirmButtonClick();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");

    }

    @Test
    public void setPromptText() throws InterruptedException {
        homePage.clickJavascriptAlertsLink();
        alertsPage.jsPromptButtonClick();
        alertsPage.alert_setInput("Test");
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You entered: Test", "Alert text incorrect");
    }
}
