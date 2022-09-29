package page;

import base.finalExamBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class automationPracticeAuthenticationPage extends finalExamBase {
    public automationPracticeAuthenticationPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "email_create")
    WebElement emailAdressInputField;
    @FindBy(css = ".icon-user.left")
    WebElement createAnAcoountButton;
    @FindBy(css = ".page-heading")
    WebElement authenticationText;
    @FindBy(xpath = "//*[@id=\"create-account_form\"]/h3")
    WebElement createAnAccountText;
    @FindBy(xpath = "//*[@id=\"create-account_form\"]/div")
    WebElement emailEnterText;
    @FindBy(id = "create_account_error")
    WebElement invalidEmailErrorMessage;
    @FindBy(id = "create_account_error")
    WebElement alreadyRegisteredEmailErrorMessage;



    public void setEmailAdressInputField(String email) {
        wdwait.until(ExpectedConditions.visibilityOf(emailAdressInputField));
        emailAdressInputField.clear();
        emailAdressInputField.sendKeys(email);
    }
    public void setCreateAnAcoountButton(){
        wdwait.until(ExpectedConditions.visibilityOf(createAnAcoountButton));
        createAnAcoountButton.click();
    }

    public boolean authenticationTextDisplayed (){
        wdwait.until(ExpectedConditions.visibilityOf(authenticationText));
        return authenticationText.isDisplayed();
    }

    public String authenticationTextText(){
        wdwait.until(ExpectedConditions.visibilityOf(authenticationText));
        return authenticationText.getText();
    }

    public boolean createAnAccountTextDisplayed() {
        wdwait.until(ExpectedConditions.visibilityOf(createAnAccountText));
        return createAnAccountText.isDisplayed();
    }

    public String createAnAccountTextText() {
        wdwait.until(ExpectedConditions.visibilityOf(createAnAccountText));
        return createAnAccountText.getText();
    }
    public boolean emailEnterTextDisplayed() {
        wdwait.until(ExpectedConditions.visibilityOf(emailEnterText));
        return emailEnterText.isDisplayed();
    }

    public String emailEnterTextText() {
        wdwait.until(ExpectedConditions.visibilityOf(emailEnterText));
        return emailEnterText.getText();
    }

    public boolean invalidEmailErrorMessageDisplayed() {
    wdwait.until(ExpectedConditions.visibilityOf(invalidEmailErrorMessage));
    return invalidEmailErrorMessage.isDisplayed();
    }

    public String invalidEmailErrorMessageText() {
        wdwait.until(ExpectedConditions.visibilityOf(invalidEmailErrorMessage));
        return invalidEmailErrorMessage.getText();
    }

    public boolean alreadyRegisteredEmailErrorMessageDisplayed() {
        wdwait.until(ExpectedConditions.visibilityOf(alreadyRegisteredEmailErrorMessage));
        return alreadyRegisteredEmailErrorMessage.isDisplayed();
    }

    public String alreadyRegisteredEmailErrorMessageText() {
        wdwait.until(ExpectedConditions.visibilityOf(alreadyRegisteredEmailErrorMessage));
        return alreadyRegisteredEmailErrorMessage.getText();
    }


}
