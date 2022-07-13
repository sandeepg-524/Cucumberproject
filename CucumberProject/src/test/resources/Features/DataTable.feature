Feature: Test the login functionality of OrangeHRM using DataTable

  Scenario: Test the valid login using DataTable
    Given user is on login page
    When users enters credentials using DataTable
    | admin   | admin123  |
    And Click on Login Button
    Then user should land on Home page

   