Feature: Feature file for Background

  Background: Sample Background
    Given the user opens the application

    @Example
  Scenario: This is a sample Scenario
    When the user enters the credentials
    And the user clicks on login button
    Then the user must be able to login

  Scenario: This is description
    When the user enters the incorrect credentials
    But the user clicks on login button
    Then the user must not be able to login
