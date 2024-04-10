package pageObjects;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "booking_engine_hotels")
	public static WebElement hotels;

	@FindBy(id = "BE_hotel_destination_city")
	public static WebElement destinationCity;

	@FindBy(xpath = "//div[@class='oneway-roundtrip']//div[2]")
	public static WebElement clickOnCity;

	@FindBy(xpath="//input[@id='BE_hotel_checkin_date']")
	public static WebElement checkinDate;

	public void clickOnHotels() {
		hotels.click();
	}

	public void enterDestinationCity() {
		//new Actions(driver).sendKeys(destinationCity, "Banglore").perform();
		destinationCity.sendKeys("Banglore");
	}

	public void ClickOnCity() {
		clickOnCity.click();
	}
	
	public void checkInDate() {
		checkinDate.click();
	}
	
	public void selectCheckInDate() {
		
		LocalDate tomorrowsDate = LocalDate.now().plusDays(1); // gives tomorrows date
		System.out.println("Tomorrows date: " + tomorrowsDate);
		String formatedDate = tomorrowsDate.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
		String date = formatedDate.substring(0, 2);
		System.out.println("Searching for Tomorrow's date.......");
		List<WebElement> allDates = driver.findElements(By.xpath("//tbody[@class=\"BE_hotel_checkin_date\"]//tr//td"));
		for (int i=0;i<33;i++) {
			System.out.println(allDates.get(i).getText());
			/*
			 * if(datevar.getText().equals(date)) { datevar.click(); break; }
			 */
		}
		System.out.println("Successfully clicked on Tomorrow's date");
	}

}
