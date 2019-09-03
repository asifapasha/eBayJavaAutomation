package com.automation.Pages;
import com.automation.Utils.WebElementUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.Utils.AssertUtils.assertPresent;
import static com.automation.Utils.CommonUtils.*;
import static com.automation.Utils.ConfigUtils.getPropertyByKey;
import static com.automation.Utils.DriverUtils.getDriver;

public class SignInPage {

    public SignInPage(){
        PageFactory.initElements(getDriver(), this);

    }
    @FindBy(id = "userid")
    private WebElement usernameTextfield;
    @FindBy(id = "pass")
    private WebElement passwordfield;
    @FindBy(id = "sgnBt")
    private WebElement signInbutton;
    @FindBy(id = "GREET-SIGN-IN-TO-EBAY")
    private WebElement signInText;

    public void verifySignInPage(){
     assertPresent(signInText);
    }
    public void login(){
        sendkeys(usernameTextfield, getPropertyByKey("username"));
        sendkeys(passwordfield,getPropertyByKey("password"));
        clickOnElement(signInbutton);
    }

    public void login(String userid, String password) {
        sendkeys(usernameTextfield, userid);
        sendkeys(passwordfield, password);
        clickOnElement(signInbutton);
    }
}
