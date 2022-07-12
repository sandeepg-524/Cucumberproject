Feature: Test the login functionality of OrangeHRM
Scenario: Test the valid login
Given user is on login page
When users enters Username and Password
And Click on Login Button
Then user should land on Home page
