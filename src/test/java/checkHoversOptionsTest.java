import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class checkHoversOptionsTest extends setUp {
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
}
