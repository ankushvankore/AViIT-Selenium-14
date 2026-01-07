Feature: Google search functionality

  Scenario: Validate search functionality on Google
    Given Launch Google
    When Enter keyword to search in search box
    And Hit Enter
    Then A valid search result should display
