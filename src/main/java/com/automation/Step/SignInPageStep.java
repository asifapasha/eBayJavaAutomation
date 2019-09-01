package com.automation.Step;

import com.automation.Pages.SignInPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInPageStep {
    SignInPage signInPage = new SignInPage();

    @Then("^Verify Sign Page$")
    public void verifySignInPageStep() {
        signInPage.verifySignInPage();
    }

    @When("^User sign in with valid credentials on sign in page$")
    public  void loginStep() {
        signInPage.login();
    }

    @When("^User login with \"(.*)\" and \"(.*)\" on sign page$")
    public void logInWithParameterStep(String userid, String password) {
        signInPage.login(userid, password);
    }
}
