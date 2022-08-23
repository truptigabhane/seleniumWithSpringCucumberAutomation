@ui
  Feature: OmniRPS Post CheckList

    Background: Login Into OmniRPS Application
      Given Open the Url Of OmniRPS Application

    Scenario: Test process of Depot Scan for Seko Demo retailer
      Given Enter UserName And Password and Click On SignIn Button
        | UserName      | Password             |
        | akash.trivedi | akash.trivedi@sstech |
      When Select Hub and Enter Consignment to Add Depot Scan Event
        | Hub          | Consignment |
        | SEKO OMNI NZ | NP87606174  |

    Scenario:
      Given Enter UserName And Password and Click On SignIn Button
        | UserName      | Password             |
        | akash.trivedi | akash.trivedi@sstech |
      When Click on Tracking And History to Check Report

      And Enter Searching Data And Click on Search Button Tracking And History
        | Search     | ProcessingStatus  |
        | NP87606175 | Unprocessed Returns |

    Scenario:
      Given Enter UserName And Password and Click On SignIn Button
        | UserName      | Password             |
        | akash.trivedi | akash.trivedi@sstech |
      When Click on Management to Check Report

      And Enter Searching Data and Click on Search Button in Management
        | Search     | ProcessingStatus    |
        | NP87606175 | Unprocessed Returns |