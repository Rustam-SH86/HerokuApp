package SauceDemoTests;

import base.SetUp;
import org.testng.annotations.Test;
import pages.SauceDemoPage;

public class SauceDemoTest extends SetUp {
    @Test
    public void loginToSauceDemo() {
        SauceDemoPage sauceDemoPage = new SauceDemoPage(driver);
        sauceDemoPage.open();
        sauceDemoPage.authorization(user,password);
    }
}