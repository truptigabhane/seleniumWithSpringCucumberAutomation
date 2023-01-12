package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class HubManage_OReturns {

    public By ClickAddHub = By.xpath("//a[normalize-space()='Add Hub']");
    public By ClickHubChangeLog = By.xpath("//a[normalize-space()='Hub Change Log']");
    public By SelectCompany = By.xpath("//select[@id='CompanyId']");
    public By EnterName = By.xpath("//input[@id='Name']");
    public By ClickOnViewHubs = By.xpath("//a[normalize-space()='View Hubs']");
}
