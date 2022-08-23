package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class SignIn_OmniRPS {

    public By EnterUserName = By.xpath("//input[@id='UserName']");
    public By EnterPassword = By.xpath("//input[@id='Password']");
    public By ClickSignInButton = By.xpath("//button[normalize-space()='Sign in']");
}
