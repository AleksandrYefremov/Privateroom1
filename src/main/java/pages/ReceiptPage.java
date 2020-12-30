package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReceiptPage extends ParentPage {

    @FindBy (css = "input[name='eic']")
    private WebElement inputPersonalNumber;

    @FindBy(css = ".button.button--verify.mat-button-base.mat-stroked-button")
    private WebElement buttonFind;

    @FindBy(css = ".mat-checkbox-inner-container")
    private WebElement checkboxCorrect;

    @FindBy(css = ".button.button--submit.mat-accent.mat-button-base.mat-raised-button")
    private WebElement btnSubmit;

    @FindBy(css = ".mat-button.mat-button-base")
    private WebElement btnOk;


    public ReceiptPage(WebDriver webDriver) {
        super(webDriver);

}


    public void enterPersonalNumber(String element) {
        actionsWithElements.enterTextInToElement(inputPersonalNumber, element);
        actionsWithElements.clickOnElement(buttonFind);

    }

    public void checkboxDataCorrect() {
        actionsWithElements.setStatusToCheckBox(checkboxCorrect,"check");
    }

    public void clickOnBtnGetReceipt() {
        actionsWithElements.clickOnElement(btnSubmit);
    }

    public void clockOnBtnOk() {
        actionsWithElements.clickOnElement(btnOk);
    }
}

