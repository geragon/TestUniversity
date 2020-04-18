package Hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1() throws InterruptedException {
        homePage.clickHoverLink();
        hoverPage.hoverOverFigure(2);


    }

}
