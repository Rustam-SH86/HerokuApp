import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class checkInputOptionsTest extends setUp {
    @Test
    public void checkInputOptions() {
        driver.get("https://the-internet.herokuapp.com/inputs");
        WebElement input = driver.findElement(By.xpath("//input[@type='number']"));
        input.click();
        input.sendKeys("111");
        input.sendKeys(Keys.ARROW_UP);
        String actualValue = input.getAttribute("value");
        assertEquals(actualValue, "112");
        input.sendKeys(Keys.ARROW_DOWN);
        actualValue = input.getAttribute("value");
        assertEquals(actualValue, "111");
    }
}
