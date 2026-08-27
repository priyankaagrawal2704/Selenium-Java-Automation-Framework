package Cucumber.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefs {

    @Given("the user opens the application")
    public void openApp(){
        System.out.println("the user opens the application");
    }

    @When("the user enters the credentials")
    public void enterCreds(){
        System.out.println("the user enters the credentials");
    }

    @And("the user clicks on login button")
    public void clickLogin(){
        System.out.println("the user clicks on login button");
    }

    @Then("the user must be able to login")
    public void ableToLogin(){
        System.out.println("the user must be able to login");
    }

    @And("the user enters the incorrect credentials")
    public void incorrectCreds(){
        System.out.println("the user enters the incorrect credentials");
    }

    @Then("the user must not be able to login")
    public void notLoggedIn(){
        System.out.println("the user must not be able to login");
    }

    @Before
    public void beforeHook(){
        System.out.println("Before Hook");
    }

    @After
    public void afterHook(){
        System.out.println("After Hook");
    }

}
