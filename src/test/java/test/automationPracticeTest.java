package test;

import base.finalExamBase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import page.autmationPracticeMyAccountPage;
import page.automationPracticeAuthenticationPage;
import page.automationPracticeCreateAnAccountPage;
import page.automationPracticePage;

public class automationPracticeTest extends finalExamBase {
    automationPracticePage AutomationPracticePage;
    automationPracticeAuthenticationPage AutomationPracticeAuthenticationPage;
    automationPracticeCreateAnAccountPage AutomationPracticeCreateAnAccountPage;
    autmationPracticeMyAccountPage AutmationPracticeMyAccountPage;

    @Before
    public void setUpTest() {
        AutomationPracticePage = new automationPracticePage();
        AutomationPracticeAuthenticationPage = new automationPracticeAuthenticationPage();
        AutomationPracticeCreateAnAccountPage = new automationPracticeCreateAnAccountPage();
        AutmationPracticeMyAccountPage = new autmationPracticeMyAccountPage();
    }

    @Test
    public void clickOnsignInButton(){
        AutomationPracticePage.setSignInButton();
    }

    @Test
    public void createAccountWithoutEmailIntoEmailFIedl(){
        AutomationPracticePage.setSignInButton();
        AutomationPracticeAuthenticationPage.setCreateAnAcoountButton();
        Assert.assertTrue(AutomationPracticeAuthenticationPage.invalidEmailErrorMessageDisplayed());
        Assert.assertEquals("Invalid email address.", AutomationPracticeAuthenticationPage.invalidEmailErrorMessageText());
    }

    @Test
    public void createAccountWithValidEmailAddress() {
        AutomationPracticePage.setSignInButton();
        AutomationPracticeAuthenticationPage.setEmailAdressInputField("zoki@zoki.com");
        AutomationPracticeAuthenticationPage.setCreateAnAcoountButton();

    }
    @Test
    public void createAccountWithAlreadyUsedEmailAddress() {
        AutomationPracticePage.setSignInButton();
        AutomationPracticeAuthenticationPage.setEmailAdressInputField("zoki@zoki.com");
        AutomationPracticeAuthenticationPage.setCreateAnAcoountButton();
        Assert.assertTrue(AutomationPracticeAuthenticationPage.alreadyRegisteredEmailErrorMessageDisplayed());
        Assert.assertEquals("An account using this email address has already been registered. Please enter a valid password or request a new one.",AutomationPracticeAuthenticationPage.alreadyRegisteredEmailErrorMessageText());
    }


    @Test
    public void authetnticationText() {
        AutomationPracticePage.setSignInButton();
        Assert.assertTrue(AutomationPracticeAuthenticationPage.authenticationTextDisplayed());
        Assert.assertEquals("AUTHENTICATION", AutomationPracticeAuthenticationPage.authenticationTextText());
    }

    @Test
    public void createAnAccountText() {
        AutomationPracticePage.setSignInButton();
        Assert.assertTrue(AutomationPracticeAuthenticationPage.createAnAccountTextDisplayed());
        Assert.assertEquals("CREATE AN ACCOUNT", AutomationPracticeAuthenticationPage.createAnAccountTextText());
    }

    @Test
    public void enterEmailText() {
        AutomationPracticePage.setSignInButton();
        Assert.assertTrue(AutomationPracticeAuthenticationPage.emailEnterTextDisplayed());
        Assert.assertEquals("Please enter your email address to create an account.",AutomationPracticeAuthenticationPage.createAnAccountTextText());

    }

    @Test
    public void creatingAccountWithValidCredentials(){
        AutomationPracticePage.setSignInButton();
        AutomationPracticeAuthenticationPage.setEmailAdressInputField("zoki3@zoki.com");
        AutomationPracticeAuthenticationPage.setCreateAnAcoountButton();
        AutomationPracticeCreateAnAccountPage.setCustomerFirstNameInputField("zokixa");
        AutomationPracticeCreateAnAccountPage.setCustomerLastNameInputField("zokicac");
        AutomationPracticeCreateAnAccountPage.setPassowrdInputField("zokilele");
        AutomationPracticeCreateAnAccountPage.setAddressInputField("zokijeva1");
        AutomationPracticeCreateAnAccountPage.setCityInputField("zokislava");
        Select state = new Select(driver.findElement(By.id("id_state")));
        state.selectByValue("1");
        AutomationPracticeCreateAnAccountPage.setPostcodeInputField("00000");
        AutomationPracticeCreateAnAccountPage.setMobilePhoneInputField("22222222");
        AutomationPracticeCreateAnAccountPage.setRegisterButton();

    }




    @Test
    public void myAccountName() {
        AutomationPracticePage.setSignInButton();
        AutomationPracticeAuthenticationPage.setEmailAdressInputField("zoki5@zoki.com");
        AutomationPracticeAuthenticationPage.setCreateAnAcoountButton();
        AutomationPracticeCreateAnAccountPage.setCustomerFirstNameInputField("zokid3");
        AutomationPracticeCreateAnAccountPage.setCustomerLastNameInputField("zokica");
        AutomationPracticeCreateAnAccountPage.setPassowrdInputField("zokilele");
        AutomationPracticeCreateAnAccountPage.setAddressInputField("zokijeva1");
        AutomationPracticeCreateAnAccountPage.setCityInputField("zokislava");
        Select state = new Select(driver.findElement(By.id("id_state")));
        state.selectByValue("1");
        AutomationPracticeCreateAnAccountPage.setPostcodeInputField("00000");
        AutomationPracticeCreateAnAccountPage.setMobilePhoneInputField("22222222");
        AutomationPracticeCreateAnAccountPage.setRegisterButton();
        Assert.assertTrue(AutmationPracticeMyAccountPage.accountNameDisplayed());
        Assert.assertEquals("zokid3 zokica", AutmationPracticeMyAccountPage.accountNameText());


    }




}
