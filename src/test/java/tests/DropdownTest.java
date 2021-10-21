package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest {

    @Test
    public void checkingCheckboxesTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://the-internet.herokuapp.com/dropdown");
        Select select = new Select(driver.findElement(By.cssSelector("select[id*='dropdown']")));
        select.selectByValue("1");
        Assert.assertEquals(select.getOptions().get(1).getText(), "Option 1");
        Thread.sleep(1000);
        select.selectByValue("2");
        Assert.assertEquals(select.getOptions().get(2).getText(), "Option 2");
        driver.close();
    }
}
