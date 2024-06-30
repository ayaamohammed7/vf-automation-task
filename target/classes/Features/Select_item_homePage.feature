@smoke
Feature: User select a product from home page

  Scenario: User select a product from category from home page
    Given user open website and accept cookies
    When user select english language
    And User select smartphone category
    And user select phone
    Then User add product into basket




