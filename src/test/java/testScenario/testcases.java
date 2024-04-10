package testScenario;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pageObjects.HomePage;
import userDefinedLibraries.DriverSetup;

public class testcases extends DriverSetup {
	HomePage homepage;

	private ExtentReports extent;

	// helps to generate the logs in the report
	private ExtentTest test;
	ExtentReports extentreportobj = new ExtentReports();
	String screenshotPath;

	@Parameters({ "browser" })
	@BeforeClass
	public void driverconfig(@Optional("defaultBrowser") String browser) {
		// Instantiate driver
		driver = DriverSetup.driverInstantiate(browser);
		System.out.println("Browser opened with the provided url");
		extent = extentreportobj.tryResolveMediaPath(null);
		System.out.println("Report object Initialised");
	}

	@Test(priority = 0)
	public void clickOnHotelstest() {
		homepage = new HomePage(driver);
		test = extent.createTest("Click on the hotels");
		test.log(Status.INFO, "Starting the test case");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homepage.clickOnHotels();
		test.pass("Hotels got clicked");
	}

	@Test(priority = 1)
	public void sendValue() {
		test = extent.createTest("Enter the city name");
		test.log(Status.INFO, "Starting the test case");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homepage.enterDestinationCity();
		homepage.ClickOnCity();
		test.pass("Entered city name");
	}

	public void clickOnCheckInDate() {
		test = extent.createTest("click on check in date");
		test.log(Status.INFO, "Starting the test case");
		homepage.checkInDate();
		test.pass("clicked on check in date");
	}
	
	@Test(priority=2)
	public void selectCheckInDate() {
		test = extent.createTest("select tomorrows date");
		test.log(Status.INFO, "Starting the test case");
		homepage.selectCheckInDate();
		test.pass("clicked on check in date");
	}
	

	@AfterClass
	public void closeBrowser() {
		//driverTearDown();
		System.out.println("Closed the browser");
	}
}
