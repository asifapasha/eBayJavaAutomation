package com.automation.Pages;

import org.openqa.selenium.WebDriver;

import static com.automation.Utils.ConfigUtils.getPropertyByKey;
import static com.automation.Utils.DriverUtils.getDriver;

public class CommonPage{

    WebDriver driver = getDriver();

    public void navigateToApplication() {
        driver.get(getPropertyByKey("url"));
    }
}
