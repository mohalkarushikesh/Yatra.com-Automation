package demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Yatra {
	WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		
		
		
		
		
		// click on the hotel
		driver.findElement(By.id("booking_engine_hotels")).click();
		System.out.println("clicked on hotels");
		
		Thread.sleep(4000);

		WebElement hotel = driver.findElement(By.id("BE_hotel_destination_city"));
		hotel.click();

		// enter pune
		Thread.sleep(2000);
		WebElement destinationCity = driver.findElement(By.id("BE_hotel_destination_city"));
		destinationCity.sendKeys("pune");

		// press enter
		Thread.sleep(3000);
		WebElement pressEnter = driver.findElement(By.id("BE_hotel_destination_city"));
		pressEnter.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		
		
		LocalDate tomorrowsDate = LocalDate.now().plusDays(1); // gives tomorrows date
		System.out.println("Check-in Date : " + tomorrowsDate);

		// click on check out date
		driver.findElement(By.id("BE_hotel_checkout_date")).click();

		LocalDate afterFiveDays = LocalDate.now().plusDays(5);
		System.out.println("Check-out Date : " + afterFiveDays);

		String formatedDate = afterFiveDays.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
		String date = formatedDate.substring(0, 2);

		List<WebElement> allDates = driver.findElements(By.xpath("//*[@id='month-scroll0']/div/div/table/tbody/tr/td"));
		for (int i = 1; i < allDates.size(); i++) {
			// System.out.println(allDates.get(i).getText());
			if (allDates.get(i).getText().equals(date)) {
				// System.out.println(allDates.get(i).getText());
				allDates.get(i).click();
				break;
			}

		}
		System.out.println("checkout date clicked!");

		// drop down
		driver.findElement(By.xpath("//i[@class='icon icon-angle-right arrowpassengerBox']")).click();
		System.out.println("clicked on drop down");
		
		// add persons
		driver.findElement(By.xpath("(//span[@class='ddSpinnerPlus'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='ddSpinnerPlus'])[1]")).click();
		System.out.println("2 adults added");

		driver.findElement(By.xpath("//input[@id='BE_hotel_htsearch_btn']")).click();
		System.out.println("clicked on search Hotels");
		Thread.sleep(10000);

		driver.findElement(By.xpath("//a[normalize-space()='User Rating']")).click();
		System.out.println("clicked on User Rating");

		Thread.sleep(12000);
		List<WebElement> checkboxlist = driver.findElements(
				By.xpath("//div[@class='full filter-wrapper accordion-wrappper accordion-anim-1']//label"));

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

		Thread.sleep(9000);
		// hotel names list
		List<WebElement> hotelNameList = driver
				.findElements(By.xpath("//h2[@class='hotel-name full fs-18 three-dot']"));
		List<WebElement> hotelPriceList = driver
				.findElements(By.xpath("//div[@class='result-details-right show-gt-768 pr']//p/span/span[2]"));

		for (int i = 0; i <= 2; i++) {
			if (hotelNameList.size() < 1) {
				System.out.println("No hotels available");
			} else if (hotelNameList.size() < 2) {
				String hotelName1 = hotelNameList.get(i).getText();
				String hotelPrice1 = hotelPriceList.get(i).getText();
				System.out.println("Hotel Name : " + hotelName1);
				System.out.println("Price : ₹" + hotelPrice1);
			} else {
				String hotelName = hotelNameList.get(i).getText();
				String hotelPrice = hotelPriceList.get(i).getText();
				System.out.println("Hotel Name : " + hotelName);
				System.out.println("Price : ₹" + hotelPrice);
			}
		}
		Thread.sleep(3000);
		driver.navigate().back();

		// move to more
		Actions action = new Actions(driver);
		WebElement more = driver.findElement(By.xpath("//span[@class='more-arr']"));
		action.moveToElement(more).perform();
		// cruise xpath
		// WebElement cruise =
		// driver.findElement(By.xpath("//*[@id='booking_engine_cruise']/span"));

		// action.moveToElement(more).moveToElement(cruise).click().build().perform();

		List<WebElement> moreList = driver.findElements(By.xpath("//div[@class='moreOption']//li"));
		for (int i = 0; i < moreList.size(); i++) {
			String morelisttxt = moreList.get(i).getText();
			// System.out.println(moreList.get(i).getText());
			if (morelisttxt.contains("Cruise")) {
				action.moveToElement(moreList.get(i)).click().perform();
			}
		}

		driver.findElement(By.xpath("(//i[@class='demo-icon icon-go arrow-go'])[1]")).click();
		System.out.println("click on read more");
		// scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		WebElement inclusionPoints = driver.findElement(By.xpath("(//li[@class='block-desc']//span)[1]"));
		System.out.println(inclusionPoints.getText());

		Thread.sleep(2000);

		driver.navigate().back();
		driver.navigate().back();

		// move to element again for gift voucher
		Thread.sleep(3000);
		WebElement more2 = driver.findElement(By.xpath("//span[@class='more-arr']"));
		action.moveToElement(more2).perform();

		List<WebElement> moreList2 = driver.findElements(By.xpath("//div[@class='moreOption']//li"));
		for (int i = 0; i < moreList2.size(); i++) {
			String morelisttxt2 = moreList2.get(i).getText();
			if (morelisttxt2.contains("Gift")) {
				action.moveToElement(moreList2.get(i)).click().perform();
			}
		}

		Set<String> windows = driver.getWindowHandles();
		for (String window : windows)
			driver.switchTo().window(window);

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("phone"))));
		WebElement phone = driver.findElement(By.id("phone"));
		action.moveToElement(phone).build().perform();
		driver.findElement(By.id("Name")).sendKeys("Abc");
		phone.sendKeys("23211");
		
		driver.findElement(By.xpath("//*[@id='rescheduleRequest']/ul/li[9]/input")).click();
		Thread.sleep(1000);
		action.moveToElement(phone).build().perform();
		phone.sendKeys("9321187756");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("123@abc");
		
		String phoneerr = phone.getAttribute("data-errormsg");
		String emailerr = email.getAttribute("data-errormsg");
		
		System.out.println("Phone number error message : " + phoneerr);
		System.out.println("Email error message : " + emailerr);
		
		driver.findElement(By.xpath("//*[@id=\"rescheduleRequest\"]/ul/li[9]/input")).click();

		System.out.println("Best of luck");

		driver.quit();

	}
}
