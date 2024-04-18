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
- Jenkins
- Git
- Github
- BDD 
- TDD


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
clicked on hotels link
Pune is selected
Check-in Date : 2024-04-18
Check-out Date : 2024-04-22
checkout date selected
clicked on traveller drop down
4 Traveller added
clicked on search button
clicked on user rating
Hotel Name : O Hotel Pune
Price : ₹1,24,696
Hotel Name : Radisson Blu Hinjawadi Pune
Price : ₹12,27,500
Hotel Name : Marriott Suites Pune
Price : ₹86,400
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Using msedgedriver 123.0.2420.97 (resolved driver for Edge 123)
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Exporting webdriver.edge.driver as C:\Users\2327238\.cache\selenium\msedgedriver\win64\123.0.2420.97\msedgedriver.exe
INCLUSION
2 Nights Cruise Accommodation
Meals (as specified in the itinerary)
Onboard Entertainment & Activities.(Some onboard activities and entertainment are chargeable)
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Using msedgedriver 123.0.2420.97 (resolved driver for Edge 123)
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Exporting webdriver.edge.driver as C:\Users\2327238\.cache\selenium\msedgedriver\win64\123.0.2420.97\msedgedriver.exe
Phone number error message : Please enter mobile number
Email error message : Please enter your valid email id
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Using chromedriver 121.0.6167.184 (resolved driver for Chrome 121)
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Exporting webdriver.chrome.driver as C:\Users\2327238\.cache\selenium\chromedriver\win64\121.0.6167.184\chromedriver.exe
clicked on hotels link
Pune is selected
Check-in Date : 2024-04-18
Check-out Date : 2024-04-22
checkout date selected
clicked on traveller drop down
4 Traveller added
clicked on search button
clicked on user rating
Hotel Name : Marriott Suites Pune
Price : ₹86,400
Hotel Name : Radisson Blu Hinjawadi Pune
Price : ₹12,27,500
Hotel Name : O Hotel Pune
Price : ₹1,24,696
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Using chromedriver 121.0.6167.184 (resolved driver for Chrome 121)
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Exporting webdriver.chrome.driver as C:\Users\2327238\.cache\selenium\chromedriver\win64\121.0.6167.184\chromedriver.exe
INCLUSION
2 Nights Cruise Accommodation
Meals (as specified in the itinerary)
Onboard Entertainment & Activities.(Some onboard activities and entertainment are chargeable)
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Using chromedriver 121.0.6167.184 (resolved driver for Chrome 121)
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Exporting webdriver.chrome.driver as C:\Users\2327238\.cache\selenium\chromedriver\win64\121.0.6167.184\chromedriver.exe
Phone number error message : Please enter mobile number
Email error message : Please enter your valid email id

===============================================
Suite
Total tests run: 40, Passes: 40, Failures: 0, Skips: 0
===============================================
```


### Cucumber Edge-Browser Output
```
@smoke @regression
Scenario: Display top rated hotels with specific amenities                                     # src/test/resources/Features/A_HotelsDetails.feature:3
Browser started successfully
Browser started successfully
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Using msedgedriver 123.0.2420.97 (resolved driver for Edge 123)
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Exporting webdriver.edge.driver as C:\Users\2327238\.cache\selenium\msedgedriver\win64\123.0.2420.97\msedgedriver.exe
=====================================================================================================================
clicked on hotels link
  Given Opening the yatra.com website, I clicked-on the ‘Hotels’ link.                         # stepdefinations.HotelsDetailsSteps.opening_the_yatra_com_website_i_clicked_on_the_hotels_link()

    Embedding Display top rated hotels with specific amenities [image/png 466964 bytes]

pune is selected
  And I set the location to "Pune" in the location field                                       # stepdefinations.HotelsDetailsSteps.i_set_the_location_to_in_the_location_field(java.lang.String)

    Embedding Display top rated hotels with specific amenities [image/png 486570 bytes]

Check-in Date : 2024-04-19
Check-out Date : 2024-04-23
checkout date selected
  And I click on the check-out date field and select the date five days from the check-in date # stepdefinations.HotelsDetailsSteps.i_click_on_the_check_out_date_field_and_select_the_date_five_days_from_the_check_in_date()

    Embedding Display top rated hotels with specific amenities [image/png 492010 bytes]

clicked on traveller drop down
  And I click on the traveller drop down                                                       # stepdefinations.HotelsDetailsSteps.i_click_on_the_traveller_drop_down()

    Embedding Display top rated hotels with specific amenities [image/png 498470 bytes]

4 Traveller added
  And I set the number of adults to four in the travellers dropdown                            # stepdefinations.HotelsDetailsSteps.i_set_the_number_of_adults_to_four_in_the_travellers_dropdown()

    Embedding Display top rated hotels with specific amenities [image/png 497681 bytes]

clicked on search button
  And I click on the search hotels button and the page should reload with the search results   # stepdefinations.HotelsDetailsSteps.i_click_on_the_search_hotels_button_and_the_page_should_reload_with_the_search_results()

    Embedding Display top rated hotels with specific amenities [image/png 39979 bytes]

