Feature: Test the login functionality of OrangeHRM

  Scenario Outline: Test the valid login
    Given user is on login page
    When users enters <username> and <password>
    And Click on Login Button
    Then user should land on Home page

    Examples: 
      | usename | password  |
      | admin   | admin123  |
      | admin1  | admin1234 |
