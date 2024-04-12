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

