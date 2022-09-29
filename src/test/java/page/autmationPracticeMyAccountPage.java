package page;

import base.finalExamBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class autmationPracticeMyAccountPage extends finalExamBase {
    public autmationPracticeMyAccountPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".info-account")
    WebElement welcomeMessage;
    @FindBy(css = ".account")
    WebElement accountName;


    public boolean welcomeMessageDisplayed(){
        wdwait.until(ExpectedConditions.visibilityOf(welcomeMessage));
        return welcomeMessage.isDisplayed();
    }

    public String welcomeMessageText() {
        wdwait.until(ExpectedConditions.visibilityOf(welcomeMessage));
        return welcomeMessage.getText();
    }

    public boolean accountNameDisplayed() {
        wdwait.until(ExpectedConditions.visibilityOf(accountName));
        return accountName.isDisplayed();
    }

    public String accountNameText() {
        wdwait.until(ExpectedConditions.visibilityOf(accountName));
        return accountName.getText();
    }


}
