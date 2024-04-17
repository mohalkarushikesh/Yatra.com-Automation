# Yatra.com Automation 

1. Display Hotel name, total amount for first 3 hotels for 4 people in any location for 5 days of stay from tomorrow's date; Should have sorted the list with highest User rating, show hotels with free Wifi, free breakfast and amenities with laundry and swimming pool.

2. Pick any one cruise line 
	a. Retrieve all the Inclusion points and Display the same

3. Go to gift voucher and scroll to corporate queries and fill it with invalid email and phone number.
	a. capture error message and display the same.

```
(Suggested Site: www.yatra.com however  you are free to choose any other legitimate  site)
```

### Prerequisites
- Java
- Maven
- Selenium WebDriver
- TestNG
- Extent Reports
- Cucumber


### Key Automation Scope
- Handling alert, different browser windows, search option 
- Navigating back to home page
- Extract multiple options items & store in collections
- Data driven approch
- Cross Browser Testing

### Installation 
1. Clone the repository: `https://github.com/mohalkarushikesh/Yatra.com-Automation.git`
2. Navigate to the project directory: `cd Yatra.com-Automation`
3. Install the dependencies: 'mvn install'

### Usage
To run the tests, use the following command: 'mvn test'

### Output: [Chrome and Edge]
```
clicked on hotels
Pune is selected
Check-in Date : 2024-04-13
Check-out Date : 2024-04-17
checkout date selected
clicked on traveller drop down
2 traveller added
clicked on search button
clicked on user rating
selected all amenities
Hotel Name : Oxford Golf Resort
Price : ₹1,96,871
Hotel Name : Oakwood Residence Pune
Price : ₹51,500
Hotel Name : Radisson Blu Hinjawadi Pune
Price : ₹12,25,000
INCLUSION
2 Nights Cruise Accommodation
Meals (as specified in the itinerary)
Onboard Entertainment & Activities.(Some onboard activities and entertainment are chargeable)
Phone number error message : Please enter mobile number
Email error message : Please enter your valid email id

clicked on hotels
Pune is selected
Check-in Date : 2024-04-13
Check-out Date : 2024-04-17
checkout date selected
clicked on traveller drop down
2 traveller added
clicked on search button
clicked on user rating
Hotel Name : Oxford Golf Resort
Price : ₹1,96,871
Hotel Name : Oakwood Residence Pune
Price : ₹51,500
Hotel Name : Radisson Blu Hinjawadi Pune
Price : ₹12,25,000
INCLUSION
2 Nights Cruise Accommodation
Meals (as specified in the itinerary)
Onboard Entertainment & Activities.(Some onboard activities and entertainment are chargeable)
Phone number error message : Please enter mobile number
Email error message : Please enter your valid email id

===============================================
Suite
Total tests run: 40, Passes: 39, Failures: 1, Skips: 0
===============================================

```


