package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class RoleManage_OReturns {

    public By ClickAddRole = By.xpath("//a[normalize-space()='Add Role']");
    public By ClickViewRole = By.xpath("//a[normalize-space()='View Roles']");
    public By SelectCompany = By.xpath("//select[@id='IdCompany']");
    public By EnterRole = By.xpath("//input[@id='Role']");
    public By EnterDescription = By.xpath("//textarea[@name='Description']");
    public By CheckModuleAccess = By.xpath("//input[@value='32']");
}
