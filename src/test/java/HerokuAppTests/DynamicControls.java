package HerokuAppTests;

import base.SetUp;

public class DynamicControls extends SetUp {

 /*   @Test(testName = "ЧекБокс", description = "Проверяем что после клика пропадает чекбокс", retryAnalyzer = Retry.class,
            groups = {"smoke"}, priority = 2, enabled = true)
    public void checkDynamicControls() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement removeButton = driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']"));
        removeButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.id("message"))));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[@type = 'checkbox']")));
    }

    @Test(testName = "Поле инпут", description = "Проверяем что поле становится кликабельно", retryAnalyzer = Retry.class,
            groups = {"smoke"}, priority = 2, enabled = true)
    public void isInputFieldClickable() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement inputField = driver.findElement(By.xpath("//input[@type='text']"));
        Assert.assertFalse(inputField.isEnabled());
        driver.findElement(By.xpath("//button[normalize-space()='Enable']")).click();
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.id("message"))));
        wait.until(ExpectedConditions.elementToBeClickable(inputField));
    } */

}
