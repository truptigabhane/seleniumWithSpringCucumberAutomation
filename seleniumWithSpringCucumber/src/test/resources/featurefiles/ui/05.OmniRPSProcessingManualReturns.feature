@ui
Feature: OmniRPS Post CheckList Report - Post Check List

  Background: Login Into OmniRPS Application
    Given Open the Url Of OmniRPS Application

  Scenario: Test process of Manual Returns for Seko Demo retailer
    Given Enter UserName And Password and Click On SignIn Button
      | UserName      | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Select Processing for OmniRPS Processing
    And Enter Consignment And Press Enter
      | Consignment     |
      | SST111122334455 |
    And Enter Manual Return Details to Successfully Receive Return
      | Retailer | OrderNo   | Quantity | RMA | LocationBarcode | WarehouseLocation | MISC_1 | MISC_3 | MISC_2 | Notes   | Style | ItemNo | CustomerComment | TotalWeight | ChtComment | Sku | Description | Value | Reason | SubReason | Condition      | ReturnAction |
      | 22       | SS1123345 | 1        | SS  | 111             | TEST              | ss1    | ss3    | ss2    | Testing | 111   | 111    | TEST            | 11          | TESTING    | SS  | Test        | 22    | FAULTY | FAULTY    | FAULTY/DAMAGED | REFUND       |

  Scenario: Returns from test are showing correctly in the Tracking and history report.
    Given Enter UserName And Password and Click On SignIn Button
      | UserName      | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Tracking And History to Check Report
    And Enter Searching Data And Click on Search Button Tracking And History
      | Search    | ProcessingStatus  |
      | SST111122334455 | Processed Returns |

  Scenario: Returns from test are showing correctly in the Management report.
    Given Enter UserName And Password and Click On SignIn Button
      | UserName      | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Management to Check Report
    And Enter Searching Data and Click on Search Button in Management
      | Search    | ProcessingStatus  |
      | SST111122334455 | Processed Returns |