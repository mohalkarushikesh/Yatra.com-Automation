package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftVoucherPage extends BasePage{
	WebDriver driver;
	Actions action;
	JavascriptExecutor js;
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

	public void checkForPhoneToolTip() throws InterruptedException {
		js.executeScript("window.scrollBy(0,600)", ""); 
		action.moveToElement(phone).build().perform();
		name.sendKeys("Rushikesh");
		phone.sendKeys("3456");
		submit.click();
		Thread.sleep(1000);
		String phoneerr = phone.getAttribute("data-errormsg");
		System.out.println("Phone number error message : " + phoneerr);

	}

	public void checkForEmailToolTip() throws InterruptedException {
		action.moveToElement(phone).build().perform();
		name.clear();
		name.sendKeys("Rushikesh");
		phone.clear();
		phone.sendKeys("9321187756");
		email.clear();
		email.sendKeys("123@abc");
		submit.click();
		Thread.sleep(1000);
		String capturetooltip = email.getAttribute("data-errormsg");
		System.out.println("Email error message : " + capturetooltip);

	}
}
