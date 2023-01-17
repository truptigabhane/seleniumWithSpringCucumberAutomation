@ui
Feature: Omni Returns

  Background: Login Into Omni Return Application
    Given Open the Url Of Omni Return Application

  Scenario: Validate Carriers Homepage and URL
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Carriers Option From Manage Dropdown
    And Validate Page URL
      | URL                                                 |
      | https://stage.omniparcelreturns.com/admin/carriers |
    Then Validate The Open Page
      | Heading   |
      | Carriers  |

  Scenario: Validate Add Carriers Page And Check Mandatory Required Fields
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Carriers Option From Manage Dropdown
    And Click On Add Carriers
    Then Validate The Open Page
      | Heading     |
      | Add Carrier |
    And Click On Submit Button
    Then Check And Validate Mandatory Required Fields Error In Add Carriers
      | CarrierName | OmniParcelID      | OmniParcelCarrierName | Hub          |
      | Name-error  | OPCarrierID-error | OPCarrierName-error   | Hubs[]-error |

  Scenario: Create Carriers and Validate Success Alert Already Used ID
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Carriers Option From Manage Dropdown
    And Click On Add Carriers
    And Add Carriers By Adding Data Fields
      | CarrierName  | OmniParcelID | OmniParcelCarrierName | Hub          |
      | Test Carrier | 111          | SekoTestDemo          | SekoTestDemo |
    And Click On Submit Button
    Then Validate Error Message
      | Error     |
      | msg_dupli |

  Scenario: Create Carriers and Validate Success Alert
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Carriers Option From Manage Dropdown
    And Click On Add Carriers
    And Add Carriers By Adding Data Fields
      | CarrierName  | OmniParcelID | OmniParcelCarrierName | Hub          |
      | Test Carrier | 11122        | SekoTestDemo          | SekoTestDemo |
    And Click On Submit Button
    Then Validate Success Alert
      | SuccessAlert                        |
      | carrier details added successfully. |

  Scenario: Search And Validate Created Carrier In View Carriers
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Carriers Option From Manage Dropdown
    And Click On View Carriers
    Then Validate The Open Page
      | Heading  |
      | Carriers |
    And Enter Carrier Details To Search Carrier In View Carriers
      | Search |
      | 11122  |
    And Click On Search Button
    Then Validate Searched Carrier Details In View Carrier
      | OPCarrierID | Hub          |
      | 11122       | SekoTestDemo |

  Scenario: Search And Edit Created Carrier In View Carriers And Validate Success Alert
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Carriers Option From Manage Dropdown
    And Click On View Carriers
    Then Validate The Open Page
      | Heading  |
      | Carriers |
    And Enter Carrier Details To Search Carrier In View Carriers
      | Search |
      | 11122  |
    And Click On Search Button
    Then Validate Searched Carrier Details In View Carrier
      | OPCarrierID | Hub          |
      | 11122       | SekoTestDemo |
    And Click On Edit Icon
    And Add Carriers By Adding Data Fields
      | CarrierName       | OmniParcelID | OmniParcelCarrierName | Hub          |
      | Test Carrier Edit | 11122        | SekoTestDemo          | SekoTestDemo |
    And Click On Update Button To Update Company
    Then Validate Success Alert
      | SuccessAlert             |
      | Data Updated Succesfully |

  Scenario: Search Add Carrier And Validate Searched Carrier Details Then Validate The Log Details PopUp In Carrier Change Log
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Carriers Option From Manage Dropdown
    And Click On Carrier Change Log
    And Enter Carrier Change Log Details to Search
      | Search | ChangeType | Company                     | StartDate   | EndDate     |
      | 1010   | Add        | SEKO Omni-Channel Logistics | 11,Dec 2022 | 23,Dec 2022 |
    Then Validate Searched Carrier Change Log Details
      | LogType            | ChangeType |
      | Carrier Management | Add Data   |
    And Click On Search Details To See Log Details
    Then Validate Log Details PopUp In Carriers
      | PopUp       |
      | popup_title |
    And Click On Close Button To Close The Log Details

  Scenario: Search Edit Carrier And Validate Searched Carrier Details Then Validate The Log Details PopUp In Carrier Change Log
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Carriers Option From Manage Dropdown
    And Click On Carrier Change Log
    And Enter Carrier Change Log Details to Search
      | Search                         | ChangeType | Company                     | StartDate   | EndDate     |
      | akash.trivedi@sstechsystem.com | Edit       | SEKO Omni-Channel Logistics | 11,Dec 2022 | 23,Dec 2022 |
    Then Validate Searched Carrier Change Log Details
      | LogType            | ChangeType |
      | Carrier Management | Add Data   |
    And Click On Search Details To See Log Details
    Then Validate Log Details PopUp In Carriers
      | PopUp       |
      | popup_title |
    And Click On Close Button To Close The Log Details

