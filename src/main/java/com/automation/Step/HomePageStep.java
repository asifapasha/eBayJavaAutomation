package com.automation.Step;

import com.automation.Pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStep {
    static HomePage homePage = new HomePage(); // Demo Static

    @Given("^Validate homepage$")
    public void validateHomePageStep() {
    homePage.validateHomePage();
    }

    @When("^User navigates to signin page$")
    public void navigateToSignInPageStep() {
       homePage.navigateToSigninPage();
    }

    @Then("^Verify User on homepage after successfull login$")
    public void verifyUserAfterLoginStep() {
        homePage.verifyUserNameAfterLogin();
    }
}
