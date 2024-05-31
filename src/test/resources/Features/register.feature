Feature: Registering a new user
  Scenario: User registers with valid data
    Given A user navigates to the registration page
    When User enters valid name "SONAR"
    And User enters valid last name "ISC"
    And User enters valid email "sonar@sonar.com"
    And User enters valid password "sonar4ever"
    And User enters valid confirm password "sonar4ever"
    And User clicks on the register button
    Then User should be taken to the successful registration page