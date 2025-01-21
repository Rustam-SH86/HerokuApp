package HerokuAppTests;

import base.SetUp;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

@Log4j2
public class СheckAddRemoveElementTest extends SetUp {

    @Step("Проверяем удаление и добавление элемента")
    @Description("удаление и добавление элемента")
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
