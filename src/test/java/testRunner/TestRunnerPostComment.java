package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @description: This class acts as an interlink between cucumber feature files and step definition classes 
 * @author palak_rane
 * @version 1.0
 * @since 10/12/2022
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "../Gurukul/src/main/java/gurukul/feature/featureFile.feature",
		glue= {"stepDefination"},
		tags= {"Smoke"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		monochrome=true
		)
public class TestRunnerPostComment {
}