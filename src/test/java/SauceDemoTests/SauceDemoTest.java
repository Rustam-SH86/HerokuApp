package SauceDemoTests;

import base.SetUp;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;
import pages.SauceDemoPage;


@Log4j2
public class SauceDemoTest extends SetUp {

    @Step("авторизация на сайте")
    @Description("Авторизация на SauceDemo с проверкой успешного входа")
    @Test
    public void loginToSauceDemo() {
        SauceDemoPage sauceDemoPage = new SauceDemoPage(driver);
        sauceDemoPage.open();
        sauceDemoPage.authorization(user,password);
    }
}