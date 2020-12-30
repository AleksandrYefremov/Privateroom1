package zayavki;

import org.junit.Test;
import parentTest.ParentTest;

import java.awt.*;

public class NewContract extends ParentTest {

    @Test
    public void newContract() throws InterruptedException, AWTException {
        loginPage.loginToPrivateroom();
        loginPage.clickOnBtnNewContract();
        newContractPage.enterEicNumber("4444444444444444");
        newContractPage.selectObject();
        newContractPage.enterRegPersons("11");
        newContractPage.checkboxBoiler();
        newContractPage.selectOperatorGrm();
        newContractPage.selectRegion();
        newContractPage.selectDistrict();
        newContractPage.selectCity();
        newContractPage.selectStreet();
        newContractPage.enterLastName("Перебийніс");
        newContractPage.enterFirstName("Орест");
        newContractPage.enterMiddleName("Михайлович");
        newContractPage.selectBirthday();
        newContractPage.enterInn("3213215765");
        newContractPage.selectPassportType();
        newContractPage.enterPassportNumber("132548731");
        newContractPage.enterPhoneNumber("504682517");
        newContractPage.clickOnBtnSubmit();
        Thread.sleep(10000);
        newContractPage.closePrint();
        newContractPage.checkStatus();
        checkExpectedResult("feedback is not deleted", newContractPage.checkStatus());

        System.out.println("New contract filled up succesfully");

    }
}
