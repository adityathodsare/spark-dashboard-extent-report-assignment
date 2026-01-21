package stepdefinitions;



import io.cucumber.java.en.*;

import org.junit.Assert;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("user is on login page")
    public void openLoginPage() {
        DriverFactory.getDriver().get("https://www.saucedemo.com/");
    }

    @When("user enters valid credentials")
    public void validLogin() {
        loginPage.login("standard_user", "secret_sauce");
    }

    @When("user enters invalid credentials")
    public void invalidLogin() {
        loginPage.login("wrong", "wrong");
    }

    @Then("user should be logged in successfully")
    public void verifyLogin() {
        Assert.assertTrue(DriverFactory.getDriver().getCurrentUrl().contains("inventory"));
    }

    @Then("error message should be displayed")
    public void verifyError() {
        Assert.assertTrue(loginPage.isErrorDisplayed());
    }
}

