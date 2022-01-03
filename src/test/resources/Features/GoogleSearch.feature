Feature: Feature to test the Search google Functionality

  Scenario: Validate the google search is working
    Given browser is open
    And user is on google Search page
    When user enter a text in search box
    And hits enter
    Then user is navigated to search Results
