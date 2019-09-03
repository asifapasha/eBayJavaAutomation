package com.automation.Pages;
import com.automation.Utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.Utils.AssertUtils.*;
import static com.automation.Utils.CommonUtils.clickOnElement;
import static com.automation.Utils.ConfigUtils.getPropertyByKey;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(DriverUtils.getDriver(),this);
    }

    @FindBy(id = "gh-logo")
    protected WebElement logoImg;
   // @FindBy(xpath = "//*[text()='Sign in']")
    @FindBy(linkText = "Sign in")
    protected WebElement signIn;

    @FindBy(xpath = "//button[@id='gh-ug']/b[1]")
    protected WebElement userNamText;


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
