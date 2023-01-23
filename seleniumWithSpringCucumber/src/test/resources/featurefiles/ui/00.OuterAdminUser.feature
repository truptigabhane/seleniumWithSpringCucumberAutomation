@ui
Feature: Outer Admin User

  Background: Login Into OmniRPS Application
    Given Open the Url Of OmniRPS Application For Stage Environment

        ################### Create Outer ######################

  Scenario: Validate Create Outer Homepage and URL
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Create Outer Dropdown Menu
    And Validate Page URL
      | URL                             |
      | https://stage.omnirps.com/outer |
    Then Validate Log Details PopUp
      | PopUp        |
      | CREATE OUTER |

  Scenario: Create Outer
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Create Outer Dropdown Menu
    And Select Hub And Retailer To Create Outer
      | Hub           | Retailer                     |
      | SEKO OMNI LAX | SEKO DEMO-RETURN TO THE FOLD |
    And Click Create Outer Button And If Outer Is Already Open Then Validate Popup And Confirm To Open Another Outer
      | PopUp              |
      | OUTER ALREADY OPEN |
    Then Validate Success Message

  Scenario: Create Outer While Outer Is Already Open
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Create Outer Dropdown Menu
    And Select Hub And Retailer To Create Outer
      | Hub           | Retailer                     |
      | SEKO OMNI LAX | SEKO DEMO-RETURN TO THE FOLD |
    And Click Create Outer Button And If Outer Is Already Open Then Validate Popup And Confirm To Open Another Outer
      | PopUp              |
      | OUTER ALREADY OPEN |
    Then Validate Success Message

  Scenario: Close Alert Popup While Outer Is Already Open
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Create Outer Dropdown Menu
    And Select Hub And Retailer To Create Outer
      | Hub           | Retailer                     |
      | SEKO OMNI LAX | SEKO DEMO-RETURN TO THE FOLD |
    And Click Create Outer Button Then Validate And Close Alert Popup While Outer Is Already Open
      | PopUp              |
      | OUTER ALREADY OPEN |
    Then Validate Log Details PopUp
      | PopUp        |
      | CREATE OUTER |

  Scenario: Validate The Error While Creating Outer Without Selecting Hub And Retailer
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Create Outer Dropdown Menu
    And Click Create Outer Button
    Then Validate Mandatory Required Field
      | Error                     |
      | error-message HubId-error |

  Scenario: Validate The Error While Creating Outer Without Selecting Retailer
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Create Outer Dropdown Menu
    And Select Hub To Create Outer
      | Hub           |
      | SEKO OMNI LAX |
    And Click Create Outer Button
    Then Validate Mandatory Required Fields
      | Error            |
      | retailerId-error |

  Scenario: Validate The Error While Creating Outer Without Selecting Hub
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Create Outer Dropdown Menu
    And Select Retailer To Create Outer
      | Retailer                     |
      | SEKO DEMO-RETURN TO THE FOLD |
    And Click Create Outer Button
    Then Validate Mandatory Required Field
      | Error                     |
      | error-message HubId-error |

  Scenario: While There Is No Closed Outer Then Create Outer And See Temporary Label
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Create Outer Dropdown Menu
    And Select Hub And Retailer To Create Outer
      | Hub           | Retailer                     |
      | SEKO OMNI LAX | SEKO DEMO-RETURN TO THE FOLD |
    And Click Create Outer Button And If Outer Is Already Open Then Validate Popup And Confirm To Open Another Outer
      | PopUp              |
      | OUTER ALREADY OPEN |
    Then Validate Success Message
    And Click To Print Temporary Label

  Scenario: While There Is No Closed Outer Then Create Outer While Outer Is Already Open And See Temporary Label
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Create Outer Dropdown Menu
    And Select Hub And Retailer To Create Outer
      | Hub           | Retailer                     |
      | SEKO OMNI LAX | SEKO DEMO-RETURN TO THE FOLD |
    And Click Create Outer Button And If Outer Is Already Open Then Validate Popup And Confirm To Open Another Outer
      | PopUp              |
      | OUTER ALREADY OPEN |
    Then Validate Success Message
    And Click To Print Temporary Label

  #################### Outer Reports ######################

  Scenario: Validate Outer Reports Homepage and URL
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Outer Reports Dropdown Menu
    And Validate Page URL
      | URL                                           |
      | https://stage.omnirps.com/outer/outer_reports |
    Then Validate Log Details PopUp
      | PopUp         |
      | OUTER REPORTS |

  Scenario: Search Open Outer Reports And Validate Searched Details
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Outer Reports Dropdown Menu
    And Enter Search Details To Search Outer
      | Search | OuterStatus | Retailer                     | Hub           | Reports       |
      | 222121 | Open        | SEKO DEMO-RETURN TO THE FOLD | SEKO OMNI LAX | Outer Reports |
    And Click On Search Button In Outer Reports
    Then Validate Searched Outer Details
      | OuterId | OuterStatus | Hub           |
      | 222121  | Open        | SEKO OMNI LAX |

  Scenario: Search Close Outer Reports And Validate Searched Details
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Outer Reports Dropdown Menu
    And Enter Search Details To Search Outer
      | Search | OuterStatus | Retailer                     | Hub           | Reports       |
      | 222119 | Closed      | SEKO DEMO-RETURN TO THE FOLD | SEKO OMNI LAX | Outer Reports |
    And Click On Search Button In Outer Reports
    Then Validate Close Outer Details
      | OuterId | OuterStatus | Hub           | OuterCannote         |
      | 222119  | Closed      | SEKO OMNI LAX | 61290988336622103734 |

  #################### Create Outer Consignment ######################

  Scenario: Validate Create Outer Consignment Homepage and URL
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Create Outer Consignment Dropdown Menu
    And Validate Page URL
      | URL                                                      |
      | https://stage.omnirps.com/outer/create_outer_consignment |
    Then Validate Log Details PopUp
      | PopUp                                  |
      | CLOSE OUTER - CREATE OUTER CONSIGNMENT |

  Scenario: Select Sender Hub From Dropdown And Validate Populated Hub Data
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Create Outer Consignment Menu
    And Select Hub From Dropdown
      | Hub           |
      | SEKO OMNI LAX |
    Then Validate Populated Hub Data

  Scenario: Select Receiver Outer From Dropdown And Validate Populated Outer Data
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Create Outer Consignment Menu
    And Select Hub From Dropdown
      | Hub           |
      | SEKO OMNI LAX |
    Then Validate Populated Hub Data
    And Enter Sender Email
      | Email            |
      | test@example.com |
    And Select Outer Id From Dropdown
      | Outer                                 |
      | 222116 - SEKO DEMO-RETURN TO THE FOLD |
    Then Validate Populated Receiver Data

  Scenario: Reset Sender Details And Validate Empty Fields
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Create Outer Consignment Menu
    And Select Hub From Dropdown
      | Hub           |
      | SEKO OMNI LAX |
    Then Validate Populated Hub Data
    And Enter Sender Email
      | Email            |
      | test@example.com |
    And Click On Sender Reset Button
    Then Validate Sender Fields Are Empty

  Scenario: Reset Receiver Outer Details And Validate Empty Fields
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Create Outer Consignment Menu
    And Select Hub From Dropdown
      | Hub           |
      | SEKO OMNI LAX |
    Then Validate Populated Hub Data
    And Enter Sender Email
      | Email            |
      | test@example.com |
    And Select Outer Id From Dropdown
      | Outer                                 |
      | 222116 - SEKO DEMO-RETURN TO THE FOLD |
    Then Click On Receiver Reset Button
    Then Validate Receiver Fields Are Empty

  Scenario: Create Connote By Clicking 'Use External Connote' Button
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Create Outer Consignment Menu
    And Select Hub From Dropdown
      | Hub           |
      | SEKO OMNI LAX |
    Then Validate Populated Hub Data
    And Enter Sender Email
      | Email            |
      | test@example.com |
    And Select Outer Id From Dropdown
      | Outer                                 |
      | 222116 - SEKO DEMO-RETURN TO THE FOLD |
    Then Validate Populated Receiver Data
    And Enter Receiver Email
      | Email                  |
      | sstech.akash@gmail.com |
    And Enter Commodities Declaration Info
      | Description | ManfCountry | TotalKg | Units | TotalValue | Currency |
      | test        | China       | 0.5     | 1     | 35         | NZD      |
    And Enter Packages Info
      | Units | Length | Width | Height | KG |
      | 1     | 11     | 11    | 11     | 1  |
    And Click Remove Icon
    And Click Calculate Freight Button
    And Click On Use Eternal Cannote
    Then Validate PopUp
      | PopUp                |
      | USE EXTERNAL CONNOTE |
    And Fill Use External Connote
      | Connote  | TrackingURL                                 |
      | 11122212 | https://test.omnirps.com/track/?id=11122212 |
    And Click On Save Btn
    Then Validate Success Message Alert
    Then Validate Success Alert
      | SuccessAlert                                                                     |
      | You have successfully created Connotes 11122212 for SEKO DEMO-RETURN TO THE FOLD |

  Scenario: Create Connote By Selecting 'Carrier Service'
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Create Outer Consignment Menu
    And Select Hub From Dropdown
      | Hub           |
      | SEKO OMNI LAX |
    Then Validate Populated Hub Data
    And Enter Sender Email
      | Email            |
      | test@example.com |
    And Select Outer Id From Dropdown
      | Outer                                 |
      | 222123 - SEKO DEMO-RETURN TO THE FOLD |
    Then Validate Populated Receiver Data
    And Enter Receiver Email
      | Email                          |
      | akash.trivedi@sstechsystem.com |
    And Enter Commodities Declaration Info
      | Description | ManfCountry | TotalKg | Units | TotalValue | Currency |
      | test        | China       | 0.5     | 1     | 35         | NZD      |
    And Enter Packages Info
      | Units | Length | Width | Height | KG |
      | 3     | 11     | 42    | 32     | 5  |
    And Click Remove Icon
    And Click Calculate Freight Button
    And Select Carrier Service
    Then Validate Success Message Alert

    ################### Processing ######################

  Scenario: Validate Processing Homepage and URL
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Processing Menu
    And Click Processing Dropdown Menu
    And Validate Page URL
      | URL                                                      |
      | https://stage.omnirps.com/return_receipt/processing_cons |
    Then Validate Log Details PopUp
      | PopUp             |
      | Return Processing |

  Scenario: Enter Consignment Number And Press Enter On Processing Page And Validate Navigated Page
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Processing Menu
    And Click Processing Dropdown Menu
    And Validate Page URL
      | URL                                                      |
      | https://stage.omnirps.com/return_receipt/processing_cons |
    Then Validate Log Details PopUp
      | PopUp             |
      | Return Processing |
    And Enter Consignment Number And Press Enter
      | ConsignmentNo |
      | A1112111      |
    Then Validate Log Details PopUp
      | PopUp                 |
      | MANUAL RETURN PROCESS |

  Scenario: While Closing Outer Validate Populated Details In Processing
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Processing Menu
    And Click Processing Dropdown Menu
    And Enter Consignment Number And Press Enter
      | ConsignmentNo |
      | A1112111      |
    Then Validate Log Details PopUp
      | PopUp                 |
      | MANUAL RETURN PROCESS |
    And Select ScanRetailer And Hub
      | ScanRetailer | Hub           |
      | 22           | SEKO OMNI LAX |
    Then Validate Populated Outer Id And Consignment No

  Scenario: Close Outer Status Using Processing And Validate Closed Outer Id
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Processing Menu
    And Click Processing Dropdown Menu
    And Enter Consignment Number And Press Enter
      | ConsignmentNo |
      | A1112111      |
    Then Validate Log Details PopUp
      | PopUp                 |
      | MANUAL RETURN PROCESS |
    And Select ScanRetailer And Hub
      | ScanRetailer | Hub           |
      | 22           | SEKO OMNI LAX |
    And Enter Manual Return Process Details
      | MISC_1 | MISC_3 | OrderNo | MISC_2 |
      | TEST   | TEST   | AT1212  | TEST   |
    And Click Submit And Close Outer Button
    Then Validate Outer Id

  Scenario: Reset Form While Closing Outer And Validate Navigated Page
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Processing Menu
    And Click Processing Dropdown Menu
    And Enter Consignment Number And Press Enter
      | ConsignmentNo |
      | A1112111      |
    Then Validate Log Details PopUp
      | PopUp                 |
      | MANUAL RETURN PROCESS |
    And Select ScanRetailer And Hub
      | ScanRetailer | Hub           |
      | 22           | SEKO OMNI LAX |
    And Enter Manual Return Process Details
      | MISC_1 | MISC_3 | OrderNo | MISC_2 |
      | TEST   | TEST   | AT1212  | TEST   |
    And Click On Reset Form Button
    And Validate Page URL
      | URL                                                      |
      | https://stage.omnirps.com/return_receipt/processing_cons |
    Then Validate Log Details PopUp
      | PopUp             |
      | Return Processing |

  Scenario: Verify If Closed Outer Id Not Available Then Validate Create Outer Button
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Processing Menu
    And Click Processing Dropdown Menu
    And Enter Consignment Number And Press Enter
      | ConsignmentNo |
      | A1112111      |
    Then Validate Log Details PopUp
      | PopUp                 |
      | MANUAL RETURN PROCESS |
    And Select ScanRetailer And Hub
      | ScanRetailer | Hub           |
      | 22           | SEKO OMNI LAX |
    Then Validate Create Outer Button

  Scenario: Verify The Cancel Button Stops The Creation Of Outer Using Manual Return Process
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Processing Menu
    And Click Processing Dropdown Menu
    And Enter Consignment Number And Press Enter
      | ConsignmentNo |
      | A1112111      |
    Then Validate Log Details PopUp
      | PopUp                 |
      | MANUAL RETURN PROCESS |
    And Select ScanRetailer And Hub
      | ScanRetailer | Hub           |
      | 22           | SEKO OMNI LAX |
    Then Click On Create Outer Button
    Then Validate PopUp
      | PopUp        |
      | Create Outer |
    And Click On Cancel Button

  Scenario: Validate 'The Create Outer' Popup And 'Create A New Outer Message' In Processing
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Processing Menu
    And Click Processing Dropdown Menu
    And Enter Consignment Number And Press Enter
      | ConsignmentNo |
      | A1112111      |
    Then Validate Log Details PopUp
      | PopUp                 |
      | MANUAL RETURN PROCESS |
    And Select ScanRetailer And Hub
      | ScanRetailer | Hub           |
      | 22           | SEKO OMNI LAX |
    Then Click On Create Outer Button
    Then Validate PopUp
      | PopUp        |
      | Create Outer |
    And Click On Cancel Button
    Then Validate Create A New Outer Message

  Scenario: Create And Validate Outer Using Manual Return Process
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Processing Menu
    And Click Processing Dropdown Menu
    And Enter Consignment Number And Press Enter
      | ConsignmentNo |
      | A1112111      |
    Then Validate Log Details PopUp
      | PopUp                 |
      | MANUAL RETURN PROCESS |
    And Select ScanRetailer And Hub
      | ScanRetailer | Hub           |
      | 22           | SEKO OMNI LAX |
    Then Click On Create Outer Button
    Then Validate PopUp
      | PopUp        |
      | Create Outer |
    And Select Hub And Retailer
      | Hub           | Retailer                     |
      | SEKO OMNI LAX | SEKO DEMO-RETURN TO THE FOLD |
    And Click On Create Outer Button In Processing
    Then Validate Outer Created Message

  Scenario: Verify If The Connote Already Processed Then Validate The Retailer’s Settings Do Not Allow For Connotes To Be Processed Again Alert.
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Processing Menu
    And Click Processing Dropdown Menu
    And Enter Consignment Number And Press Enter
      | ConsignmentNo |
      | A1            |
    Then Validate Log Details PopUp
      | PopUp                 |
      | MANUAL RETURN PROCESS |
    And Select ScanRetailer And Hub
      | ScanRetailer | Hub           |
      | 22           | SEKO OMNI LAX |
    And Enter Manual Return Process Details
      | MISC_1 | MISC_3 | OrderNo | MISC_2 |
      | TEST   | TEST   | AA      | TEST   |
    And Click Submit And Close Outer Button
    Then Validate Outer Created Message

  Scenario: Close Outer Status Using Processing And Validate Populated Sender Details
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Processing Menu
    And Click Processing Dropdown Menu
    And Enter Consignment Number And Press Enter
      | ConsignmentNo |
      | A1444413      |
    Then Validate Log Details PopUp
      | PopUp                 |
      | MANUAL RETURN PROCESS |
    And Select ScanRetailer And Hub
      | ScanRetailer | Hub           |
      | 22           | SEKO OMNI LAX |
    And Enter Manual Return Process Details
      | MISC_1 | MISC_3 | OrderNo | MISC_2 |
      | TEST   | TEST   | AT1213  | TEST   |
    And Click Submit And Close Outer Button
    Then Validate Outer Id
    Then Validate Populated Hub Data

  Scenario: Close Outer Status Using Processing And Validate Populated Receiver Details
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Processing Menu
    And Click Processing Dropdown Menu
    And Enter Consignment Number And Press Enter
      | ConsignmentNo |
      | A1444425      |
    Then Validate Log Details PopUp
      | PopUp                 |
      | MANUAL RETURN PROCESS |
    And Select ScanRetailer And Hub
      | ScanRetailer | Hub           |
      | 22           | SEKO OMNI LAX |
    And Enter Manual Return Process Details
      | MISC_1 | MISC_3 | OrderNo | MISC_2 |
      | TEST   | TEST   | AT1125  | TEST   |
    And Click Submit And Close Outer Button
    Then Validate Outer Id
    Then Validate Populated Hub Data
    Then Validate Populated Receiver Data

  Scenario: Close Outer Status Using Processing And Enter 'Commodities Declaration' And 'Packages' Info
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Processing Menu
    And Click Processing Dropdown Menu
    And Enter Consignment Number And Press Enter
      | ConsignmentNo |
      | A1444426      |
    Then Validate Log Details PopUp
      | PopUp                 |
      | MANUAL RETURN PROCESS |
    And Select ScanRetailer And Hub
      | ScanRetailer | Hub           |
      | 22           | SEKO OMNI LAX |
    And Enter Manual Return Process Details
      | MISC_1 | MISC_3 | OrderNo | MISC_2 |
      | TEST   | TEST   | AT1126  | TEST   |
    And Click Submit And Close Outer Button
    Then Validate Outer Id
    And Enter Commodities Declaration Info
      | Description | ManfCountry | TotalKg | Units | TotalValue | Currency |
      | test        | China       | 0.5     | 1     | 35         | NZD      |
    And Click Remove Commodity Row Icon
    And Enter Packages Info
      | Units | Length | Width | Height | KG |
      | 1     | 11     | 11    | 11     | 1  |
    And Click Remove Icon

  Scenario: Close Outer Status Using Processing And Create Connote By Clicking 'Use External Connote' Button
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Processing Menu
    And Click Processing Dropdown Menu
    And Enter Consignment Number And Press Enter
      | ConsignmentNo |
      | A1444441      |
    Then Validate Log Details PopUp
      | PopUp                 |
      | MANUAL RETURN PROCESS |
    And Select ScanRetailer And Hub
      | ScanRetailer | Hub           |
      | 22           | SEKO OMNI LAX |
    And Enter Manual Return Process Details
      | MISC_1 | MISC_3 | OrderNo | MISC_2 |
      | TEST   | TEST   | AT1144  | TEST   |
    And Click Submit And Close Outer Button
    Then Validate Outer Id
    Then Validate Populated Hub Data
    And Enter Sender Email
      | Email            |
      | test@example.com |
    Then Validate Populated Receiver Data
    And Enter Receiver Email
      | Email                  |
      | sstech.akash@gmail.com |
    And Enter Commodities Declaration Info
      | Description | ManfCountry | TotalKg | Units | TotalValue | Currency |
      | test        | China       | 0.5     | 1     | 35         | NZD      |
    And Click Remove Commodity Row Icon
    And Enter Packages Info
      | Units | Length | Width | Height | KG |
      | 1     | 11     | 11    | 11     | 1  |
    And Click Remove Icon
    And Click Calculate Freight Button
    And Click On Use Eternal Cannote
    Then Validate PopUp
      | PopUp                |
      | USE EXTERNAL CONNOTE |
    And Fill Use External Connote
      | Connote  | TrackingURL                                 |
      | 11122212 | https://test.omnirps.com/track/?id=11122212 |
    And Click On Save Btn
    Then Validate Success Message Alert
    Then Validate Success Alert
      | SuccessAlert                                                                     |
      | You have successfully created Connotes 11122212 for SEKO DEMO-RETURN TO THE FOLD |

  Scenario: Close Outer Status Using Processing And Create Connote By Selecting Carrier Service
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Processing Menu
    And Click Processing Dropdown Menu
    And Enter Consignment Number And Press Enter
      | ConsignmentNo |
      | A1113441      |
    Then Validate Log Details PopUp
      | PopUp                 |
      | MANUAL RETURN PROCESS |
    And Select ScanRetailer And Hub
      | ScanRetailer | Hub           |
      | 22           | SEKO OMNI LAX |
    And Enter Manual Return Process Details
      | MISC_1 | MISC_3 | OrderNo | MISC_2 |
      | TEST   | TEST   | AT1144  | TEST   |
    And Click Submit And Close Outer Button
    Then Validate Outer Id
    Then Validate Populated Hub Data
    And Enter Sender Email
      | Email            |
      | test@example.com |
    Then Validate Populated Receiver Data
    And Enter Receiver Email
      | Email                  |
      | sstech.akash@gmail.com |
    And Enter Commodities Declaration Info
      | Description | ManfCountry | TotalKg | Units | TotalValue | Currency |
      | test        | China       | 0.5     | 1     | 35         | NZD      |
    And Click Remove Commodity Row Icon
    And Enter Packages Info
      | Units | Length | Width | Height | KG |
      | 1     | 11     | 11    | 11     | 1  |
    And Click Remove Icon
    And Click Calculate Freight Button
    And Select Carrier Service
    Then Validate Success Message Alert

  Scenario: While There Is No Closed Outer Then Create Outer In Processing And See Temporary Label
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Processing Menu
    And Click Processing Dropdown Menu
    And Enter Consignment Number And Press Enter
      | ConsignmentNo |
      | A1112111      |
    Then Validate Log Details PopUp
      | PopUp                 |
      | MANUAL RETURN PROCESS |
    And Select ScanRetailer And Hub
      | ScanRetailer | Hub           |
      | 22           | SEKO OMNI LAX |
    Then Click On Create Outer Button
    Then Validate PopUp
      | PopUp        |
      | Create Outer |
    And Select Hub And Retailer
      | Hub           | Retailer                     |
      | SEKO OMNI LAX | SEKO DEMO-RETURN TO THE FOLD |
    And Click On Create Outer Button In Processing
    Then Validate Outer Created Message
    And Click On 'CLICK HERE' To Print Temporary Label

  Scenario: Verify If Unavailable Retailer Enter Then Validate Retailer Not Found Error
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Processing Menu
    And Click Processing Dropdown Menu
    And Enter Consignment Number And Press Enter
      | ConsignmentNo |
      | A112112111    |
    Then Validate Log Details PopUp
      | PopUp                 |
      | MANUAL RETURN PROCESS |
    And Select ScanRetailer
      | ScanRetailer |
      | ABC          |
    Then Validate Retailer Error
      | RetailerError |
      | error_msg     |

  ######################### Add Outers To MAWB ########################

  Scenario: Validate Add Outers To MAWB Homepage and URL
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Add Outers To MAWB
    And Validate Page URL
      | URL                                         |
      | https://stage.omnirps.com/consolidate_outer |
    Then Validate Log Details PopUp
      | PopUp              |
      | ADD OUTERS TO MAWB |

  Scenario: Verify Pop Up While Searching Without Selecting Hub
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Add Outers To MAWB
    And Click On Search Btn
    Then Validate PopUp
      | PopUp      |
      | Select Hub |
    And Click On Close Button

  Scenario: Search And Validate The Retailer After Selecting Hub
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Add Outers To MAWB
    And Fill Add Outers Details And Search
      | Hub           | Retailer                       |
      | SEKO OMNI LAX | SEKO DEMO-RETURN TO THE FOLD |
    And Click On Search Btn
    Then Validate Searched Detail
      | Retailer                     |
      | SEKO DEMO-RETURN TO THE FOLD |

  Scenario: Verify Popup While Export Without Selecting Retailer And Close Popup
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Add Outers To MAWB
    And Fill Add Outers Details And Search
      | Hub           | Retailer                       |
      | SEKO OMNI LAX | SEKO DEMO-RETURN TO THE FOLD |
    And Click On Search Btn
    And Click On Export Btn
    Then Validate PopUp Head
      | PopUp        |
      | Scan To Tick |
    And Click On Close Btn

  Scenario: Verify 'MAWB allocate and send' Popup After Export And Close It
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Add Outers To MAWB
    And Fill Add Outers Details And Search
      | Hub           | Retailer                     |
      | SEKO OMNI LAX | SEKO DEMO-RETURN TO THE FOLD |
    And Click On Search Btn
    And Select Item To Export
    And Click On Export Btn
    Then Validate Log Details PopUp
      | PopUp                  |
      | MAWB allocate and send |
    And Click Close Btn

  Scenario: Validate Mandatory Fields Of 'MAWB allocate and send' Popup
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Add Outers To MAWB
    And Fill Add Outers Details And Search
      | Hub           | Retailer                     |
      | SEKO OMNI LAX | SEKO DEMO-RETURN TO THE FOLD |
    And Click On Search Btn
    And Select Item To Export
    And Click On Export Btn
    Then Validate Log Details PopUp
      | PopUp                  |
      | MAWB allocate and send |
    And Click Create MAWB Button
    Then Check And Validate Mandatory Required Fields Error In Creating Create MAWB
      | Weight       | TransitMode        | OriginCountry       | OriginPort       | OriginAgent       | DestinationCountry       | DestinationPort       | DestinationAgent       | VesselNumber        |
      | Weight-error | transit_mode-error | OriginCountry-error | OriginPort-error | OriginAgent-error | DestinationCountry-error | DestinationPort-error | DestinationAgent-error | Vessel_Number-error |

  Scenario: Create MAWB By Adding Data Fields
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Add Outers To MAWB
    And Fill Add Outers Details And Search
      | Hub           | Retailer                     |
      | SEKO OMNI LAX | SEKO DEMO-RETURN TO THE FOLD |
    And Click On Search Btn
    Then Validate Searched Detail
      | Retailer                     |
      | SEKO DEMO-RETURN TO THE FOLD |
    And Select Item To Export
    And Click On Export Btn
    Then Validate Log Details PopUp
      | PopUp                  |
      | MAWB allocate and send |
    Then Create MAWB By Adding Data Fields
      | Weight | TransitMode | OriginCountry | OriginPort        | OriginAgent                   | DestinationCountry | DestinationPort   | DestinationAgent         | VesselNumber  | MAWB_1 | MAWB_2   |
      | 45     | AIR         | UNITED STATES | LOS ANGELES > LAX | LOS ANGELES > LAX > LAX AGENT | UNITED STATES      | LOS ANGELES > LAX | LOS ANGELES > LAX > SEKO | 4440001111111 | 233    | 97492111 |
    And Click Create MAWB Button
    Then Validate Success Alert
      | SuccessAlert                                                    |
      | Outer Consolidation for MAWB 233-97492111 successfully created. |

  Scenario: Enter Outer Connote For Scan To Tick And Validate Selected Outer Connote Checkbox
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Add Outers To MAWB
    And Fill Add Outers Details And Search
      | Hub           | Retailer                       |
      | SEKO OMNI LAX | SEKO DEMO-RETURN TO THE FOLD |
    And Click On Search Btn
    Then Enter Outer Connote For Scan To Tick
      | ScanToTick           |
      | 61290988336622094438 |
    Then Validate Outer Connote Checkbox
      | OuterConnote         |
      | 61290988336622094438 |

  Scenario: Enter Multiple Outer Connote For Scan To Tick And Validate Selected Outer Connotes Checkbox
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Add Outers To MAWB
    And Fill Add Outers Details And Search
      | Hub           | Retailer                       |
      | SEKO OMNI LAX | SEKO DEMO-RETURN TO THE FOLD |
    And Click On Search Btn
    Then Enter Outer Connote For Scan To Tick
      | ScanToTick           |
      | 61290988336622094438 |
    Then Validate Outer Connote Checkbox
      | OuterConnote         |
      | 61290988336622094438 |
    Then Enter Outer Connote For Scan To Tick
      | ScanToTick  |
      | FD560001608 |
    Then Validate Outer Connote Checkbox
      | OuterConnote |
      | FD560001608  |
    Then Enter Outer Connote For Scan To Tick
      | ScanToTick |
      | AT123451   |
    Then Validate Outer Connote Checkbox
      | OuterConnote |
      | AT123451     |

  Scenario: Enter Outer Connote For 'Scan To Tick' Then Uncheck Selected Connote And Validate 'Scan To Tick' Red Box
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Add Outers To MAWB
    And Fill Add Outers Details And Search
      | Hub           | Retailer                       |
      | SEKO OMNI LAX | SEKO DEMO-RETURN TO THE FOLD |
    And Click On Search Btn
    Then Enter Outer Connote For Scan To Tick
      | ScanToTick |
      | AT123451   |
    Then Validate Outer Connote Checkbox
      | OuterConnote |
      | AT123451     |
    And Uncheck Outer Connote Checkbox
      | OuterConnote |
      | AT123451     |
    Then Validate Scan To Tick Box Is Empty
    Then Validate Scan To Tick Box Error

  Scenario: Enter Outer Connote For 'Scan To Tick' Then Validate 'Scan To Tick' Green Box
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Add Outers To MAWB
    And Fill Add Outers Details And Search
      | Hub           | Retailer                     |
      | SEKO OMNI LAX | SEKO DEMO-RETURN TO THE FOLD |
    And Click On Search Btn
    Then Enter Outer Connote For Scan To Tick
      | ScanToTick |
      | AT123451   |
    Then Validate Outer Connote Checkbox
      | OuterConnote |
      | AT123451     |
    Then Validate Scan To Tick Box Is Empty
    Then Validate Scan To Tick Green Box

    Scenario: Enter Outer Connote For 'Scan To Tick' Then Export And Validate Readonly Units
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Add Outers To MAWB
    And Fill Add Outers Details And Search
      | Hub           | Retailer                     |
      | SEKO OMNI LAX | SEKO DEMO-RETURN TO THE FOLD |
    And Click On Search Btn
    Then Enter Outer Connote For Scan To Tick
      | ScanToTick         |
      | SPXHEF038600005857 |
    Then Validate Outer Connote Checkbox
      | OuterConnote       |
      | SPXHEF038600005857 |
      Then Enter Outer Connote For Scan To Tick
      | ScanToTick  |
      | FD560001608 |
    Then Validate Outer Connote Checkbox
      | OuterConnote |
      | FD560001608  |
    Then Enter Outer Connote For Scan To Tick
      | ScanToTick |
      | AT123451   |
    Then Validate Outer Connote Checkbox
      | OuterConnote |
      | AT123451     |
    And Click On Export Btn
    Then Validate Log Details PopUp
      | PopUp                  |
      | MAWB allocate and send |
    Then Validate Readonly Units

