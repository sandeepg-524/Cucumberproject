$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/loginfeature.feature");
formatter.feature({
  "name": "Test the login functionality of OrangeHRM",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test the valid login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinition.Loginsteps.user_is_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "users enters Username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinition.Loginsteps.users_enters_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinition.Loginsteps.click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should land on Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinition.Loginsteps.user_should_land_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
});