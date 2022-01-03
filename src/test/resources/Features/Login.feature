Feature: feature to test the login Functionality

  Scenario: check login with valid Credentials
    Given user is on login page
    When the user enter valid username and password
    And clicks on the login button
    Then the users should be navigated to home page
