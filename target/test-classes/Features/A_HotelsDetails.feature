Feature: Hotel and Cruise Booking and Gift Voucher Validation

  Scenario: Display top rated hotels with specific amenities
    Given Opening the yatra.com website, I clicked-on the ‘Hotels’ link.	 
    And I set the location to "Pune" in the location field
    And I click on the check-out date field and select the date five days from the check-in date
    And I click on the traveller drop down
    And I set the number of adults to four in the travellers dropdown
    And I click on the search hotels button and the page should reload with the search results
    And I select User Rating: High to Low in the sort dropdown  
    And I select free Wifi, free breakfast, laundry and swimming pool in the amenities filter
    Then I should see the name and total-amount for the first three hotels
    Then I should navigate back to the home page
	

  
