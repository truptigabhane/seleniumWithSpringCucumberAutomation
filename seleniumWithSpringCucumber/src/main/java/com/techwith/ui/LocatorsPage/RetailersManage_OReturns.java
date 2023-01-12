package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class RetailersManage_OReturns {

    public By ClickAddRetailer = By.xpath("//a[normalize-space()='Add Retailer']");
    public By ClickRetailerChangeLog = By.xpath("//a[normalize-space()='Retailer Change Log']");
    public By ClickEditBtnRetailer41 = By.xpath("//tr[@class='even']//a[contains(text(),'Edit')]");
    public By ClickAssignHub = By.xpath("//span[normalize-space()='ASSIGN HUBS']");
    public By ClickCountryFees = By.xpath("//span[normalize-space()='COUNTRY FEES']");
    public By ClickPaymentGateway = By.xpath("//span[normalize-space()='PAYMENT GATEWAY']");
    public By ClickViewRetailers = By.xpath("//a[normalize-space()='View Retailers']");
    public By ClickSaveAndNextBtn = By.xpath("//button[normalize-space()='Save and Next']");
    public By ClickDeleteButton = By.xpath("//a[normalize-space()='Delete']");
    public By ClickOnTheSaveAndNextButton = By.xpath("//button[@name='btnSave'][normalize-space()='Save and Next']");
    public By ClickOnSaveAndNextBtn = By.xpath("(//button[@class='btn btn-success col-md-3 col-sm-5 col-xs-12'])[1]");
    public By ClickOnSaveAndPublishButton = By.xpath("//button[normalize-space()='Save and Publish']");
    public By ClickRetailerPreviewButton = By.xpath("//button[normalize-space()='Retailer Preview']");
    public By ClickSaveButton = By.xpath("(//button[@name='btnSave'][normalize-space()='Save'])[1]");
    public By SelectName = By.xpath("//select[@id='CompanyId']");
    public By InputLogoFile = By.xpath("//input[@id='file']");
    public By EnterRetailerName = By.xpath("//input[@id='firstname']");
    public By ClickAddHub = By.xpath("//input[@placeholder='Search hubs']");
    public By SelectHub = By.xpath("(//input[@id='United-States-US-231-18'])[1]");
    public By ClickLabelOmniParcelKey = By.xpath("//label[normalize-space()='OmniParcel Key']");
    public By EnterOmniParcelKey = By.xpath("//input[@id='AccessToken']");
    public By selectMultiLanguage = By.xpath("//select[@id='MultiLang']");
    public By selectGatewayType = By.xpath("//div[@class='vsparent']//select[@id='gatewaytype_id']");
    public By selectRootGateWay = By.xpath("//div[@class='vsparent']//select[@id='rootgateway_id']");
    public By selectSubGateWay = By.xpath("//div[@class='vsparent']//select[@id='subgateway_id']");
    public By selectPriority = By.xpath("(//select[@name='priority[]'])[1]");
    public By selectReturnType = By.xpath("(//select[@name='ReturnType-18-231[]'])[1]");
    public By selectStoreCredit = By.xpath("(//select[@name='storecredit_countryid_231_hubid_18'])[1]");
    public By selectExchange = By.xpath("(//select[@name='exchange_countryid_231_hubid_18'])[1]");
    public By selectSuburbLabel = By.xpath("(//select[@name='SuburbLabel[]'])[1]");
    public By selectStateCityLabel = By.xpath("(//select[@name='StateCityLabel[]'])[1]");
    public By selectPostcodeLabel = By.xpath("(//select[@name='PostcodeLabel[]'])[1]");
    public By selectBackgroundImageFile = By.xpath("//input[@id='filebg']");
    public By selectFaviconFile = By.xpath("//input[@id='fileico']");
    public By selectOrderMethod = By.xpath("//select[@name='OrderLevel']");
}