#################### MAWB - Outer Consolidations #######################

  Scenario: Validate "MAWB - Outer Consolidations" Homepage and URL
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click MAWB - Outer Consolidations
    And Validate Page URL
      | URL                                                |
      | https://stage.omnirps.com/outer/mawb_export_report |
    Then Validate The Page Heading
      | Heading                     |
      | MAWB - Outer Consolidations |

  Scenario: Search "MAWB - Outer Consolidations" Details Without Filling Any Details.
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click MAWB - Outer Consolidations
    And Validate Page URL
      | URL                                                |
      | https://stage.omnirps.com/outer/mawb_export_report |
    Then Validate The Page Heading
      | Heading                     |
      | MAWB - Outer Consolidations |
    And Click On Search Button To Search

  Scenario: Search And Validate "MAWB - Outer Consolidations" Details
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click MAWB - Outer Consolidations
    And Validate Page URL
      | URL                                                |
      | https://stage.omnirps.com/outer/mawb_export_report |
    Then Validate The Page Heading
      | Heading                     |
      | MAWB - Outer Consolidations |
    And Fill Outers Consolidations Details
      | Search       | OriginFacility        | DestinationPort     | Retailer                     | SubRetailer |
      | 134-78987587 | UNITED STATES-LAX-AIR | NEW ZEALAND-CHC-AIR | SEKO DEMO-RETURN TO THE FOLD | 1           |
    And Click On Search Button To Search
    Then Validate Searched Company Details In MAWB Outer Consolidations
      | Origin            | DestinationMode | Mode | MAWB         |
      | UNITED STATES-LAX | NEW ZEALAND-CHC | AIR  | 134-78987587 |