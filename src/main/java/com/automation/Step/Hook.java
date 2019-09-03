package com.automation.Step;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import static com.automation.Utils.ConfigUtils.loadProperties;
import static com.automation.Utils.DriverUtils.*;

public class Hook {
    @Before
    public void setup() {
        loadProperties();
        getDriver();
    }
    @After
    public void teardown() {
        tearDown();
    }
}
