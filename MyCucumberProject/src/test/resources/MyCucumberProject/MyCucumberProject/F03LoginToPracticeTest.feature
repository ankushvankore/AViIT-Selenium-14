Feature: Login to Practice Test

  Background: 
    Given Launch Practice Test Application

  Scenario: To validate login functionality with valid data
    When Enter valid user name
    When Enter valid password
    And Click on Login button
    Then Home page should display

  Scenario: To validate login functionality with invalid data
    When Enter invalid user name and invalid password
    And Click on Submit button
    Then Error message should display
