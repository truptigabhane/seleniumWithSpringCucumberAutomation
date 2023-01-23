package com.techwith.ui.pages;

import com.techwith.ui.models.Processing_ORPS_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Processing_ORPS_Methods {

    @Autowired
    public Processing_ORPS_Model processing_orps_model;

    public void EnterConsignmentNo(String consignmentNo) {
        processing_orps_model.EnterConsignmentNo(consignmentNo);
    }
    public void clickOnScanRetailerDropDown(String ProductReturnDropDown){
        processing_orps_model.clickOnScanRetailerDropDown(ProductReturnDropDown);
    }
    public void selectScanRetailerFromTheDropDown(String returnReason){
        processing_orps_model.selectScanRetailerFromTheDropDown(returnReason);
    }
    public void selectHub(String hub){
        processing_orps_model.selectHub(hub);
    }
    public void selectRetailer(String retailer){
        processing_orps_model.selectRetailer(retailer);
    }
    public void selectHubFromTheDropDown(String retailer) {
        processing_orps_model.selectHubFromTheDropDown(retailer);
    }
    public void FillManualReturnProcessDetails( String misc_1 , String misc_3 , String orderNo , String misc_2) {
        processing_orps_model.EnterMISC_1(misc_1);
        processing_orps_model.EnterMISC_3(misc_3);
        processing_orps_model.EnterOrderNo(orderNo);
        processing_orps_model.EnterMISC_2(misc_2);
    }
    public void ClickSubmitAndClosOuterButton(){
        processing_orps_model.ClickSubmitAndClosOuterButton();
    }
    public void ClickOnResetFormButton(){
        processing_orps_model.ClickOnResetFormButton();
    }
    public void ClickOnCreateOuterButton(){
        processing_orps_model.ClickOnCreateOuterButton();
    }
    public void ClickOnCreateOuterButtonInProcessing(){
        processing_orps_model.ClickOnCreateOuterButtonInProcessing();
    }
    public void ClickOnCLICKHEREToPrintTemporaryLabel(){
        processing_orps_model.ClickOnCLICKHEREToPrintTemporaryLabel();
    }
    public void ClickOnCancelButton(){
        processing_orps_model.ClickOnCancelButton();
    }
    public void SelectRetailerName(String retailer){
        processing_orps_model.SelectRetailerName(retailer);
    }
}
