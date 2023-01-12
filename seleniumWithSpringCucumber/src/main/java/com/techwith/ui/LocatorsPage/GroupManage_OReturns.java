package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class GroupManage_OReturns {

    public By ClickAddGroup = By.xpath("//a[normalize-space()='Add Group']");
    public By EnterGroupName = By.xpath("//input[@id='GroupName']");
    public By EnterRetailer = By.xpath("//input[@placeholder='Search Retailer']");
    public By AddRetailer = By.xpath("(//ul[@class='select2-selection__rendered'])[1]");
    public By ClickViewGroup = By.xpath("//a[normalize-space()='View Groups']");
    public By ClickEditIconInGroup = By.xpath("(//a[contains(text(),'Edit')])[4]");
    public By ClickDeleteIconInGroup = By.xpath("(//a[contains(text(),'Delete')])[4]");
}
