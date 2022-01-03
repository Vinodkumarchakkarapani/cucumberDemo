Feature: This is the login ORange HRM site

  Scenario Outline: This is login scenario
    Given proceed to login page
    When user enters "<Username>"and password "<Password>"
    And click button

    Then click menu bar Recruitment
    And click canditates
    Examples: 
      | Username |  | Password |
      | Admin    |  | admin123 |
      
