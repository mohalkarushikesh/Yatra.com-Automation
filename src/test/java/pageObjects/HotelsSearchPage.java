package pageObjects;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

<<<<<<< HEAD
public class HotelsSearchPage extends BasePage {
=======

public class HotelsSearchPage extends BasePage{
>>>>>>> 300e14270dad51d3da2c6b51a267b13b91df6fdb
	WebDriver driver;

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
		clickonuserrating.click();
		System.out.println("clicked on user rating");
	}

	public void selectAllAminities() throws InterruptedException {
		Thread.sleep(8000);
		for (int i = 0; i < checkboxlist.size(); i++) {
			String str = checkboxlist.get(i).getText();
			if (str.contains("Free WiFi ")) {
				checkboxlist.get(i).click();
			}
			if (str.contains("Free Breakfast ")) {
				checkboxlist.get(i).click();
			}
			if (str.contains("Laundry facilities ")) {
				checkboxlist.get(i).click();
			}
			if (str.contains("Swimming pool ")) {
				checkboxlist.get(i).click();
			}
		}
		System.out.println("selected all amenities");
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
