package testScenario;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import pageObjects.GiftVoucherPage;
import pageObjects.HomePage;
import pageObjects.HotelsPage;
import testBase.BaseClass;

public class TC_HomePage extends BaseClass {
	HomePage homepage;
	HotelsPage hotelspage;
	GiftVoucherPage giftvoucherpage;

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

	@Test(priority = 15)
	public void printInclusionPointsTestCase() {
		homepage.printInclusionPoints();
	}

	@Test(priority = 16)
	public void navigate2TestCase() {
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
		giftvoucherpage = new GiftVoucherPage(driver);
		giftvoucherpage.checkForPhoneToolTip();
	}

	@Test(priority = 22)
	public void checkForEmailToolTipTestCase() throws InterruptedException {
		giftvoucherpage.checkForEmailToolTip();
	}

}
