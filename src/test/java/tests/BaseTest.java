package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import pages.ContextMenuPage;
import pages.DynamicControlsPage;
import pages.FileUploadPage;
import pages.FramesPage;

public class BaseTest {
    WebDriver driver;
    ContextMenuPage contextMenuPage;
    DynamicControlsPage dynamicControlsPage;
    FileUploadPage fileUploadPage;
    FramesPage framesPage;

    @BeforeMethod
    public void initTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        contextMenuPage = new ContextMenuPage(driver);
        dynamicControlsPage = new DynamicControlsPage(driver);
        fileUploadPage = new FileUploadPage(driver);
        framesPage = new FramesPage(driver);
    }

//
//    @AfterMethod
//    public void closeDriver() {
//        driver.quit();
//    }
}