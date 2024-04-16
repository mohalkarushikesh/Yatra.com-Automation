package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
<<<<<<< HEAD

=======
>>>>>>> 300e14270dad51d3da2c6b51a267b13b91df6fdb
	}
}
