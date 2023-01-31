package com.techwith.ui.pages;

import com.techwith.ui.LocatorsPage.OuterReport_ORPS;
import com.techwith.ui.models.CompaniesManage_OReturns_Model;
import com.techwith.ui.models.OuterReport_ORPS_Model;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;
import static com.techwith.ui.models.customUtils.elementCommonUtils.elementFromString;
import static com.techwith.webdriver.WebDriverFactory.getDriver;

@Component
public class OuterReport_ORPS_Methods {

    @Autowired
    public OuterReport_ORPS outerReport_orps;
    @Autowired
    public CompaniesManage_OReturns_Model companiesManage_oReturns_model;
    @Autowired
    public OuterReport_ORPS_Model outerReport_orps_model;

    public void SelectOuterStatus(String Company){
        ClickBy(outerReport_orps.SelectOuterStatus);
        companiesManage_oReturns_model.enterText(Company);
        getDriver().findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);
    }
    public void SelectRetailer(String Retailer){
        ClickBy(outerReport_orps.SelectRetailer);
        companiesManage_oReturns_model.enterText(Retailer);
        getDriver().findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);
    }
    public void SelectHub(String Hub){
        ClickBy(outerReport_orps.SelectHub);
        companiesManage_oReturns_model.enterText(Hub);
        getDriver().findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);
    }
    public void SelectReports(String Reports){
        ClickBy(outerReport_orps.SelectReports);
        companiesManage_oReturns_model.enterText(Reports);
        getDriver().findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);
    }
    public void FillSearchDetails(String search , String outerStatus , String retailer , String hub , String reports ) {
        outerReport_orps_model.EnterSearch(search);
        SelectOuterStatus(outerStatus);
        SelectRetailer(retailer);
        SelectHub(hub);
        SelectReports(reports);
    }
    public void ClickSearchBtn(){
        outerReport_orps_model.ClickSearchBtn();
    }
    public void ClickOnCancelButtonInOuterReport(){
        outerReport_orps_model.ClickOnCancelButtonInOuterReport();
    }
    public void ClickOnXButtonInOuterReport(){
        outerReport_orps_model.ClickOnXButtonInOuterReport();
    }
    public void ClickOnConfirmButtonInOuterReport(){
        outerReport_orps_model.ClickOnConfirmButtonInOuterReport();
    }
    public void ClickOnOuterReviewIcon(){
        outerReport_orps_model.ClickOnOuterReviewIcon();
    }
    public void ClickOnDownloadOuterManifestIcon(){
        outerReport_orps_model.ClickOnDownloadOuterManifestIcon();
    }
    public void ClickOnMarkAsDeliveredIcon(){
        outerReport_orps_model.ClickOnMarkAsDeliveredIcon();
    }
    public void ClickCreateOuterConsignmentDropdownMenu(){
        outerReport_orps_model.ClickCreateOuterConsignmentDropdownMenu();
    }
    public void ClickProcessingDropdownMenu(){
        outerReport_orps_model.ClickProcessingDropdownMenu();
    }
    public void ClickOnSenderResetButton(){
        outerReport_orps_model.ClickOnSenderResetButton();
    }
    public void ClickOnReceiverResetButton(){
        outerReport_orps_model.ClickOnReceiverResetButton();
    }
    public void FillSearchDetailsInHubUser(String search , String outerStatus , String retailer , String hub) {
        outerReport_orps_model.EnterSearch(search);
        SelectOuterStatus(outerStatus);
        SelectRetailer(retailer);
        SelectHub(hub);
    }
}
