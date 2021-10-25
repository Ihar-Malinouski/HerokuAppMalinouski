package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortableDataTablesTest {

    @Test
    public void checkingCheckboxesTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://the-internet.herokuapp.com/tables");
        String firstElement = driver.findElements(By.xpath("//table//tr[1]//td[1]")).get(0).getText();
        Assert.assertEquals(firstElement, "Smith");
        String secondElement = driver.findElements(By.xpath("//table//tr[1]//td[2]")).get(0).getText();
        Assert.assertEquals(secondElement, "John");
        String thirdElement = driver.findElements(By.xpath("//table//tr[1]//td[3]")).get(0).getText();
        Assert.assertEquals(thirdElement, "jsmith@gmail.com");
        String fourthElement = driver.findElements(By.xpath("//table//tr[1]//td[4]")).get(0).getText();
        Assert.assertEquals(fourthElement, "$50.00");
        String fifthElement = driver.findElements(By.xpath("//table//tr[1]//td[5]")).get(0).getText();
        Assert.assertEquals(fifthElement, "http://www.jsmith.com");
        String firstActions = driver.findElements(By.xpath("//table//tr[1]//td[6]/a[1]")).get(0).getText();
        Assert.assertEquals(firstActions, "edit");
        String secondActions = driver.findElements(By.xpath("//table//tr[1]//td[6]/a[2]")).get(0).getText();
        Assert.assertEquals(secondActions, "delete");
        System.out.println(firstElement + "\n" + secondElement + "\n" + thirdElement + "\n" + fourthElement + "\n"
                + fifthElement + "\n" + firstActions + "\n" + secondActions);
        driver.close();
    }
}