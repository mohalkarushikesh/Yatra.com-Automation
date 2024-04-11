package pageObjects;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "booking_engine_hotels")
	private static WebElement hotels;

	@FindBy(name = "BE_hotel_destination")
	private static WebElement hoteldestination;

	@FindBy(xpath = "//div[@class='viewport']//li")
	private static List<WebElement> cititieslist;

	@FindBy(id = "BE_hotel_checkout_date")
	private static WebElement checkoutdate;

	@FindBy(xpath = "//*[@id='month-scroll0']/div/div/table/tbody/tr/td")
	private static List<WebElement> listofdates;

	@FindBy(xpath = "//i[@class='icon icon-angle-right arrowpassengerBox']")
	private static WebElement travellerdropdown;

	@FindBy(xpath = "(//span[@class='ddSpinnerPlus'])[1]")
	private static WebElement addtravellers;

	@FindBy(xpath = "//input[@id='BE_hotel_htsearch_btn']")
	private static WebElement clickonsearchbutton;

	@FindBy(xpath = "//span[@class='more-arr']")
	private static WebElement more;

	@FindBy(xpath = "//div[@class='moreOption']//li")
	private static List<WebElement> morelist;

	@FindBy(xpath = "(//i[@class='demo-icon icon-go arrow-go'])[1]")
	private static WebElement readmore;

	@FindBy(xpath = "(//li[@class='block-desc']//span)[1]")
	private static WebElement inclusionpoints;

	public void clickonHotels() {
		hotels.click();
		System.out.println("clicked on hotels");

	}

	public void selectCity(String city) throws InterruptedException {
		Thread.sleep(1000);
		hoteldestination.click();
		Thread.sleep(1000);
		hoteldestination.clear();
		hoteldestination.sendKeys(city);
		Thread.sleep(1000);
		hoteldestination.sendKeys(Keys.ENTER);
		System.out.println(city + " is selected");
	}

	public void selectCheckoutDate() {
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
	}

	public void clickonTravellerDropDown() {
		travellerdropdown.click();
		System.out.println("clicked on traveller drop down");
	}

	public void addTravellers() {
		addtravellers.click();
		addtravellers.click();
		System.out.println("2 traveller added");
	}

	public void clickonSearchButton() {
		clickonsearchbutton.click();
		System.out.println("clicked on search button");
	}

	public void moveToMore() {
		Actions action = new Actions(driver);
		action.moveToElement(more).perform();
	}

	public void selectCruiseFromMoreList() {
		for (int i = 0; i < morelist.size(); i++) {
			String morelisttxt = morelist.get(i).getText();
			Actions action = new Actions(driver);
			if (morelisttxt.contains("Cruise")) {
				action.moveToElement(morelist.get(i)).click().perform();
			}
		}
	}

	public void clickonReadMore() {
		readmore.click();
	}

	public void printInclusionPoints() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println(inclusionpoints.getText());
	}

	// navigate

	public void moveToMore2() {
		Actions action = new Actions(driver);
		action.moveToElement(more).perform();
	}

	// new page

	public void selectGiftFromMoreList() {
		Actions action = new Actions(driver);
		for (int i = 0; i < morelist.size(); i++) {
			String morelisttxt2 = morelist.get(i).getText();
			if (morelisttxt2.contains("Gift")) {
				action.moveToElement(morelist.get(i)).click().perform();
			}
		}
	}

	public void switchToGiftVoucher() {
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows)
			driver.switchTo().window(window);
	}

}
