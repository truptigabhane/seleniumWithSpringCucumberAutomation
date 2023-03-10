@ui
Feature: OmniRPS Post CheckList Report - Post Check List

  Background: Login Into OmniRPS Application
    Given Open the Url Of OmniRPS Application

  Scenario: Test process of API Method for Seko Demo retailer.
    Given Enter UserName And Password and Click On SignIn Button
      | UserName      | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Select Processing for OmniRPS Processing
    And Enter Consignment And Press Enter
      | Consignment |
      | TK100342334NZ111  |
    And API Method Details to Successfully Receive Return

  Scenario: Returns from test are showing correctly in the Tracking and history report.
    Given Enter UserName And Password and Click On SignIn Button
      | UserName      | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Tracking And History to Check Report
    And Enter Searching Data And Click on Search Button Tracking And History
      | Search     | ProcessingStatus  |
      | TK100342334NZ111 | Processed Returns |

  Scenario: Returns from test are showing correctly in the Management report.
    Given Enter UserName And Password and Click On SignIn Button
      | UserName      | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Management to Check Report
    And Enter Searching Data and Click on Search Button in Management
      | Search     | ProcessingStatus  |
      | TK100342334NZ111 | Processed Returns |