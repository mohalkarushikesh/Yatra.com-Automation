package testScenario;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.HomePage;
import pageObjects.HotelsPage;
import pageObjects.HotelsSearchPage;
import testBase.BaseClass;

public class TC_HotelsPage extends BaseClass {
	HomePage homepage;
	HotelsPage hotelspage;
	HotelsSearchPage hotelssearchpage;

	private ExtentReports extent;

	// helps to generate the logs in the report
	private ExtentTest test;
	ExtentReports extentreportobj = new ExtentReports();
	String screenshotPath;

	@Test(priority = 0)
	public void clickonHotelsTestCase() {
		homepage = new HomePage(driver);
		homepage.clickonHotels();
	}

	@Test(priority = 1)
	public void selectCityTestCase() throws InterruptedException {
		hotelspage = new HotelsPage(driver);
		hotelspage.selectCity("Pune");
	}

	@Test(priority = 2)
	public void selectCheckoutDateTestCase() {
		hotelspage.selectCheckoutDate();
	}

	@Test(priority = 3)
	public void clickonTravellerDropDownTestCase() {
		hotelspage.clickonTravellerDropDown();
	}

	@Test(priority = 4)
	public void addTravellersTestCase() {
		hotelspage.addTravellers();
	}

	@Test(priority = 5)
	public void clickonSearchButtonTestCase() {
		hotelspage.clickonSearchButton();
	}

	@Test(priority = 6)
	public void clickonUserRatingTestCase() throws InterruptedException {
		hotelssearchpage = new HotelsSearchPage(driver);
		hotelssearchpage.clickonUserRating();

	}

	@Test(priority = 7)
	public void selectAllAminitiesTestCase() throws InterruptedException {
		hotelssearchpage.selectAllAminities();

	}

	@Test(priority = 8)
	public void displayHotelNamesAndPricesTestCase() throws InterruptedException {
		hotelssearchpage.displayHotelNamesAndPrices();
		Thread.sleep(3000);
	}

	@Test(priority = 10)
	public void navigateHomepageTestCase() {
		driver.navigate().back();
	}

}
