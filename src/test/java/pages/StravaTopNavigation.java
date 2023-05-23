package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;

public class StravaTopNavigation extends BasePage {
    public StravaTopNavigation(WebDriver driver) {
        super(driver);
    }

    @FindBy(css= "#global-header > nav > div.branding > a")
    WebElement homeOption;
    @FindBy(css= "#container-nav > ul.global-nav.nav-group > li:nth-child(2) > a")
    WebElement trainingDDL;
    @FindBy(css= "#container-nav > ul.global-nav.nav-group > li.nav-item.drop-down-menu.accessible-nav-dropdown.enabled.active > ul > li:nth-child(2) > a")
    WebElement myActivitiesOption;





    public void navigateMyActivities() {
//        trainingDDL.click();
        myActivitiesOption.click();
    }
}
