@ui
Feature: Omni Returns

  Background: Login Into Omni Return Application
    Given Open the Url Of Omni Return Application

  Scenario: Validate Reporting Homepage and URL
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Reporting to see Returns Report
    And Validate Page URL
      | URL                                               |
      | https://stage.omniparcelreturns.com/admin/returns |
    Then Validate The Open Page
      | Heading        |
      | Returns Report |

  Scenario: Search Returns Report Without Taking Inputs
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Reporting to see Returns Report
    And Click On Search Button
    Then Validate Returns Report Details
      | Retailer        | Name          |
      | Seko Demo Store | Akash Trivedi |

  Scenario: Export Returns Report
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Reporting to see Returns Report
    And Click On Export Button


