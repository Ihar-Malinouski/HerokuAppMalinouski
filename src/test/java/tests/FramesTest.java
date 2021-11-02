package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTest extends BaseTest {

    @Test
     public void FrameTest() {
        framesPage.openPage("http://the-internet.herokuapp.com/frames");
        framesPage.waitForPageLoader();
        framesPage.clickByLinkToTheFrame();
        framesPage.waitForIframe();
        framesPage.transitionToIframe();
        Assert.assertEquals(framesPage.textWithnAIframe(), "Your content goes here.");
        framesPage.outOfFrame();
    }

}
