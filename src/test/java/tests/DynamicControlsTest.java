package tests;

import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest{

    @Test
    public void Test() {
        dynamicControlsPage.openPage("http://the-internet.herokuapp.com/dynamic_controls");
    }
}
