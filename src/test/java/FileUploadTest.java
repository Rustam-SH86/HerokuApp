import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.io.File;

public class FileUploadTest extends setUp {
    WebDriver driver;

    @Test(testName = "Upload File", description = "Проверка загрузки файла", retryAnalyzer = Retry.class,
            groups = {"smoke"}, priority = 2, enabled = true)
    public void uploadFile() {
        driver.get("https://the-internet.herokuapp.com/upload");
        File file = new File("src/test/resources/upload");
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys(file.getAbsolutePath());
        WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));

        driver.findElement(By.id("file-submit")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uploaded-files")));
        WebElement uploadedFile = driver.findElement(By.id("uploaded-files"));
    }
}