@ui
Feature: Omni Returns

  Background: Login Into Omni Return Application
    Given Open the Url Of Omni Return Application

  Scenario: Validate Companies Homepage and URL
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Companies Option From Manage Dropdown
    And Validate Page URL
      | URL                                                 |
      | https://stage.omniparcelreturns.com/admin/companies |
    Then Validate The Open Page
      | Heading   |
      | Companies |

  Scenario: Validate Add Company Page And Check Mandatory Required Fields
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Companies Option From Manage Dropdown
    And Click On Add Company
    Then Validate The Open Page
      | Heading     |
      | Add Company |
    And Click On Submit Button
    Then Check And Validate Mandatory Required Fields Error
      | CompanyName       | Country       | Suburb     | State/City  | Postcode         | ContactNumber | Email       | ReturnPortalDomain | SiteURL       |
      | CompanyName-error | country-error | city-error | state-error | postalcode-error | Contact-error | Email-error | CustomDomain-error | SiteURL-error |

  Scenario: Fill Create Company Fields and Click on Reset Button And Validate Fields Are Empty
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Companies Option From Manage Dropdown
    And Click On Add Company
    And Add Company By Adding Data Fields
      | CompanyName   | Country       | Suburb        | State/City | Postcode | ContactNumber | Email            | ReturnPortalDomain | SiteURL                |
      | Test Retailer | United States | New York City | Alaska     | 10001    | 6309194800    | test@exmaple.com | seko               | .omniparcelreturns.com |
    And Click On Reset Button
    Then Validate Fields Are Empty

  Scenario: Create Company and Validate Success Alert
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Companies Option From Manage Dropdown
    And Click On Add Company
    And Add Company By Adding Data Fields
      | CompanyName   | Country       | Suburb        | State/City | Postcode | ContactNumber | Email            | ReturnPortalDomain | SiteURL                |
      | Retailer Test | United States | New York City | Alaska     | 10001    | 6309194800    | test@exmaple.com | omniseko           | .omniparcelreturns.com |
    And Click On Submit Button
    Then Validate Success Alert
      | SuccessAlert                             |
      | A record has been inserted successfully. |

  Scenario: Search Created Company And Validate Searched Company Details In View Company
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Companies Option From Manage Dropdown
    And Click On View Company To Search Added Company
    And Search From Input
      | Search        |
      | Retailer Test |
    Then Validate Searched Company Details
      | Company       | Country       | Domain   | Email            |
      | RETAILER TEST | United States | omniseko | test@exmaple.com |

  Scenario: Search Created Company And Validate Searched Company Details Then Validate The Log Details PopUp In Company Change Log
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Companies Option From Manage Dropdown
    And Click On Company Change Log
    And Enter Change Log Details to Search
      | Search        | ChangeType | Company       | StartDate   | EndDate     |
      | Retailer Test | Add        | Retailer Test | 11,Nov 2022 | 19,Dec 2022 |
    Then Validate Searched Company Change Log Details
      | Company       | ChangeType |
      | Retailer Test | Add        |
    And Click On Search Details To See Log Details
    Then Validate Log Details PopUp
      | PopUp       |
      | Log Details |
    And Click On Close Button To Close The Log Details

  Scenario: Search Created Company And Update The Company Details In View Company And Validate Success Message For Update
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Companies Option From Manage Dropdown
    And Click On View Company To Search Added Company
    And Search From Input
      | Search        |
      | Retailer Test |
    Then Validate Searched Company Details
      | Company       | Country       | Domain   | Email            |
      | RETAILER TEST | United States | omniseko | test@exmaple.com |
    And Click On Edit To Update Company Details
    Then Validate The Open Page
      | Heading        |
      | Update Company |
    And Update Company By Modifying Data Fields
      | ContactNumber |
      | 6300000000    |
    And Click On Update Button To Update Company
    Then Validate Success Alert
      | SuccessAlert                             |
      | A record has been updated successfully.  |

  Scenario: Search And Validate The Updated Company Details Then Validate The Log Details PopUp In Company Change Log
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Companies Option From Manage Dropdown
    And Click On Company Change Log
    And Enter Change Log Details to Search
      | Search        | ChangeType | Company       | StartDate   | EndDate     |
      | Retailer Test | Update     | RETAILER TEST | 11,Nov 2022 | 19,Dec 2022 |
    Then Validate Searched Company Change Log Details
      | Company       | ChangeType |
      | Retailer Test | Update     |
    And Click On Search Details To See Log Details
    Then Validate Log Details PopUp
      | PopUp       |
      | Log Details |
    And Click On Close Button To Close The Log Details

  Scenario: Disable Company Status And Check On Company Change Log Page
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Companies Option From Manage Dropdown
    And Click On View Company To Search Added Company
    And Search From Input
      | Search        |
      | Retailer Test |
    Then Validate Searched Company Details
      | Company       | Country       | Domain   | Email            |
      | RETAILER TEST | United States | omniseko | test@exmaple.com |
    And Click On Edit To Update Company Details
    Then Validate The Open Page
      | Heading        |
      | Update Company |
    And Disable Company By Modifying Data Field
    And Click On Update Button To Update Company
    Then Validate Success Alert
      | SuccessAlert                             |
      | A record has been updated successfully.  |
    And Click On Company Change Log
    And Enter Disabled Company Name And Validate No Result Found
      | Company       |
      | Retailer Test |

  Scenario: Export Created Company And Validate Downloaded Excel Sheet Data
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Companies Option From Manage Dropdown
    And Click On View Company To Search Added Company
    And Export From Input
      | Search        |
      | Retailer Test |
  ##################################
#    Given user fills the form from given sheetname "<SheetName>" and rownumber <RowNumber>
#    Examples:
#      | SheetName  | RowNumber |
#      | YourReturn | 0         |
#      | YourReturn | 1         |