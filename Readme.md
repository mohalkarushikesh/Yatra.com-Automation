# Yatra.com Automation 

1. Display Hotel name, total amount for first 3 hotels for 4 people in any location for 5 days of stay from tomorrow's date; Should have sorted the list with highest User rating, show hotels with free Wifi, free breakfast and amenities with laundry and swimming pool.

2. Pick any one cruise line 
	a. Retrieve all the Inclusion points and Display the same

3. Go to gift voucher and scroll to corporate queries and fill it with invalid email and phone number.
	a. capture error message and display the same.

```
(Suggested Site: www.yatra.com however  you are free to choose any other legitimate  site)
```
### Project Overview
This project automates the testing of various functionalities on a travel booking website (e.g., Yatra.com). The main objectives include:

Hotel Booking Automation:
	Display the hotel name and total amount for the first three hotels for four people in any location for a 5-day stay starting from tomorrow.
	Sort the list by highest user rating.
	Ensure the hotels offer free WiFi, free breakfast, and amenities like laundry and a swimming pool.
Cruise Line Information Retrieval:
	Select a cruise line and retrieve all inclusion points.
Gift Voucher Form Validation:
	Navigate to the gift voucher section, scroll to corporate queries, and fill in the form with invalid email and phone number.
 	Capture and display the error message.


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
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Exporting webdriver.edge.driver as C:\Users\user-rushi\.cache\selenium\msedgedriver\win64\123.0.2420.97\msedgedriver.exe
INCLUSION
2 Nights Cruise Accommodation
Meals (as specified in the itinerary)
Onboard Entertainment & Activities.(Some onboard activities and entertainment are chargeable)
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Using msedgedriver 123.0.2420.97 (resolved driver for Edge 123)
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Exporting webdriver.edge.driver as C:\Users\user-rushi\.cache\selenium\msedgedriver\win64\123.0.2420.97\msedgedriver.exe
Phone number error message : Please enter mobile number
Email error message : Please enter your valid email id
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Using chromedriver 121.0.6167.184 (resolved driver for Chrome 121)
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Exporting webdriver.chrome.driver as C:\Users\user-rushi\.cache\selenium\chromedriver\win64\121.0.6167.184\chromedriver.exe
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
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Exporting webdriver.chrome.driver as C:\Users\user-rushi\.cache\selenium\chromedriver\win64\121.0.6167.184\chromedriver.exe
INCLUSION
2 Nights Cruise Accommodation
Meals (as specified in the itinerary)
Onboard Entertainment & Activities.(Some onboard activities and entertainment are chargeable)
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Using chromedriver 121.0.6167.184 (resolved driver for Chrome 121)
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Exporting webdriver.chrome.driver as C:\Users\user-rushi\.cache\selenium\chromedriver\win64\121.0.6167.184\chromedriver.exe
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
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Using msedgedriver 123.0.2420.97 (resolved driver for Edge 123)
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Exporting webdriver.edge.driver as C:\Users\user-rushi\.cache\selenium\msedgedriver\win64\123.0.2420.97\msedgedriver.exe
clicked on hotels link
  Given Opening the yatra.com website, I clicked-on the ‘Hotels’ link.                         # stepdefinations.HotelsDetailsSteps.opening_the_yatra_com_website_i_clicked_on_the_hotels_link()

    Embedding Display top rated hotels with specific amenities [image/png 402545 bytes]

pune is selected
  And I set the location to "Pune" in the location field                                       # stepdefinations.HotelsDetailsSteps.i_set_the_location_to_in_the_location_field(java.lang.String)

    Embedding Display top rated hotels with specific amenities [image/png 489562 bytes]

Check-in Date : 2024-04-18
Check-out Date : 2024-04-22
checkout date selected
  And I click on the check-out date field and select the date five days from the check-in date # stepdefinations.HotelsDetailsSteps.i_click_on_the_check_out_date_field_and_select_the_date_five_days_from_the_check_in_date()

    Embedding Display top rated hotels with specific amenities [image/png 493732 bytes]

