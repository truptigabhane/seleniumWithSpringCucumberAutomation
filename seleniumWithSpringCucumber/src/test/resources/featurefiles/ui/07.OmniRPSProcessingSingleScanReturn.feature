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
      | Consignment |
      | QY125620246GB  |

  Scenario:
    Given Enter UserName And Password and Click On SignIn Button
      | UserName      | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Tracking And History to Check Report

    And Enter Searching Data And Click on Search Button Tracking And History For Single Scan
      | Search        | ProcessingStatus    | DateRange               |
      | QY125620246GB | Unprocessed Returns | 01/08/2022 - 01/09/2022 |

  Scenario:
    Given Enter UserName And Password and Click On SignIn Button
      | UserName      | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Management to Check Report

    And Enter Searching Data and Click on Search Button in Management For Single Scan
      | Search        | ProcessingStatus    | DateRange               |
      | QY125620246GB | Unprocessed Returns | 01/08/2022 - 01/09/2022 |