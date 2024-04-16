package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

<<<<<<< HEAD
public class CruisePage extends BasePage {
=======

public class CruisePage extends BasePage{
>>>>>>> 300e14270dad51d3da2c6b51a267b13b91df6fdb
	WebDriver driver;
	Actions action;
	JavascriptExecutor javascripexecutor;
	
	public CruisePage(WebDriver driver) {
		super(driver);
<<<<<<< HEAD
=======
		action = new Actions(driver);
		javascripexecutor = (JavascriptExecutor) driver;
>>>>>>> 300e14270dad51d3da2c6b51a267b13b91df6fdb
	}

	@FindBy(xpath = "(//i[@class='demo-icon icon-go arrow-go'])[1]")
	public static WebElement readmore;

	@FindBy(xpath = "(//li[@class='block-desc']//span)[1]")
	public static WebElement inclusionpoints;

	public void clickonReadMore() {
		readmore.click();
	}

	public void printInclusionPoints() {
		/*
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println(inclusionpoints.getText());
		*/
		javascripexecutor.executeScript("window.scrollBy(0,250)", "");
		System.out.println(inclusionpoints.getText());
	}

}
