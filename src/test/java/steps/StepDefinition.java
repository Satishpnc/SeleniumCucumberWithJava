package steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import pages.LoginPage;
import transformation.EmailTransform;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class StepDefinition extends BaseUtil {

    /**
     * Steps which are reproduced from 'login.feature'.
     */

    private BaseUtil base;

    public StepDefinition(BaseUtil base) {
        this.base = base;
    }

    @Given("^I am on CarSales signin page$")
    public void iAmOnCarSalesHomepage() {
        base.driver.navigate().to("https://access.carsalesnetwork.com.au/carsales/signin/");
    }

    @When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterValidAnd(String username, String password) {
        base.driver.findElement(By.id("Email")).sendKeys(username);
        base.driver.findElement(By.id("Password")).sendKeys(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        LoginPage page = new LoginPage(base.driver);
        page.clickLogin();
    }

    @Then("^I logged into CarSales")
    public void iLoggedIntoFacebook() {
        LoginPage page = new LoginPage(base.driver);
        page.isDisplayedSuccessfulLogin();
    }

    @And("^I enter the users email address as email:\"([^\"]*)\"$")
    public void iEnterTheUsersEmailAddressAsEmail(@Transform(EmailTransform.class) String email) {
        System.out.println("The Email Address Is: " + email);
    }

    @And("^I enter the following$")
    public void i_enter_the_following(DataTable table) {
        List<User> users = new ArrayList<>();
        // Storing the users
        users = table.asList(User.class);

        LoginPage page = new LoginPage(base.driver);

        for(User user : users) {
            page.Login(user.username, user.password);
        }
    }

    @Then("^I will get a notification for invalid username/password$")
    public void iWillGetANotificationForInvalidUsernamePassword() {
        LoginPage page = new LoginPage(base.driver);
    }

    public class User {

        public String username;
        public String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

    }
}
