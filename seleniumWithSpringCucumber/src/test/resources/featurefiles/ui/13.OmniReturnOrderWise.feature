@ui
Feature: Omni Returns Order Wise

  Background: Login Into Omni Parcel Return Application
    Given Open the Url Of Omni Parcel Return Application In Stage

  Scenario: Create a Consignment With Mentioned Single Order Number and Process It with DHL Return.
    Given Click on Create Return Find the Mentioned Retailer Name and Open It
      | RetailerName    |
      | Seko Demo Store |
    When Enter the Order Number and EmailID and Click On Next
      | OrderNumber | EmailID       |
      | AT1212      | akash.trivedi |
    And Enter Confirm Your Details For Order Wise Return Label Creation
      | ProductValue | Description | ReturnReason    | ReturnAction | FullName      | Country          | ZipCode | Building  | Street    | City          | State    | PhoneNumber | ExtraField |
      | 11           | CLOTHES     | Doesn’t suit me | Store Credit | Akash Trivedi | United States-US | 10001   | Apartment | main 1024 | New York City | New York | 6309194800  | Test       |
    And Validate the Order Summary and Process the Order To Create Consignment Using DHL Returns
      | OrderNumber | ProductName | ReturnReason    | ReturnOption | Service     | CardNumber          | ExpDate | CVC | Zip   |
      | AT1212      | CLOTHES     | DOESN’T SUIT ME | STORE CREDIT | DHL RETURNS | 4111 1111 1111 1111 | 01 / 23 | 123 | 10001 |
    And Validate the Success Return and Create Consignment
      | OrderNumber | Name          |
      | AT1212      | Akash Trivedi |


  Scenario: Create a Consignment With Mentioned Single Order Number and Process It with Happy Returns.
    Given Click on Create Return Find the Mentioned Retailer Name and Open It
      | RetailerName    |
      | Seko Demo Store |
    When Enter the Order Number and EmailID and Click On Next
      | OrderNumber | EmailID       |
      | AT1212      | akash.trivedi |
    And Enter Confirm Your Details For Order Wise Return Label Creation
      | ProductValue | Description | ReturnReason    | ReturnAction | FullName      | Country          | ZipCode | Building  | Street    | City          | State    | PhoneNumber | ExtraField |
      | 11           | CLOTHES     | Doesn’t suit me | Store Credit | Akash Trivedi | United States-US | 10001   | Apartment | main 1024 | New York City | New York | 6309194800  | Test       |
    And Validate the Order Summary and Process the Order To Create Consignment Using Happy Returns
      | OrderNumber | ProductName | ReturnReason    | ReturnOption | Service       | CardNumber          | ExpDate | CVC | Zip   |
      | AT1212      | CLOTHES     | DOESN’T SUIT ME | STORE CREDIT | HAPPY RETURNS | 4111 1111 1111 1111 | 01 / 23 | 123 | 10001 |
    And Validate the Success Return and Create Consignment
      | OrderNumber | Name          |
      | AT1212      | Akash Trivedi |