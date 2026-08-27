package Cucumber.StepDefs;

import Cucumber.Elements.commons;
import Cucumber.Elements.homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumCode {
    ChromeDriver driver;

    @Given("the user opens the website")
    public void open(){
        commons com = new commons();
        driver = com.openApp();
    }

    @When("the user clicks on sign in button")
    public void signInClick(){
        homePage hp = new homePage(driver);
        hp.clickSignIn();
    }
}
