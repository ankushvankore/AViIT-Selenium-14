Feature: Login on OHRM via Data driven testing

  Scenario Outline: To validate login functionality
    Given Launch OHRM application
    When Enter username as "<UserName>" 
    When Enter password as "<Password>"
    And Click on Submit
    Then Dashboard page should display

    Examples: 
      | UserName | Password   |
      | admin    | admin123   |
      | amita    | amita123   |
      | admin    | admin123   |
      | mehwash  | mehwash123 |
