package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class Login_ORPS {

    public By EnterEmailAddress = By.xpath("//input[@id='UserName']");
    public By EnterPassword = By.xpath("//input[@id='Password']");
    public By ClickSignInButton = By.xpath("//button[normalize-space()='Sign in']");
    public By ClickOnOutersMenu = By.xpath("//a[normalize-space()='Outers']");
    public By ClickOnProcessingMenu = By.xpath("(//a[@class='dropdown-toggle'][normalize-space()='Processing'])[1]");
    public By ClickMAWBOuterConsolidations = By.xpath("//a[normalize-space()='MAWB - Outer Consolidations']");
    public By ClickCreateOuterDropdownMenu = By.xpath("//a[normalize-space()='Create Outer']");
    public By ClickOuterReportsDropdownMenu = By.xpath("//a[normalize-space()='Outer Reports']");
}
