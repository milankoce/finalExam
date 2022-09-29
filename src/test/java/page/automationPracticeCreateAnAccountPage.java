package page;

import base.finalExamBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class automationPracticeCreateAnAccountPage extends finalExamBase {
    public automationPracticeCreateAnAccountPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "customer_firstname")
    WebElement customerFirstNameInputField;
    @FindBy(id = "customer_lastname")
    WebElement customerLastNameInputField;
    @FindBy(id = "passwd")
    WebElement passowrdInputField;
    @FindBy(id = "address1")
    WebElement addressInputField;
    @FindBy(id = "city")
    WebElement cityInputField;
    @FindBy(id = "postcode")
    WebElement postcodeInputField;
    @FindBy(id = "phone_mobile")
    WebElement mobilePhoneInputField;
    @FindBy(id = "submitAccount")
    WebElement registerButton;
    @FindBy(css = ".alert.alert-danger")
    WebElement errorMessage;


    public void setCustomerFirstNameInputField(String firstname) {
        wdwait.until(ExpectedConditions.visibilityOf(customerFirstNameInputField));
        customerFirstNameInputField.clear();
        customerFirstNameInputField.sendKeys(firstname);
    }

    public void setCustomerLastNameInputField(String lastname) {
        wdwait.until(ExpectedConditions.visibilityOf(customerLastNameInputField));
        customerLastNameInputField.clear();
        customerLastNameInputField.sendKeys(lastname);
    }

    public void setPassowrdInputField(String password) {
        wdwait.until(ExpectedConditions.visibilityOf(passowrdInputField));
        passowrdInputField.clear();
        passowrdInputField.sendKeys(password);
    }


    public void setAddressInputField(String adress){
        wdwait.until(ExpectedConditions.visibilityOf(addressInputField));
        addressInputField.clear();
        addressInputField.sendKeys(adress);
    }

    public void setCityInputField(String city) {
        wdwait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.clear();
        cityInputField.sendKeys(city);
    }
    public void setPostcodeInputField(String postcode) {
        wdwait.until(ExpectedConditions.visibilityOf(postcodeInputField));
        postcodeInputField.clear();
        postcodeInputField.sendKeys( postcode );
    }

    public void setMobilePhoneInputField(String mobilephone){
        wdwait.until(ExpectedConditions.visibilityOf(mobilePhoneInputField));
        mobilePhoneInputField.clear();
        mobilePhoneInputField.sendKeys(mobilephone);
    }

    public void setRegisterButton() {
        wdwait.until(ExpectedConditions.visibilityOf(registerButton));
        registerButton.click();
    }


    public boolean firstNameErrorDisplayed() {
        wdwait.until(ExpectedConditions.visibilityOf(errorMessage));
        return errorMessage.isDisplayed();
    }

    public String firstNameErrorText() {
        wdwait.until(ExpectedConditions.visibilityOf(errorMessage));
        return errorMessage.getText();
    }














}

