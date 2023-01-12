package com.techwith.ui.pages;

import com.techwith.ui.LocatorsPage.CarriersManage_OReturns;
import com.techwith.ui.models.CarriersManage_OReturns_Model;
import com.techwith.ui.models.CompaniesManage_OReturns_Model;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;
import static com.techwith.webdriver.WebDriverFactory.getDriver;

@Component
public class CarriersManage_OReturns_Methods {

    @Autowired
    public CarriersManage_OReturns_Model carriersManage_oReturns_model;
    @Autowired
    public CompaniesManage_OReturns_Methods companiesManage_oReturns_methods;
    @Autowired
    public CompaniesManage_OReturns_Model companiesManage_oReturns_model;
    @Autowired
    public CarriersManage_OReturns carriersManage_oReturns;

    public void ClickOnAddCarriers(){
        carriersManage_oReturns_model.ClickAddCarriers();
    }
    public void ClickOnViewCarriers(){
        carriersManage_oReturns_model.ClickViewCarriers();
    }
    public void FillAddCarriersDetails(String carrierName , String omniParcelID , String omniParcelCarrierName) {
        carriersManage_oReturns_model.enterCarrierName(carrierName);
        carriersManage_oReturns_model.enterOmniParcelID(omniParcelID);
        carriersManage_oReturns_model.enterOmniParcelCarrierName(omniParcelCarrierName);
        carriersManage_oReturns_model.checkHub();
    }
    public void FillSearchCarriersDetails(String search) {
        carriersManage_oReturns_model.enterSearch(search);
        carriersManage_oReturns_model.checkHub();
    }
    public void ClickOnEditIcon(){
        carriersManage_oReturns_model.ClickEditIconToEdit();
    }
    public void clickOnCarrierChangeLog(){
        carriersManage_oReturns_model.ClickCarrierChangeLog();
    }
    public void selectChangeType(String TypeText){
        ClickBy(carriersManage_oReturns.ClickChangeTypeDropDown);
        companiesManage_oReturns_model.enterText(TypeText);
        getDriver().findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);
    }
    public void selectCompany(String Company){
        ClickBy(carriersManage_oReturns.ClickCompanyDropDown);
        companiesManage_oReturns_model.enterText(Company);
        getDriver().findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);
    }
    public void FillChangeLogDetails(String search , String changeType , String company ) {
        companiesManage_oReturns_model.enterSearch(search);
        selectChangeType(changeType);
        selectCompany(company);
    }

}
