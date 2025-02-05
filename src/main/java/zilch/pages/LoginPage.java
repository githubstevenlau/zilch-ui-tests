package zilch.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private final By emailField = By.id("email-field");
    private final By passwordField = By.id("password-field");
    private final By loginButton = By.id("log-in-button");

    public LoginPage() {
        super();
    }

    public void setEmail(String email) {
        set(emailField, email);
    }

    public void setPassword(String password) {
        set(passwordField, password);
    }

    public void clickLoginButton() {
        click(loginButton);
    }
}
