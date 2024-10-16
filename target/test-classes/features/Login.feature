Feature: Login to doctor portal

  @login
Scenario: Login as an admin
  Given I am on login page
  When  I enter email
  And   I enter password
  And   I choose role as admin
  And   I Click on sign in button
  Then  I should be logged in successfully
