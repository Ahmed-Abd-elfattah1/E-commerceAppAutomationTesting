
Feature: User could register with new account

  Scenario:user could register with valid data
    Given user navigate to register page
    When user select gender
    And  user enter first name
    And  user enter last name
    And  user enter date of birth
    And  user enter email
    And  user fills Password
    And  user fills confirm password
    And  user clicks on register button
    Then success message is displayed