package testScenario;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import pageObjects.HomePage;
import pageObjects.HotelsPage;
import pageObjects.HotelsSearchPage;
import testBase.BaseClass;

public class TC_HotelsPage extends BaseClass {
	HomePage homepage;
	HotelsPage hotelspage;
	HotelsSearchPage hotelssearchpage;
	ExtentReports extentreportobj = new ExtentReports();
	String screenshotPath;
	
	@Test(priority = 0)
	public void clickonHotelsTestCase() {
		logger.info("Starting the 'clickonHotelsTestCase' test case");
		homepage = new HomePage(driver);
		homepage.clickonHotels();
		logger.info("'clickonHotelsTestCase' test case completed: Successfully clicked on Hotels");
	}

	@Test(priority = 1)
	public void selectCityTestCase() throws InterruptedException {
		logger.info("Starting the 'selectCityTestCase' test case");
		hotelspage = new HotelsPage(driver);
		hotelspage.selectCity(p.getProperty("city"));
		logger.info("'selectCityTestCase' test case completed: Successfully selected the city");
	}

	@Test(priority = 2)
	public void selectCheckoutDateTestCase() {
		logger.info("Starting the 'selectCheckoutDateTestCase' test case");
		hotelspage.selectCheckoutDate();
		logger.info("'selectCheckoutDateTestCase' test case completed: Successfully selected the checkout date");
	}

	@Test(priority = 3)
	public void clickonTravellerDropDownTestCase() {
		logger.info("Starting the 'clickonTravellerDropDownTestCase' test case");
		hotelspage.clickonTravellerDropDown();
		logger.info(
				"'clickonTravellerDropDownTestCase' test case completed: Successfully clicked on the traveller dropdown");
	}

	@Test(priority = 4)
	public void addTravellersTestCase() {
		logger.info("Starting the 'addTravellersTestCase' test case");
		hotelspage.addTravellers();
		logger.info("'addTravellersTestCase' test case completed: Successfully added travellers");
	}

	@Test(priority = 5)
	public void clickonSearchButtonTestCase() {
		logger.info("Starting the 'clickonSearchButtonTestCase' test case");
		hotelspage.clickonSearchButton();
		logger.info("'clickonSearchButtonTestCase' test case completed: Successfully clicked on the search button");
	}

	@Test(priority = 6)
	public void clickonUserRatingTestCase() throws InterruptedException {
		logger.info("Starting the 'clickonUserRatingTestCase' test case");
		hotelssearchpage = new HotelsSearchPage(driver);
		hotelssearchpage.clickonUserRating();
		logger.info("'clickonUserRatingTestCase' test case completed: Successfully clicked on user rating");
	}

	@Test(priority = 7)
	public void selectAllAminitiesTestCase() throws InterruptedException {
		logger.info("Starting the 'selectAllAminitiesTestCase' test case");
		hotelssearchpage.selectAllAminities();
		logger.info("'selectAllAminitiesTestCase' test case completed: Successfully selected suggested amenities");
	}

	@Test(priority = 8)
	public void displayHotelNamesAndPricesTestCase() throws InterruptedException {
		logger.info("Starting the 'displayHotelNamesAndPricesTestCase' test case");
		hotelssearchpage.displayHotelNamesAndPrices();
		Thread.sleep(3000);
		logger.info(
				"'displayHotelNamesAndPricesTestCase' test case completed: Successfully displayed hotel names and prices");
	}

	@Test(priority = 10)
	public void navigateHomepageTestCase() {
		logger.info("Starting the 'navigateHomepageTestCase' test case");
		driver.navigate().back();
		logger.info("'navigateHomepageTestCase' test case completed: Successfully navigated back to the homepage");
	}

}
