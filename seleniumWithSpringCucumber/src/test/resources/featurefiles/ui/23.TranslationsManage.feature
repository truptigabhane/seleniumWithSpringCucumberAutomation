@ui
Feature: Omni Returns

  Background: Login Into Omni Return Application
    Given Open the Url Of Omni Return Application

  Scenario: Validate Translations Homepage and URL
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Translations Option From Manage Dropdown
    And Validate Page URL
      | URL                                                    |
      | https://stage.omniparcelreturns.com/admin/translations |
    Then Validate The Open Page
      | Heading      |
      | Translations |

  Scenario: Validate Add Translation Page And Check Mandatory Required Fields
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Translations Option From Manage Dropdown
    And Click On Add Translation
    Then Validate The Open Page
      | Heading         |
      | Add Translation |
    And Click On Submit Button
    Then Check And Validate Mandatory Required Fields Error In Translations
      | Type       | Item         | Field           | French        | German        | Spanish       |
      | Type-error | TypeId-error | FieldName-error | Text_fr-error | Text_de-error | Text_es-error |

  Scenario: Delete Translations In View Translations
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Translations Option From Manage Dropdown
    And Click On View Translation
    And Click On Delete Button###############
    Then Validate Success Alert#################
      | SuccessAlert                  |
      | Group is Deleted Succesfully. |


  Scenario: Edit Translations In View Translations
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Translations Option From Manage Dropdown
    And Click On View Translation
    And Click On Edit Button
    Then Validate The Open Page
      | Heading            |
      | Update Translation |
    And Take Inputs To Update Translations
      | Type | Item                                                      | Field        | French                                                                     | German                                                           | Spanish                                                                    |
      | FAQ  | HOW LONG IT WILL TAKE TO GET MY MONEY BACK IN MY ACCOUNT? | FAQ Question | Cela prendra 3-5 jours ouvrables selon votre banque? Termes et conditions. | Es dauert 3-5 Werktage je nach Ihrer Bank? Geschäftsbedingungen. | ¿Tardará 3-5 días hábiles dependiendo de su banco? términos y Condiciones. |
    And Click On Submit Button
    Then Validate Success Alert
      | SuccessAlert                            |
      | A record has been updated successfully. |

  Scenario: Search Translations Without Taking Inputs
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Translations Option From Manage Dropdown
    And Click On View Translation
    And Click On Submit Btn
    Then Validate Searched Translation Details
      | Type | Field      |
      | FAQ  | FAQ Answer |

  Scenario: Search Translations With Inputs##############
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select Translations Option From Manage Dropdown
    And Click On View Translation

    And Click On Submit Btn
    Then Validate Searched Translation Details
      | Type | Field      |
      | FAQ  | FAQ Answer |


