@smoke
Feature: User select a product from search Bar

  Scenario: User search a product from search bar
    Given user opens website and accept cookies
    When user selects english language
    And User pressed on search bar and search for item
    And User selects samsung category
    And user selected phone
    Then User adds product into basket