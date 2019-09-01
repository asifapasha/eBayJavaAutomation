package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(tags = "@smoke", plugin = {"pretty", "html:target/cucumber-report",
            "json:target/json-cucumber-report"}, glue = "com.automation.Step",
            features = "src/test/java/feature")
    public class SmokeRunner {
}
