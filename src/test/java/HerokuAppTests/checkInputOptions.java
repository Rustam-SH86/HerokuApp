package HerokuAppTests;

import base.SetUp;

import static org.testng.Assert.assertEquals;

public class checkInputOptions extends SetUp {
   /* @Test
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
    } */
}
