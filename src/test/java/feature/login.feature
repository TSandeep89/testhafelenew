#verify the login functionality

Feature: Login feature
  Scenario: test the Login functionality
    Given I launch chrome browser
    When User opens URL "https://oneweb-test.hafele.com/test-release2-rg40/de/de/"
#    Then User close the dialog box
    Then User clicks on Register button
    Then User enters Customer as 1000437 and Password as HQ3-
    Then Click on Register submit button
    Then Page Title should be "My account"
    And Close the Browser






