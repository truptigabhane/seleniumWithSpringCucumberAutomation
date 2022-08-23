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

    public void FillTheManualReturnDetails( String orderNo , String quantity , String rma , String itemNo , String sku , String value , String condition , String returnAction){
        manualReturn_omniRPS_model.enterOrderNo(orderNo);
        returnCreated_omniRPS_model.enterQuantity(quantity);
        returnCreated_omniRPS_model.enterRMA(rma);
        returnCreated_omniRPS_model.enterItemNo(itemNo);
        returnCreated_omniRPS_model.enterSku(sku);
        returnCreated_omniRPS_model.enterValue(value);
        returnCreated_omniRPS_model.selectCondition(condition);
        manualReturn_omniRPS_model.selectReturnAction(returnAction);
    }
}
