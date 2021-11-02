package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicControlsPage extends BasePage {
    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    private static final By CHECKBOX = By.xpath("//*[@id='checkbox']");
    private static final By REMOVE_BUTTON_CLICK = By.xpath("//*[@id='checkbox-example']/button");
    private static final By TEXT_MESSAGE = By.xpath("//*[@id='checkbox-example']//*[@id='message']");
    private static final By INPUT_FIELD = By.xpath("//*[@id='input-example']//*[@type='text']");
    private static final By ENABLE_BUTTON_CLICK = By.xpath("//*[@id='input-example']//button");


    public void checkboxVisibility() {
        driver.findElement(CHECKBOX).isDisplayed();
    }

    public void removeButtonClick() {
        driver.findElement(REMOVE_BUTTON_CLICK).click();
    }

    public void waitForText() {
        waitForElementlocated(TEXT_MESSAGE, 10);
    }

    public void inputVisibility() {
        driver.findElement(INPUT_FIELD).isEnabled();
    }

    public void enableButtonClick() {
        driver.findElement(ENABLE_BUTTON_CLICK).click();
    }

    public void enableButtonClick123() {
        driver.findElement(INPUT_FIELD).getAttribute("type");

    }
}