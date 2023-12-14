Feature: Checkout
  Scenario: Checkout Items
    Given a user successfully logs into the app
    Given User clicks on Add to Cart button
    When user clicks on the cart icon and views items added to the Cart
    And user clicks on Checkout
    Then user can enter checkout information <firstName> <lastName> <Zip>
    When user clicks on Continue
    Then User is directed to Checkout overview
    When user clicks on Finish then user is navigated to Checkout Overview
