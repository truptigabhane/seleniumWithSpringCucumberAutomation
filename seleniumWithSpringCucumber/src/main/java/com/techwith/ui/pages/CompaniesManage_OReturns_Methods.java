package com.techwith.ui.pages;

import com.techwith.ui.LocatorsPage.CompaniesManage_OReturns;
import com.techwith.ui.models.CompaniesManage_OReturns_Model;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;
import static com.techwith.webdriver.WebDriverFactory.getDriver;

@Component
public class CompaniesManage_OReturns_Methods {

    @Autowired
    public CompaniesManage_OReturns_Model companiesManage_oReturns_model;
    @Autowired
    public CompaniesManage_OReturns companiesManage_oReturns;

    public void FillSearch(String Search) {
        companiesManage_oReturns_model.enterSearch(Search);
    }

    public void ClickSearchButton(){
        companiesManage_oReturns_model.ClickSearchBtn();
    }

    public void ClickExportButton(){
        companiesManage_oReturns_model.ClickExportBtn();
    }

    public void ClickOnAddCompany(){
        companiesManage_oReturns_model.ClickAddCompany();
    }

    public void ClickOnCompanyChangeLog(){
        companiesManage_oReturns_model.ClickCompanyChangeLog();
    }
    public void selectChangeType(String TypeText){
        ClickBy(companiesManage_oReturns.ClickChangeTypeDropDown);
        companiesManage_oReturns_model.enterText(TypeText);
        getDriver().findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);
    }
    public void selectCompany(String Company){
        ClickBy(companiesManage_oReturns.ClickCompanyDropDown);
        companiesManage_oReturns_model.enterText(Company);
        getDriver().findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);
    }
    public void selectCompanyToCheckNotFound(String Company) {
        ClickBy(companiesManage_oReturns.ClickCompanyDropDown);
        companiesManage_oReturns_model.enterText(Company);
    }
    public void FillChangeLogDetailsToSearch(String search , String changeType , String company , String startDate , String endDate ) {
        companiesManage_oReturns_model.enterSearchKey(search);
        selectChangeType(changeType);
        selectCompany(company);
        companiesManage_oReturns_model.enterStartDate(startDate);
        companiesManage_oReturns_model.enterEndDate(endDate);
    }
    public void FillChangeLogDetails(String search , String changeType , String company ) {
        companiesManage_oReturns_model.enterSearchKey(search);
        selectChangeType(changeType);
        selectCompany(company);
    }
    public void SelectDateToSearch( String startDate , String endDate ) throws InterruptedException {
        companiesManage_oReturns_model.selectStartDateToSearch(startDate);
        companiesManage_oReturns_model.selectEndDateToSearch(endDate);
    }
    public void ClickSearchDetails(){ companiesManage_oReturns_model.clickSearchDetails();}
    public void ClickCloseSearchDetails(){ companiesManage_oReturns_model.clickCloseSearchDetails();}
    public void ClickOnViewCompany(){ companiesManage_oReturns_model.clickOnViewCompany();}

    public void ClickOnSubmitButton(){
        companiesManage_oReturns_model.ClickSubmitBtn();
    }
    public void ClickViewCategories(){
        companiesManage_oReturns_model.ClickOnViewCategories();
    }
    public void ClickAddCategory(){
        companiesManage_oReturns_model.ClickOnAddCategory();
    }
    public void ClickOnSearchButton(){
        companiesManage_oReturns_model.ClickSearchButton();
    }
    public void ClickOnResetButton(){
        companiesManage_oReturns_model.ClickOnResetBtn();
    }
    public void ClickOnEdit(){
        companiesManage_oReturns_model.ClickOnTheEdit();
    }
    public void ClickOnDisableRadioButton(){
        companiesManage_oReturns_model.ClickOnTheDisableRadioButton();
    }
    public void ClickOnUpdateButton(){
        companiesManage_oReturns_model.ClickOnTheUpdateButton();
    }

    public void FillAddCompanyDeatils( String companyName , String country , String suburb , String state_City , String postcode , String contactNumber , String email , String returnPortalDomain , String siteURL ) {
        companiesManage_oReturns_model.enterCompanyName(companyName);
        companiesManage_oReturns_model.enterCountry(country);
        companiesManage_oReturns_model.enterSuburb(suburb);
        companiesManage_oReturns_model.enterState_City(state_City);
        companiesManage_oReturns_model.enterPostcode(postcode);
        companiesManage_oReturns_model.enterContactNumber(contactNumber);
        companiesManage_oReturns_model.enterEmail(email);
        companiesManage_oReturns_model.enterReturnPortalDomain(returnPortalDomain);
        companiesManage_oReturns_model.enterSiteURL(siteURL);
    }

    public void UpadateCompanyDeatils( String contactNumber) {
        companiesManage_oReturns_model.enterContactNumber(contactNumber);
    }

}
