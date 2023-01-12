@ui
Feature: Omni Returns

  Background: Login Into Omni Return Application
    Given Open the Url Of Omni Return Application

  Scenario: Validate Login Page URL
    And Validate Page URL
      | URL                                             |
      | https://stage.omniparcelreturns.com/admin/login |

  Scenario: Verify If User Login Without Email Address And Password.
    Given Without Entering EmailAddress And Password and Click On LogIn Button
    Then Validate Message
      | Error |
      | red   |

  Scenario: Verify If User Login Without Password.
    Given Without Entering Password Click On LogIn Button
      | EmailID       |
      | akash.trivedi |
    Then Validate Message
      | Error |
      | red   |

  Scenario: Verify If User Login Without EmailAddress.
    Given Without Entering EmailAddress Click On LogIn Button
      | Password             |
      | akash.trivedi@sstech |
    Then Validate Message
      | Error |
      | red   |

  Scenario: Verify If User Login With Wrong EmailAddress And Password.
    Given Login With Wrong EmailAddress And Password And Click On LogIn Button
      | EmailID | Password      |
      | wrong   | wrongPassword |
    Then Validate Message
      | Error |
      | red   |

  Scenario: Validate Forget Password Page And Submit Without Email Address And Then Validate Navigated Page.
    Given Click On Forget Password
    And Validate Page URL
        | URL                                                   |
        | https://stage.omniparcelreturns.com/admin/login#login |
    And Click On Submit Button On Forget Password Page
    And Validate Page URL
      | URL                                             |
      | https://stage.omniparcelreturns.com/admin/login |

  Scenario: Verify If User Clicks On Login Link On Forget Password Page Then Validate Navigated Page.
    Given Click On Forget Password
    And Click On Login Link
    And Validate Page URL
      | URL                                                    |
      | https://stage.omniparcelreturns.com/admin/login#signup |

  Scenario: Verify If User Clicks On Submit Button With Invalid Email Address And Then Validate Navigated Page.
    Given Click On Forget Password
    And Enter Invalid Email Address And Click On Submit Button
      | EmailID |
      | invalid |
    And Click On Submit Button On Forget Password Page
    Then Validate Message
      | Error |
      | red   |

  Scenario: Verify If User Clicks On Submit Button With Valid Email Address And Then Validate Navigated Page.
    Given Click On Forget Password
    And Enter Invalid Email Address And Click On Submit Button
      | EmailID       |
      | akash.trivedi |
    And Click On Submit Button On Forget Password Page
    Then Validate Message
      | Error |
      | green |

  Scenario: Use Received Reset Password Link On Email And Submit Without Entering Password And Confirm Password.
    Given Open Reset Password Link
      | LinkOnEmail                                                                           |
      | https://stage.omniparcelreturns.com/admin/login/reset_user_forgot_password/480483b6bd |
    And Click On Submit Button On Forget Password Page
    And Check And Validate Mandatory Required Field
      | NewPassword    | ConfirmPassword       |
      | password-error | confirmpassword-error |

  Scenario: Use Received Reset Password Link On Email And Submit Without Entering Password Fields.
    Given Open Reset Password Link
      | LinkOnEmail                                                                           |
      | https://stage.omniparcelreturns.com/admin/login/reset_user_forgot_password/480483b6bd |
    And Enter Confirm Password
      | ConfirmPassword      |
      | akash.trivedi@sstech |
    And Click On Submit Button On Forget Password Page
    And Check And Validate Mandatory Required Password Field For Confirm Password
      | ConfirmPassword       |
      | confirmpassword-error |

  Scenario: Use Received Reset Password Link On Email And Submit Without Entering Confirm Password Fields.
    Given Open Reset Password Link
      | LinkOnEmail                                                                           |
      | https://stage.omniparcelreturns.com/admin/login/reset_user_forgot_password/480483b6bd |
    And Enter Password
      | Password             |
      | akash.trivedi@sstech |
    And Click On Submit Button On Forget Password Page
    And Check And Validate Mandatory Required Password Field For Confirm Password
      | ConfirmPassword       |
      | confirmpassword-error |

  Scenario: Use Received Reset Password Link On Email And Submit By Entering Password Fields.
    Given Open Reset Password Link
      | LinkOnEmail                                                                           |
      | https://stage.omniparcelreturns.com/admin/login/reset_user_forgot_password/480483b6bd |
    And Enter Password And Confirm Password
      | Password             | ConfirmPassword      |
      | akash.trivedi@sstech | akash.trivedi@sstech |
    And Click On Submit Button On Forget Password Page
    Then Validate Message
      | Error |
      | green |

  Scenario: Verify If User Login With Valid EmailAddress And Password And Validate Navigated Page.
    Given Login With Valid EmailAddress And Password And Click On LogIn Button
      | EmailID       | Password             |
      | akash.trivedi | akash.trivedi@sstech |
    And Validate Page URL
      | URL                                                 |
      | https://stage.omniparcelreturns.com/admin/Dashboard |
