Feature: This is a sample Feature File

  @SmokeTag  @Regression
  Scenario: This is a sample Scenario
    Given the user opens the application
    When the user enters the credentials
    And the user clicks on login button
    Then the user must be able to login

    @Sanity @Regression
  Scenario: This is description
    Given the user opens the application
    When the user enters the incorrect credentials
    But the user clicks on login button
    Then the user must not be able to login
