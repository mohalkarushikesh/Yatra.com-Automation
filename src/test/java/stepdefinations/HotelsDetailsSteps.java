package stepdefinations;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.HomePage;
import pageObjects.HotelsPage;
import pageObjects.HotelsSearchPage;

public class HotelsDetailsSteps {
	public WebDriver driver;
	HomePage homepage;
	HotelsPage hotelspage;
	HotelsSearchPage hotelssearchpage;

	@Given("Opening the yatra.com website, I clicked-on the ‘Hotels’ link.")
	public void opening_the_yatra_com_website_i_clicked_on_the_hotels_link() {
		homepage = new HomePage(Hooks.driver);
		homepage.clickonHotels();
	}

	@Given("I set the location to {string} in the location field")
	public void i_set_the_location_to_in_the_location_field(String string) throws InterruptedException {
		hotelspage = new HotelsPage(Hooks.driver);
		Thread.sleep(2000);
		hotelspage.selectCity("pune");
	}

	@Given("I click on the check-out date field and select the date five days from the check-in date")
	public void i_click_on_the_check_out_date_field_and_select_the_date_five_days_from_the_check_in_date() {
		hotelspage.selectCheckoutDate();
	}

	@Given("I click on the traveller drop down")
	public void i_click_on_the_traveller_drop_down() {
		hotelspage.clickonTravellerDropDown();
	}

	@Given("I set the number of adults to four in the travellers dropdown")
	public void i_set_the_number_of_adults_to_four_in_the_travellers_dropdown() {
		hotelspage.addTravellers();
	}

	@Given("I click on the search hotels button and the page should reload with the search results")
	public void i_click_on_the_search_hotels_button_and_the_page_should_reload_with_the_search_results() {
		hotelspage.clickonSearchButton();
	}

	@Then("I select User Rating: High to Low in the sort dropdown")
	public void i_select_user_rating_high_to_low_in_the_sort_dropdown() {
		hotelssearchpage = new HotelsSearchPage(Hooks.driver);
		hotelssearchpage.clickonUserRating();
	}

	@Then("I select free Wifi, free breakfast, laundry and swimming pool in the amenities filter")
	public void i_select_free_wifi_free_breakfast_laundry_and_swimming_pool_in_the_amenities_filter() throws InterruptedException {
		hotelssearchpage.selectFreeWifi();
		hotelssearchpage.selectFreeBreakFast();
		hotelssearchpage.selectLaundryFacilities();
		hotelssearchpage.selectSwimmingPool();

	}

	@Then("I should see the name and total-amount for the first three hotels")
	public void i_should_see_the_name_and_total_amount_for_the_first_three_hotels() {
		hotelssearchpage.displayHotelNamesAndPrices();
	}

	@Then("I should navigate back to the home page")
	public void I_should_navigate_back_to_the_home_page() throws InterruptedException {
		Hooks.driver.navigate().back();
		Thread.sleep(5000);
	}

}
