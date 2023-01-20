@ui
Feature: Outer Admin

  Background: Login Into OmniRPS Application
    Given Open the Url Of OmniRPS Application For Stage Environment

        ################### Create Outer ######################

  Scenario: Validate Create Outer Homepage and URL
    Given Enter EmailAddress And Password and Click On LogIn Btn In Hub User
      | EmailID  | Password |
      | lucky123 | lucky123 |
    When Click on Outers Menu
    And Click Create Outer Dropdown Menu
    And Validate Page URL
      | URL                             |
      | https://stage.omnirps.com/outer |
    Then Validate Log Details PopUp
      | PopUp        |
      | CREATE OUTER |

  Scenario: Create Outer
    Given Enter EmailAddress And Password and Click On LogIn Btn In Hub User
      | EmailID  | Password |
      | lucky123 | lucky123 |
    When Click on Outers Menu
    And Click Create Outer Dropdown Menu
    And Select Hub And Retailer To Create Outer
      | Hub           | Retailer                     |
      | SEKO OMNI LAX | SEKO DEMO-RETURN TO THE FOLD |
    And Click Create Outer Button And If Outer Is Already Open Then Validate Popup And Confirm To Open Another Outer
      | PopUp              |
      | OUTER ALREADY OPEN |
    Then Validate Success Message

  Scenario: Create Outer While Outer Is Already Open
    Given Enter EmailAddress And Password and Click On LogIn Btn In Hub User
      | EmailID  | Password |
      | lucky123 | lucky123 |
    When Click on Outers Menu
    And Click Create Outer Dropdown Menu
    And Select Hub And Retailer To Create Outer
      | Hub           | Retailer                     |
      | SEKO OMNI LAX | SEKO DEMO-RETURN TO THE FOLD |
    And Click Create Outer Button And If Outer Is Already Open Then Validate Popup And Confirm To Open Another Outer
      | PopUp              |
      | OUTER ALREADY OPEN |
    Then Validate Success Message

  Scenario: Validate The Error While Creating Outer Without Selecting Hub And Retailer
    Given Enter EmailAddress And Password and Click On LogIn Btn In Hub User
      | EmailID  | Password |
      | lucky123 | lucky123 |
    When Click on Outers Menu
    And Click Create Outer Dropdown Menu
    And Click Create Outer Button
    Then Validate Error Message
      | Error            |
      | retailerId-error |

  Scenario: Validate The Error While Creating Outer Without Selecting Retailer
    Given Enter EmailAddress And Password and Click On LogIn Btn In Hub User
      | EmailID  | Password |
      | lucky123 | lucky123 |
    When Click on Outers Menu
    And Click Create Outer Dropdown Menu
    And Select Hub To Create Outer
      | Hub           |
      | SEKO OMNI LAX |
    And Click Create Outer Button
    Then Validate Mandatory Required Fields
      | Error            |
      | retailerId-error |

  Scenario: While There Is No Closed Outer Then Create Outer And See Temporary Label
    Given Enter EmailAddress And Password and Click On LogIn Btn In Hub User
      | EmailID  | Password |
      | lucky123 | lucky123 |
    When Click on Outers Menu
    And Click Create Outer Dropdown Menu
    And Select Hub And Retailer To Create Outer
      | Hub           | Retailer                     |
      | SEKO OMNI LAX | SEKO DEMO-RETURN TO THE FOLD |
    And Click Create Outer Button And If Outer Is Already Open Then Validate Popup And Confirm To Open Another Outer
      | PopUp              |
      | OUTER ALREADY OPEN |
    Then Validate Success Message
    And Click To Print Temporary Label

  Scenario: While There Is No Closed Outer Then Create Outer While Outer Is Already Open And See Temporary Label
    Given Enter EmailAddress And Password and Click On LogIn Btn In Hub User
      | EmailID  | Password |
      | lucky123 | lucky123 |
    When Click on Outers Menu
    And Click Create Outer Dropdown Menu
    And Select Hub And Retailer To Create Outer
      | Hub           | Retailer                     |
      | SEKO OMNI LAX | SEKO DEMO-RETURN TO THE FOLD |
    And Click Create Outer Button And If Outer Is Already Open Then Validate Popup And Confirm To Open Another Outer
      | PopUp              |
      | OUTER ALREADY OPEN |
    Then Validate Success Message
    And Click To Print Temporary Label

    ################### Outer Reports ######################

  Scenario: Validate Outer Reports Homepage and URL
    Given Enter EmailAddress And Password and Click On LogIn Btn In Hub User
      | EmailID  | Password |
      | lucky123 | lucky123 |
    When Click on Outers Menu
    And Click Outer Reports Dropdown Menu
    And Validate Page URL
      | URL                                           |
      | https://stage.omnirps.com/outer/outer_reports |
    Then Validate Log Details PopUp
      | PopUp         |
      | OUTER REPORTS |

  Scenario: Search Open Outer Reports And Validate Searched Details
    Given Enter EmailAddress And Password and Click On LogIn Btn In Hub User
      | EmailID  | Password |
      | lucky123 | lucky123 |
    When Click on Outers Menu
    And Click Outer Reports Dropdown Menu
    And Enter Search Details To Search Outer In Hub User
      | Search | OuterStatus | Retailer                     | Reports       |
      | 222175 | Open        | SEKO DEMO-RETURN TO THE FOLD | Outer Reports |
    And Click On Search Button In Outer Reports
    Then Validate Searched Outer Details
      | OuterId | OuterStatus | Hub           |
      | 222175  | Open        | SEKO OMNI LAX |

  Scenario: Search Close Outer Reports And Validate Searched Details
    Given Enter EmailAddress And Password and Click On LogIn Btn In Hub User
      | EmailID  | Password |
      | lucky123 | lucky123 |
    When Click on Outers Menu
    And Click Outer Reports Dropdown Menu
    And Enter Search Details To Search Outer In Hub User
      | Search | OuterStatus | Retailer                     | Reports       |
      | 222171 | Closed      | SEKO DEMO-RETURN TO THE FOLD | Outer Reports |
    And Click On Search Button In Outer Reports
    Then Validate Close Outer Details
      | OuterId | OuterStatus | Hub           | OuterCannote         |
      | 222171  | Closed      | SEKO OMNI LAX | 61290988336622109347 |