clicked on traveller drop down
  And I click on the traveller drop down                                                       # stepdefinations.HotelsDetailsSteps.i_click_on_the_traveller_drop_down()

    Embedding Display top rated hotels with specific amenities [image/png 500611 bytes]

4 Traveller added
  And I set the number of adults to four in the travellers dropdown                            # stepdefinations.HotelsDetailsSteps.i_set_the_number_of_adults_to_four_in_the_travellers_dropdown()

    Embedding Display top rated hotels with specific amenities [image/png 500696 bytes]

clicked on search button
  And I click on the search hotels button and the page should reload with the search results   # stepdefinations.HotelsDetailsSteps.i_click_on_the_search_hotels_button_and_the_page_should_reload_with_the_search_results()

    Embedding Display top rated hotels with specific amenities [image/png 199527 bytes]

clicked on user rating
  And I select User Rating: High to Low in the sort dropdown                                   # stepdefinations.HotelsDetailsSteps.i_select_user_rating_high_to_low_in_the_sort_dropdown()

    Embedding Display top rated hotels with specific amenities [image/png 385924 bytes]

  And I select free Wifi, free breakfast, laundry and swimming pool in the amenities filter    # stepdefinations.HotelsDetailsSteps.i_select_free_wifi_free_breakfast_laundry_and_swimming_pool_in_the_amenities_filter()

    Embedding Display top rated hotels with specific amenities [image/png 401193 bytes]

Hotel Name : Marriott Suites Pune
Price : ₹86,400
Hotel Name : Radisson Blu Hinjawadi Pune
Price : ₹12,27,500
Hotel Name : O Hotel Pune
Price : ₹1,24,696
  Then I should see the name and total-amount for the first three hotels                       # stepdefinations.HotelsDetailsSteps.i_should_see_the_name_and_total_amount_for_the_first_three_hotels()

    Embedding Display top rated hotels with specific amenities [image/png 400982 bytes]

  Then I should navigate back to the home page                                                 # stepdefinations.HotelsDetailsSteps.I_should_navigate_back_to_the_home_page()

    Embedding Display top rated hotels with specific amenities [image/png 405788 bytes]


@regression
Scenario: Retrieve cruise line inclusion points        # src/test/resources/Features/B_CruisePage.feature:3
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Using msedgedriver 123.0.2420.97 (resolved driver for Edge 123)
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Exporting webdriver.edge.driver as C:\Users\user-rushi\.cache\selenium\msedgedriver\win64\123.0.2420.97\msedgedriver.exe
  Given I navigate to the More section                 # stepdefinations.CruisePageSteps.i_navigate_to_the_more_section()

    Embedding Retrieve cruise line inclusion points [image/png 391862 bytes]

  When I select a cruise from the list and click on it # stepdefinations.CruisePageSteps.i_select_a_cruise_from_the_list_and_click_on_it()

    Embedding Retrieve cruise line inclusion points [image/png 386817 bytes]

  And I click on the Read More button                  # stepdefinations.CruisePageSteps.i_click_on_the_read_more_button()

    Embedding Retrieve cruise line inclusion points [image/png 368469 bytes]

INCLUSION
2 Nights Cruise Accommodation
Meals (as specified in the itinerary)
Onboard Entertainment & Activities.(Some onboard activities and entertainment are chargeable)
  Then all the Inclusion points should be displayed    # stepdefinations.CruisePageSteps.all_the_inclusion_points_should_be_displayed()

    Embedding Retrieve cruise line inclusion points [image/png 339042 bytes]


@regression
Scenario: Validate gift voucher form with invalid data                                              # src/test/resources/Features/C_GiftVoucherPage.feature:3
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Using msedgedriver 123.0.2420.97 (resolved driver for Edge 123)
[main] INFO io.github.bonigarcia.wdm.WebDriverManager - Exporting webdriver.edge.driver as C:\Users\user-rushi\.cache\selenium\msedgedriver\win64\123.0.2420.97\msedgedriver.exe
  Given I am on the Home page and moved to more section                                             # stepdefinations.GiftVoucherPageSteps.i_am_on_the_home_page_and_moved_to_more_section()

    Embedding Validate gift voucher form with invalid data [image/png 391862 bytes]

  Then I have clicked on the Gift-Voucher from the list                                             # stepdefinations.GiftVoucherPageSteps.i_have_clicked_on_the_gift_voucher_from_the_list()

    Embedding Validate gift voucher form with invalid data [image/png 442558 bytes]

  Then I have switched to the Gift-Voucher page                                                     # stepdefinations.GiftVoucherPageSteps.i_have_switched_to_the_gift_voucher_page()

    Embedding Validate gift voucher form with invalid data [image/png 324687 bytes]

