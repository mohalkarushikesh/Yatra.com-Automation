package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CruisePage extends BasePage {
	WebDriver driver;

	public CruisePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//i[@class='demo-icon icon-go arrow-go'])[1]")
	public static WebElement readmore;

	@FindBy(xpath = "(//li[@class='block-desc']//span)[1]")
	public static WebElement inclusionpoints;

	public void clickonReadMore() {
		readmore.click();
	}

	public void printInclusionPoints() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println(inclusionpoints.getText());
	}

}
