package com.automation.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.automation.Utils.ConfigUtils.getPropertyByKey;

public class DriverUtils {
    //Oops concept here is implementation of WebDriver to ChromeDriver

    static WebDriver driver;

    public static void initDriver() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getPropertyByKey("url"));
    }



    public static WebDriver getDriver() {

        if (driver == null ) {
            initDriver();
        }
        System.out.println("=====" + driver);
        return driver;
    }

    public static void tearDown() {
        driver.quit();
        System.out.println("=====" + driver);
        driver = null;
    }

    public void closeDriver() {
        driver.close();
    }
}
