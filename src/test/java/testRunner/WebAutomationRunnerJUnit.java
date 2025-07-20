package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",       // path to feature files
    glue = "stepDefinition",                        // package containing step definitions
    plugin = {
        "pretty",
        "html:target/cucumber-reports/html-report.html",
        "json:target/cucumber-reports/report.json"
    },
    monochrome = true,                               // better console output
    dryRun = false,                                  // true = check mappings only
    tags = "@Sai"                              // optional: run scenarios with this tag
)
public class WebAutomationRunnerJUnit {
    // No code is needed here. Runner is driven by annotations.
}
