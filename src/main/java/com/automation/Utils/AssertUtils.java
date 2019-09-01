package com.automation.Utils;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class AssertUtils {
    WebElementUtils utils = new WebElementUtils();

    public static void assertPresent(WebElement element) {
        waitForVisible(element);
        Assert.assertTrue(String.format("Element %s is displayed !!!", element.getText()), element.isDisplayed());
    }

    private static void waitForVisible(WebElement element) {
    }

    public static void assertNotPresent(WebElement element) {
        Assert.assertTrue(String.format("Element %s is not displayed !!!", element.getText()), !element.isDisplayed());
    }

    public static void assertEquals(WebElement element, String actual, String expected) {
        waitForVisible(element);
        Assert.assertTrue(String.format("Actual text is %s and expected text is %s", actual, expected), actual.contains(expected));
    }
}
