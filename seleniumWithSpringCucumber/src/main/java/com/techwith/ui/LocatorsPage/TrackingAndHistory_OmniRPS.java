package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class TrackingAndHistory_OmniRPS {

    public By ClickTrackingAndHistory = By.xpath("//a[normalize-space()='Tracking and History']");
    public By EnterSearch = By.xpath("//input[@id='search']");
    public By SelectConvertToTimezone = By.xpath("//input[@placeholder='Convert to Timezone']");
    public By SelectReturnReason = By.xpath("//span[@id='select2-return_reason-container']");
    public By SelectProcessingStatus = By.xpath("//select[@id='not_processed']");
    public By ClickSearchButton = By.xpath("//button[normalize-space()='SEARCH']");
    public By SelectRetailer = By.xpath("//input[@placeholder='Select Retailer']");
    public By SelectSubRetailer = By.xpath("//input[@placeholder='All Sub Retailer']");
    public By SelectCountry = By.xpath("//input[@placeholder='Select Country']");
    public By SelectHub = By.xpath("//select[@id='hubs']");
    public By EnterDateRange = By.xpath("//input[@id='daterange']");
    public By ClickExportButton = By.xpath("//button[@id='export_booking']");

    public String ValidateConsignment = "//td[normalize-space()='";
    public String PostValidateConsignment = "']";
}
