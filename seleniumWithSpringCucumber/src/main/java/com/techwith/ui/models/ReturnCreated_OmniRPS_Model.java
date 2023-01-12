package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.ReturnCreated_OmniRPS;
import com.techwith.ui.models.customUtils.DropdownEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.*;

@Component
public class ReturnCreated_OmniRPS_Model {

    @Autowired
    public ReturnCreated_OmniRPS returnCreated_omniRPS;

    public String FetchAndValidateConsignmentNo() {
        return fetchDataByInput(returnCreated_omniRPS.ValidateConsignmentNo);
    }

    public String FetchAndValidateOrderNumber() {
        return fetchDataByInput(returnCreated_omniRPS.ValidateOrderNo);
    }

    public void SelectTheHub(String Hub){
        DropDownBySelect((returnCreated_omniRPS.SelectHub), DropdownEnum.VISIBLE_TEXT() , Hub);
        ScrollIntoElement(ElementBy(returnCreated_omniRPS.ClickOnSubmitButton));
    }

    public void enterQuantity(String Quantity){
        SendKeyBy(returnCreated_omniRPS.EnterQuantity , Quantity);
    }

    public void enterRMA(String RMA){
        SendKeyBy(returnCreated_omniRPS.EnterRMA , RMA);
    }

    public void enterLocationBarcode(String LocationBarcode){
        SendKeyBy(returnCreated_omniRPS.EnterLocationBarcode , LocationBarcode);
    }

    public void enterWarehouseLocation(String WarehouseLocation){
        SendKeyBy(returnCreated_omniRPS.EnterWarehouseLocation , WarehouseLocation);
    }

    public void enterMISC_1(String MISC_1){
        SendKeyBy(returnCreated_omniRPS.EnterMISC_1 , MISC_1);
    }

    public void enterMISC_2(String MISC_2){
        SendKeyBy(returnCreated_omniRPS.EnterMISC_2 , MISC_2);
    }

    public void enterMISC_3(String MISC_3){
        SendKeyBy(returnCreated_omniRPS.EnterMISC_3 , MISC_3);
    }

    public void enterNotes(String Notes){
        SendKeyBy(returnCreated_omniRPS.EnterNotes , Notes);
    }

    public void ClickOnUploadPhotoBtn(){
        ClickBy(returnCreated_omniRPS.UploadPhotos);
    }

    public void enterStyle(String Style){
        SendKeyBy(returnCreated_omniRPS.EnterStyle , Style);
    }

    public void enterItemNo(String ItemNo){
        SendKeyBy(returnCreated_omniRPS.EnterItemNo , ItemNo);
    }

    public void enterCustomerComment(String CustomerComment){
        SendKeyBy(returnCreated_omniRPS.EnterCustomerComment , CustomerComment);
    }

    public void enterTotalWeight(String TotalWeight){
        SendKeyBy(returnCreated_omniRPS.EnterTotalWeight , TotalWeight);
    }

    public void enterChtComment(String ChtComment){
        SendKeyBy(returnCreated_omniRPS.EnterChtComment , ChtComment);
    }

    public void enterSku(String Sku){
        SendKeyBy(returnCreated_omniRPS.EnterSku , Sku);
    }

    public void enterDescription(String Description){
        SendKeyBy(returnCreated_omniRPS.EnterDescription , Description);
    }

    public void enterValue(String Value){
        SendKeyBy(returnCreated_omniRPS.EnterValue , Value);
    }

    public void enterReason(String Reason){
        SendKeyBy(returnCreated_omniRPS.EnterReason , Reason);
    }

    public void enterSubReason(String SubReason){
        SendKeyBy(returnCreated_omniRPS.EnterSubReason , SubReason);
    }

    public void selectCondition(String Condition){
        DropDownBySelect((returnCreated_omniRPS.SelectCondition), DropdownEnum.VISIBLE_TEXT() , Condition);
    }

    public void enterReviewDescription(String ReviewDescription){
        SendKeyBy(returnCreated_omniRPS.EnterReviewDescription , ReviewDescription);
    }

    public void ClickOnAddNewItemBtn(){
        ClickBy(returnCreated_omniRPS.ClickOnAddNewItemButton);
    }

    public void ClickOnSubmitBtn(){
        ClickBy(returnCreated_omniRPS.ClickOnSubmitButton);
    }

    public void ClickOnResetFormBtn(){
        ClickBy(returnCreated_omniRPS.ClickOnResetFormButton);
    }

}
