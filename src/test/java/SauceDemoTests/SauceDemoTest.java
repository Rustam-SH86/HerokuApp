package SauceDemoTests;

import base.SetUp;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
import pages.SauceDemoPage;

public class SauceDemoTest extends SetUp {
    @Step("авторизация на сайте")
    @Test
    public void loginToSauceDemo() {
        SauceDemoPage sauceDemoPage = new SauceDemoPage(driver);
        sauceDemoPage.open();
        sauceDemoPage.authorization(user,password);
    }
}