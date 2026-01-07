@GoogleLinks
Feature: Google Links

  Background: 
    Given Launch "https://www.google.com"

  @AboutLink
  Scenario: To validate About Link Functionality
    When Click on About Link
    Then About page should open

  @StoreLink
  Scenario: To validate Store Link Functionality
    When Click on Store Link
    Then Store page should open

  @GmailLink
  Scenario: To validate Gmail Link Functionality
    When Click on Gmail Link
    Then Gmail page should open

  @AdvtLink
  Scenario: To validate Advt Link Functionality
    When Click on Advt Link
    Then Advt page should open
