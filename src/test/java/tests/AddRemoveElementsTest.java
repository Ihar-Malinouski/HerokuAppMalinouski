package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveElementsTest {

    @Test
    public void addRemoveElementsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(addButton).doubleClick().perform();
        driver.findElement(By.xpath("//button[text()='Delete']")).click();
        int numberOfButtons = driver.findElements(By.xpath("//button[text()='Delete']")).size();
        Assert.assertEquals(numberOfButtons, 1);
        driver.close();
    }
}
