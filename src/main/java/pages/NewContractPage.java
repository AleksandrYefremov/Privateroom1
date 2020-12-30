package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;

public class NewContractPage extends ParentPage {

    @FindBy(css = "input[name='eic']")
    private WebElement inputEicNumber;

    @FindBy(css = ".button.button--verify.mat-button-base.mat-stroked-button")
    private WebElement btnVerifyNumber;

    @FindBy(css = "[formcontrolname='BuildingType'] .mat-select-value")
    private WebElement objectDD;

    @FindBy(css = "mat-option:nth-of-type(2) > .mat-option-text")
    private WebElement object;

    @FindBy(css = "[formcontrolname='RegisteredPersons']")
    private WebElement regPersons;

    @FindBy(css = "div:nth-of-type(2) > .ng-pristine.ng-untouched.ng-valid > .mat-accent.mat-checkbox.ng-pristine.ng-untouched.ng-valid  .mat-checkbox-inner-container")
    private WebElement setcheckboxBoiler;

    @FindBy(css = "[formcontrolname='OperatorGrm'] .mat-select-value")
    private WebElement operatorGrmDD;

    @FindBy(css = "mat-option:nth-of-type(10) > .mat-option-text")
    private WebElement operatorGrm;

    @FindBy(css = "[formcontrolname='AddressRegion'] .mat-select-value")
    private WebElement regionDD;

    @FindBy(css = "mat-option:nth-of-type(9) > .mat-option-text")
    private WebElement region;

    @FindBy(css = "[formcontrolname='AddressDistrict'] .mat-select-value")
    private WebElement districtDD;

    @FindBy(css = "mat-option:nth-of-type(8) > .mat-option-text")
    private WebElement district;

    @FindBy(css = "[formcontrolname='AddressCity'] .mat-select-value")
    private WebElement cityDD;

    @FindBy(css = "mat-option:nth-of-type(5) > .mat-option-text")
    private WebElement city;

    @FindBy(css = "[formcontrolname='AddressStreet'] .mat-select-value")
    private WebElement streetDD;

    @FindBy(css = "mat-option:nth-of-type(10) > .mat-option-text")
    private WebElement street;

    @FindBy(css = "[formcontrolname='LastName']")
    private WebElement lastNameField;

    @FindBy(css = "[formcontrolname='FirstName']")
    private WebElement firstNameField;

    @FindBy(css = "[formcontrolname='MiddleName']")
    private WebElement middleNameField;

    @FindBy(css = "[formcontrolname='Birthday']")
    private WebElement birthdayPicker;

    @FindBy(css = "tr:nth-of-type(5) > td:nth-of-type(1) > .mat-calendar-body-cell-content")
    private WebElement birthday;

    @FindBy(css = "[formcontrolname='Inn']")
    private WebElement innField;

    @FindBy(css = "[formcontrolname='PassportTypeId'] .mat-select-value")
    private WebElement passportTypeDD;

    @FindBy(css = "mat-option:nth-of-type(2) > .mat-option-text")
    private WebElement passportType;

    @FindBy(css = "[formcontrolname='PassportNumber']")
    private WebElement passportNumberField;

    @FindBy(css = "[formcontrolname='ContactPhoneNumber']")
    private WebElement phoneNumberField;

    @FindBy(css = ".button.button--submit.mat-accent.mat-button-base.mat-raised-button.ng-star-inserted")
    private WebElement btnSubmit;

    @FindBy(css = ".naftogaz-status.naftogaz-status--5100")
    private WebElement status;



    public NewContractPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterEicNumber(String element) {
        actionsWithElements.enterTextInToElement(inputEicNumber, element);
        actionsWithElements.clickOnElement(btnVerifyNumber);
    }


    public void selectObject() {
        actionsWithElements.clickOnElement(objectDD);
        actionsWithElements.clickOnElement(object);
    }

    public void enterRegPersons(String persons) {
        actionsWithElements.enterTextInToElement(regPersons, persons);
    }

    public void selectOperatorGrm() {
        actionsWithElements.clickOnElement(operatorGrmDD);
        actionsWithElements.clickOnElement(operatorGrm);
    }

    public void selectRegion() {
        actionsWithElements.clickOnElement(regionDD);
        actionsWithElements.clickOnElement(region);
    }

    public void selectDistrict() {
        actionsWithElements.clickOnElement(districtDD);
        actionsWithElements.clickOnElement(district);
    }

    public void selectCity() {
        actionsWithElements.clickOnElement(cityDD);
        actionsWithElements.clickOnElement(city);
    }

    public void selectStreet() {
        actionsWithElements.clickOnElement(streetDD);
        actionsWithElements.clickOnElement(street);
    }

    public void enterLastName(String lastName) {
        actionsWithElements.enterTextInToElement(lastNameField, lastName);
    }

    public void enterFirstName(String firstName) {
        actionsWithElements.enterTextInToElement(firstNameField, firstName);
    }

    public void enterMiddleName(String middleName) {
        actionsWithElements.enterTextInToElement(middleNameField, middleName);
    }

    public void selectBirthday() {
        actionsWithElements.clickOnElement(birthdayPicker);
        actionsWithElements.clickOnElement(birthday);
    }

    public void enterInn(String inn) {
        actionsWithElements.enterTextInToElement(innField, inn);
    }

    public void selectPassportType() {
        actionsWithElements.clickOnElement(passportTypeDD);
        actionsWithElements.clickOnElement(passportType);
    }

    public void enterPassportNumber(String passportNumber) {
        actionsWithElements.enterTextInToElement(passportNumberField, passportNumber);
    }

    public void enterPhoneNumber(String phoneNumber) {
        actionsWithElements.enterNumberInToElement(phoneNumberField, phoneNumber);
    }

    public void clickOnBtnSubmit() throws InterruptedException {
        Thread.sleep(1000);
        actionsWithElements.isElementPresent(btnSubmit);
        actionsWithElements.clickOnElement(btnSubmit);
    }

    public void checkboxBoiler() {
        actionsWithElements.setStatusToCheckBox(setcheckboxBoiler,"check");
    }

    public boolean checkStatus() {
        actionsWithElements.isElementPresent(status);
        return true;
    }

    public void closePrint() throws AWTException {
        // press Escape programatically - the print dialog must have focus, obviously
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        r.keyRelease(KeyEvent.VK_ESCAPE);
    }
}


