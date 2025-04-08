package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = "featurefiles/Login.feature",
		glue={"stepdefinitions"},
		dryRun = true,
		monochrome = true,
		plugin={"html:target/report.html","json:target/report.json"}
		)
public class RunnerClass extends AbstractTestNGCucumberTests{

}
