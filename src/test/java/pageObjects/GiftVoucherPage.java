package pageObjects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtility;

public class GiftVoucherPage extends BasePage{
	WebDriver driver;
	Actions action;
	JavascriptExecutor js;
	
	ExcelUtility excelutility;
	
	
	
	public GiftVoucherPage(WebDriver driver) {
		super(driver);
		action = new Actions(driver);
		js = (JavascriptExecutor) driver;
	}

	@FindBy(id = "Name")
	private static WebElement name;

	@FindBy(id = "phone")
	private static WebElement phone;

	@FindBy(id = "email")
	private static WebElement email;

	@FindBy(xpath = "//input[@value='Submit']")
	private static WebElement submit;

	public void checkForPhoneToolTip() throws InterruptedException, IOException {
		excelutility = new ExcelUtility();
		
		
		js.executeScript("window.scrollBy(0,600)", ""); 
		action.moveToElement(phone).build().perform();
		name.sendKeys(excelutility .getCellData("Sheet1", 1, 0));
		phone.sendKeys(excelutility.getCellData("Sheet1", 1, 1));
		submit.click();
		Thread.sleep(1000);
		String phoneerr = phone.getAttribute("data-errormsg");
		System.out.println("Phone number error message : " + phoneerr);

	}

	public void checkForEmailToolTip() throws InterruptedException, IOException {
		action.moveToElement(phone).build().perform();
		name.clear();
		name.sendKeys(excelutility.getCellData("Sheet1", 2, 0));
		phone.clear();
		phone.sendKeys(excelutility.getCellData("Sheet1", 2, 1));
		email.clear();
		email.sendKeys(excelutility.getCellData("Sheet1", 2, 2));
		submit.click();
		Thread.sleep(1000);
		String capturetooltip = email.getAttribute("data-errormsg");
		System.out.println("Email error message : " + capturetooltip);

	}
}
