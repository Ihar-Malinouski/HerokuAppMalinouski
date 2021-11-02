package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePage {

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    private static final By CLICK_CONTEXT_MENU = By.xpath("//*[@id='hot-spot']");
    private static final By ALERT_POP_UP_OPEN = By.xpath("//*[@id='content']/script");

    public void waitForContextMenu() {
        waitForElementlocated(CLICK_CONTEXT_MENU, 10);
    }

    public void rightClickForContextMenu() {
        Actions actions= new Actions(driver);
        actions.contextClick(driver.findElement(CLICK_CONTEXT_MENU));
    }
//
//    public void waitForPopUp() {
//        waitForElementPopUp(ALERT_POP_UP_OPEN, 10);
//    }
}
