package testrunner;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = { 
				"src/test/resources/Features/A_HotelsDetails.feature",
				"src/test/resources/Features/B_CruisePage.feature",
				"src/test/resources/Features/C_GiftVoucherPage.feature", 
			},
		// features = {"@target/return.txt"},
		glue = "stepdefinations",  // gherkins keywords
		plugin = { "pretty",
				"html:reports/cucumberReport.html", // cucumber junit report
				"rerun:target/rerun.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" // third party report 
		},
		dryRun=false, // if true checks for association of methods in step definations 
		monochrome=true, // avoid junk characters in output
		publish=true,	// publish report in cucumber server
		//tags = "@smoke and @regression"		
		tags = "@Smoke or @regression"	
		//tags = "@Smoke",		
		//tags = "@regression",	
	)
public class TestRunner extends AbstractTestNGCucumberTests {

}
