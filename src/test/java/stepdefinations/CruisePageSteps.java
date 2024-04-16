package stepdefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CruisePage;
import pageObjects.HomePage;

public class CruisePageSteps {
	public WebDriver driver;
	HomePage homepage;
	CruisePage cruisepage;
	
	@Given("I navigate to the More section")
	public void i_navigate_to_the_more_section() {
	    homepage=new HomePage(Hooks.driver);
	    homepage.moveToMore();
	}

	@When("I select a cruise from the list and click on it")
	public void i_select_a_cruise_from_the_list_and_click_on_it() {
	   homepage.selectCruiseFromMoreList();
	}

	@When("I click on the Read More button")
	public void i_click_on_the_read_more_button() {
		cruisepage=new CruisePage(Hooks.driver);
		cruisepage.clickonReadMore();
	}

	@Then("all the Inclusion points should be displayed")
	public void all_the_inclusion_points_should_be_displayed() {
		cruisepage.printInclusionPoints();
	}
	
	public void navigateToHomePage() {
		//cruise page
		Hooks.driver.navigate().back();
		// basepage
		Hooks.driver.navigate().back();
	}
}
