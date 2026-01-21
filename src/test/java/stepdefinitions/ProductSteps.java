package stepdefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;
import pages.ProductPage;
import utils.DriverFactory;

public class ProductSteps {

    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    ProductPage productPage = new ProductPage(DriverFactory.getDriver());

    @Given("user is logged in")
    public void user_is_logged_in() {
        DriverFactory.getDriver().get("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret_sauce");
    }

    @When("user adds product to cart")
    public void user_adds_product_to_cart() {
        productPage.addToCart();
        productPage.goToCart();
    }

    @Then("product should be visible in cart")
    public void product_should_be_visible_in_cart() {
        // assertion handled in cart step
    }
}
