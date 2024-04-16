package stepdefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.GiftVoucherPage;
import pageObjects.HomePage;

public class GiftVoucherPageSteps {
	public WebDriver driver;
	HomePage homepage;
	GiftVoucherPage giftvoucherpage;
	
	
	@Given("I am on the Home page and moved to more section")
	public void i_am_on_the_home_page_and_moved_to_more_section() {
		 homepage=new HomePage(Hooks.driver);
		 homepage.moveToMore();
	}

	@Then("I have clicked on the Gift-Voucher from the list")
	public void i_have_clicked_on_the_gift_voucher_from_the_list() {
	    homepage.selectGiftFromMoreList();
	}

	@Then("I have switched to the Gift-Voucher page")
	public void i_have_switched_to_the_gift_voucher_page() {
	    homepage.switchToGiftVoucher(Hooks.driver);
	}

	@Then("I submit the form with an invalid phone number and  I capture the phone number error message")
	public void i_submit_the_form_with_an_invalid_phone_number_and_i_capture_the_phone_number_error_message() throws InterruptedException, IOException {
		giftvoucherpage = new GiftVoucherPage(Hooks.driver);
		giftvoucherpage.checkForPhoneToolTip();
	}

	@Then("I submit the form with an invalid email and I capture the email error message")
	public void i_submit_the_form_with_an_invalid_email_and_i_capture_the_email_error_message() throws InterruptedException, IOException {
		giftvoucherpage.checkForEmailToolTip();
	}
}
