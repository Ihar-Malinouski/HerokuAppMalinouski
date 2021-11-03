package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

    @Test
    public void contextMenuTest() {
        contextMenuPage.openPage("http://the-internet.herokuapp.com/context_menu");
        contextMenuPage.waitForContextMenu();
        contextMenuPage.rightClickForContextMenu();
        contextMenuPage.waitForPopUp();
        Assert.assertEquals(contextMenuPage.getAlertText(), "You selected a context menu");
        contextMenuPage.closeAlert();
    }
}
