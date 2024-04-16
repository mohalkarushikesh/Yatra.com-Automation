Feature: Cruise Line Inclusion Points Retrieval As a user, I want to retrieve all inclusion points of a cruise line

  Scenario: Retrieve cruise line inclusion points
    Given I navigate to the More section
    When I select a cruise from the list and click on it
    And I click on the Read More button
    Then all the Inclusion points should be displayed
