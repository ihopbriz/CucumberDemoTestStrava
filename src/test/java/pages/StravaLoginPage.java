package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StravaLoginPage extends BasePage {
    public StravaLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id= "email")
    WebElement usernameInput;
    @FindBy(id= "password")
    WebElement passwordInput;
    @FindBy(id= "login-button")
    WebElement loginButton;


    public void stravaLogin(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
