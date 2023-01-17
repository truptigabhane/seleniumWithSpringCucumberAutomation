@ui
Feature: Omni Returns

  Background: Login Into Omni Return Application
    Given Open the Url Of Omni Return Application

  Scenario: Validate User Homepage and URL
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select User Option From Manage Dropdown
    And Validate Page URL
      | URL                                             |
      | https://stage.omniparcelreturns.com/admin/users |
    Then Validate The Open Page
      | Heading |
      | Users   |

  Scenario: Validate Add User Page And Check Mandatory Required Fields
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select User Option From Manage Dropdown
    And Click On Add User
    Then Validate The Open Page
      | Heading      |
      | Add New User |
    And Click On Submit Button
    Then Check And Validate Mandatory Required Fields Error In Add User
      | FirstName  | Email       | Password       | Company         | Role         | Retailer         | Group         |
      | Name-error | Email-error | Password-error | IdCompany-error | RoleId-error | IdRetailer-error | GroupId-error |

  Scenario: Fill Create User Fields and Click on Reset Button And Validate Fields Are Empty
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select User Option From Manage Dropdown
    And Click On Add User
    And Add User By Adding Data Fields
      | FirstName | LastName | Email             | Password | Company       | Role             |
      | Akash     | Trivedi  | akash@example.com | 123      | Test Retailer | Retailer Manager |
    And Click On Reset Button
    Then Validate Fields Are Empty By Clicking On Reset Button

  Scenario: Create User and Validate Success Alert
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select User Option From Manage Dropdown
    And Click On Add User
    And Add User By Adding Data Fields
      | FirstName | LastName | Email              | Password | Company | Role                   | Retailer |
      | Akash     | Trivedi  | akash@testing2.com | 123      | aa      | Retailer Standard User | AABB     |
    And Click On Submit Button
    Then Validate Success Alert
      | SuccessAlert                                                                                                               |
      | User Akash Trivedi has successfully been created. An email has been sent to akash@testing2.com with the login credentials. |

  Scenario: Create User Using Already Existing Email and Validate Failed Alert
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select User Option From Manage Dropdown
    And Click On Add User
    And Add User By Adding Data Fields
      | FirstName | LastName | Email              | Password | Company | Role                   | Retailer |
      | Akash     | Trivedi  | akash@testing2.com | 123      | aa      | Retailer Standard User | AA       |
    And Click On Submit Button
    Then Validate Failed Alert
      | FailedAlert                           |
      | Email already exists with this email. |

  Scenario: Search Created User And Validate Searched User Details In View User
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select User Option From Manage Dropdown
    And Click On View User To Search Added User
    And Search User From Input
      | Search | Company | Role                   |
      | Akash  | AA      | Retailer Standard User |
    Then Validate Searched User Details
      | FirstName | LastName | Company | Role                   |
      | Akash     | Trivedi  | aa      | Retailer Standard User |

  Scenario: Search Unavailable User And Validate Not Found User Message
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select User Option From Manage Dropdown
    And Click On View User To Search Added User
    And Search User From Input
      | Search | Company | Role                   |
      | ABC    | AA      | Retailer Standard User |
    Then Validate No Data Available Message
      | DataTable        |
      | dataTables_empty |

  Scenario: Search Created User And Validate Searched User Details In View User
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select User Option From Manage Dropdown
    And Click On View User To Search Added User
    And Search User From Input
      | Search | Company | Role                   |
      | Akash  | AA      | Retailer Standard User |
    Then Validate Searched User Details
      | FirstName | LastName | Company | Role                   |
      | Akash     | Trivedi  | aa      | Retailer Standard User |
    And Click On Edit To Update Company Details
    And Add User By Adding Data Fields
      | FirstName | LastName | Email                | Password | Company | Role                   | Retailer |
      | Akash     | Trivedi  | akash@testing200.com | 123      | aa      | Retailer Standard User | AA       |
    And Click On Update Button To Update Company
    Then Validate Success Alert
      | SuccessAlert             |
      | Data Updated Succesfully |

  Scenario: Search Created User And Click On Delete Icon And Confirm To Not Delete
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select User Option From Manage Dropdown
    And Click On View User To Search Added User
    And Search User From Input
      | Search | Company | Role                   |
      | Akash  | AA      | Retailer Standard User |
    Then Validate Searched User Details
      | FirstName | LastName | Company | Role                   |
      | Akash     | Trivedi  | aa      | Retailer Standard User |
    And Click On Delete Icon
    And Click On No Button To Confirm No Delete

  Scenario: Search Created User And Click On Delete Icon And Confirm To Delete
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select User Option From Manage Dropdown
    And Click On View User To Search Added User
    And Search User From Input
      | Search | Company | Role                   |
      | Akash  | AA      | Retailer Standard User |
    Then Validate Searched User Details
      | FirstName | LastName | Company | Role                   |
      | Akash     | Trivedi  | aa      | Retailer Standard User |
    And Click On Delete Icon
    And Click On Yes Button To Confirm Delete
    Then Validate Success Alert
      | SuccessAlert              |
      | Data deleted sucessfully. |

  Scenario: Search Added User And Validate Searched User Details And Pop Up In User Change Log
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select User Option From Manage Dropdown
    And Click On User Change Log
    And Enter Carrier Change Log Details to Search
      | Search             | ChangeType | Company                     | StartDate   | EndDate     |
      | akash@testing2.com | Add Data   | SEKO Omni-Channel Logistics | 11,Dec 2022 | 26,Dec 2022 |
    Then Validate Searched Carrier Change Log Details
      | LogType         | ChangeType |
      | User Management | Add Data   |
    And Click On Search Details To See Log Details
    Then Validate Log Details PopUp In Carriers
      | PopUp       |
      | popup_title |
    And Click On Close Button To Close The Log Details

  Scenario: Search Edited User And Validate Searched User Details And Pop Up In User Change Log
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select User Option From Manage Dropdown
    And Click On User Change Log
    And Enter Carrier Change Log Details to Search
      | Search             | ChangeType | Company                     | StartDate   | EndDate     |
      | akash@testing2.com | Edit Data  | SEKO Omni-Channel Logistics | 11,Dec 2022 | 26,Dec 2022 |
    Then Validate Searched Carrier Change Log Details
      | LogType         | ChangeType |
      | User Management | Edit Data   |
    And Click On Search Details To See Log Details
    Then Validate Log Details PopUp In Carriers
      | PopUp       |
      | popup_title |
    And Click On Close Button To Close The Log Details

  Scenario: Search Deleted User And Validate Searched User Details And Pop Up In User Change Log
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select User Option From Manage Dropdown
    And Click On User Change Log
    And Enter Carrier Change Log Details to Search
      | Search               | ChangeType  | Company                     | StartDate   | EndDate     |
      | akash@testing200.com | Delete Data | SEKO Omni-Channel Logistics | 26,Dec 2022 | 26,Dec 2022 |
#    Then Validate Searched Carrier Change Log Details####################
#      | LogType         | ChangeType  |
#      | User Management | Delete Data |
#    And Click On Search Details To See Log Details
#    Then Validate Log Details PopUp In Carriers
#      | PopUp       |
#      | popup_title |
#    And Click On Close Button To Close The Log Details#################

  Scenario: Verify The Deleted User Is Showing As Strikeout
   Given Enter EmailAddress And Password and Click On LogIn Button
    When Select User Option From Manage Dropdown
    And Click On View User To Search Added User
    And Search User From Input
      | Search                 | Company | Role                   |
      | akash.trivedi@aabb.com | AA      | Retailer Standard User |
    And Validate User Details Are Strikeout

  Scenario: Export User And Download Excel Sheet Data In View User
   Given Enter EmailAddress And Password and Click On LogIn Button
    When Select User Option From Manage Dropdown
    And Click On View User To Search Added User
    And Search User From Input
      | Search                 | Company | Role                   |
      | akash.trivedi@aabb.com | AA      | Retailer Standard User |
    And Click On Export To Exel Button