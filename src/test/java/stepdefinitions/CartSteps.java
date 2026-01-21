package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductPage;
import utils.DriverFactory;

public class CartSteps {

    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    ProductPage productPage = new ProductPage(DriverFactory.getDriver());
    CartPage cartPage = new CartPage(DriverFactory.getDriver());

    @Given("user has product in cart")
    public void user_has_product_in_cart() {
        DriverFactory.getDriver().get("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret_sauce");
        productPage.addToCart();
        productPage.goToCart();
    }

    @When("user removes product")
    public void user_removes_product() {
        cartPage.removeProduct();
    }

    @Then("cart should be empty")
    public void cart_should_be_empty() {
        Assert.assertTrue(cartPage.isCartEmpty());
    }
}
