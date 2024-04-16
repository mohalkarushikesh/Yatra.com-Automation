package testScenario;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
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
	private static  Logger logger = (Logger) LogManager.getLogger(TC_GiftVoucherPage.class);
	
	@Test(priority = 17)
	public void moveToMore2TestCase() {
		logger.info("Starting the 'moveToMore2TestCase' test case");
		homepage = new HomePage(driver);
		homepage.moveToMore();
		logger.info("'moveToMore2TestCase' test case completed: Successfully moved to 'More'");
	}

	@Test(priority = 18)
	public void selectGiftFromMoreListTestCase() {
		logger.info("Starting the 'selectGiftFromMoreListTestCase' test case");
		homepage.selectGiftFromMoreList();
		logger.info(
				"'selectGiftFromMoreListTestCase' test case completed: Successfully selected 'Gift' from 'More' list");
	}

	@Test(priority = 19)
	public void switchToGiftVoucherTestCase() {
		logger.info("Starting the 'switchToGiftVoucherTestCase' test case");
		homepage.switchToGiftVoucher(driver);
		logger.info("'switchToGiftVoucherTestCase' test case completed: Successfully switched to 'Gift Voucher'");
	}

	@Test(priority = 21)
	public void checkForPhoneToolTipTestCase() throws InterruptedException, IOException {
		logger.info("Starting the 'checkForPhoneToolTipTestCase' test case");
		giftvoucherpage = new GiftVoucherPage(driver);
		giftvoucherpage.checkForPhoneToolTip();
		logger.info("'checkForPhoneToolTipTestCase' test case completed: Successfully checked for phone tooltip");
	}

	@Test(priority = 22)
	public void checkForEmailToolTipTestCase() throws InterruptedException, IOException {
		logger.info("Starting the 'checkForEmailToolTipTestCase' test case");
		giftvoucherpage.checkForEmailToolTip();
		logger.info("'checkForEmailToolTipTestCase' test case completed: Successfully checked for email tooltip");
	}

}
