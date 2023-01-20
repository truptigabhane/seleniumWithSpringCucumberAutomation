package com.techwith.ui.pages;

import com.techwith.ui.LocatorsPage.CompaniesManage_OReturns;
import com.techwith.ui.LocatorsPage.CreateOuterConsignment;
import com.techwith.ui.models.CompaniesManage_OReturns_Model;
import com.techwith.ui.models.CreateOuterConsignment_Model;
import com.techwith.ui.models.customUtils.elementCommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;
import static com.techwith.webdriver.WebDriverFactory.getDriver;

@Component
public class CreateOuterConsignment_Methods {

    @Autowired
    public CreateOuterConsignment_Model createOuterConsignment_model;
    @Autowired
    public CreateOuterConsignment createOuterConsignment;
    @Autowired
    public CompaniesManage_OReturns_Model companiesManage_oReturns_model;
    @Autowired
    public CompaniesManage_OReturns companiesManage_oReturns;

    public void ClickCreateOuterConsignmentMenu(){
        createOuterConsignment_model.ClickCreateOuterConsignmentMenu();
    }
    public void ClickAddOutersToMAWB(){
        createOuterConsignment_model.ClickAddOutersToMAWB();
    }
    public void ClickOnProcessingDropdown(){
        createOuterConsignment_model.ClickOnProcessingDropdown();
    }
    public void SelectHub(String hub) {
        createOuterConsignment_model.SelectHub(hub);
    }
    public void SelectOuter(String outer) {
        createOuterConsignment_model.SelectOuter(outer);
    }
    public void FillCommoditiesDetails( String description , String manfCountry , String totalKg , String units , String totalValue , String currency) {
        createOuterConsignment_model.EnterDescription(description);
        createOuterConsignment_model.SelectManfCountry(manfCountry);
        createOuterConsignment_model.EnterTotalKg(totalKg);
        createOuterConsignment_model.EnterUnits(units);
        createOuterConsignment_model.EnterTotalValue(totalValue);
        createOuterConsignment_model.SelectCurrency(currency);
    }
    public void EnterSenderEmail( String email) {
        createOuterConsignment_model.EnterSenderEmail(email);
    }
    public void EnterReceiverEmail( String email) {
        createOuterConsignment_model.EnterReceiverEmail(email);
    }
    public void FillPackagesDetails( String units , String length , String width , String height , String kg) {
        createOuterConsignment_model.EnterPackageUnits(units);
        createOuterConsignment_model.SelectLength(length);
        createOuterConsignment_model.EnterWidth(width);
        createOuterConsignment_model.EnterHeight(height);
        createOuterConsignment_model.EnterKg(kg);
    }
    public void FillUseExternalConnote(String connote , String trackingURL) {
        createOuterConsignment_model.EnterConnote(connote);
        createOuterConsignment_model.EnterTrackingURL(trackingURL);
    }
    public void ClickCalculateFreightButton(){
        createOuterConsignment_model.ClickCalculateFreightBtn();
    }
    public void ClickRemoveIcon(){
        createOuterConsignment_model.ClickRemoveIcon();
    }
    public void ClickRemoveCommodityRowIcon(){
        createOuterConsignment_model.ClickRemoveCommodityRowIcon();
    }
    public void ClickOnSaveBtn(){
        createOuterConsignment_model.ClickOnSaveBtn();
    }
    public void SelectCarrierService(){
        createOuterConsignment_model.SelectCarrierService();
    }
    public void ClickOnUseEternalCannote(){
        createOuterConsignment_model.ClickOnUseEternalCannote();
    }
    public void ClickSearch(){
        createOuterConsignment_model.ClickSearch();
    }
    public void CheckItem(){
        createOuterConsignment_model.CheckItem();
    }
    public void ClickExport(){
        createOuterConsignment_model.ClickExport();
    }
    public void ClickOnCloseButton(){
        createOuterConsignment_model.ClickOnCloseButton();
    }
    public void ClickOnCloseBtn(){
        createOuterConsignment_model.ClickOnCloseBtn();
    }
    public void ClickCloseBtn(){
        createOuterConsignment_model.ClickCloseBtn();
    }
    public void ClickCreateMAWBButton(){
        createOuterConsignment_model.ClickCreateMAWBButton();
    }
    public void SelectEnterHub(String TypeText){
        ClickBy(createOuterConsignment.SelectEnterHub);
        createOuterConsignment_model.EnterText(TypeText);
        getDriver().findElement(By.xpath("(//input[@role='textbox'])[2]")).sendKeys(Keys.ENTER);
    }
    public void EnterRetailer(String Retailer){
//        ClickBy(createOuterConsignment.EnterRetailer);
        ClickBy(createOuterConsignment.EnterRetailer);
        createOuterConsignment_model.EnterRetailer(Retailer);
        getDriver().findElement(createOuterConsignment.EnterRetailer);
//        getDriver().findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);
    }
    public void FillAddOutersDetails( String hub , String retailer ) {
        SelectEnterHub(hub);
//        EnterRetailer(retailer);
    }
    public void FillAddMAWBDeatils( String weight , String transitMode , String originCountry , String originPort , String originAgent , String destinationCountry , String destinationPort , String destinationAgent , String vesselNumber , String mawb_1 , String mawb_2 ) {
        createOuterConsignment_model.enterWeight(weight);
        createOuterConsignment_model.selectTransitMode(transitMode);
        createOuterConsignment_model.selectOriginCountry(originCountry);
        createOuterConsignment_model.selectOriginPort(originPort);
        createOuterConsignment_model.selectOriginAgent(originAgent);
        createOuterConsignment_model.selectDestinationCountry(destinationCountry);
        createOuterConsignment_model.selectDestinationPort(destinationPort);
        createOuterConsignment_model.selectDestinationAgent(destinationAgent);
        createOuterConsignment_model.enterVesselNumber(vesselNumber);
        createOuterConsignment_model.enterMawb_1(mawb_1);
        createOuterConsignment_model.enterMawb_2(mawb_2);
    }
    public void EnterOuterConnoteForScanToTick(String scanToTick) {
        createOuterConsignment_model.EnterOuterConnoteForScanToTick(scanToTick);
    }
    public boolean ValidateDetails(String Search) {
        Boolean value = getDriver().findElement(By.xpath(createOuterConsignment.ValidateOuterCannoteCheckBox + Search + createOuterConsignment.PostValidateOuterCannoteCheckBox)).isDisplayed();
        return value;
    }
    public void ValidateCloseOuterDetails(String ChangeType) {
        Boolean ChangeTypeValidation = ValidateDetails(ChangeType);
        elementCommonUtils.assertBoolValues(Boolean.TRUE, ChangeTypeValidation);
    }

    public void ClickToUncheck(String CheckBox) throws InterruptedException {
        Thread.sleep(2000);
        getDriver().findElement(By.xpath(createOuterConsignment.ValidateOuterCannoteCheckBox + CheckBox + createOuterConsignment.PostValidateOuterCannoteCheckBox)).click();
    }
    public void selectRetailer(String retailer){
        ClickBy(createOuterConsignment.SelectRetailer);
        companiesManage_oReturns_model.enterText(retailer);
        getDriver().findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);
    }
    public void selectSubRetailer(String subRetailer){
        ClickBy(createOuterConsignment.SelectSubRetailer);
        companiesManage_oReturns_model.enterText(subRetailer);
        getDriver().findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);
    }
    public void FillOutersConsolidationsDetails( String search , String originFacility , String destinationPort , String retailer , String subRetailer) {
        createOuterConsignment_model.enterSearch(search);
//        createOuterConsignment_model.selectOriginFacility(originFacility);
        createOuterConsignment_model.selectDestination_Port(destinationPort);
//        selectRetailer(retailer);
//        selectSubRetailer(subRetailer);
    }
}
