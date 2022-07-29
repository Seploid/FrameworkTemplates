Feature: Example of simple test scenario

  @debug
  Scenario: Search request with + symbol
    Given I open the Home page
    When I try to find 'Selenide + Spring' on the Home page
    Then I see results on the Search page

  @debug
  Scenario: Search request with - symbol
    Given I open the Home page
    When I try to find 'Selenide - Spring' on the Home page
    Then I see results on the Search page