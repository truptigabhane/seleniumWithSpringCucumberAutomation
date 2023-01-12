@ui
Feature: Omni Returns

  Background: Login Into Omni Return Application
    Given Open the Url Of Omni Return Application

    Scenario: Validate Hubs Homepage and URL
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Hub Option From Manage Dropdown
    And Validate Page URL
      | URL                                            |
      | https://stage.omniparcelreturns.com/admin/hubs |
    Then Validate The Open Page
      | Heading |
      | Hubs    |

  Scenario: Validate Add Hub Page And Check Mandatory Required Fields
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Hub Option From Manage Dropdown
    And Click On Add Hub
    Then Validate The Open Page
      | Heading |
      | Add Hub |
    And Click On Submit Button
    Then Check And Validate Mandatory Required Fields Errors
      | CompanyName     | Name       | Country       | Suburb     | State/City  | Email       |
      | CompanyId-error | Name-error | country-error | city-error | state-error | Email-error |

  Scenario: Add Hub Fields and Click on Reset Button And Validate Fields Are Empty
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Hub Option From Manage Dropdown
    And Click On Add Hub
    And Add Hub By Adding Data Fields
      | Company       | Name          | Country       | Suburb        | State/City | Postcode | Email            |
      | Retailer Test | Akash Trivedi | United States | New York City | Alaska     | 10001    | test@exmaple.com |
    And Click On Reset Button
    Then Validate Fields Are Empty Or Not

  Scenario: Create Hub and Validate Success Alert
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Hub Option From Manage Dropdown
    And Click On Add Hub
    And Add Hub By Adding Data Fields
      | Company       | Name     | Country       | Suburb        | State/City | Postcode | Email            |
      | Retailer Test | SekoOmni | United States | New York City | Alaska     | 10001    | test@exmaple.com |
    And Click On Submit Button
    Then Validate Success Alert
      | SuccessAlert                             |
      | A record has been inserted successfully. |

  Scenario: Search Created Hub And Validate Searched Hub Details In View Hub
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Hub Option From Manage Dropdown
    And Click On View Hubs To Search Added Hub
    And Search From Input In Hub
      | Search   | Company       |
      | SekoOmni | Retailer Test |
    Then Validate Searched Hub Details
      | Company       | Name     |
      | Retailer Test | SekoOmni |

  Scenario: Search Created Hub And Validate Searched Hub Details Then Validate The Log Details PopUp In hub Change Log
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Hub Option From Manage Dropdown
    And Click On Hub Change Log
    And Enter Change Log Details to Search
      | Search   | ChangeType | Company       | StartDate   | EndDate     |
      | SekoOmni | Add        | Retailer Test | 11,Nov 2022 | 19,Dec 2022 |
    Then Validate Searched Hub Change Log Details
      | Company       | Hub      | ChangeType |
      | Retailer Test | SekoOmni | Add        |
    And Click On Search Details To See Log Details
    Then Validate Log Details PopUp
      | PopUp       |
      | Log Details |
    And Click On Close Button To Close The Log Details

  Scenario: Search Created Hub And Update The Hub Details In View Hub And Validate Success Message For Update
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Hub Option From Manage Dropdown
    And Click On View Hubs To Search Added Hub
    And Search From Input In Hub
      | Search   | Company       |
      | SekoOmni | Retailer Test |
    Then Validate Searched Hub Details
      | Company       | Name     |
      | Retailer Test | SekoOmni |
    And Click On Edit To Update Company Details
    Then Validate The Open Page
      | Heading    |
      | Update Hub |
    And Update Hub By Modifying Data Fields
      | Name         |
      | SekoTestDemo |
    And Click On Update Button
    Then Validate Success Alert
      | SuccessAlert                            |
      | A record has been updated successfully. |

  Scenario: Search And Validate The Updated Hub Details Then Validate The Log Details PopUp In Hub Change Log
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Hub Option From Manage Dropdown
    And Click On Hub Change Log
    And Enter Change Log Details to Search
      | Search       | ChangeType | Company       | StartDate   | EndDate     |
      | SekoTestDemo | Update     | Retailer Test | 11,Nov 2022 | 19,Dec 2022 |
    Then Validate Searched Hub Change Log Details
      | Company       | Hub          | ChangeType |
      | Retailer Test | SekoTestDemo | Update     |
    And Click On Search Details To See Log Details
    Then Validate Log Details PopUp
      | PopUp       |
      | Log Details |
    And Click On Close Button To Close The Log Details

  Scenario: Export Created Hub And Validate Downloaded Excel Sheet Data
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Hub Option From Manage Dropdown
    And Click On View Hubs To Search Added Hub
    And Export From Input
      | Search        |
      | Retailer Test |