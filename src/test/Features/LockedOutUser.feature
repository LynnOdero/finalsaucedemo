Feature: User Log in
  Scenario: Locked User Login
    Given User logs in with incorrect credentials
    Then user should be able to see an error message
    Then close browser