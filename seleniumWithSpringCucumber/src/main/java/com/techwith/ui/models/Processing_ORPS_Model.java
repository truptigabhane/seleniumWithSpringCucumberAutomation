package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.Processing_ORPS;
import com.techwith.ui.models.customUtils.DropdownEnum;
import com.techwith.ui.models.customUtils.elementCommonUtils;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.*;
import static com.techwith.webdriver.WebDriverFactory.getDriver;

@Component
public class Processing_ORPS_Model {

    @Autowired
    public Processing_ORPS processing_orps;

    public void EnterConsignmentNo(String consignmentNo){
        SendKeyBy(processing_orps.EnterConsignmentNo , consignmentNo);
    }
    public void clickOnScanRetailerDropDown(String ScanRetailerDropDownNo){
        elementFromString(processing_orps.PreClickOnReturnReasonDropDown,ScanRetailerDropDownNo, processing_orps.Post2).click();
    }
    public void selectScanRetailerFromTheDropDown(String ScanRetailer){
        elementFromString(processing_orps.PreSelectReasonFromDropDown , ScanRetailer , processing_orps.Post2).click();
    }
    public void selectHubFromTheDropDown(String hub){
        DropDownBySelect((processing_orps.selectHubFromTheDropDown), DropdownEnum.VISIBLE_TEXT() , hub);
    }
    public void selectHub(String hub){
        DropDownBySelect((processing_orps.SelectHub), DropdownEnum.VISIBLE_TEXT() , hub);
    }
    public void selectRetailer(String retailer){
        DropDownBySelect((processing_orps.SelectRetailer), DropdownEnum.VISIBLE_TEXT() , retailer);
    }
    public void EnterMISC_1(String misc_1){
        SendKeyBy(processing_orps.EnterMISC_1 , misc_1);
    }
    public void EnterMISC_3(String misc_3){
        SendKeyBy(processing_orps.EnterMISC_3 , misc_3);
    }
    public void EnterOrderNo(String orderNo){
        SendKeyBy(processing_orps.EnterOrderNo , orderNo);
    }
    public void EnterMISC_2(String misc_2){
        SendKeyBy(processing_orps.EnterMISC_2 , misc_2);
    }
    public void ClickSubmitAndClosOuterButton(){
        ClickBy(processing_orps.ClickSubmitAndClosOuterButton);
    }
    public void ClickOnResetFormButton(){
        ClickBy(processing_orps.ClickOnResetFormButton);
    }
    public void ClickOnCreateOuterButton(){
        ClickBy(processing_orps.ClickOnCreateOuterButton);
    }
    public void ClickOnCreateOuterButtonInProcessing(){
        ClickBy(processing_orps.ClickOnCreateOuterButtonInProcessing);
    }
    public void ClickOnCLICKHEREToPrintTemporaryLabel(){
        ClickBy(processing_orps.ClickOnCLICKHEREToPrintTemporaryLabel);
    }
    public void ClickOnCancelButton(){
        ClickBy(processing_orps.ClickOnCancelButton);
    }
    public void SelectRetailerName(String retailer){
        SendKeyBy(processing_orps.SelectRetailerName , retailer);
    }
    public boolean ValidateTheErrorMessage(String Search) {
        Boolean value = getDriver().findElement(By.xpath(processing_orps.ValidateError + Search + processing_orps.PostValidateError)).isDisplayed();
        return value;
    }
    public void ValidateErrorDisplay(String Heading) {
        Boolean ErrorValidation = ValidateTheErrorMessage(Heading);
        elementCommonUtils.assertBoolValues(Boolean.TRUE, ErrorValidation);
    }
}
