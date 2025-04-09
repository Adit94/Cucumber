package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = "FeatureFiles/CampaignsModule.feature",
		glue={"stepdefinitions"},
		dryRun = false,
		monochrome = true,
		plugin={"html:target/report.html","json:target/report.json"}
		)
public class RunnerClass extends AbstractTestNGCucumberTests{

}
