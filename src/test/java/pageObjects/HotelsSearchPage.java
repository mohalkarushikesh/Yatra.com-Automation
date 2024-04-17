package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.LoggerClass;

public class HotelsSearchPage extends BasePage {
	WebDriver driver;
	public LoggerClass logger = new LoggerClass();

	public HotelsSearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[normalize-space()='User Rating']")
	public static WebElement clickonuserrating;

	@FindBy(xpath = "//div[@class='full filter-wrapper accordion-wrappper accordion-anim-1']//label")
	public static List<WebElement> checkboxlist;

	@FindBy(xpath = "//h2[@class='hotel-name full fs-18 three-dot']")
	public static List<WebElement> hotelnamelist;

	@FindBy(xpath = "//div[@class='result-details-right show-gt-768 pr']//p/span/span[2]")
	public static List<WebElement> hotelpricelist;

	public void clickonUserRating() {
		logger.log.info("Test case started: Calling the 'clickonUserRating' method");
		clickonuserrating.click();
		System.out.println("clicked on user rating");
		logger.log.info("'clickonUserRating' method executed: Successfully clicked on user rating");
		logger.log.info("Test case completed: 'clickonUserRating' method called successfully");
	}

	public void selectFreeWifi() throws InterruptedException {
		logger = new LoggerClass();
		logger.log.info("Test case started: Calling the 'selectFreeWifi' method");
		Thread.sleep(2000);
		for (WebElement checkbox : checkboxlist) {
			String str = checkbox.getText();
			if (str.contains("Free WiFi ")) {
				checkbox.click();
				break;
			}
		}
		logger.log.info("'selectFreeWifi' method executed: Successfully selected Free WiFi");
		logger.log.info("Test case completed: 'selectFreeWifi' method called successfully");
	}

	public void selectFreeBreakFast() throws InterruptedException {
		logger = new LoggerClass();
		logger.log.info("Test case started: Calling the 'selectFreeBreakFast' method");
		Thread.sleep(2000);
		for (WebElement checkbox : checkboxlist) {
			String str = checkbox.getText();
			if (str.contains("Free Breakfast ")) {
				checkbox.click();
				break;
			}
		}
		logger.log.info("'selectFreeBreakFast' method executed: Successfully selected Free Breakfast");
		logger.log.info("Test case completed: 'selectFreeBreakFast' method called successfully");
	}

	public void selectLaundryFacilities() throws InterruptedException {
		logger = new LoggerClass();
		logger.log.info("Test case started: Calling the 'selectLaundryFacilities' method");
		Thread.sleep(2000);
		for (WebElement checkbox : checkboxlist) {
			String str = checkbox.getText();
			if (str.contains("Laundry facilities ")) {
				checkbox.click();
				break;
			}
		}
		logger.log.info("'selectLaundryFacilities' method executed: Successfully selected Laundry Facilities");
		logger.log.info("Test case completed: 'selectLaundryFacilities' method called successfully");
	}

	public void selectSwimmingPool() throws InterruptedException {
		logger = new LoggerClass();
		logger.log.info("Test case started: Calling the 'selectSwimmingPool' method");
		Thread.sleep(2000);
		for (WebElement checkbox : checkboxlist) {
			String str = checkbox.getText();
			if (str.contains("Swimming pool ")) {
				checkbox.click();
				break;
			}
		}
		logger.log.info("'selectSwimmingPool' method executed: Successfully selected Swimming Pool");
		logger.log.info("Test case completed: 'selectSwimmingPool' method called successfully");
	}

	public void displayHotelNamesAndPrices() {
		logger = new LoggerClass();
		logger.log.info("Test case started: Calling the 'displayHotelNamesAndPrices' method");
		if (hotelnamelist.isEmpty()) {
			System.out.println("No hotels available");
		} else {
			for (int i = 0; i < Math.min(hotelnamelist.size(), 3); i++) {
				String hotelName = hotelnamelist.get(i).getText();
				String hotelPrice = hotelpricelist.get(i).getText();
				System.out.println("Hotel Name : " + hotelName);
				System.out.println("Price : ₹" + hotelPrice);
			}
		}
		logger.log.info("'displayHotelNamesAndPrices' method executed: Successfully displayed hotel names and prices");
		logger.log.info("Test case completed: 'displayHotelNamesAndPrices' method called successfully");
	}

}
