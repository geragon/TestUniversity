package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption() throws InterruptedException {
        homePage.clickDropdownLink();
        dropdownPage.selectFromDropDown("Option 2");
    }
}
