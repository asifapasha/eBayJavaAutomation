package com.automation.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.Utils.AssertUtils.*;
import static com.automation.Utils.CommonUtils.clickOnElement;
import static com.automation.Utils.ConfigUtils.getPropertyByKey;
import static com.automation.Utils.DriverUtils.getDriver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(id = "gh-logo")
    private WebElement logoImg;
   // @FindBy(xpath = "//*[text()='Sign in']")
    @FindBy(linkText = "Sign in")
    private WebElement signIn;

    @FindBy(xpath = "//button[@id='gh-ug']/b[1]")
    private WebElement userNamText;


    public void validateHomePage() {
        assertPresent(logoImg);
    }

    public void navigateToSigninPage() {
        clickOnElement(signIn);
    }

    public void verifyUserNameAfterLogin() {
        assertEquals(userNamText, userNamText.getText(), getPropertyByKey("loggedin.username"));
    }
}
