Feature: Account Management

  Scenario: User register a new address
    Given I am on the Account Management with email "sonar@sonar.com" and password "sonar4ever"
    When I follow add New Address
    When I fill in the following:
      | field       | value       |
      | FirstName   | SONAR        |
      | LastName    | ISC         |
      | Email       | sonar@sonar.com |
      | Country     | Colombia |
      | City        | SonarLand     |
      | Address1    | Sonar House Sonar Street|
      | ZipCode     | 140622       |
      | PhoneNumber | 14062022  |
    And I press "Save"
    Then I should go back to the Account Management page
