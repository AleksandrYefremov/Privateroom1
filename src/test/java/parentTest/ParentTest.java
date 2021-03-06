package parentTest;

import libs.ConfigProperties;
import org.aeonbits.owner.ConfigFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import pages.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {

    WebDriver webDriver;
    protected static ConfigProperties configProperties = ConfigFactory.create(ConfigProperties.class);
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected ReceiptPage receiptPage;
    protected NewContractPage newContractPage;
    protected ChangeContractPage changeContractPage;
    protected EditSparePage editSparePage;
    String browser = System.getProperty("browser");

    @Before
    public void setUp() {
//        initDriver();
        File driver = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", driver.getAbsolutePath());
        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage = new HomePage(webDriver);
        receiptPage = new ReceiptPage(webDriver);
        loginPage = new LoginPage(webDriver);
        newContractPage = new NewContractPage(webDriver);
        changeContractPage = new ChangeContractPage(webDriver);

    }

    @After
    public void tearDown() {
        webDriver.quit();
    }

    protected void checkExpectedResult (String message, boolean actualResult) {
        Assert.assertEquals(message,true, actualResult);
    }

    private void initDriver(){
        if (browser == null || "chrome".equals(browser.toLowerCase())){
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        webDriver = new ChromeDriver();
    } else if ("firefox".equals(browser)){
            File file = new File("./src/drivers/geckodriver.exe");
            System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
            FirefoxOptions profile = new FirefoxOptions();
            profile.addPreference("browser.startup.page", 0);
            profile.addPreference("browser.startup.homepage_override.mstone", "ignore"); // Suppress the "What's new" page

            webDriver = new FirefoxDriver();
        }
    }
}
