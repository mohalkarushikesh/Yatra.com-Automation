package testScenario;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.GiftVoucherPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_GiftVoucherPage  extends BaseClass{
	HomePage homepage;
	GiftVoucherPage giftvoucherpage;
	// ExtentReports extent;
	//private ExtentTest test; // helps to generate the logs in the report
	ExtentReports extentreportobj = new ExtentReports();
	String screenshotPath;
	
	@Test(priority = 17)
	public void moveToMore2TestCase() {
		homepage = new HomePage(driver);
		homepage.moveToMore();
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
