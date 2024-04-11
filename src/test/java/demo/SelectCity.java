package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SelectCity {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("booking_engine_hotels")).click();

		WebElement hoteldestination=driver.findElement(By.name("BE_hotel_destination"));
		
		Actions action = new Actions(driver);
		Thread.sleep(5000); //
		action.moveToElement(hoteldestination).click().sendKeys("Bangalore").perform();
		
		Thread.sleep(4000); //
		List<WebElement> citiesList=driver.findElements(By.xpath("//div[@class='viewport']//li"));
		String citytoselect="Bangalore";
		int count = 0;
		for(int i=0;i<citiesList.size();i++) {
			String currentcity=citiesList.get(i).getText();
			//System.out.println(citiesList.get(i).getText());
			if(currentcity.contains(citytoselect)) {
				citiesList.get(i).click();
				count++;
				break;
			}
		}
		if(count!=0) {
			System.out.println(citytoselect + " has been selected from drop down");
		}else {
			System.out.println("option you want to select is not available in list");
		}
	
	
	
	}
}
