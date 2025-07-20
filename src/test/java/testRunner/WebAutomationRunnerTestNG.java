package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src\\test\\resources\\features",
		glue="stepDefinition",
		dryRun=false,
		monochrome=true,
		tags="@sanity",
		plugin= {"pretty","html:target/cucumberReports/WishListReport.html"}
	//	plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/extentReports/report.html"}
		)

public class WebAutomationRunnerTestNG extends AbstractTestNGCucumberTests{
	
}
