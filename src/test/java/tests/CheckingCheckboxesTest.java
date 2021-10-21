package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

import static org.testng.Assert.*;

public class CheckingCheckboxesTest {

    @Test
    public void checkingCheckboxesTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkbox = driver.findElements(By.cssSelector("[type=checkbox]"));
        if (checkbox.get(1).isSelected() && !checkbox.get(0).isSelected()) {
            checkbox.get(0).click();
            assertTrue(checkbox.get(0).isSelected());
            checkbox.get(1).click();
            assertFalse(checkbox.get(1).isSelected());
        }
        driver.close();
    }

    // Ниже первый вариант теста, который пришёл в голову. Но не понравился, после того, как придумал второй)
    @Test
    public void secondCheckingCheckboxesTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement firstCheckbox = driver.findElement(By.cssSelector("input[type=checkbox]:nth-child(1)"));
        assertFalse(firstCheckbox.isSelected());
        firstCheckbox.click();
        assertTrue(firstCheckbox.isSelected());
        WebElement secondCheckbox = driver.findElement(By.cssSelector("input[type=checkbox]:nth-child(3)"));
        assertTrue(secondCheckbox.isSelected());
        secondCheckbox.click();
        assertFalse(secondCheckbox.isSelected());
        driver.close();
    }
}
