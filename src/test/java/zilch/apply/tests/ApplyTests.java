package zilch.login.tests;

import org.testng.annotations.Test;

import zilch.login.base.BaseTest;

public class LoginTests extends BaseTest {

    @Test
    public void loginErrorMessageTest() {
        loginPage.setEmail("invalid@email.com");
        loginPage.setPassword("password123!");

        loginPage.clickLoginButton();
    }
}
