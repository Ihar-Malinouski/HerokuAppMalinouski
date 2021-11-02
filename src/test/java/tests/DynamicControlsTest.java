package tests;

import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest {

    //TODO: ЕЩЁ НЕ ДОБАВИЛ АССЕРТЫ
    @Test
    public void Test() {
        dynamicControlsPage.openPage("http://the-internet.herokuapp.com/dynamic_controls");
        dynamicControlsPage.checkboxVisibility();
        dynamicControlsPage.removeButtonClick();
        dynamicControlsPage.waitForText();
        dynamicControlsPage.inputVisibility();
        dynamicControlsPage.enableButtonClick();

    }
}
