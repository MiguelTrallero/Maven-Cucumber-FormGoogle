package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"steps"},
        tags = "@002",
        plugin = {"json:target/cucumber-report/cucumber.json",
                "html:target/cucumber-report/cucumber.html",
                "pretty"},
        monochrome = true
)

public class cukeRunner extends AbstractTestNGCucumberTests {
}