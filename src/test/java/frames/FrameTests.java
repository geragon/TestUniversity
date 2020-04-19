package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWusiwyg(){
        homePage.clickWysiwyEditorLink();
        wysiwyEditorPage.clearTextArea();

        String text1 = "Hello";
        String text2 = "World";

        wysiwyEditorPage.setTextArea(text1);
        wysiwyEditorPage.decreaseIndention();
        wysiwyEditorPage.setTextArea(text2);

        assertEquals(wysiwyEditorPage.getTextFromEditor(), text1 + text2, "Texto incorrecto");

    }

}
