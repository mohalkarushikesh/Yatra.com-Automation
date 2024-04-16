package pageObjects;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

<<<<<<< HEAD
public class HomePage extends BasePage{
=======
public class HomePage extends BasePage {
>>>>>>> 300e14270dad51d3da2c6b51a267b13b91df6fdb
	WebDriver driver;
	Actions action;

	public HomePage(WebDriver driver) {
		super(driver);
<<<<<<< HEAD
		
=======
		action = new Actions(driver);
>>>>>>> 300e14270dad51d3da2c6b51a267b13b91df6fdb
	}

	@FindBy(id = "booking_engine_hotels")
	public WebElement hotels;

	@FindBy(xpath = "//span[@class='more-arr']")
	public WebElement more;

	@FindBy(xpath = "//div[@class='moreOption']//li")
	public List<WebElement> morelist;

	public void clickonHotels() {
		hotels.click();
		System.out.println("clicked on hotels");

	}

	public void moveToMore() {
		action.moveToElement(more).perform();
	}

	public void selectCruiseFromMoreList() {
		for (int i = 0; i < morelist.size(); i++) {
			String morelisttxt = morelist.get(i).getText();
			if (morelisttxt.contains("Cruise")) {
				action.moveToElement(morelist.get(i)).click().perform();
			}
		}
	}

	public void selectGiftFromMoreList() {
		for (int i = 0; i < morelist.size(); i++) {
			String morelisttxt2 = morelist.get(i).getText();
			if (morelisttxt2.contains("Gift")) {
				action.moveToElement(morelist.get(i)).click().perform();
			}
		}
	}

	public void switchToGiftVoucher(WebDriver driver) {
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows)
			driver.switchTo().window(window);
	}

}
