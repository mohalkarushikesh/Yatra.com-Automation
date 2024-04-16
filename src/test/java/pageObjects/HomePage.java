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

public class HomePage extends BasePage{
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id = "booking_engine_hotels")
	private static WebElement hotels;

	@FindBy(xpath = "//span[@class='more-arr']")
	public static WebElement more;

	@FindBy(xpath = "//div[@class='moreOption']//li")
	public static List<WebElement> morelist;

	public void clickonHotels() {
		hotels.click();
		System.out.println("clicked on hotels");

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
