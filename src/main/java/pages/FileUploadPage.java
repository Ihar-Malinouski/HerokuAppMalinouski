package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends BasePage {
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }


    public void fileUpload() {
        driver.findElement(By.id("file-upload")).sendKeys("C:/Users/Malinouski_IY/IdeaProjects/HerokuAppMalinouski/pom.xml");
        driver.findElement(By.id("file-submit")).click();
    }

    public String getTextLoadedFile() {
        return driver.findElement(By.id(String.format("uploaded-files"))).getText();
    }
}
