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
		homepage = new HomePage(driver);
		cruisepage = new CruisePage(driver);
		homepage.moveToMore();
	}

	@Test(priority = 2)
	public void selectCruiseFromMoreListTestCase() {
		homepage.selectCruiseFromMoreList();
	}

	@Test(priority = 3)
	public void clickonReadMoreTestCase() {
		cruisepage.clickonReadMore();
	}

	@Test(priority = 5)
	public void printInclusionPointsTestCase() {
		cruisepage.printInclusionPoints();
	}

	@Test(priority = 6)
	public void navigate2TestCase() {
		// cruise page
		driver.navigate().back();
		// basepage
		driver.navigate().back();
	}

}