### Cucumber Output
```
Scenario: Display top rated hotels with specific amenities                                     [90m# src/test/resources/Features/A_HotelsDetails.feature:3[0m
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Using chromedriver 121.0.6167.184 (resolved driver for Chrome 121)
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Exporting webdriver.chrome.driver as C:\Users\2327238\.cache\selenium\chromedriver\win64\121.0.6167.184\chromedriver.exe
clicked on hotels
  [32mGiven [0m[32mOpening the yatra.com website, I clicked-on the ‘Hotels’ link.[0m                         [90m# stepdefinations.HotelsDetailsSteps.opening_the_yatra_com_website_i_clicked_on_the_hotels_link()[0m
pune is selected
  [32mAnd [0m[32mI set the location to [0m[32m[1m"Pune"[0m[32m in the location field[0m                                       [90m# stepdefinations.HotelsDetailsSteps.i_set_the_location_to_in_the_location_field(java.lang.String)[0m
Check-in Date : 2024-04-18
Check-out Date : 2024-04-22
checkout date selected
  [32mAnd [0m[32mI click on the check-out date field and select the date five days from the check-in date[0m [90m# stepdefinations.HotelsDetailsSteps.i_click_on_the_check_out_date_field_and_select_the_date_five_days_from_the_check_in_date()[0m
clicked on traveller drop down
  [32mAnd [0m[32mI click on the traveller drop down[0m                                                       [90m# stepdefinations.HotelsDetailsSteps.i_click_on_the_traveller_drop_down()[0m
2 traveller added
  [32mAnd [0m[32mI set the number of adults to four in the travellers dropdown[0m                            [90m# stepdefinations.HotelsDetailsSteps.i_set_the_number_of_adults_to_four_in_the_travellers_dropdown()[0m
clicked on search button
  [32mAnd [0m[32mI click on the search hotels button and the page should reload with the search results[0m   [90m# stepdefinations.HotelsDetailsSteps.i_click_on_the_search_hotels_button_and_the_page_should_reload_with_the_search_results()[0m
clicked on user rating
  [32mAnd [0m[32mI select User Rating: High to Low in the sort dropdown[0m                                   [90m# stepdefinations.HotelsDetailsSteps.i_select_user_rating_high_to_low_in_the_sort_dropdown()[0m
  [32mAnd [0m[32mI select free Wifi, free breakfast, laundry and swimming pool in the amenities filter[0m    [90m# stepdefinations.HotelsDetailsSteps.i_select_free_wifi_free_breakfast_laundry_and_swimming_pool_in_the_amenities_filter()[0m
Hotel Name : Marriott Suites Pune
Price : ₹86,700
Hotel Name : Radisson Blu Hinjawadi Pune
Price : ₹12,27,500
Hotel Name : O Hotel Pune
Price : ₹1,24,996
  [32mThen [0m[32mI should see the name and total-amount for the first three hotels[0m                       [90m# stepdefinations.HotelsDetailsSteps.i_should_see_the_name_and_total_amount_for_the_first_three_hotels()[0m
  [32mThen [0m[32mI should navigate back to the home page[0m                                                 [90m# stepdefinations.HotelsDetailsSteps.I_should_navigate_back_to_the_home_page()[0m

Scenario: Retrieve cruise line inclusion points        [90m# src/test/resources/Features/B_CruisePage.feature:3[0m
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Using chromedriver 121.0.6167.184 (resolved driver for Chrome 121)
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Exporting webdriver.chrome.driver as C:\Users\2327238\.cache\selenium\chromedriver\win64\121.0.6167.184\chromedriver.exe
  [32mGiven [0m[32mI navigate to the More section[0m                 [90m# stepdefinations.CruisePageSteps.i_navigate_to_the_more_section()[0m
  [32mWhen [0m[32mI select a cruise from the list and click on it[0m [90m# stepdefinations.CruisePageSteps.i_select_a_cruise_from_the_list_and_click_on_it()[0m
  [32mAnd [0m[32mI click on the Read More button[0m                  [90m# stepdefinations.CruisePageSteps.i_click_on_the_read_more_button()[0m
INCLUSION
2 Nights Cruise Accommodation
Meals (as specified in the itinerary)
Onboard Entertainment & Activities.(Some onboard activities and entertainment are chargeable)
  [32mThen [0m[32mall the Inclusion points should be displayed[0m    [90m# stepdefinations.CruisePageSteps.all_the_inclusion_points_should_be_displayed()[0m

Scenario: Validate gift voucher form with invalid data                                              [90m# src/test/resources/Features/C_GiftVoucherPage.feature:3[0m
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Using chromedriver 121.0.6167.184 (resolved driver for Chrome 121)
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Exporting webdriver.chrome.driver as C:\Users\2327238\.cache\selenium\chromedriver\win64\121.0.6167.184\chromedriver.exe
  [32mGiven [0m[32mI am on the Home page and moved to more section[0m                                             [90m# stepdefinations.GiftVoucherPageSteps.i_am_on_the_home_page_and_moved_to_more_section()[0m
  [32mThen [0m[32mI have clicked on the Gift-Voucher from the list[0m                                             [90m# stepdefinations.GiftVoucherPageSteps.i_have_clicked_on_the_gift_voucher_from_the_list()[0m
  [32mThen [0m[32mI have switched to the Gift-Voucher page[0m                                                     [90m# stepdefinations.GiftVoucherPageSteps.i_have_switched_to_the_gift_voucher_page()[0m
Phone number error message : Please enter mobile number
  [32mThen [0m[32mI submit the form with an invalid phone number and  I capture the phone number error message[0m [90m# stepdefinations.GiftVoucherPageSteps.i_submit_the_form_with_an_invalid_phone_number_and_i_capture_the_phone_number_error_message()[0m
Email error message : Please enter your valid email id
  [32mThen [0m[32mI submit the form with an invalid email and I capture the email error message[0m                [90m# stepdefinations.GiftVoucherPageSteps.i_submit_the_form_with_an_invalid_email_and_i_capture_the_email_error_message()[0m
PASSED: io.cucumber.testng.AbstractTestNGCucumberTests.runScenario("Retrieve cruise line inclusion points", "Cruise Line Inclusion Points Retrieval As a user, I want to retrieve all inclusion points of a cruise line")
        Runs Cucumber Scenarios
PASSED: io.cucumber.testng.AbstractTestNGCucumberTests.runScenario("Validate gift voucher form with invalid data", "alidate Gift Voucher Form As a user, I want to ensure that the gift voucher form correctly handles invalid data")
        Runs Cucumber Scenarios
PASSED: io.cucumber.testng.AbstractTestNGCucumberTests.runScenario("Display top rated hotels with specific amenities", "Hotel and Cruise Booking and Gift Voucher Validation")
        Runs Cucumber Scenarios

===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 3, Passes: 3, Failures: 0, Skips: 0
===============================================
```
