@ui
Feature: Omni Returns

  Background: Login Into Omni Return Application
    Given Open the Url Of Omni Return Application

  Scenario: Validate Role Homepage and URL
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Role Option From Manage Dropdown
    And Validate Page URL
      | URL                                            |
      | https://stage.omniparcelreturns.com/admin/role |
    Then Validate The Open Page
      | Heading |
      | Roles   |

  Scenario: Validate Add Role Page And Check Mandatory Required Fields
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Role Option From Manage Dropdown
    And Click On Add Role
    Then Validate The Open Page
      | Heading  |
      | Add Role |
    And Click On Submit Button
    Then Check And Validate Mandatory Required Fields Error In Add Role
      | Company         | Role       | Description       |
      | IdCompany-error | Role-error | Description-error |

  Scenario: Create Role and Validate Success Alert
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Role Option From Manage Dropdown
    And Click On Add Role
    And Add Role By Adding Data Fields
      | Company | Role      | Description     |
      | aa      | TestRole9 | TestDescription |
    And Click On Submit Button
    Then Validate Success Alert
      | SuccessAlert           |
      | Role added succesfully |

  Scenario: Validate Added Role In View Role
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Role Option From Manage Dropdown
    And Click On View Role
    Then Validate The Open Page
      | Heading  |
      | Roles    |
    Then Validate Created Role Details
      | Role      | Description     |
      | TESTROLE9 | TestDescription |

  Scenario: Edit Added Role
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Role Option From Manage Dropdown
    And Click On View Role
    Then Validate The Open Page
      | Heading |
      | Roles   |
    And Click On Edit To Update Company Details
    Then Validate The Open Page
      | Heading   |
      | Edit Role |
    And Add Role By Adding Data Fields
      | Company | Role        | Description        |
      | aa      | TestRole111 | TestDescription111 |
    And Click On Update Button To Update Company
    Then Validate Success Alert
      | SuccessAlert            |
      | Role update succesfully |

  Scenario: Validate Updated Role In View Role
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Role Option From Manage Dropdown
    And Click On View Role
    Then Validate The Open Page
      | Heading  |
      | Roles    |
    Then Validate Created Role Details
      | Role        | Description        |
      | TESTROLE111 | TestDescription111 |
