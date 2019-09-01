package com.automation.Pages;

import com.automation.Utils.WebElementUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.Utils.AssertUtils.assertPresent;
import static com.automation.Utils.CommonUtils.sendkeys;
import static com.automation.Utils.ConfigUtils.getPropertyByKey;
import static com.automation.Utils.DriverUtils.getDriver;

public class SearchPage {
    public SearchPage(){

        PageFactory.initElements(getDriver(), this);
    }
    @FindBy(id = "gh-logo")
    private static WebElement logoImg;
    @FindBy(id = "gh-ac")
    private static WebElement searchbox;
    @FindBy(className = "srp-main-content clearfix srp-main-content--flex")
    private static WebElement content;


    public void userIsOnEbayHomepage (){
      assertPresent(logoImg);
    }

    public void searchingForIphone (){
     sendkeys(searchbox, getPropertyByKey("item1"));
    }

    public void searchResultsForIphone (){
       assertPresent(content);

    }
}
