@ui
Feature: PHD-873

  Background: Login Into OmniRPS Application
    Given Open the Url Of OmniRPS Application For Stage Environment

  Scenario: 1.When accessing from processing page : a.hub should be pre-populated with hub selected on processing page#########
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Processing Menu
    And Click On Processing Dropdown

  Scenario: 1.When accessing from processing page : b.received should be pre-populated with address from retailer settings > hub address#########
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Processing Menu
    And Click On Processing Dropdown

  Scenario: 2.Accessing from nav : a.Hub should be pre populated if there is only one hub the user has access to
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Create Outer Consignment Menu
    And Select Hub From Dropdown
      | Hub           |
      | SEKO OMNI LAX |
    Then Validate Populated Hub Data

  Scenario: 2.Accessing from nav : b.Received needs to be selected by retailer and outer ID
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Create Outer Consignment Menu
    And Select Hub From Dropdown
      | Hub           |
      | SEKO OMNI LAX |
    Then Validate Populated Hub Data
    And Select Outer Id From Dropdown
      | Outer                                 |
      | 222101 - SEKO DEMO-RETURN TO THE FOLD |
    Then Validate Populated Receiver Data

  Scenario: 3.Hub/sender details - email and phone should be populated from hub details
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Create Outer Consignment Menu
    And Select Hub From Dropdown
      | Hub           |
      | SEKO OMNI LAX |
    Then Validate Populated Hub Data

  Scenario: 4.Commodities/Custom Declaration section
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Create Outer Consignment Menu
    And Select Hub From Dropdown
      | Hub           |
      | SEKO OMNI LAX |
    Then Validate Populated Hub Data
    And Select Outer Id From Dropdown
      | Outer                                 |
      | 222101 - SEKO DEMO-RETURN TO THE FOLD |
    Then Validate Populated Receiver Data
    And Enter Commodities Declaration Info
      | Description | ManfCountry | TotalKg | Units | TotalValue | Currency |
      | test        | China       | 0.5     | 1     | 35         | NZD      |
    And Enter Packages Info
      | Units | Length | Width | Height | KG |
      | 2     | 12     | 32    | 25     | 1  |

  Scenario: 5.Calculate freight button returns options to create label: a.Can add external connote
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
      | 222103 - SEKO DEMO-RETURN TO THE FOLD |
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
    Then Validate Success Alert
      | SuccessAlert                                                                     |
      | You have successfully created Connotes 11122212 for SEKO DEMO-RETURN TO THE FOLD |


  Scenario: 5.Calculate freight button returns options to create label: b.can create connote via OP
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
      | Outer                                  |
      | 22280 - SEKO DEMO - RETURN TO THE FOLD |
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
    And Click Calculate Freight Button
    And Select Carrier Service
    Then Validate Success Alert
      | SuccessAlert                                                                                                                                   |
      | You have successfully created Connotes 61290988336622098118 for SEKO DEMO - RETURN TO THE FOLD but there is an issue with printing the label.. |

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
    Then Validate The Page Heading
      | Heading            |
      | ADD OUTERS TO MAWB |

  Scenario: Verify Pop Up While Searching Without Selecting Hub
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Add Outers To MAWB
    And Validate Page URL
      | URL                                         |
      | https://stage.omnirps.com/consolidate_outer |
    Then Validate The Page Heading
      | Heading            |
      | ADD OUTERS TO MAWB |
    And Click On Search Btn
    Then Validate PopUp
      | PopUp      |
      | Select Hub |
    And Click On Close Button

  Scenario: Search And Validate The Retailer By Selecting Hub
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Add Outers To MAWB
    And Fill Add Outers Details And Search
      | Hub           | Retailer                       |
      | SEKO OMNI LAX | SEKO DEMO - RETURN TO THE FOLD |
    And Click On Search Btn
    Then Validate Searched Detail
      | Retailer                       |
      | SEKO DEMO - RETURN TO THE FOLD |

  Scenario: Verify Pop Up While Export Without Selecting Retailer
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Add Outers To MAWB
    And Fill Add Outers Details And Search
      | Hub           | Retailer                       |
      | SEKO OMNI LAX | SEKO DEMO - RETURN TO THE FOLD |
    And Click On Search Btn
    Then Validate Searched Detail
      | Retailer                       |
      | SEKO DEMO - RETURN TO THE FOLD |
    And Click On Export Btn
    Then Validate PopUp Head
      | PopUp        |
      | Scan To Tick |
    And Click On Close Btn

  Scenario: Verify "MAWB allocate and send" Popup After Export And Close It
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Add Outers To MAWB
    And Fill Add Outers Details And Search
      | Hub           | Retailer                       |
      | SEKO OMNI LAX | SEKO DEMO - RETURN TO THE FOLD |
    And Click On Search Btn
    Then Validate Searched Detail
      | Retailer                       |
      | SEKO DEMO - RETURN TO THE FOLD |
    And Select Item To Export
    And Click On Export Btn
    Then Validate The Page Heading
      | Heading                |
      | MAWB allocate and send |
    And Click Close Btn

  Scenario: Click "Create MAWB" Button And Validate Mandatory Fields
    Given Enter EmailAddress And Password and Click On LogIn Btn
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    When Click on Outers Menu
    And Click Add Outers To MAWB
    And Fill Add Outers Details And Search
      | Hub           | Retailer                       |
      | SEKO OMNI LAX | SEKO DEMO - RETURN TO THE FOLD |
    And Click On Search Btn
    Then Validate Searched Detail
      | Retailer                       |
      | SEKO DEMO - RETURN TO THE FOLD |
    And Select Item To Export
    And Click On Export Btn
    Then Validate The Page Heading
      | Heading                |
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
    Then Validate The Page Heading
      | Heading                |
      | MAWB allocate and send |
    Then Create MAWB By Adding Data Fields
      | Weight | TransitMode | OriginCountry | OriginPort        | OriginAgent | DestinationCountry | DestinationPort   | DestinationAgent         | VesselNumber  | MAWB_1 | MAWB_2   |
      | 45     | AIR         | UNITED STATES | LOS ANGELES > LAX | LAX AGENT   | UNITED STATES      | LOS ANGELES > LAX | LOS ANGELES > LAX > SEKO | 4440001111111 | 233    | 97492111 |
    And Click Create MAWB Button
    Then Validate Success Alert
      | SuccessAlert                                                    |
      | Outer Consolidation for MAWB 233-97492111 successfully created. |

######################### MAWB - Outer Consolidations ##########################

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

  Scenario: Search "MAWB - Outer Consolidations" Details.
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

  Scenario: Validate Searched "MAWB - Outer Consolidations" Details.########
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
    And Validate Details
      | Mode |
      | AIR  |

#    ##################### Create Outer ######################

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