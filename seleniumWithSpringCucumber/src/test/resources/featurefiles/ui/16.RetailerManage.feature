@ui
Feature: Omni Returns

  Background: Login Into Omni Return Application
    Given Open the Url Of Omni Return Application

  Scenario: Validate Retailer Homepage and URL
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Retailer Option From Manage Dropdown
    And Validate Page URL
      | URL                                                              |
      | https://stage.omniparcelreturns.com/admin/retailer/retailer_view |
    Then Validate The Open Page
      | Heading   |
      | Retailers |

  Scenario: Validate Add Retailer Page And Check Mandatory Required Fields
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Retailer Option From Manage Dropdown
    And Click On Add Retailer
    And Validate Page URL
      | URL                                                                 |
      | https://stage.omniparcelreturns.com/admin/retailer/add/general_info |
    And Click On Save And Next Button
    Then Check And Validate Mandatory Required Fields
      | Company         | Logo       | RetailerName    |
      | CompanyId-error | file-error | firstname-error |

  Scenario: Create Retailer,Assign Hub,Fill Country Fees Details Using Retailer Preview Button and Validate Success Alert Then Open Navigated Page
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Retailer Option From Manage Dropdown
    And Click On Add Retailer
    And Add Retailer By Adding Data Fields
      | Company       | Logo                                         | RetailerName   |
      | Test Retailer | D:/SSTech/src/main/resources/Images/logo.jpg | TestSekoDemo05 |
    And Click On Save And Next Button
    Then Validate Success Alert
      | SuccessAlert                                              |
      | Retailer general information has been added successfully. |
    And Assign Hubs
      | AddHub | OmniParcelKey |
      | US     | TestingKey    |
    And Fill Assigned Hub Details
      | MultiLanguage | GatewayType          | PreRootGateWay              | PostRootGateWay | SubGateWay  | Priority |
      | Enable        | SEKO Payment Gateway | SEKO Omni-Channel Logistics | PAYPAL          | TEST_PAYPAL | 1        |
    And Click Save And Next Button
    Then Validate Success Alert
      | SuccessAlert                                          |
      | Retailer hub information has been added successfully. |
    And Validate And Fill Country Fees Details
      | ReturnType    | StoreCredit | Exchange | SuburbLabel | StateCityLabel | PostcodeLabel |
      | Retailer Paid | Paid        | Paid     | City        | STATE          | Postcode      |
    And Click Retailer Preview Button
    And Open Navigated Page After Navigation

  Scenario: Search Created Retailer In View Retailer After Creating Retailer Using Retailer Preview Button
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Retailer Option From Manage Dropdown
    And Click On View Retailers
    And Search From Input In Hub
      | Search         | Company       |
      | TestSekoDemo51 | Test Retailer |
    Then Validate Searched Hub Details
      | Company       | Name           |
      | Test Retailer | TestSekoDemo51 |

  Scenario: Create Retailer,Assign Hub,Fill Country Fees Details Using Save Button and Validate Success Alert
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Retailer Option From Manage Dropdown
    And Click On Add Retailer
    And Add Retailer By Adding Data Fields
      | Company       | Logo                                         | RetailerName   |
      | Test Retailer | D:/SSTech/src/main/resources/Images/logo.jpg | TestSekoDemo42 |
    And Click On Save And Next Button
    Then Validate Success Alert
      | SuccessAlert                                              |
      | Retailer general information has been added successfully. |
    And Assign Hubs
      | AddHub | OmniParcelKey |
      | US     | TestingKey    |
    And Fill Assigned Hub Details
      | MultiLanguage | GatewayType          | PreRootGateWay              | PostRootGateWay | SubGateWay  | Priority |
      | Enable        | SEKO Payment Gateway | SEKO Omni-Channel Logistics | PAYPAL          | TEST_PAYPAL | 1        |
    And Click Save And Next Button
    Then Validate Success Alert
      | SuccessAlert                                          |
      | Retailer hub information has been added successfully. |
    And Validate And Fill Country Fees Details
      | ReturnType    | StoreCredit | Exchange | SuburbLabel | StateCityLabel | PostcodeLabel |
      | Retailer Paid | Paid        | Paid     | City        | STATE          | Postcode      |
    And Click On Save Button
    Then Validate Success Alert
      | SuccessAlert                            |
      | Retailer has been updated successfully. |

  Scenario: Search And Validate Created Retailer In View Retailer Then Delete The Retailer
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Retailer Option From Manage Dropdown
    And Click On View Retailers
    And Search From Input In Hub
      | Search         | Company       |
      | TestSekoDemo42 | Test Retailer |
    Then Validate Searched Hub Details
      | Company       | Name           |
      | Test Retailer | TestSekoDemo42 |
    Then Delete Retailer By Clicking On Delete
    Then Validate Success Alert
      | SuccessAlert                            |
      | A record has been deleted successfully. |


  Scenario: Create Retailer,Assign Hub,Fill Country Fees Details Using Save And Publish Button And Validate Success Alert
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Retailer Option From Manage Dropdown
    And Click On Add Retailer
    And Add Retailer By Adding Data Fields
      | Company       | Logo                                         | RetailerName   |
      | Test Retailer | D:/SSTech/src/main/resources/Images/logo.jpg | TestSekoDemo43 |
    And Click On Save And Next Button
    Then Validate Success Alert
      | SuccessAlert                                              |
      | Retailer general information has been added successfully. |
    And Assign Hubs
      | AddHub | OmniParcelKey |
      | US     | TestingKey    |
    And Fill Assigned Hub Details
      | MultiLanguage | GatewayType          | PreRootGateWay              | PostRootGateWay | SubGateWay  | Priority |
      | Enable        | SEKO Payment Gateway | SEKO Omni-Channel Logistics | PAYPAL          | TEST_PAYPAL | 1        |
    And Click Save And Next Button
    Then Validate Success Alert
      | SuccessAlert                                          |
      | Retailer hub information has been added successfully. |
    And Validate And Fill Country Fees Details
      | ReturnType    | StoreCredit | Exchange | SuburbLabel | StateCityLabel | PostcodeLabel |
      | Retailer Paid | Paid        | Paid     | City        | STATE          | Postcode      |
    And Click Save And Publish Button
    Then Validate Success Alert
      | SuccessAlert                            |
      | Retailer has been updated successfully. |

  Scenario: Search And Validate Created Retailer In View Retailer Then Update The Retailer
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Retailer Option From Manage Dropdown
    And Click On View Retailers
    And Search From Input In Hub
      | Search         | Company       |
      | TestSekoDemo43 | Test Retailer |
    Then Validate Searched Hub Details
      | Company       | Name           |
      | Test Retailer | TestSekoDemo43 |
    And Click On Edit To Update Company Details
    And Update Retailer By Modifying Data Fields
      | BackgroundImage                                    | Favicon                                      | OrderMethod |
      | D:\SSTech\src\main\resources\Images\background.jpg | D:\SSTech\src\main\resources\Images\logo.jpg | Allow Both  |
    And Click Save And Next Btn
    Then Validate Success Alert
      | SuccessAlert                                                |
      | Retailer general information has been updated successfully. |
    And Click Save And Next Button
    Then Validate Success Alert
      | SuccessAlert                                            |
      | Retailer hub information has been updated successfully. |
    And Click On Save Button
    Then Validate Success Alert
      | SuccessAlert                            |
      | Retailer has been updated successfully. |

  Scenario: Search And Validate Added Retailer In Retailer Change Log And See PopUp
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Retailer Option From Manage Dropdown
    And Click On Retailer Change Log
    And Enter Change Log Details to Search
      | Search         | ChangeType | Company       | StartDate   | EndDate     |
      | TestSekoDemo43 | Add        | Test Retailer | 05,Dec 2022 | 22,Dec 2022 |
    Then Validate Searched Company Change Log Details
      | Company       | ChangeType |
      | Test Retailer | Add        |
    And Click On Search Details To See Log Details
    Then Validate Log Details PopUp
      | PopUp       |
      | Log Details |
    And Click On Close Button To Close The Log Details

  Scenario: Search And Validate Updated Retailer In Retailer Change Log And See PopUp
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Retailer Option From Manage Dropdown
    And Click On Retailer Change Log
    And Enter Change Log Details to Search
      | Search         | ChangeType | Company       | StartDate   | EndDate     |
      | TestSekoDemo43 | Update     | Test Retailer | 05,Dec 2022 | 22,Dec 2022 |
    Then Validate Searched Company Change Log Details
      | Company       | ChangeType |
      | Test Retailer | Update     |
    And Click On Search Details To See Log Details
    Then Validate Log Details PopUp
      | PopUp       |
      | Log Details |
    And Click On Close Button To Close The Log Details

  Scenario: Search And Validate Deleted Retailer In Retailer Change Log And See PopUp
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Retailer Option From Manage Dropdown
    And Click On Retailer Change Log
    And Enter Change Log Details to Search
      | Search         | ChangeType | Company       | StartDate   | EndDate     |
      | TestSekoDemo42 | Delete     | Test Retailer | 05,Dec 2022 | 22,Dec 2022 |
    Then Validate Searched Company Change Log Details
      | Company       | ChangeType |
      | Test Retailer | Delete     |
    And Click On Search Details To See Log Details
    Then Validate Log Details PopUp
      | PopUp       |
      | Log Details |
    And Click On Close Button To Close The Log Details

  Scenario: Export Created Retailer And Validate Downloaded Excel Sheet Data
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Retailer Option From Manage Dropdown
    And Click On View Retailers
    And Export From Input
      | Search        |
      | Retailer Test |