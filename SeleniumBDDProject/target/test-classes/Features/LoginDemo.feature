Feature: Test login functionality for second user

  Scenario: Check login is successful with valid info for second user
    When browser is open for user
    And user is on login page for user
    When user enters username and password for user
    And user clicks on login for user
    Then user is navigated to the home page for user
