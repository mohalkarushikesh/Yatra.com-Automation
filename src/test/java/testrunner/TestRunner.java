package testrunner;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/Features/A_HotelsDetails.feature",
		"src/test/resources/Features/B_CruisePage.feature",
		"src/test/resources/Features/C_GiftVoucherPage.feature", }, glue = "stepdefinations", plugin = { "pretty"

				, "html:reports/cucumberReport.html", "rerun:target/rerun.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

})
public class TestRunner extends AbstractTestNGCucumberTests {

}
