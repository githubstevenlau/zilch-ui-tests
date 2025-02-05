package zilch.apply.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import zilch.pages.ApplyPage;
import zilch.pages.BasePage;
import zilch.pages.LoginPage;

import java.util.concurrent.TimeUnit;

import static utilities.Utility.setUtilityDriver;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected ApplyPage applyPage;
    private final String url = "https://customers.payzilch.com/apply";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        applyPage = new ApplyPage();
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
