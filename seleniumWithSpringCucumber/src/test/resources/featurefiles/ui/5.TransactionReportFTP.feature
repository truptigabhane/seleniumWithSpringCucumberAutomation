@ui
Feature: Omni Returns Transaction Report

  Background: Login Into Omni Parcel Return Application For Transaction Report
    Given Open the Url Of Omni Parcel Return Application For Transaction Report

  Scenario: Check Created Order And Consignment Number in Transaction Report for FTP
    Given Enter EmailAddress And Password and Click On LogIn Button
#      | EmailID       | Password             |
#      | akash.trivedi | akash.trivedi@sstech |
    When Select Reporting to see Transaction Report

    And Search Created Order and Consignment No
      | Consignment |
      | NP87606176  |
