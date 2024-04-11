package testScenario;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pageObjects.HomePage;
import pageObjects.HotelsPage;
import userDefinedLibraries.DriverSetup;

public class TC_HomePage extends DriverSetup {
	HomePage homepage;
	HotelsPage hotelspage;
	
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
		// System.out.println("Browser opened with the provided url");
		extent = extentreportobj.tryResolveMediaPath(null);
	}

	@Test(priority = 0)
	public void clickonHotelsTestCase() {
		homepage = new HomePage(driver);
		homepage.clickonHotels();
	}

	@Test(priority = 1)
	public void selectCityTestCase() throws InterruptedException {
		homepage.selectCity("Bangalore");
	}

	@Test(priority = 2)
	public void selectCheckoutDateTestCase() {
		homepage.selectCheckoutDate();
	}

	@Test(priority = 3)
	public void clickonTravellerDropDownTestCase() {
		homepage.clickonTravellerDropDown();
	}

	@Test(priority = 4)
	public void addTravellersTestCase() {
		homepage.addTravellers();
	}
	
	@Test(priority = 5)
	public void clickonSearchButtonTestCase() {
		homepage.clickonSearchButton();
	}
	
	
	@Test(priority = 6)
	public void clickonUserRatingTestCase() throws InterruptedException {
		hotelspage = new HotelsPage(driver);
		hotelspage.clickonUserRating();
		
	}
	
	@Test(priority = 7)
	public void selectAllAminitiesTestCase() throws InterruptedException {
		hotelspage.selectAllAminities();
		
	}
	
	@Test(priority = 8)
	public void displayHotelNamesAndPricesTestCase() throws InterruptedException {
		hotelspage.displayHotelNamesAndPrices();
		Thread.sleep(3000);
	}
	
	@Test(priority = 10)
	public void navigateHomepageTestCase() {
		hotelspage.navigateHomepage();
	}
	
	@Test(priority = 11)
	public void moveToMoreTestCase() {
		homepage.moveToMore();
	}
	
	@Test(priority = 12)
	public void selectCruiseFromMoreListTestCase() {
		homepage.selectCruiseFromMoreList();
	}
	@Test(priority = 13)
	public void clickonReadMoreTestCase() {
		homepage.clickonReadMore();
	}
	@Test(priority = 14)
	public void scrollTestCase1() throws InterruptedException {
		homepage.scroll();
	}
	@Test(priority = 15)
	public void printInclusionPointsTestCase() {
		homepage.printInclusionPoints();
	}
	
	@Test(priority = 16)
	public void navigate2TestCase(){
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority = 17)
	public void moveToMore2TestCase() {
		homepage.moveToMore2();
	}
	
	
	@Test(priority = 18)
	public void selectGiftFromMoreListTestCase() {
		homepage.selectGiftFromMoreList();
	}
	
	@Test(priority = 19)
	public void switchToGiftVoucherTestCase() {
		homepage.switchToGiftVoucher();
	}
	
	
	
	@Test(priority = 21)
	public void checkForPhoneToolTipTestCase() throws InterruptedException {
		homepage.checkForPhoneToolTip();
	}
	
	@Test(priority = 22)
	public void checkForEmailToolTipTestCase() throws InterruptedException {
		homepage.checkForEmailToolTip();
	}
	

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		driverTearDown();
	}
}
