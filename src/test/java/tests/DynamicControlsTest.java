package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void Test() {
        dynamicControlsPage.openPage("http://the-internet.herokuapp.com/dynamic_controls");
        Assert.assertEquals(dynamicControlsPage.isCheckboxDisplayed(), true);
        dynamicControlsPage.removeButtonClick();
        dynamicControlsPage.waitForTextMessageDisplayed();
        Assert.assertEquals(dynamicControlsPage.isInputFieldEnabled(), true);
        dynamicControlsPage.enableButtonClick();
    }
}
