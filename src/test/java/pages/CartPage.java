package pages;


import locators.CartPageLocators;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void removeProduct() {
        driver.findElement(CartPageLocators.REMOVE_BUTTON).click();
    }

    public boolean isCartEmpty() {
        return driver.findElements(CartPageLocators.CART_ITEMS).isEmpty();
    }
}

