package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.CreateOuterConsignment;
import com.techwith.ui.models.customUtils.DropdownEnum;
import com.techwith.ui.models.customUtils.elementCommonUtils;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.*;
import static com.techwith.webdriver.WebDriverFactory.getDriver;

@Component
public class CreateOuterConsignment_Model {

    @Autowired
    public CreateOuterConsignment createOuterConsignment;

    public void ClickCreateOuterConsignmentMenu(){
        ClickBy(createOuterConsignment.ClickCreateOuterConsignmentMenu);
    }
    public void ClickAddOutersToMAWB(){
        ClickBy(createOuterConsignment.ClickAddOutersToMAWB);
    }
    public void ClickOnProcessingDropdown(){
        ClickBy(createOuterConsignment.ClickOnProcessingDropdown);
    }
    public void SelectHub(String hub){
        DropDownBySelect((createOuterConsignment.SelectHub), DropdownEnum.VISIBLE_TEXT() , hub);
    }
    public void SelectOuter(String outer){
        DropDownBySelect((createOuterConsignment.SelectOuter), DropdownEnum.VISIBLE_TEXT() , outer);
    }
    public void EnterDescription(String description){ SendKeyBy(createOuterConsignment.EnterDescription , description);}
    public void SelectManfCountry(String manfCountry){
        DropDownBySelect((createOuterConsignment.SelectManfCountry), DropdownEnum.VISIBLE_TEXT() , manfCountry);
    }
    public void EnterTotalKg(String totalKg){ SendKeyBy(createOuterConsignment.EnterTotalKg , totalKg);}
    public void EnterUnits(String units){ SendKeyBy(createOuterConsignment.EnterUnits , units);}
    public void EnterTotalValue(String totalValue){ SendKeyBy(createOuterConsignment.EnterTotalValue , totalValue);}
    public void SelectCurrency(String currency){
        DropDownBySelect((createOuterConsignment.SelectCurrency), DropdownEnum.VISIBLE_TEXT() , currency);
    }
    public void EnterPackageUnits(String units){ SendKeyBy(createOuterConsignment.EnterPackageUnits , units);}
    public void SelectLength(String length){ SendKeyBy(createOuterConsignment.SelectLength , length);}
    public void EnterWidth(String width){ SendKeyBy(createOuterConsignment.EnterWidth , width);}
    public void EnterHeight(String height){ SendKeyBy(createOuterConsignment.EnterHeight , height);}
    public void EnterKg(String kg){ SendKeyBy(createOuterConsignment.EnterKg , kg);}
    public void ClickCalculateFreightBtn(){
        ClickBy(createOuterConsignment.ClickCalculateFreightBtn);
    }
    public void ClickRemoveIcon(){
        ClickBy(createOuterConsignment.ClickRemoveIcon);
    }
    public void ClickOnSaveBtn(){
        ClickBy(createOuterConsignment.ClickOnSaveBtn);
    }
    public void SelectCarrierService(){
        ClickBy(createOuterConsignment.SelectCarrierService);
    }
    public void ClickOnUseEternalCannote(){
        ClickBy(createOuterConsignment.ClickOnUseEternalCannote);
    }
    public void EnterSenderEmail(String email){ SendKeyBy(createOuterConsignment.EnterEmail , email);}
    public void EnterReceiverEmail(String email){ SendKeyBy(createOuterConsignment.EnterReceiverEmail , email);}
    public void EnterRetailer(String retailer){ SendKeyBy(createOuterConsignment.EnterRetailer , retailer);}
    public void ClickSearch(){
        ClickBy(createOuterConsignment.ClickSearch);
    }
    public void EnterText(String text){ SendKeyBy(createOuterConsignment.EnterText , text);}
    public void CheckItem(){
        ClickBy(createOuterConsignment.CheckItem);
    }
    public void ClickExport(){
        ClickBy(createOuterConsignment.ClickExport);
    }
    public void ClickOnCloseButton(){
        ClickBy(createOuterConsignment.ClickOnCloseButton);
    }
    public void ClickOnCloseBtn(){
        ClickBy(createOuterConsignment.ClickOnCloseBtn);
    }
    public void ClickCloseBtn(){
        ClickBy(createOuterConsignment.ClickCloseBtn);
    }
    public void ClickCreateMAWBButton(){
        ClickBy(createOuterConsignment.ClickCreateMAWBButton);
    }
    public boolean ValidateLogDetailPopUp(String Search) {
        Boolean value = getDriver().findElement(By.xpath(createOuterConsignment.ValidatePopUpHead + Search + createOuterConsignment.PostValidatePopUpHead)).isDisplayed();
        return value;
    }
    public void ValidatePopUpHead(String PopUp) {
        Boolean PopUpHeading = ValidateLogDetailPopUp(PopUp);
        elementCommonUtils.assertBoolValues(Boolean.TRUE, PopUpHeading);
    }

    public boolean ValidateDetailPopUp(String Search) {
        Boolean value = getDriver().findElement(By.xpath(createOuterConsignment.ValidateHead + Search + createOuterConsignment.PostValidateHead)).isDisplayed();
        return value;
    }
    public void ValidatHead(String PopUp) {
        Boolean PopUpHeading = ValidateDetailPopUp(PopUp);
        elementCommonUtils.assertBoolValues(Boolean.TRUE, PopUpHeading);
    }
    public void enterWeight(String weight){ SendKeyBy(createOuterConsignment.EnterWeight , weight);}
    public void selectTransitMode(String transitMode){
        DropDownBySelect((createOuterConsignment.SelectTransitMode), DropdownEnum.VISIBLE_TEXT() , transitMode);
    }
    public void selectOriginCountry(String originCountry){
        DropDownBySelect((createOuterConsignment.SelectOriginCountry), DropdownEnum.VISIBLE_TEXT() , originCountry);
    }
    public void selectOriginPort(String originPort){
        DropDownBySelect((createOuterConsignment.SelectOriginPort), DropdownEnum.VISIBLE_TEXT() , originPort);
    }
    public void selectOriginAgent(String originAgent){
        DropDownBySelect((createOuterConsignment.SelectOriginAgent), DropdownEnum.VISIBLE_TEXT() , originAgent);
    }
    public void selectDestinationCountry(String destinationCountry){
        DropDownBySelect((createOuterConsignment.SelectDestinationCountry), DropdownEnum.VISIBLE_TEXT() , destinationCountry);
    }
    public void selectDestinationPort(String destinationPort){
        DropDownBySelect((createOuterConsignment.SelectDestinationPort), DropdownEnum.VISIBLE_TEXT() , destinationPort);
    }
    public void selectDestinationAgent(String destinationAgent){
        DropDownBySelect((createOuterConsignment.SelectDestinationAgent), DropdownEnum.VISIBLE_TEXT() , destinationAgent);
    }
    public void enterVesselNumber(String vesselNumber){ SendKeyBy(createOuterConsignment.EnterVesselNumber , vesselNumber);}
    public void enterMawb_1(String mawb_1){ SendKeyBy(createOuterConsignment.EnterMawb_1 , mawb_1);}
    public void enterMawb_2(String mawb_2){ SendKeyBy(createOuterConsignment.EnterMawb_2 , mawb_2);}
    public void EnterConnote(String connote){ SendKeyBy(createOuterConsignment.EnterConnote , connote);}
    public void EnterTrackingURL(String trackingURL){ SendKeyBy(createOuterConsignment.EnterTrackingURL , trackingURL);}
}
