import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class checkParagraphTypos extends setUp {
  /*  @Test
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
    }*/
}
