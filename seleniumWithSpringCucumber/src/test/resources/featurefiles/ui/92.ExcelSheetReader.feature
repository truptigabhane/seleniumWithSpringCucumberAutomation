@ui
Feature: Excel Sheet Feature for Omni Returns

  Background: Login Into Omni Parcel Return Application
    Given Open the Url Of Omni Parcel Return Application

  Scenario Outline: Excel Sheet scenario with different set of data
    Given Click on Create Return Find the Mentioned Retailer Name and Open It
      | RetailerName    |
      | Seko Demo Store |
    When user fills the form from given sheetname "<SheetName>" and rownumber <RowNumber>

    Examples:
      | SheetName  | RowNumber |
      | YourReturn | 0         |
      | YourReturn | 1         |

