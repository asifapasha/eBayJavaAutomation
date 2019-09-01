package com.automation.Step;
import com.automation.Utils.DriverUtils;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import static com.automation.Utils.ConfigUtils.loadProperties;
import static com.automation.Utils.DriverUtils.*;

public class Hook {
    @Before
    public void setup() {
        loadProperties();
        initDriver();
    }
    @After
    public void teardown() {
        tearDown();
    }
}
