package page;

import base.finalExamBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class automationPracticePage extends finalExamBase {
    public automationPracticePage() { PageFactory.initElements(driver, this); }

    @FindBy(css = ".header_user_info")
    WebElement signInButton;

    public void setSignInButton() {
        wdwait.until(ExpectedConditions.visibilityOf(signInButton));
        signInButton.click();
    }

}
