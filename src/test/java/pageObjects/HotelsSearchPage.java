package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelsSearchPage extends BasePage {
	WebDriver driver;

	public HotelsSearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[normalize-space()='User Rating']")
	private static WebElement clickonuserrating;

	@FindBy(xpath = "//div[@class='full filter-wrapper accordion-wrappper accordion-anim-1']//label")
	private static List<WebElement> checkboxlist;

	@FindBy(xpath = "//h2[@class='hotel-name full fs-18 three-dot']")
	private static List<WebElement> hotelnamelist;

	@FindBy(xpath = "//div[@class='result-details-right show-gt-768 pr']//p/span/span[2]")
	private static List<WebElement> hotelpricelist;

	public void clickonUserRating() {
		clickonuserrating.click();
		System.out.println("clicked on user rating");
	}

	/*
	 * public void selectAllAminities() throws InterruptedException {
	 * Thread.sleep(8000); for (int i = 0; i < checkboxlist.size(); i++) { String
	 * str = checkboxlist.get(i).getText(); if (str.contains("Free WiFi ")) {
	 * checkboxlist.get(i).click(); } if (str.contains("Free Breakfast ")) {
	 * checkboxlist.get(i).click(); } if (str.contains("Laundry facilities ")) {
	 * checkboxlist.get(i).click(); } if (str.contains("Swimming pool ")) {
	 * checkboxlist.get(i).click(); } }
	 * System.out.println("selected all amenities"); }
	 */

	public void selectFreeWifi() throws InterruptedException {
		Thread.sleep(2000);
		for (WebElement checkbox : checkboxlist) {
			String str = checkbox.getText();
			if (str.contains("Free WiFi ")) {
				checkbox.click();
				break;
			}
		}
	}

	public void selectFreeBreakFast() throws InterruptedException {
		Thread.sleep(2000);
		for (WebElement checkbox : checkboxlist) {
			String str = checkbox.getText();
			if (str.contains("Free Breakfast ")) {
				checkbox.click();
				break;
			}
		}
	}

	public void selectLaundryFacilities() throws InterruptedException {
		Thread.sleep(2000);
		for (WebElement checkbox : checkboxlist) {
			String str = checkbox.getText();
			if (str.contains("Laundry facilities ")) {
				checkbox.click();
				break;
			}
		}
	}

	public void selectSwimmingPool() throws InterruptedException {
		Thread.sleep(2000);
		for (WebElement checkbox : checkboxlist) {
			String str = checkbox.getText();
			if (str.contains("Swimming pool ")) {
				checkbox.click();
				break;
			}
		}
	}

	public void displayHotelNamesAndPrices() {
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
	}

}
