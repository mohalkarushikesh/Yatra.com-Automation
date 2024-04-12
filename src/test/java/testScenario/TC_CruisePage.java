package testScenario;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.CruisePage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_CruisePage extends BaseClass{
	HomePage homepage;
	CruisePage cruisepage;
	//private ExtentReports extent;
	//private ExtentTest test; // helps to generate the logs in the report
	ExtentReports extentreportobj = new ExtentReports();
	String screenshotPath;
	
	@Test(priority = 11)
	public void moveToMoreTestCase() {
		homepage = new HomePage(driver);
		homepage.moveToMore();
	}

	@Test(priority = 12)
	public void selectCruiseFromMoreListTestCase() {
		homepage.selectCruiseFromMoreList();
	}
	
	@Test(priority = 13)
	public void clickonReadMoreTestCase() {
		cruisepage = new CruisePage(driver);
		cruisepage.clickonReadMore();
	}

	@Test(priority = 15)
	public void printInclusionPointsTestCase() {
		cruisepage.printInclusionPoints();
	}


	@Test(priority = 16)
	public void navigate2TestCase() {
		// cruise page
		driver.navigate().back();
		// basepage
		driver.navigate().back();
	}
	
	
}
