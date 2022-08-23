@ui
Feature: OmniRPS Post CheckList Report

  Background: Login Into OmniRPS Application
    Given Open the Url Of OmniRPS Application

  Scenario: Test process of FTP Returns for Seko Demo retailer
    Given Enter UserName And Password and Click On SignIn Button
      | UserName      | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Select Processing for OmniRPS Processing

    And Enter Consignment And Press Enter
      | Consignment |
      | NP87606176  |
    And Validate Order and Consignment No and Enter Details to Successfully Receive Return
      | Hub          | Quantity | Style      | ItemNo     | Sku        | Description   | Value | Reason          |
      | SEKO OMNI NZ | 1        | WF00000004 | WF00000004 | WF00000004 | BLACK BEANBAG | 69.99 | DOESN’T SUIT ME |

  Scenario:
    Given Enter UserName And Password and Click On SignIn Button
      | UserName      | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Tracking And History to Check Report

    And Enter Searching Data And Click on Search Button Tracking And History
      | Search     | ProcessingStatus  |
      | NP87606176 | Processed Returns |

  Scenario:
    Given Enter UserName And Password and Click On SignIn Button
      | UserName      | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Management to Check Report

    And Enter Searching Data and Click on Search Button in Management
      | Search     | ProcessingStatus    |
      | NP87606176 | Processed Returns |