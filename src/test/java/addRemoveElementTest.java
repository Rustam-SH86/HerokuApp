import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.time.Duration;
import java.util.List;

import static org.testng.Assert.*;

public class addRemoveElementTest {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

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

    @Test
    public void checkDropDownOptions() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropDown);
        List<WebElement> options = select.getOptions();
        assertEquals(options.get(0).getText(), "Please select an option");
        assertEquals(options.get(1).getText(), "Option 1");
        assertEquals(options.get(2).getText(), "Option 2");
        select.selectByVisibleText("Option 1");
        Assert.assertTrue(select.getFirstSelectedOption().isSelected());
        select.selectByVisibleText("Option 2");
        Assert.assertTrue(select.getFirstSelectedOption().isSelected());
    }

    @Test
    public void checkCheckboxesOptions() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        assertFalse(checkbox1.isSelected(), "Checkbox1 unchecked by default");
        checkbox1.click();
        Assert.assertTrue(checkbox1.isSelected(), "Checkbox1 should be checked");
        Assert.assertTrue(checkbox2.isSelected(), "Checkbox2 checked by default");
        checkbox2.click();
        assertFalse(checkbox2.isSelected(), "Checkbox2 should be unchecked");
    }

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

    @Test
    public void checkParagraphTypos() {
        driver.get("https://the-internet.herokuapp.com/typos");
        do {
            driver.navigate().refresh();
            WebElement paragraph1 = driver.findElement(By.xpath("//*[@id='content']/div/p[1]"));
            String paragraphText1 = paragraph1.getText();
            String expectedCorrectText1 =
                    "This example demonstrates a typo being introduced. It does it randomly on each page load.";
            assertEquals(paragraphText1, expectedCorrectText1, "The first paragraph text contains a typo.");
            WebElement paragraph2 = driver.findElement(By.xpath("//*[@id='content']/div/p[2]"));
            String paragraphText2 = paragraph2.getText();
            String expectedCorrectText2 =
                    "Sometimes you'll see a typo, other times you won't.";
            assertEquals(paragraphText2, expectedCorrectText2, "The second paragraph text contains a typo.");

        } while (true);
    }

    @Test
    public void checkHoversOptions() {
        driver.get("http://the-internet.herokuapp.com/hovers");
        Actions actions = new Actions(driver);
        WebElement firstUserImage = driver.findElement(By.xpath("(//div[@class='figure'])[1]"));
        actions.moveToElement(firstUserImage).perform();
        WebElement firstUserText = driver.findElement(By.xpath("(//div[@class='figcaption']/h5)[1]"));
        String user1Text = firstUserText.getText();
        String expectedText = "name: user1";
        assertEquals(user1Text, expectedText);
        WebElement viewProfile = driver.findElement(By.cssSelector("a[href='/users/1']"));
        viewProfile.click();
        String title = driver.getTitle();
        System.out.println(title);
        WebElement notFound = driver.findElement(By.xpath("/html/body/h1"));
        assertNotEquals(notFound.getText(), "Not Found");
    }

    @AfterTest(alwaysRun = true)
    public void quitDriver() {
        driver.quit();
    }
}