package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.StravaLoginPage;
import pages.StravaTopNavigation;

import java.time.Duration;

public class StravaSteps {
    WebDriver driver;

    @Given("User is on strava.com login page")
    public void userIsOnStravaComLoginPage() {
        System.out.println("Start at login page");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Dimension newDimension = new Dimension(1600, 1200);
        driver.manage().window().setSize(newDimension);


        driver.get("https://www.strava.com/login");
    }

    @When("User logins with username {string} and password {string}")
    public void userLoginsWithUsernameAndPassword(String username, String password) {
        System.out.println("User: " + username + " password: " + password);
        StravaLoginPage stravaLoginPage = new StravaLoginPage(driver);
        stravaLoginPage.stravaLogin(username, password);

    }

    @Then("Strava home page displayed")
    public void stravaHomePageDisplayed() {
        System.out.println("End at Home page");
    }




    @Given("User has logged on as {string} {string}")
    public void userHasLoggedOnAs(String username, String password) {
        System.out.println("Start at login page");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Dimension newDimension = new Dimension(1600, 1200);
        driver.manage().window().setSize(newDimension);

        driver.get("https://www.strava.com/login");

        System.out.println("User: " + username + " password: " + password);
        StravaLoginPage stravaLoginPage = new StravaLoginPage(driver);
        stravaLoginPage.stravaLogin(username, password);
    }

    @And("navigated to My Activities")
    public void navigatedToMyActivities() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Navigate to My Activities");
        StravaTopNavigation stravaTopNavigation = new StravaTopNavigation(driver);
        stravaTopNavigation.navigateMyActivities();
    }

    @When("I do this")
    public void iDoThis() {
        System.out.println("Do this");
    }

    @Then("this happens")
    public void thisHappens() {
        System.out.println("This is what happens");
    }
}
