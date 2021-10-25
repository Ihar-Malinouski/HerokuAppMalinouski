package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoversTest {

    @Test
    public void checkingCheckboxesTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://the-internet.herokuapp.com/hovers");
        Actions builder = new Actions(driver);
        driver.findElement(By.xpath("//*[@id='content']/div/div[1]/img"));
        builder.moveToElement(driver.findElement(By.xpath("//*[@id='content']/div/div[1]/img"))).perform();
        String textComparison = driver.findElements(By.xpath("//*[@id='content']/div/div[1]/div/h5")).get(0).getText();
        WebElement viewProfile = driver.findElement(By.xpath(" //*[@id='content']/div/div[1]/div/a"));
        Assert.assertEquals(textComparison, "name: user1");
        builder.moveToElement(viewProfile).click().perform();
        // driver.getPageSource();
        // Не успел дальше... к сожалению, времения не хватило(
    }
}