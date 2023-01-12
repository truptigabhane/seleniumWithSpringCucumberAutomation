package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class ModuleManage_OReturns {

    public By ClickAddModule = By.xpath("//a[normalize-space()='Add Module']");
    public By EnterModuleName = By.xpath("//input[@id='ModuleName']");
    public By EnterDescription = By.xpath("//textarea[@name='Description']");
    public By ClickOnViewModule = By.xpath("//a[normalize-space()='View Modules']");
}
