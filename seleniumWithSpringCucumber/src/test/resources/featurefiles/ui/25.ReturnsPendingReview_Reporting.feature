@ui
Feature: Omni Returns

  Background: Login Into Omni Return Application
    Given Open the Url Of Omni Return Application

  Scenario: Validate Returns Pending Review Homepage and URL
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Returns Pending Review to see Returns Report
    And Validate Page URL
      | URL                                                     |
      | https://stage.omniparcelreturns.com/admin/return_review |
    Then Validate The Open Page
      | Heading                |
      | Returns Pending Review |

  Scenario: Search Returns Pending Review Report Without Taking Inputs
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Returns Pending Review to see Returns Report
    And Click On Search Button


