Feature: Tricentis Insurance Project

  Scenario: To validate Automobile Test
    Given Launch Tricentis Application
    When Click on Automobile Link
    When Enter following data
      | Audi | 1000 | 01/01/2026 | 2 | Petrol | 10000 | MH09GF1246 | 1000 |
    Then Automobile Test complete
