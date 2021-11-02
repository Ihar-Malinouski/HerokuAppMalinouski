package tests;

import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

    @Test
    public void contextMenuTest() {
        contextMenuPage.openPage("http://the-internet.herokuapp.com/context_menu");
         contextMenuPage.waitForContextMenu();
        contextMenuPage.rightClickForContextMenu();
      //  contextMenuPage.waitForPopUp();
    }
}
