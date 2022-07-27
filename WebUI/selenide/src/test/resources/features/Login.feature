Feature: Example of simple test scenario

  @debug
  Scenario: Check Sum function
    Given first digit is 2
    And second digit is 3
    When I sum them
    Then result is 5