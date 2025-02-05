package zilch.login.base;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import zilch.pages.BasePage;
import zilch.pages.LoginPage;

import static utilities.Utility.setUtilityDriver;
import static utilities.Utility.getRandomString;


public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    private final String url = "https://customers.payzilch.com/login";

    Faker faker = new Faker(new Locale("en-GB"));

    /*
     * Data provider for fake emails
     */
    @DataProvider(name = "emailAddress")
    public Object[][] createFakeEmail() {
        return new Object[][] {
                { faker.internet().emailAddress() },
                { faker.internet().emailAddress() }
        };
    }

    /*
     * Data provider for random string - can be used to create a parameterised
     * test that can be used for boundary value testing or input/output partitioning.
     */
    @DataProvider(name = "randomString")
    public Object[][] createRandomString() {
        return new Object[][] {
                { getRandomString(1) },
                { getRandomString(10 ) }
        };
    }

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        loginPage = new LoginPage();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
    }
}
