package zayavki;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import parentTest.ParentTest;

import java.util.concurrent.TimeUnit;

public class Receipt extends ParentTest {

    @Test
    public void makeReceipt() throws InterruptedException {
        loginPage.loginToPrivateroom();
        loginPage.clickOnBtnReceipt();
        receiptPage.enterPersonalNumber("111111111");
        receiptPage.checkboxDataCorrect();
        receiptPage.clickOnBtnGetReceipt();
        receiptPage.clockOnBtnOk();
        System.out.println("Receipt received succesfully");

    }

}
