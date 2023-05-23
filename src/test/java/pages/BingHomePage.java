package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BingHomePage extends BasePage {
    public BingHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name= "q")
    WebElement queryInput;

    public void searchFor(String queryString) {
        queryInput.sendKeys(queryString);
        queryInput.submit();
    }
}
