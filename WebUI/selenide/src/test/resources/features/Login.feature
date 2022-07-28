Feature: Example of simple test scenario

  @debug
  Scenario: Test1 - Check Sum function
    Given first digit is 2
    And second digit is 3
    When I sum them
    Then result is 5

  @debug
  Scenario: Test2 - Check Sum function
    Given first digit is 2
    And second digit is 3
    When I sum them
    Then result is 6