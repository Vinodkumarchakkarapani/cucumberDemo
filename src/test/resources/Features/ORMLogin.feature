Feature: This is the login feature of Orange HRM

  Scenario: This is login Scenario
    Given Go to the login page
    When Enter the below Credentials
      |Username||Password|
      |Admin   ||admin123|
    And click login button
