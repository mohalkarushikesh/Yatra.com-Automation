package pageObjects;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.LoggerClass;

public class HotelsPage extends BasePage {
	WebDriver driver;
	public LoggerClass logger = new LoggerClass();

	public HotelsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "BE_hotel_destination")
	public static WebElement hoteldestination;

	@FindBy(xpath = "//div[@class='viewport']//li")
	public static List<WebElement> cititieslist;

	@FindBy(id = "BE_hotel_checkout_date")
	public static WebElement checkoutdate;

	@FindBy(xpath = "//*[@id='month-scroll0']/div/div/table/tbody/tr/td")
	public static List<WebElement> listofdates;

	@FindBy(xpath = "//i[@class='icon icon-angle-right arrowpassengerBox']")
	public static WebElement travellerdropdown;

	@FindBy(xpath = "(//span[@class='ddSpinnerPlus'])[1]")
	public static WebElement addtravellers;

	@FindBy(xpath = "//input[@id='BE_hotel_htsearch_btn']")
	public static WebElement clickonsearchbutton;

	public void selectCity(String city) throws InterruptedException {
		logger.log.info("Test case started: Calling the 'selectCity' method");
		Thread.sleep(1000);
		hoteldestination.click();
		Thread.sleep(1000);
		hoteldestination.clear();
		hoteldestination.sendKeys(city);
		Thread.sleep(1000);
		hoteldestination.sendKeys(Keys.ENTER);
		System.out.println(city + " is selected");
		logger.log.info("'selectCity' method executed: Successfully selected the city");
		logger.log.info("Test case completed: 'selectCity' method called successfully");
	}

	public void selectCheckoutDate() {
		logger.log.info("Test case started: Calling the 'selectCheckoutDate' method");
		LocalDate tomorrowsDate = LocalDate.now().plusDays(1); // gives tomorrows date
		System.out.println("Check-in Date : " + tomorrowsDate);
		checkoutdate.click();
		LocalDate checkoutdate = LocalDate.now().plusDays(5);
		System.out.println("Check-out Date : " + checkoutdate);

		String formatedDate = checkoutdate.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
		String date = formatedDate.substring(0, 2);
		for (int i = 1; i < listofdates.size(); i++) {
			if (listofdates.get(i).getText().equals(date)) {
				listofdates.get(i).click();
				break;
			}
		}
		System.out.println("checkout date selected");
		logger.log.info("'selectCheckoutDate' method executed: Successfully selected the checkout date");
		logger.log.info("Test case completed: 'selectCheckoutDate' method called successfully");
	}

	public void clickonTravellerDropDown() {
		logger.log.info("Test case started: Calling the 'clickonTravellerDropDown' method");
		travellerdropdown.click();
		System.out.println("clicked on traveller drop down");
		logger.log.info("'clickonTravellerDropDown' method executed: Successfully clicked on the traveller dropdown");
		logger.log.info("Test case completed: 'clickonTravellerDropDown' method called successfully");
	}

	public void addTravellers() {
		logger.log.info("Test case started: Calling the 'addTravellers' method");
		addtravellers.click();
		addtravellers.click();
		System.out.println("4 Traveller added");
		logger.log.info("'addTravellers' method executed: Successfully added travellers");
		logger.log.info("Test case completed: 'addTravellers' method called successfully");
	}

	public void clickonSearchButton() {
		logger.log.info("Test case started: Calling the 'clickonSearchButton' method");
		clickonsearchbutton.click();
		System.out.println("clicked on search button");
		logger.log.info("'clickonSearchButton' method executed: Successfully clicked on the search button");
		logger.log.info("Test case completed: 'clickonSearchButton' method called successfully");
	}

}
