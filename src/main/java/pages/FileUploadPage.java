package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends BasePage {
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    //TODO: Никак не могу открыть и добавить файл. И я должен в invisibilityOf впихнуть значение какого нибудт метода, который будет проверять и возвращать инфу?
    //TODO: Чот гуглил гулил и недогуглил

     public void fileUpload() {
        driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("D:/ContextMenuPage.java");
        driver.findElement(By.xpath("//*[@id='file-submit']")).click();
        //  wait.until(ExpectedConditions.invisibilityOf();


    }
}
