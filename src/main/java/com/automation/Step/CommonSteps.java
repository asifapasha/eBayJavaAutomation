package com.automation.Step;

import com.automation.Pages.CommonPage;
import cucumber.api.java.en.Given;

public class CommonSteps {
    CommonPage commonPage = new CommonPage() ;

    @Given("^Navigate to application$")
    public void navigateToApplicationStep() {
        commonPage.navigateToApplication();
    }
}
