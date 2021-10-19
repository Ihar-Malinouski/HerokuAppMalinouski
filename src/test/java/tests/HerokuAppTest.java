package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HerokuAppTest {

    @Test
    public void herokuAppTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        //    chromeOptions.setHeadless(true); // запуск без открытия окна браузера
        chromeOptions.addArguments("--incognito"); // будет запускаться в режиме
        chromeOptions.addArguments("--disable-popup-blocking"); // при запуске в браузере не открываются всплывашки
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // driver.manage().getCookies();
        //  driver.get("http://the-internet.herokuapp.com/");
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement inputField = driver.findElement(By.tagName("input"));
        inputField.sendKeys("1111");
        String textFromInputField = inputField.getAttribute("value");
        Assert.assertEquals(textFromInputField, "1111");
        driver.quit();
        //driver.close();


    }
}
