package steps;

import base.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import utils.DriverFactory;
import utils.DriverUtils;

public class StepDefinitions {


    String loginPageExpectedTitle = DriverFactory.prop.getProperty("loginPageExpectedTitle");
    String loginPageActualTitle;


    @Given("I am on login page")
    public void i_am_on_login_page() {
        DriverUtils.navigateToUrl(DriverFactory.prop.getProperty("url"));
        loginPageActualTitle = DriverUtils.getPageTitle();
        Assertions.assertEquals(loginPageExpectedTitle, loginPageActualTitle);
    }

    @When("I enter email")
    public void i_enter_email() {
        BasePage.loginPage.enterEmail(DriverFactory.prop.getProperty(("email")));
    }

    @When("I enter password")
    public void i_enter_password() {
        BasePage.loginPage.enterPassword(DriverFactory.prop.getProperty(("password")));
    }

    @When("I choose role as admin")
    public void i_choose_role_as_admin() {
        BasePage.loginPage.selectRole(DriverFactory.prop.getProperty("role"));
    }

    @When("I Click on sign in button")
    public void i_click_on_sign_in_button() {
        BasePage.loginPage.clickSignInBtn();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully()
    {


    }

}
