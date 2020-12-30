package zayavki;

import org.junit.Test;
import parentTest.ParentTest;

public class ChangeContract extends ParentTest {
    @Test
    public void newContract() throws InterruptedException {
        loginPage.loginToPrivateroom();
        loginPage.clickOnBtnChangeContract();
        newContractPage.enterEicNumber("4444444444444444");
        Thread.sleep(500);
        newContractPage.selectObject();
        Thread.sleep(300);
        newContractPage.enterRegPersons("11");
        Thread.sleep(300);
        newContractPage.checkboxBoiler();
        Thread.sleep(300);
        newContractPage.selectOperatorGrm();
        Thread.sleep(300);
        newContractPage.selectRegion();
        Thread.sleep(300);
        newContractPage.selectDistrict();
        Thread.sleep(300);
        newContractPage.selectCity();
        Thread.sleep(300);
        newContractPage.selectStreet();
        Thread.sleep(300);
        newContractPage.enterLastName("Перебийніс");
        Thread.sleep(300);
        newContractPage.enterFirstName("Орест");
        Thread.sleep(300);
        newContractPage.enterMiddleName("Михайлович");
        Thread.sleep(300);
        newContractPage.selectBirthday();
        Thread.sleep(300);
        newContractPage.enterInn("3213215765");
        Thread.sleep(300);
        newContractPage.selectPassportType();
        Thread.sleep(300);
        newContractPage.enterPassportNumber("132548731");
        Thread.sleep(300);
        newContractPage.enterPhoneNumber("504682517");
        Thread.sleep(300);
        newContractPage.clickOnBtnSubmit();
        Thread.sleep(1000);
//        newContractPage.checkStatus();

        System.out.println("Change contract filled up succesfully");

    }
}
