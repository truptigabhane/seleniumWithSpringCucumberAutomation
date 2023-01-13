package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class Login_OReturns {

    public By EnterEmailAddress = By.xpath("//input[@id='username']");
    public By EnterEmailAddressForReset = By.xpath("//input[@id='recovery-mail']");
    public By EnterPassword = By.xpath("//input[@id='password']");
    public By ClickLogInButton = By.xpath("//button[contains(text(),'Log In')]");
    public String ValidateError = "//font[@color='";
    public String PostValidateError = "']";
    public By ClickForgetPassword = By.xpath("//a[normalize-space()='Forgot Password?']");
    public By ClickSubmitButton = By.xpath("//button[normalize-space()='Submit']");
    public By ClickLoginLink = By.xpath("//a[@class='loginlink']");
    public By EnterConfirmPassword = By.xpath("//input[@id='confirmpassword']");
}