Phone number error message : Please enter mobile number
  Then I submit the form with an invalid phone number and  I capture the phone number error message # stepdefinations.GiftVoucherPageSteps.i_submit_the_form_with_an_invalid_phone_number_and_i_capture_the_phone_number_error_message()

    Embedding Validate gift voucher form with invalid data [image/png 85202 bytes]

Email error message : Please enter your valid email id
  Then I submit the form with an invalid email and I capture the email error message                # stepdefinations.GiftVoucherPageSteps.i_submit_the_form_with_an_invalid_email_and_i_capture_the_email_error_message()

    Embedding Validate gift voucher form with invalid data [image/png 85677 bytes]

┌──────────────────────────────────────────────────────────────────────────┐
│ View your Cucumber Report at:                                            │
│ https://reports.cucumber.io/reports/802221af-5844-4602-bbcf-dbc2a4312562 │
│                                                                          │
│ This report will self-destruct in 24h.                                   │
│ Keep reports forever: https://reports.cucumber.io/profile                │
└──────────────────────────────────────────────────────────────────────────┘
===============================================
Suite
Total tests run: 3, Passes: 3, Failures: 0, Skips: 0
===============================================
```


### Dependencies 
```
<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.8.1</version>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>3.0.0-M1</version>
				<configuration>
					<suiteXmlFiles>
						<suiteXmlFile>cucumber.xml</suiteXmlFile>
					</suiteXmlFiles>
				</configuration>
			</plugin>
		</plugins>
	</build>
	<dependencies>
		<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.19.1</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
		<dependency>
			<groupId>io.github.bonigarcia</groupId>
			<artifactId>webdrivermanager</artifactId>
			<version>5.7.0</version>
		</dependency>
		<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-simple</artifactId>
			<version>2.0.12</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>7.9.0</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>com.aventstack</groupId>
			<artifactId>extentreports</artifactId>
			<version>5.1.1</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core -->
		<dependency>
			<groupId>org.apache.logging.log4j</groupId>
			<artifactId>log4j-core</artifactId>
			<version>2.23.1</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api -->
		<dependency>
			<groupId>org.apache.logging.log4j</groupId>
			<artifactId>log4j-api</artifactId>
			<version>2.23.1</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi</artifactId>
			<version>5.2.5</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi-ooxml</artifactId>
			<version>5.2.5</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
		<dependency>
			<groupId>commons-io</groupId>
			<artifactId>commons-io</artifactId>
			<version>2.16.1</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.apache.commons/commons-lang3 -->
		<dependency>
			<groupId>org.apache.commons</groupId>
			<artifactId>commons-lang3</artifactId>
			<version>3.14.0</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-java</artifactId>
			<version>7.16.1</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-junit</artifactId>
			<version>7.16.1</version>
			<scope>test</scope>
		</dependency>
		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-testng -->
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-testng</artifactId>
			<version>7.16.1</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/com.vimalselvam/cucumber-extentsreport -->
		<dependency>
			<groupId>com.vimalselvam</groupId>
			<artifactId>cucumber-extentsreport</artifactId>
			<version>3.1.1</version>
		</dependency>
		<dependency>
			<groupId>tech.grasshopper</groupId>
			<artifactId>extentreports-cucumber7-adapter</artifactId>
			<version>1.14.0</version>
		</dependency>
		<dependency>
			<groupId>tech.grasshopper</groupId>
			<artifactId>extentreports-cucumber7-adapter</artifactId>
			<version>1.14.0</version>
		</dependency>
	</dependencies>
```
