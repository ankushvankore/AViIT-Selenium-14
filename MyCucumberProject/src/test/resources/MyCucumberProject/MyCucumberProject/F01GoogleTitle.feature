
Feature: Google Title

  Scenario: To validate title of Google page
    Given Open Google
    When Read the title
    Then Title should be Google
