Feature: Remove Item From Cart
  Scenario: Remove added Item from Cart
    Given when user logs to the app
    When user add item to the Cart
    And user clicks on the cart icon
    Then user clicks on Remove, item is removed successfully