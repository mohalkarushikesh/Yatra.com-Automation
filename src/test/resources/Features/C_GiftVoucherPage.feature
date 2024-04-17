Feature: alidate Gift Voucher Form As a user, I want to ensure that the gift voucher form correctly handles invalid data
	@regression
  Scenario: Validate gift voucher form with invalid data
    Given I am on the Home page and moved to more section
    Then I have clicked on the Gift-Voucher from the list
    Then I have switched to the Gift-Voucher page
    Then I submit the form with an invalid phone number and  I capture the phone number error message
    Then I submit the form with an invalid email and I capture the email error message
