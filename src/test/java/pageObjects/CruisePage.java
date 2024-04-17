package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilities.LoggerClass;

public class CruisePage extends BasePage {
	WebDriver driver;
	Actions action;
	JavascriptExecutor javascripexecutor;
	public LoggerClass logger = new LoggerClass();

	public CruisePage(WebDriver driver) {
		super(driver);
		action = new Actions(driver);
		javascripexecutor = (JavascriptExecutor) driver;
	}

	@FindBy(xpath = "(//i[@class='demo-icon icon-go arrow-go'])[1]")
	public static WebElement readmore;

	@FindBy(xpath = "(//li[@class='block-desc']//span)[1]")
	public static WebElement inclusionpoints;

	public void clickonReadMore() {
		logger.log.info("Test case started: Calling the 'clickonReadMore' method");
		readmore.click();
		logger.log.info("'clickonReadMore' method executed: Successfully clicked on Read More");
		logger.log.info("Test case completed: 'clickonReadMore' method called successfully");
	}

	public void printInclusionPoints() {
		logger = new LoggerClass();
		logger.log.info("Test case started: Calling the 'printInclusionPoints' method");
		javascripexecutor.executeScript("window.scrollBy(0,250)", "");
		System.out.println(inclusionpoints.getText());
		logger.log.info("'printInclusionPoints' method executed: Successfully printed inclusion points");
		logger.log.info("Test case completed: 'printInclusionPoints' method called successfully");
	}

}
