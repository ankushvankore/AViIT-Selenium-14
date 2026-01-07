Feature: Test Automation

  Scenario: To validate Test Automation Registration
    Given Open Test Automation App
    When Enter name as "Mehwash"
    When Enter Email id as "mehwash@gmail.com"
    When Enter Phone no as "9898989898"
    When Enter Address as "Pune"
    When Select Gender "Female"
    Then Registration success
