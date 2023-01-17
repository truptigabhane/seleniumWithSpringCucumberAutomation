@ui
Feature: Omni Returns

  Background: Login Into Omni Return Application
    Given Open the Url Of Omni Return Application

  Scenario: Validate FAQ Homepage and URL
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select FAQ Option From Manage Dropdown
    And Validate Page URL
      | URL                                            |
      | https://stage.omniparcelreturns.com/admin/faqs |
    Then Validate The Open Page
      | Heading   |
      | View FAQs |

  Scenario: Validate Add FAQ Page And Check Mandatory Required Fields
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select FAQ Option From Manage Dropdown
    And Click On Add FAQ
    Then Validate The Open Page
      | Heading |
      | Add FAQ |
    And Click On Submit Button
    Then Check And Validate Mandatory Required Fields Error In Add FAQ
      | Company         | Category         | Question       | Answer       |
      | CompanyId-error | CategoryId-error | Question-error | Answer-error |

  Scenario: Fill Add FAQ Fields and Create FAQ

  Scenario: Validate View Categories Page and URL
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select FAQ Option From Manage Dropdown
    And Click View Categories
    And Validate Page URL
      | URL                                                |
      | https://stage.omniparcelreturns.com/admin/category |
    Then Validate The Open Page
      | Heading         |
      | View Categories |

  Scenario: Validate Add Category Page and URL
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select FAQ Option From Manage Dropdown
    And Click View Categories
    And Click Add Category
    And Validate Page URL
      | URL                                                       |
      | https://stage.omniparcelreturns.com/admin/category/insert |
    Then Validate The Open Page
      | Heading      |
      | Add Category |

  Scenario: Validate Add Category Page And Check Mandatory Required Fields
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select FAQ Option From Manage Dropdown
    And Click View Categories
    And Click Add Category
    And Click On Submit Button
    Then Check And Validate Mandatory Required Fields Error In Add Category
      | Company         | Name               |
      | CompanyId-error | CategoryName-error |

  Scenario: Delete FAQ In View FAQs
    Given Enter EmailAddress And Password and Click On LogIn Button
    When Select FAQ Option From Manage Dropdown
    And Click On View FAQs
#    And Click On Delete Button###############
#    Then Validate Success Alert#################
#      | SuccessAlert                  |
#      | Group is Deleted Succesfully. |

#  Scenario: Edit FAQ In View FAQs#############Database error
#    Given Enter EmailAddress And Password and Click On LogIn Button
#    When Select FAQ Option From Manage Dropdown
#    And Click On View FAQs
#    And Click On Edit Button
#    Then Validate The Open Page
#      | Heading    |
#      | Update FAQ |
#    And Take Inputs To Update FAQ
#      | Company | Category     | Question                                               | Answer                                                                                                                                                                                                                                 | DisplayOrder | Status  |
#      | aa      | TestCategory | WHO CAN I CONTACT FOR ASSISTANCE WITH MY RETURN LABEL? | Please contact us on support@omniparcelreturns.com with your Name, Retailer name and Order number.  Please include the issue you are experiencing to help us expedite the process and we will get in touch with you as soon as we can. | 13           | Publish |
#    And Click On Submit Button
##    Then Validate Success Alert
##      | SuccessAlert                            |
##      | A record has been updated successfully. |