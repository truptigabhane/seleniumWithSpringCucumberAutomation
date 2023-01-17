@ui
Feature: Omni Returns

  Background: Login Into Omni Return Application
    Given Open the Url Of Omni Return Application

  Scenario: Validate Groups Homepage and URL
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Groups Option From Manage Dropdown
    And Validate Page URL
      | URL                                              |
      | https://stage.omniparcelreturns.com/admin/groups |
    Then Validate The Open Page
      | Heading     |
      | View Groups |

  Scenario: Validate Add Group Page And Check Mandatory Required Fields
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Groups Option From Manage Dropdown
    And Click On Add Group
    Then Validate The Open Page
      | Heading   |
      | Add Group |
    And Click On Submit Button
    Then Check And Validate Mandatory Required Fields Error In Add Group
      | GroupName       | Company         | Retailer         |
      | GroupName-error | IdCompany-error | IdRetailer-error |

  Scenario: Fill Create Group Fields and Click on Reset Button And Validate Fields Are Empty
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Groups Option From Manage Dropdown
    And Click On Add Group
    And Add Group By Adding Data Fields
      | GroupName | Company | Retailer |
      | Group12   | aa      | AA       |
    And Click On Reset Button
    Then Validate Fields Are Empty In Add Group

  Scenario: Create Group and Validate Success Alert
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Groups Option From Manage Dropdown
    And Click On Add Group
    And Add Group By Adding Data Fields
      | GroupName | Company | Retailer |
      | Group1    | aa      | AA       |
    And Click On Submit Button
    Then Validate Success Alert
      | SuccessAlert                |
      | Group inserted sucessfully. |

  Scenario: Validate Added Group In View Groups
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Groups Option From Manage Dropdown
    And Click On View Group
    Then Validate Created Group Details
      | GroupName | Retailer |
      | Group1    | AA       |

  Scenario: Update Created Group In View Groups
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Groups Option From Manage Dropdown
    And Click On View Group
    And Click On Edit Icon In Group
    Then Validate The Open Page
      | Heading      |
      | Update Group |
    And Add Group By Adding Data Fields To Update
      | GroupName | Company | Retailer |
      | Group111  | aa      | aa       |
    And Click On Update Button To Update Company
    Then Validate Success Alert
      | SuccessAlert                  |
      | Group is Updated Succesfully. |

  Scenario: Delete Created Group In View Groups
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Groups Option From Manage Dropdown
    And Click On View Group
    And Click On Delete Icon In Group
    Then Validate Success Alert
      | SuccessAlert                  |
      | Group is Deleted Succesfully. |

  Scenario: Validate Updated Group In View Group
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Groups Option From Manage Dropdown
    And Click On View Group
    Then Validate Created Group Details
      | GroupName | Retailer |
      | Group111  | AA       |