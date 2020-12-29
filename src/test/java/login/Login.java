package login;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class Login {


    @Test
    public void validLogIn(){
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

    WebDriver webDriver = new ChromeDriver();

    webDriver.manage().window().maximize();
    webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


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

        webDriver.quit();
    }



}
