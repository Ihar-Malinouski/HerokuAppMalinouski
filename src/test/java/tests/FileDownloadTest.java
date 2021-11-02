package tests;

import org.testng.annotations.Test;

public class FileDownloadTest extends BaseTest{
    @Test
    public void Test() {
         fileDownloadPage.openPage("http://the-internet.herokuapp.com/download");
    }
}
