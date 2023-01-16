#@ui
#Feature: Omni Returns Product Wise - Post Check List
#
#  Background: Login Into Omni Parcel Return Application
#    Given Open the Url Of Omni Parcel Return Application
#
##  Scenario: Create a Consignment With Mentioned Single Order Number and Process It.
##    Given Click on Create Return Find the Mentioned Retailer Name and Open It
##      | RetailerName    |
##      | Seko Demo Store |
##    When Enter the Order Number and EmailID and Click On Next
##      | OrderNumber | EmailID       |
##      | AFT1213     | akash.trivedi |
##    And Validate the Order Number and EmailID are Same or Not
##      | OrderNumber | EmailID       |
##      | AFT1213     | akash.trivedi |
##    And Select Product with its Return Reason and Return Option
##      | ReturnReason    | ReturnOption |
##      | Doesn’t suit me | Refund       |
##    And Enter Confirm Your Details
##      | FullName      | Country          | ZipCode | Building  | Street    | City          |  State   | PhoneNumber | ExtraField |
##      | Akash Trivedi | United States-US | 10001   | Apartment | main 1024 | New York City | New York | 6309194800  | Test       |
##    And Validate the Order Summary and Process the Order To Create Consignment
##      | OrderNumber | ProductName                            | ReturnReason    | ReturnOption | Service        | CardNumber          | ExpDate | CVC | Zip   |
##      | AFT1213     | Sky Blue - Arch Support Flip Flops - US-7 | Doesn’t suit me | REFUND       | GENERIC RETURN | 4111 1111 1111 1111 | 01 / 23 | 123 | 10001 |
##    And Validate the Success Return and Create Consignment
##      | OrderNumber  | Name          |
##      | AFT1213      | Akash Trivedi |
#
##  Scenario: Create a Consignment With Mentioned Single Order Number and Process It.
##    Given Click on Create Return Find the Mentioned Retailer Name and Open It
##      | RetailerName    |
##      | Seko Demo Store |
##    When Enter the Order Number and EmailID and Click On Next
##      | OrderNumber | EmailID       |
##      | AFT1213     | akash.trivedi |
##    And Validate the Order Number and EmailID are Same or Not
##      | OrderNumber | EmailID       |
##      | AFT1213     | akash.trivedi |
##    And Select Product with its Return Reason and Return Option
##      | ReturnReason    | ReturnOption |
##      | Doesn’t suit me | Refund       |
##    And Enter Confirm Your Details
##      | FullName      | Country          | ZipCode | Building  | Street    | City          |  State   | PhoneNumber | ExtraField |
##      | Akash Trivedi | United States-US | 10001   | Apartment | main 1024 | New York City | New York | 6309194800  | Test       |
##    And Validate the Order Summary and Process the Order To Create Consignment Using Happy Returns
##      | OrderNumber | ProductName                            | ReturnReason    | ReturnOption | Service        | CardNumber          | ExpDate | CVC | Zip   |
##      | AFT1213     | Sky Blue - Arch Support Flip Flops - US-7 | Doesn’t suit me | REFUND       | HAPPY RETURNS  | 4111 1111 1111 1111 | 01 / 23 | 123 | 10001 |
##    And Validate the Success Return and Create Consignment
##      | OrderNumber  | Name          |
##      | AFT1213      | Akash Trivedi |
#
#  Scenario: Create a Consignment With Mentioned Single Order Number and Process It.
#    Given Click on Create Return Find the Mentioned Retailer Name and Open It
#      | RetailerName    |
#      | Seko Demo Store |
#    When Enter the Order Number and EmailID and Click On Next
#      | OrderNumber | EmailID       |
#      | PJ1063      | akash.trivedi |
#    And Validate the Order Number and EmailID are Same or Not
#      | OrderNumber | EmailID       |
#      | PJ1063      | akash.trivedi |
#    And Select Product with its Return Reason and Return Option
#      | ReturnReason    | ReturnOption |
#      | Doesn’t suit me | Refund       |
#    And Enter Confirm Your Details
#      | FullName      | Country          | ZipCode | Building  | Street    | City          |  State   | PhoneNumber | ExtraField |
#      | Akash Trivedi | United States-US | 10001   | Apartment | main 1024 | New York City | New York | 6309194800  | Test       |
#    And Validate the Order Summary and Process the Order To Create Consignment Using Happy Returns
#      | OrderNumber | ProductName               | ReturnReason    | ReturnOption | RefundType         | Service        | CardNumber          | ExpDate | CVC | Zip   |
#      | PJ1063      | 7 Shakra Bracelet - Blue  | Doesn’t suit me | REFUND       | Standard Refund | HAPPY RETURNS  | 4111 1111 1111 1111 | 01 / 23 | 123 | 10001 |
#    And Validate the Success Return and Create Consignment
#      | OrderNumber  | Name          |
#      | PJ1063       | Akash Trivedi |
##    And Enter Refundid Details and Click On Continue Button
##      | StoreName | OrderNo | Email |
##      |           |         |       |