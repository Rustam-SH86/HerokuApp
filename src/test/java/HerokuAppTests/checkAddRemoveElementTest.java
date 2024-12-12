package HerokuAppTests;

import base.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;


public class checkAddRemoveElementTest extends SetUp {
    @Test
    public void checkAddRemoveElement() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElement = driver.findElement(By.xpath("//button[text() = 'Add Element']"));
        addElement.click();
        addElement.click();
        List<WebElement> buttonDelete = driver.findElements(By.xpath("//button[text() = 'Delete']"));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(buttonDelete.size(), 2);
        buttonDelete.get(1).click();
        List<WebElement> buttonDeleteAfterDelete = driver.findElements(By.xpath("//button[text() = 'Delete']"));
        softAssert.assertEquals(buttonDeleteAfterDelete.size(), 1);
        softAssert.assertAll();
    }
}
