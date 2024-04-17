package testScenario;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import pageObjects.GiftVoucherPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_GiftVoucherPage extends BaseClass {
	HomePage homepage;
	GiftVoucherPage giftvoucherpage;
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
		homepage.switchToGiftVoucher(driver);

	}

	@Test(priority = 21)
	public void checkForPhoneToolTipTestCase() throws InterruptedException, IOException {
		giftvoucherpage = new GiftVoucherPage(driver);
		giftvoucherpage.checkForPhoneToolTip();
	}

	@Test(priority = 22)
	public void checkForEmailToolTipTestCase() throws InterruptedException, IOException {
		giftvoucherpage.checkForEmailToolTip();
	}

}
