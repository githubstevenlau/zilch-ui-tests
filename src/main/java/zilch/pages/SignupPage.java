package zilch.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class SignupPage extends BasePage {

    @FindBy(id="welcome-screen-button-login-in")
    public WebElement loginButton;

    @FindBy(id="welcome-screen-button-get-started")
    public WebElement getStartedButton;
}
