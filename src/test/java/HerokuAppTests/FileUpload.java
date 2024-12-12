package HerokuAppTests;

import base.SetUp;

public class FileUpload extends SetUp {
   /* @Test(testName = "Upload File", description = "Проверка загрузки файла", retryAnalyzer = Retry.class,
            groups = {"smoke"}, priority = 2, enabled = true)
    public void uploadFile() {
        driver.get("https://the-internet.herokuapp.com/upload");
        File file = new File("src/test/resources/Screenshot 2024-11-18 at 21.34.13.png");
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys(file.getAbsolutePath());
        driver.findElement(By.id("file-submit")).click();
        WebElement uploadFile = driver.findElement(By.id("uploaded-files"));
        uploadFile.click();
        String title = driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText();
        Assert.assertEquals(title, "File Uploaded!");
    } */
}