clicked on user rating
  And I select User Rating: High to Low in the sort dropdown                                   # stepdefinations.HotelsDetailsSteps.i_select_user_rating_high_to_low_in_the_sort_dropdown()

    Embedding Display top rated hotels with specific amenities [image/png 242671 bytes]

  And I select free Wifi, free breakfast, laundry and swimming pool in the amenities filter    # stepdefinations.HotelsDetailsSteps.i_select_free_wifi_free_breakfast_laundry_and_swimming_pool_in_the_amenities_filter()

    Embedding Display top rated hotels with specific amenities [image/png 492741 bytes]

Hotel Name : Marriott Suites Pune
Price : ₹89,300
Hotel Name : Oakwood Residence Pune
Price : ₹53,000
Hotel Name : Radisson Blu Hinjawadi Pune
Price : ₹12,25,000
  Then I should see the name and total-amount for the first three hotels                       # stepdefinations.HotelsDetailsSteps.i_should_see_the_name_and_total_amount_for_the_first_three_hotels()

    Embedding Display top rated hotels with specific amenities [image/png 492583 bytes]

  Then I should navigate back to the home page                                                 # stepdefinations.HotelsDetailsSteps.I_should_navigate_back_to_the_home_page()

    Embedding Display top rated hotels with specific amenities [image/png 403566 bytes]

Browser closed successfully
=====================================================================================================================

@regression
Scenario: Retrieve cruise line inclusion points        # src/test/resources/Features/B_CruisePage.feature:3
Browser started successfully
Browser started successfully
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Using msedgedriver 123.0.2420.97 (resolved driver for Edge 123)
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Exporting webdriver.edge.driver as C:\Users\2327238\.cache\selenium\msedgedriver\win64\123.0.2420.97\msedgedriver.exe
=====================================================================================================================
  Given I navigate to the More section                 # stepdefinations.CruisePageSteps.i_navigate_to_the_more_section()

    Embedding Retrieve cruise line inclusion points [image/png 464322 bytes]

  When I select a cruise from the list and click on it # stepdefinations.CruisePageSteps.i_select_a_cruise_from_the_list_and_click_on_it()

    Embedding Retrieve cruise line inclusion points [image/png 455671 bytes]

  And I click on the Read More button                  # stepdefinations.CruisePageSteps.i_click_on_the_read_more_button()

    Embedding Retrieve cruise line inclusion points [image/png 369202 bytes]

INCLUSION
2 Nights Cruise Accommodation
Meals (as specified in the itinerary)
Onboard Entertainment & Activities.(Some onboard activities and entertainment are chargeable)
  Then all the Inclusion points should be displayed    # stepdefinations.CruisePageSteps.all_the_inclusion_points_should_be_displayed()

    Embedding Retrieve cruise line inclusion points [image/png 339775 bytes]

Browser closed successfully
=====================================================================================================================

@regression
Scenario: Validate gift voucher form with invalid data                                              # src/test/resources/Features/C_GiftVoucherPage.feature:3
Browser started successfully
Browser started successfully
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Using msedgedriver 123.0.2420.97 (resolved driver for Edge 123)
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Exporting webdriver.edge.driver as C:\Users\2327238\.cache\selenium\msedgedriver\win64\123.0.2420.97\msedgedriver.exe
=====================================================================================================================
  Given I am on the Home page and moved to more section                                             # stepdefinations.GiftVoucherPageSteps.i_am_on_the_home_page_and_moved_to_more_section()

    Embedding Validate gift voucher form with invalid data [image/png 454085 bytes]

  Then I have clicked on the Gift-Voucher from the list                                             # stepdefinations.GiftVoucherPageSteps.i_have_clicked_on_the_gift_voucher_from_the_list()

    Embedding Validate gift voucher form with invalid data [image/png 504115 bytes]

  Then I have switched to the Gift-Voucher page                                                     # stepdefinations.GiftVoucherPageSteps.i_have_switched_to_the_gift_voucher_page()

    Embedding Validate gift voucher form with invalid data [image/png 323249 bytes]

Phone number error message : Please enter mobile number
  Then I submit the form with an invalid phone number and  I capture the phone number error message # stepdefinations.GiftVoucherPageSteps.i_submit_the_form_with_an_invalid_phone_number_and_i_capture_the_phone_number_error_message()

    Embedding Validate gift voucher form with invalid data [image/png 85546 bytes]

Email error message : Please enter your valid email id
  Then I submit the form with an invalid email and I capture the email error message                # stepdefinations.GiftVoucherPageSteps.i_submit_the_form_with_an_invalid_email_and_i_capture_the_email_error_message()

    Embedding Validate gift voucher form with invalid data [image/png 86056 bytes]

Browser closed successfully
=====================================================================================================================
┌──────────────────────────────────────────────────────────────────────────┐
│ View your Cucumber Report at:                                            │
│ https://reports.cucumber.io/reports/4cfe40bb-0130-4479-86c6-2e7d9f5b806a │
│                                                                          │
│ This report will self-destruct in 24h.                                   │
│ Keep reports forever: https://reports.cucumber.io/profile                │
└──────────────────────────────────────────────────────────────────────────┘
===============================================
Suite
Total tests run: 3, Passes: 3, Failures: 0, Skips: 0
===============================================
```
