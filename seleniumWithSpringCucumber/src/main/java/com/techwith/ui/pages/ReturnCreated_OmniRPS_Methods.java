package com.techwith.ui.pages;

import com.techwith.ui.models.ReturnCreated_OmniRPS_Model;
import com.techwith.ui.models.WouldYouLikeToReturns_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Component
public class ReturnCreated_OmniRPS_Methods {

    @Autowired
    public ReturnCreated_OmniRPS_Model returnCreated_omniRPS_model;

    public void ValidateConsignmentNo(String ExpectedConsignmentNo){
        String ConsignmentNo = returnCreated_omniRPS_model.FetchAndValidateConsignmentNo();
        assertEquals(ExpectedConsignmentNo , ConsignmentNo);
    }

    public void ValidateOrderNumber(String ExpectedOrderNumber){
        String OrderNumber = returnCreated_omniRPS_model.FetchAndValidateOrderNumber();
        assertEquals(ExpectedOrderNumber , OrderNumber);
    }

    public void FillTheReturnCreatedDetails(String hub , String quantity , String style , String itemNo , String sku , String description , String value , String reason){
//    public void FillTheReturnCreatedDetails(String hub , String quantity , String rma , String warehouseLocation , String misc_1 , String misc_2 , String misc_3 , String notes , String style , String itemNo , String sku , String description , String value , String reason , String subReason , String condition , String reviewDescription) {
        returnCreated_omniRPS_model.SelectTheHub(hub);
        returnCreated_omniRPS_model.enterQuantity(quantity);
//        returnCreated_omniRPS_model.enterRMA(rma);
//        returnCreated_omniRPS_model.enterWarehouseLocation(warehouseLocation);
//        returnCreated_omniRPS_model.enterMISC_1(misc_1);
//        returnCreated_omniRPS_model.enterMISC_2(misc_2);
//        returnCreated_omniRPS_model.enterMISC_3(misc_3);
//        returnCreated_omniRPS_model.enterNotes(notes);
        //returnCreated_omniRPS_model.uploadPhotos(photo);
        returnCreated_omniRPS_model.enterStyle(style);
        returnCreated_omniRPS_model.enterItemNo(itemNo);
        returnCreated_omniRPS_model.enterSku(sku);
        returnCreated_omniRPS_model.enterDescription(description);
        returnCreated_omniRPS_model.enterValue(value);
        returnCreated_omniRPS_model.enterReason(reason);
//        returnCreated_omniRPS_model.enterSubReason(subReason);
//        returnCreated_omniRPS_model.selectCondition(condition);
//        returnCreated_omniRPS_model.enterReviewDescription(reviewDescription);
//        returnCreated_omniRPS_model.enterReturnAction(returnAction);
    }

    public void ClickOnAddNewItemButton(){
        returnCreated_omniRPS_model.ClickOnAddNewItemBtn();
    }

    public void ClickOnSubmitButton(){
        returnCreated_omniRPS_model.ClickOnSubmitBtn();
    }

    public void ClickOnResetFormButton(){
        returnCreated_omniRPS_model.ClickOnResetFormBtn();
    }
}
