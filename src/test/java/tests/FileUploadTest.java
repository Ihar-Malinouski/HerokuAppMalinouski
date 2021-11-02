package tests;

import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {
    @Test
    public void Test() {
        fileUploadPage.openPage("http://the-internet.herokuapp.com/upload");
    }
}
