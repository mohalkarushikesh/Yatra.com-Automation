package pageObjects;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilities.LoggerClass;

public class HomePage extends BasePage {
	WebDriver driver;
	Actions action;
	public LoggerClass logger = new LoggerClass();

	public HomePage(WebDriver driver) {
		super(driver);
		action = new Actions(driver);
	}

	@FindBy(id = "booking_engine_hotels")
	public WebElement hotels;

	@FindBy(xpath = "//span[@class='more-arr']")
	public WebElement more;

	@FindBy(xpath = "//div[@class='moreOption']//li")
	public List<WebElement> morelist;

	public void clickonHotels() {
		logger.log.info("Test case started: Calling the 'clickonHotels' method");
		hotels.click();
		System.out.println("clicked on hotels link");
		logger.log.info("'clickonHotels' method executed: Successfully clicked on Hotels");
		logger.log.info("Test case completed: 'clickonHotels' method called successfully");
	}

	public void moveToMore() {
		logger.log.info("Test case started: Calling the 'moveToMore' method");
		action.moveToElement(more).perform();
		logger.log.info("'moveToMore' method executed: Successfully moved to 'More'");
		logger.log.info("Test case completed: 'moveToMore' method called successfully");
	}

	
	
	public void selectCruiseFromMoreList() {
		logger.log.info("Test case started: Calling the 'selectCruiseFromMoreList' method");
		for (int i = 0; i < morelist.size(); i++) {
			String morelisttxt = morelist.get(i).getText();
			if (morelisttxt.contains("Cruise")) {
				action.moveToElement(morelist.get(i)).click().perform();
			}
		}
		logger.log.info("'selectCruiseFromMoreList' method executed: Successfully selected 'Cruise' from 'More' list");
		logger.log.info("Test case completed: 'selectCruiseFromMoreList' method called successfully");
	}

	public void selectGiftFromMoreList() {
		logger.log.info("Test case started: Calling the 'selectGiftFromMoreList' method");
		for (int i = 0; i < morelist.size(); i++) {
			String morelisttxt2 = morelist.get(i).getText();
			if (morelisttxt2.contains("Gift")) {
				action.moveToElement(morelist.get(i)).click().perform();
			}
		}
		logger.log.info("'selectGiftFromMoreList' method executed: Successfully selected 'Gift' from 'More' list");
		logger.log.info("Test case completed: 'selectGiftFromMoreList' method called successfully");
	}

	public void switchToGiftVoucher(WebDriver driver) {
		logger.log.info("Test case started: Calling the 'switchToGiftVoucher' method");
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows)
			driver.switchTo().window(window);
		logger.log.info("'switchToGiftVoucher' method executed: Successfully switched to 'Gift Voucher'");
		logger.log.info("Test case completed: 'switchToGiftVoucher' method called successfully");
	}


}
