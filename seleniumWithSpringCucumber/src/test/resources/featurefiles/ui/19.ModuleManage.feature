@ui
Feature: Omni Returns

  Background: Login Into Omni Return Application
    Given Open the Url Of Omni Return Application

  Scenario: Validate Module Homepage and URL
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Module Option From Manage Dropdown
    And Validate Page URL
      | URL                                               |
      | https://stage.omniparcelreturns.com/admin/modules |
    Then Validate The Open Page
      | Heading |
      | Modules |

  Scenario: Validate Add Module Page And Check Mandatory Required Fields
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Module Option From Manage Dropdown
    And Click On Add Module
    Then Validate The Open Page
      | Heading    |
      | Add Module |
    And Click On Submit Button
    Then Check And Validate Mandatory Required Fields Error In Add Module
      | ModuleName       | Description       |
      | ModuleName-error | Description-error |

  Scenario: Create Module and Validate Success Alert
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Module Option From Manage Dropdown
    And Click On Add Module
    And Add Module By Adding Data Fields
      | ModuleName  | Description             |
      | TestModule1 | TestModule1 Description |
    And Click On Submit Button
    Then Validate Success Alert
      | SuccessAlert             |
      | Module added succesfully |

  Scenario: Search Created Module And Validate Searched Module Details In View Module
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Module Option From Manage Dropdown
    And Click On View Module
    Then Validate Created Module Details
      | ModuleName  | Description             |
      | TESTMODULE1 | TestModule1 Description |
