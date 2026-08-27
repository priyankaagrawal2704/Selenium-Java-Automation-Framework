Feature: A sample feature file for Scenario Outline

  @Outline
  Scenario Outline: A Sample Scenario Outline
    Given the user opens the application
    When the user enters username as "<username>"
    But the user enters password as "<password>"
    Then the user must not be able to login

    Examples:
      | username | password |
      | abcd     | 0123     |
      | bcde     | 1234     |
      | cdef     | 2345     |
      | defg     | 3456     |
      | efgh     | 4567     |