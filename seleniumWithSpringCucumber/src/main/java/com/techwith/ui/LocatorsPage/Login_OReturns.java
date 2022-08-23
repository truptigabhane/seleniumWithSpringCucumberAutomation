package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Login_OReturns {

    public By EnterEmailAddress = By.xpath("//input[@id='username']");
    public By EnterPassword = By.xpath("//input[@id='password']");
    public By ClickLogInButton = By.xpath("//button[contains(text(),'Log In')]");

}
