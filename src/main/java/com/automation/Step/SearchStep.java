package com.automation.Step;

import com.automation.Pages.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStep {
    SearchPage searchpage = new SearchPage();

    @Given("^user is on ebay homepage$")
    public void user_is_on_ebay_homepage() {
               searchpage.userIsOnEbayHomepage();
    }

    @When("^user is searching for iphone$")
    public void user_is_searching_for_iphone() {
        searchpage.searchingForIphone();

    }
    @Then("^user finds search results for iphone$")
    public void user_finds_search_results_for_iphone() {
        searchpage.searchResultsForIphone();

    }

    }

