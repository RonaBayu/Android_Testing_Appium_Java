Feature: Log Out account in Cicle app

  Background: User already logged in into Staging Cicle app

  @LogOut
  Scenario: Log Out the account
    Given User already opened Staging Cicle app
    When User click hamburger icon
    And User click log out button
    Then User is successfully logged out and showed sign in page