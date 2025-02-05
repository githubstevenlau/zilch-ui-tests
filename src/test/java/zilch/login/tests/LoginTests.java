package zilch.login.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import zilch.login.base.BaseTest;

public class LoginTests extends BaseTest {

    @Test (dataProvider = "emailAddress")
    public void loginInvalidEmailTest(String emailAddress) {
        loginPage.setEmail(emailAddress);
        loginPage.setPassword("password123!");

        loginPage.clickLoginButton();
    }

    @Test (dataProvider = "randomString")
    public void stringLoginTest(String randomString) {
        loginPage.setEmail(randomString);
        loginPage.setPassword("password123!");

        loginPage.clickLoginButton();

        String validationMessage = loginPage.getInvalidEmailValidationMessage();
        Assert.assertTrue(validationMessage.contains("Please enter a valid email address"));
    }
}
