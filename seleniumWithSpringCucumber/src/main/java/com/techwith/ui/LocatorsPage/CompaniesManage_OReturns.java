package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class CompaniesManage_OReturns {

    public By SearchCompany = By.xpath("//input[@id='search']");
    public By ClickSearchButton = By.xpath("//button[normalize-space()='Search']");
    public By ClickExportButton = By.xpath("//button[@id='export_booking']");

    public By ClickAddCompany = By.xpath("//a[normalize-space()='Add Company']");

    public By ClickCompanyChangeLog = By.xpath("//a[normalize-space()='Company Change Log']");
    public By SearchKey = By.xpath("//input[@id='SearchKey']");
    public By ClickChangeTypeDropDown = By.xpath("//span[@id='select2-ChangesType-container']");
    public By EnterChangeTypeText = By.xpath("//input[@role='textbox']");
    public By ClickCompanyDropDown = By.xpath("//span[@id='select2-CompanyId-container']");
    public By EnterStartDate = By.xpath("//input[@id='startDate']");
    public String SelectStartDate = "(//td[contains(text(),'";
    public String PostSelectStartDate = "')])[1]";
    public String PostSelectEndDate = "')])[3]";
    public String SelectStartMonthAndYear = "//th[normalize-space()='";
    public String SelectEndMonthAndYear = "(//th[contains(@class,'month')][normalize-space()='";
    public String PostSelectEndMonthAndYear = "'])[3]";
    public By EnterEndDate = By.xpath("//input[@id='endDate']");

    public By ClickSearchDetails = By.xpath("(//i[@class='fa fa-search'])[1]");
    public By ClickOnViewCompany = By.xpath("//a[normalize-space()='View Companies']");
    public By ClickCloseSearchDetails = By.xpath("//button[normalize-space()='Close']");

    public By ClickSubmitBtn = By.xpath("//button[normalize-space()='Submit']");
    public By ClickOnResetBtn = By.xpath("//button[normalize-space()='Reset']");
    public By ClickOnEdit = By.xpath("(//a[contains(text(),'Edit')])[1]");
    public By ClickOnUpdateButton = By.xpath("//button[normalize-space()='Update']");
    public By ClickOnDisableRadioButton = By.xpath("//input[@value='0']");

    public String ValidateError = "//p[@id='";
    public String PostValidateError = "']";

    public By enterCompanyName = By.xpath("//input[@id='CompanyName']");
    public By enterCountry = By.xpath("//input[@id='country']");
    public By enterSuburb = By.xpath("//input[@id='city']");
    public By enterState_City = By.xpath("//input[@id='state']");
    public By enterPostcode = By.xpath("//input[@id='postalcode']");
    public By enterContactNumber = By.xpath("//input[@id='Contact']");
    public By enterEmail = By.xpath("//input[@id='Email']");
    public By enterReturnPortalDomain = By.xpath("//input[@id='CustomDomain']");
    public By enterSiteURL = By.xpath("//input[@id='SiteURL']");

    public String ValidatePopUpHead = "//h3[normalize-space()='";
    public String PostValidatePopUpHead = "']";
    public String ValidateChangeType = "//td[normalize-space()='";
    public String PostValidateChangeType = "']";

    public By ClickOnSearchButton = By.xpath("//button[normalize-space()='SEARCH']");
    public By ClickViewCategories = By.xpath("//a[normalize-space()='View Categories']");
    public By ClickAddCategory = By.xpath("//a[normalize-space()='Add Category']");
}
