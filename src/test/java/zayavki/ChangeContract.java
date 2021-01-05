package zayavki;

import org.junit.Test;
import parentTest.ParentTest;

import java.awt.*;

public class ChangeContract extends ParentTest {
    @Test
    public void newContract() throws InterruptedException, AWTException {
        loginPage.loginToPrivateroom();
        loginPage.clickOnBtnChangeContract();
        changeContractPage.enterEicNumber("4444444444444444");
        changeContractPage.selectObject();
        changeContractPage.choosePrivilege();
        changeContractPage.chooseCounter();
        changeContractPage.enterRegPersons("11");
        changeContractPage.checkboxBoiler();
        changeContractPage.selectOperatorGrm();
        changeContractPage.selectRegion();
        changeContractPage.selectDistrict();
        changeContractPage.selectCity();
        changeContractPage.selectStreet();
        changeContractPage.enterBuilding("15А");
        changeContractPage.enterIndex("04216");
        changeContractPage.enterLastName("Перебийніс");
        changeContractPage.enterFirstName("Орест");
        changeContractPage.enterMiddleName("Михайлович");
        changeContractPage.selectBirthday();
        changeContractPage.enterInn("3213215765");
        changeContractPage.selectPassportType();
        changeContractPage.enterPassportNumber("132548731");
        changeContractPage.enterPhoneNumber("504682517");
        changeContractPage.enterEmail("sample@gmail.com");
        changeContractPage.clickOnBtnSubmit();
        Thread.sleep(10000);
        changeContractPage.closePrint();
        changeContractPage.checkStatus();
        checkExpectedResult("Status is not present", changeContractPage.checkStatus());

        System.out.println("Change contract filled up succesfully");

    }
}
