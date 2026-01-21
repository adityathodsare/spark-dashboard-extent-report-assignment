package pages;


import locators.ProductPageLocators;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        driver.findElement(ProductPageLocators.ADD_TO_CART).click();
    }

    public void goToCart() {
        driver.findElement(ProductPageLocators.CART_ICON).click();
    }
}
