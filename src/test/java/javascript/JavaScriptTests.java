package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable() throws InterruptedException {
        homePage.clickLargeDeepDomLink();
        largeAndDeepDomPage.scrollToTable();
    }

    @Test
    public void testScrollToInfiniteParagraph() throws InterruptedException {
        homePage.clickInfiniteScrollLink();
        infiniteScrollPage.scrollToParagraph(5);
    }

}
