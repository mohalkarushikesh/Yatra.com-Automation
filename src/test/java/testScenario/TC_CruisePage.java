package testScenario;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import pageObjects.CruisePage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_CruisePage extends BaseClass {
	HomePage homepage;
	CruisePage cruisepage;
	ExtentReports extentreportobj = new ExtentReports();
	String screenshotPath;

	@Test(priority = 1)
	public void moveToMoreTestCase() {
		logger.info("Starting the 'moveToMoreTestCase' test case");
		homepage = new HomePage(driver);
		cruisepage = new CruisePage(driver);
		homepage.moveToMore();
		logger.info("'moveToMoreTestCase' test case completed: Successfully moved to 'More'");
	}

	@Test(priority = 2)
	public void selectCruiseFromMoreListTestCase() {
		logger.info("Starting the 'selectCruiseFromMoreListTestCase' test case");
		homepage.selectCruiseFromMoreList();
		logger.info(
				"'selectCruiseFromMoreListTestCase' test case completed: Successfully selected 'Cruise' from 'More' list");
	}

	@Test(priority = 3)
	public void clickonReadMoreTestCase() {
		logger.info("Starting the 'clickonReadMoreTestCase' test case");
		cruisepage.clickonReadMore();
		logger.info("'clickonReadMoreTestCase' test case completed: Successfully clicked on 'Read More'");
	}

	@Test(priority = 5)
	public void printInclusionPointsTestCase() {
		logger.info("Starting the 'printInclusionPointsTestCase' test case");
		cruisepage.printInclusionPoints();
		logger.info("'printInclusionPointsTestCase' test case completed: Successfully printed inclusion points");
	}

	@Test(priority = 6)
	public void navigate2TestCase() {
		logger.info("Starting the 'navigate2TestCase' test case");
		// cruise page
		driver.navigate().back();
		logger.info("Navigated back from the cruise page");
		// basepage
		driver.navigate().back();
		logger.info("'navigate2TestCase' test case completed: Successfully navigated back to the base page");
	}

}
