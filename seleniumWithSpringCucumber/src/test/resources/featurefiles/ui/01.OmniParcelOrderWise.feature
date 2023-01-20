@ui
Feature: Omni Parcel Order Wise Consignment Creation - Post Check List

  Background: Login Into Omni Parcel Return Application
    Given Open the Url Of Omni Parcel Return Application

#  Scenario: Create a Consignment With Mentioned Single Order Number and Process It.
#    Given Click on Create Return Find the Mentioned Retailer Name and Open It
#      | RetailerName    |
#      | Seko Demo Store |
#    When Enter the Order Number and EmailID and Click On Next
#      | OrderNumber | EmailID       |
#      | ATS1991      | akash.trivedi |
#    And Enter Confirm Your Details For Order Wise Return Label Creation
#      | ProductValue | Description | ReturnReason    | ReturnAction | FullName      | Country          | ZipCode | Building  | Street    | City          | State     | PhoneNumber | ExtraField |
#      | 11           | CLOTHES     | Doesn’t suit me | Refund       | Akash Trivedi | United States-US | 10001   | Apartment | main 1024 | New York City | New York  | 6309194800  | Test       |
#    And Validate the Order Summary and Process the Order To Create Consignment
#      | OrderNumber | ProductName | ReturnReason    | ReturnOption | Service         | CardNumber          | ExpDate | CVC | Zip   |
#      | ATS1991      | CLOTHES     | DOESN’T SUIT ME | REFUND       | GENERIC RETURN  | 4111 1111 1111 1111 | 01 / 23 | 123 | 10001 |
#    And Validate the Success Return and Create Consignment
#      | OrderNumber | Name          |
#      | ATS1991      | Akash Trivedi |


  Scenario: Create a Consignment With Mentioned Single Order Number and Process It.
    Given Click on Create Return Find the Mentioned Retailer Name and Open It
      | RetailerName    |
      | Seko Demo Store |
    When Enter the Order Number and EmailID and Click On Next
      | OrderNumber | EmailID       |
      | AT1212      | akash.trivedi |
    And Enter Confirm Your Details For Order Wise Return Label Creation
      | ProductValue | Description | ReturnReason    | ReturnAction | FullName      | Country          | ZipCode | Building  | Street    | City          | State     | PhoneNumber | ExtraField |
      | 11           | CLOTHES     | Doesn’t suit me | Refund       | Akash Trivedi | United States-US | 10001   | Apartment | main 1024 | New York City | New York  | 6309194800  | Test       |
    And Validate the Order Summary and Process the Order To Create Consignment Using Happy Returns
      | OrderNumber | ProductName | ReturnReason    | ReturnOption | RefundType      | Service       | CardNumber          | ExpDate | CVC | Zip   |
      | AT1212      | CLOTHES     | DOESN’T SUIT ME | REFUND       | Standard Refund | HAPPY RETURNS | 4111 1111 1111 1111 | 01 / 23 | 123 | 10001 |
    And Validate the Success Return and Create Consignment
      | OrderNumber | Name          |
      | AT1212      | Akash Trivedi |