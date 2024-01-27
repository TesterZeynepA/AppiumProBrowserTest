package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"StepDefs", "Utils"},
        tags = "",
        dryRun = false,
        plugin = {
                "pretty",
                "summary",
                "html:target/reports/cucumber-report.html"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {
}