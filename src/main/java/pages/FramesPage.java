package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage extends BasePage {
    public FramesPage(WebDriver driver) {
        super(driver);
    }

    private static final By LINK_FRAME_CLICK = By.xpath("//*[contains( text(),'iFrame')]");
    private static final By IFRAME_WINDOW = By.id("mce_0_ifr");
    private static final String TEXT_INSIDE_IN_FRAME = "//*[@id='tinymce']//p";


    public void transitionToIframe() {
        driver.switchTo().frame(driver.findElement(IFRAME_WINDOW));
    }

    public void outOfFrame() {
        driver.switchTo().defaultContent();
    }

    public void clickByLinkToTheFrame() {
        driver.findElement(LINK_FRAME_CLICK).click();
    }

    public void waitForIframe() {
        waitForElementlocated(IFRAME_WINDOW, 10);
    }

    public String textWithnAIframe(){
        return driver.findElement(By.xpath(String.format(TEXT_INSIDE_IN_FRAME))).getText();
    }
}
