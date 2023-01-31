package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class OuterReport_ORPS {

    public By SelectOuterStatus = By.xpath("(//span[@id='select2-outer_status-container'])[1]");
    public By SelectRetailer = By.xpath("(//span[@role='combobox'])[2]");
    public By SelectHub = By.xpath("(//span[contains(@role,'combobox')])[3]");
    public By SelectReports = By.xpath("(//span[contains(@role,'combobox')])[4]");
    public By EnterSearch = By.xpath("//input[@id='search_key']");
    public By ClickSearchBtn = By.xpath("//button[@onclick='search_outer_reports();']");
    public By ClickOnCancelButtonInOuterReport = By.xpath("(//button[normalize-space()='CANCEL'])[1]");
    public By ClickCreateOuterConsignmentDropdownMenu = By.xpath("//a[normalize-space()='Create Outer Consignment']");
    public By ClickOnSenderResetButton = By.xpath("//button[@id='btnResetSender']");
    public By ClickOnReceiverResetButton = By.xpath("//button[@id='btnResetReceiver']");
    public By EnterCountry = By.xpath("//input[@id='SenderCountry']");
    public By EnterName = By.xpath("//input[@id='SenderName']");
    public By EnterBuilding = By.xpath("//input[@id='SenderBuilding']");
    public By EnterStreet = By.xpath("//input[@id='SenderStreet']");
    public By EnterSuburb = By.xpath("//input[@id='SenderSuburb']");
    public By EnterStateCity = By.xpath("//input[@id='SenderStateCity']");
    public By EnterPostcode = By.xpath("//input[@id='SenderPostcode']");
    public By EnterContact = By.xpath("//input[@id='SenderContact']");
    public By EnterPhone = By.xpath("//input[@id='SenderPhone']");
    public By EnterEmail = By.xpath("//input[@id='SenderEmail']");
    public By EnterReceiverCountry = By.xpath("//input[@id='ReceiverCountry']");
    public By EnterReceiverName = By.xpath("//input[@id='ReceiverName']");
    public By EnterReceiverBuilding = By.xpath("//input[@id='ReceiverBuilding']");
    public By EnterReceiverStreet = By.xpath("//input[@id='ReceiverStreet']");
    public By EnterReceiverSuburb = By.xpath("//input[@id='ReceiverSuburb']");
    public By EnterReceiverStateCity = By.xpath("//input[@id='ReceiverStateCity']");
    public By EnterReceiverPostcode = By.xpath("//input[@id='ReceiverPostcode']");
    public By EnterReceiverContact = By.xpath("//input[@id='ReceiverContact']");
    public By EnterReceiverPhone = By.xpath("//input[@id='ReceiverPhone']");
    public By EnterReceiverEmail = By.xpath("//input[@id='ReceiverEmail']");
    public By EnterReceiverDeliveryInstructions = By.xpath("//input[@id='DeliveryInstructions']");
    public By ClickProcessingDropdownMenu = By.xpath("//a[@href='https://stage.omnirps.com/return_receipt/processing_cons']");
    public By ClickOnOuterReviewIcon = By.xpath("(//a[@title='Outer Review'])[1]");
    public By ClickOnDownloadOuterManifestIcon = By.xpath("(//a[@id='outer_excel_review'])[1]");
    public By ClickOnMarkAsDeliveredIcon = By.xpath("(//i[@class='fa fa-check'])[1]");
    public By ClickOnXButtonInOuterReport = By.xpath("//button[normalize-space()='×']");
    public By ClickOnConfirmButtonInOuterReport = By.xpath("//button[@id='outerdelivered']");
}
