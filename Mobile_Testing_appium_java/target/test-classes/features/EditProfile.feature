Feature: Edit profile in Cicle app

  Background: User already logged in into Staging Cicle app

  @EditProfile
  Scenario Outline: Change profile with all fields changed
    Given User already opened Staging Cicle app
    When User click icon profile on footer dashboard page
    And User input <new name> on Your Name field
    And User input <new title> on Your Title field
    And User input <new bio> on Your Bio field
    And User click save button
    Then The app shows success message and changing profile

    Examples:
      |new name   |     |new title      |     |new bio  |
      |Kepa       |     | QA Engineer   |     | New QA  |

#  Scenario: Change profile with input blank data in Your Name field
