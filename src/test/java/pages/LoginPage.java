package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    WebElement usernameField;

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement submitButton;

    @FindBy(className = "side-nav-logo")
    WebElement isCarSalesLogoPresent;

    @FindBy(className = "page-status service-error")
    WebElement loginPageStatus;

    public void Login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        submitButton.click();
    }

    public void isDisplayedSuccessfulLogin() {
        if (isCarSalesLogoPresent.isDisplayed()) {
            System.out.println("Successfully Logged In, Test Case Passed");
        } else {
            System.err.println("Failed Test Case");
        }
    }

    public void isDisplayedFailureLogin() {
        if (loginPageStatus.isDisplayed()) {
            System.out.println("Test Case Passed");
        } else {
            System.err.println("Failed Test Case");
        }
    }
}