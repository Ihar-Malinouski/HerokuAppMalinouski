package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTest extends BaseTest {

    @Test
     public void FrameTest() {
        framesPage.openPage("http://the-internet.herokuapp.com/frames");
        framesPage.waitForPageLoader();
        framesPage.clickByLinkToTheFrame();
        framesPage.waitForIframe();
        framesPage.switchToFrame();
        Assert.assertEquals(framesPage.getTextWithinIframe(), "Your content goes here.");
        framesPage.switchToDefaultContent();
    }

}
