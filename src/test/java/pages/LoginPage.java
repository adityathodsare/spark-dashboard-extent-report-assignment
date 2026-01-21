package pages;



import locators.LoginPageLocators;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(LoginPageLocators.USERNAME).sendKeys(username);
        driver.findElement(LoginPageLocators.PASSWORD).sendKeys(password);
        driver.findElement(LoginPageLocators.LOGIN_BUTTON).click();
    }

    public boolean isErrorDisplayed() {
        return driver.findElement(LoginPageLocators.ERROR_MESSAGE).isDisplayed();
    }
}

