package com.techwith.ui.pages;

import com.techwith.ui.models.ManualReturn_OmniRPS_Model;
import com.techwith.ui.models.ReturnCreated_OmniRPS_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManualReturn_OmniRPS_Methods {

    @Autowired
    public ManualReturn_OmniRPS_Model manualReturn_omniRPS_model;

    @Autowired
    public ReturnCreated_OmniRPS_Model returnCreated_omniRPS_model;

    public void clickOnScanRetailerDropDown(String ProductReturnDropDown){
        manualReturn_omniRPS_model.clickOnScanRetailerDropDown(ProductReturnDropDown);
    }

    public void selectScanRetailerFromTheDropDown(String returnReason){
        manualReturn_omniRPS_model.selectScanRetailerFromTheDropDown(returnReason);
    }

    public void FillTheManualReturnDetails( String orderNo , String quantity , String rma , String locationBarcode , String warehouseLocation , String misc_1 , String misc_3 , String misc_2 , String notes , String style , String itemNo , String customerComment , String totalWeight , String chtComment , String sku , String description , String value , String reason , String subReason , String condition , String returnAction){
        manualReturn_omniRPS_model.enterOrderNo(orderNo);
        returnCreated_omniRPS_model.enterQuantity(quantity);
        returnCreated_omniRPS_model.enterRMA(rma);
        returnCreated_omniRPS_model.enterLocationBarcode(locationBarcode);
        returnCreated_omniRPS_model.enterWarehouseLocation(warehouseLocation);
        returnCreated_omniRPS_model.enterMISC_1(misc_1);
        returnCreated_omniRPS_model.enterMISC_3(misc_3);
        returnCreated_omniRPS_model.enterMISC_2(misc_2);
        returnCreated_omniRPS_model.enterNotes(notes);
        returnCreated_omniRPS_model.enterStyle(style);
        returnCreated_omniRPS_model.enterItemNo(itemNo);
        returnCreated_omniRPS_model.enterCustomerComment(customerComment);
        returnCreated_omniRPS_model.enterTotalWeight(totalWeight);
        returnCreated_omniRPS_model.enterChtComment(chtComment);
        returnCreated_omniRPS_model.enterSku(sku);
        returnCreated_omniRPS_model.enterDescription(description);
        returnCreated_omniRPS_model.enterValue(value);
        returnCreated_omniRPS_model.enterReason(reason);
        returnCreated_omniRPS_model.enterSubReason(subReason);
        returnCreated_omniRPS_model.selectCondition(condition);
        manualReturn_omniRPS_model.selectReturnAction(returnAction);
    }

    public void UploadPhoto(){
        returnCreated_omniRPS_model.ClickOnUploadPhotoBtn();
    }
}
