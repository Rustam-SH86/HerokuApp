package HerokuAppTests;

import base.SetUp;

import static org.testng.Assert.assertEquals;

public class checkDropDownOptions extends SetUp {
   /* @Test
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
    } */

}
