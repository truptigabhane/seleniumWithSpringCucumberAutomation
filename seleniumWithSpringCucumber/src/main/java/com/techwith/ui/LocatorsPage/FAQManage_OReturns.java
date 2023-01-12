package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class FAQManage_OReturns {

    public By ClickViewFAQs = By.xpath("//a[normalize-space()='View FAQs']");
    public By ClickAddFAQ = By.xpath("//a[normalize-space()='Add FAQ']");
    public By selectCompany = By.xpath("//select[@id='CompanyId']");
    public By selectCategory = By.xpath("//select[@id='CategoryId']");
    public By enterQuestion = By.xpath("//textarea[@id='Question']");
    public By enterAnswer = By.xpath("//textarea[@id='Answer']");
    public By enterDisplayOrder = By.xpath("//input[@id='DisplayOrder']");
    public By selectStatus = By.xpath("//select[@id='Enable']");
}
