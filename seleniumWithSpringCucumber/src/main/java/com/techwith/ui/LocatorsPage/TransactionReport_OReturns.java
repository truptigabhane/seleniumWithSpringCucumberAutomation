package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class TransactionReport_OReturns {

    public By EnterSearch = By.xpath("//input[@id='search']");
    public By SelectCompany = By.xpath("//span[@id='select2-CompanyId-container']");
    public By EnterSearchRetailer = By.xpath("//input[@placeholder='Search Retailer']");
    public By EnterStartDate = By.xpath("//input[@id='startDate']");
    public By EnterEndDate = By.xpath("//input[@id='endDate']");
    public By ClickExportToExcelButton = By.xpath("//button[@id='export_direct_excel']");
//    public By ClickSearchButton = By.xpath("//button[normalize-space()='Search']");
    public By ClickSearchButton = By.xpath("//button[normalize-space()='SEARCH']");

}
