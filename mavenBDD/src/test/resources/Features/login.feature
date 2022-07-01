@SmokeFeature
Feature: feature to test login functionality
    

  @smoketest
  Scenario: Check login is successful with vaid info
    Given user is login page
    When user enters username and password
    And clicks login button
    Then user is navigated to the home page

    Examples: 
      | user1 |  | pass1 |
      | user2 |  | pass2 |
