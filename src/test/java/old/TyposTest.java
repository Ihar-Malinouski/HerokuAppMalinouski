package old;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TyposTest {

    @Test
    public void checkingCheckboxesTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://the-internet.herokuapp.com/typos");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String firstString = driver.findElements(By.tagName("p")).get(0).getText();
        Assert.assertEquals(firstString, "This example demonstrates a typo being introduced. It does it randomly on each page load.");
        String secondString = driver.findElements(By.tagName("p")).get(1).getText();
        Assert.assertEquals(secondString, "Sometimes you'll see a typo, other times you won't.");
        driver.close();
    }
}
