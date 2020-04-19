package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload() throws InterruptedException {
        homePage.clickFileUploadLink();
        fileUploadPage.uploadFile("C:/Users/gera1/Desktop/pata.PNG");
        assertEquals(fileUploadPage.getUploadedFiles(),"pata.PNG", "Uploaded failed" );
    }

}
