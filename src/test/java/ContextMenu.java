import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenu extends setUp {

  /*  @Test(testName = "Контекстное меню", description = "Проверка контекстного меню", retryAnalyzer = Retry.class,
            groups = {"smoke"}, priority = 2, enabled = true)
    public void checkContextMenu() {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(By.id("hot-spot"))).perform();
        String alertText = driver.switchTo().alert().getText();
        Assert.assertEquals(alertText, "You selected a context menu");
    } */
}

