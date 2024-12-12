package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SauceDemoPage extends BasePage {
    private final By USERNAME_INPUT = (By.cssSelector("#user-name")); //#user-name
    private final By PASSWORD_INPUT = (By.id("password"));
    private final By LOGIN_BUTTON = (By.id("login-button"));
    public SauceDemoPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @Step("Открыть страницу SauceDemo")
    public void open() {
        driver.get("https://www.saucedemo.com");
    }
    @Step("авторизация")
    public void authorization(String username, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
    }
}
