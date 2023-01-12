package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class ReturnCreated_OmniRPS {
    public By ValidateConsignmentNo = By.xpath("//input[@id='Consignment_No']");
    public By ValidateOrderNo = By.xpath("//input[@id='OrderNo']");
    public By SelectHub = By.xpath("//select[@id='HubId']");
    public By EnterQuantity = By.xpath("//input[@id='Quantity']");
    public By EnterRMA = By.xpath("//input[@id='RMA']");
    public By EnterLocationBarcode = By.xpath("//input[@id='LocationBarcode']");
    public By EnterWarehouseLocation = By.xpath("//input[@id='WarehouseLocation']");
    public By EnterMISC_1 = By.xpath("//input[@id='MISC_1']");
    public By EnterMISC_2 = By.xpath("//input[@id='MISC_2']");
    public By EnterMISC_3 = By.xpath("//input[@id='MISC_3']");
    public By EnterNotes = By.xpath("//textarea[@id='Notes']");
    public By UploadPhotos = By.xpath("//input[@id='ItemPhoto']");
    public By EnterStyle = By.xpath("//input[@id='STYLE']");
    public By EnterItemNo = By.xpath("//input[@id='ItemNo']");
    public By EnterCustomerComment = By.xpath("//input[@id='CustomerComment']");
    public By EnterTotalWeight = By.xpath("//input[@id='TotalWeight']");
    public By EnterChtComment = By.xpath("//input[@id='ChtComment']");
    public By EnterSku = By.xpath("//div[@class='col-md-4 col-sm-12 col-xs-12 sku-box']//input[@id='Sku']");
    public By EnterDescription = By.xpath("//input[@id='Description']");
    public By EnterValue = By.xpath("//input[@id='TotalGBP']");
    public By EnterReason = By.xpath("//input[@id='Reason']");
    public By EnterSubReason = By.xpath("//input[@id='SubReason']");
    public By SelectCondition = By.xpath("//select[@id='Conditions']");
    public By EnterReviewDescription = By.xpath("//input[@id='ReviewDescription']");
    public By EnterReturnAction = By.xpath("//select[@id='ReturnAction']");
    public By ClickOnAddNewItemButton = By.xpath("//button[@id='ad_btn_one']");
    public By ClickOnSubmitButton = By.xpath("//button[normalize-space()='SUBMIT']");
    public By ClickOnResetFormButton = By.xpath("//a[normalize-space()='RESET FORM']");

}
