package zilch.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class ApplyPage extends BasePage {

    public final By emailField = By.name("email");
    public final By passwordField = By.name("passwordSignup");
    public final By oopsEmptyError = By.cssSelector("#form > div:nth-child(1) > div > p");

    public void setEmail(String email) {
        set(emailField, "signmeup@email.com");
    }

    public void clickEmail() {
        click(emailField);
    }

    public String getEmptyValidationError() {
        return find(oopsEmptyError).getText();
    }
}
