/*import static org.testng.AssertJUnit.assertEquals;

public class DataProvider {

@DataProvider()
  public Object[][] loginData() {
      return new Object[][]{
              {"", "secret_sauce", "Epic sadface: Username is required"},
              {"standard_user", "", "Epic sadface: Password is required"},
              {"standard_user", "123342424", "Epic sadface: Username and password do not match any user in this service"}
      };
  }

  @Test (dataProvider = "loginData", testName = "Негативные проверки гистрации",
          retryAnalyzer = Retry.class,groups = {"smoke"},priority = 3,enabled = true)
  @Description("Негативные проверки для login и password")
  public void test(String user, String password, String expectedError) {
      loginPage.open();
      loginPage.login(user, password);
      assertEquals(
              loginPage.getErrorMessage(),
              expectedError,
              "Сообщение об ошибке не верное");
  }
}
} */
