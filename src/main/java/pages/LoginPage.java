package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LoginPage extends ParentPage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }
    Logger logger = Logger.getLogger(getClass());

    public void loginToPrivateroom(){

        webDriver.get("https://vnd.test1:Pa$$w0rd@privateroom.competence.com:33443/api/v1/Users/Current/LinkedApplications/UserApplication");
        webDriver.findElement(By.id("details-button")).click();
        webDriver.findElement(By.id("proceed-link")).click();

        System.out.println("Auth in API:33443");

        webDriver.get("https://vnd.test1:Pa$$w0rd@privateroom.competence.com:34443/api/User/Roles");

        System.out.println("Auth in API:34443");

        webDriver.get("https://vnd.test1:Pa$$w0rd@k2dev/api/workflow/v1/tasks/");
        webDriver.findElement(By.id("details-button")).click();
        webDriver.findElement(By.id("proceed-link")).click();

        System.out.println("Auth in K2");

        webDriver.get("https://vnd.test1:Pa$$w0rd@privateroom.competence.com/#/apps/naftogaz/");
        webDriver.findElement(By.id("details-button")).click();
        webDriver.findElement(By.id("proceed-link")).click();

        System.out.println("Site was opened");

        Assert.assertTrue("App Naftogaz is not opened", ((ChromeDriver) webDriver).findElementByCssSelector(".ng-star-inserted h1") .isDisplayed());
        System.out.println("App Naftogaz was opened");
    }

    public void clickOnBtnReceipt() throws InterruptedException {
//        Thread.sleep(5000);
        actionsWithElements.isElementPresent(By.cssSelector(".naftogaz-requests-actions [type='button']:nth-of-type(3)"));
        actionsWithElements.clickOnElement(By.cssSelector(".naftogaz-requests-actions [type='button']:nth-of-type(3)"));
    }

    public void clickOnBtnNewContract() {
        actionsWithElements.isElementPresent(By.cssSelector(".naftogaz-requests-actions > button:nth-of-type(2)"));
        actionsWithElements.clickOnElement(By.cssSelector(".naftogaz-requests-actions > button:nth-of-type(2)"));
    }

    public void clickOnBtnChangeContract() {
        actionsWithElements.isElementPresent(By.cssSelector(".naftogaz-requests-actions > button:nth-of-type(1)"));
        actionsWithElements.clickOnElement(By.cssSelector(".naftogaz-requests-actions > button:nth-of-type(1)"));
    }
}
