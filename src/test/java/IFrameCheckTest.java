import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IFrameCheckTest extends setUp {
    @Test(testName = "Проверка IFrame", description = "Проверка IFrame поля", retryAnalyzer = Retry.class,
            groups = {"smoke"}, priority = 2, enabled = true)
    public void IFrameCheck() {
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.findElement(By.xpath("(//*[name()='path'])[18]")).click();
        driver.switchTo().frame("mce_0_ifr");
        WebElement paragraph = driver.findElement(By.cssSelector("body#tinymce > p"));
        String paragraphText = paragraph.getText().trim();
        Assert.assertEquals(paragraphText, "Your content goes here.", "Text does not match!");
    }
}