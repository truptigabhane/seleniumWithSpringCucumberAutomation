package com.techwith.ui.pages;

import com.techwith.ui.models.WouldYouLikeToReturns_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Component
public class WouldYouLikeToReturns_Methods {

    @Autowired
    public WouldYouLikeToReturns_Model wouldYouLikeToReturnsModel;


    public void validateTheOrderNumber(String ExpectedOrderNumber){
        String OrderNumber = wouldYouLikeToReturnsModel.FetchAndValidateOrderNumber();
        assertEquals(ExpectedOrderNumber , OrderNumber);
    }


    public void validateTheEmailID(String emailID){
        String EmailID = wouldYouLikeToReturnsModel.FetchAndValidateEmailID();
        assertEquals(emailID , EmailID);
    }

    public void selectProductCheckBox(String ProductNo){
        wouldYouLikeToReturnsModel.selectOrderNumberCheckbox(ProductNo);
    }

    public void clickOnProductReturnReasonDropDown(String ProductReturnDropDown){
        wouldYouLikeToReturnsModel.clickOnReturnReasonDropDown(ProductReturnDropDown);
    }

    public void selectReasonFromTheDropDown(String returnReason){
        wouldYouLikeToReturnsModel.selectReturnReasonFromTheDropDown(returnReason);
    }

    public void clickOnReturnOptionDropDown(String returnOption){
        wouldYouLikeToReturnsModel.clickOnReturnReasonOptionDropDown(returnOption);
    }

    public void selectOptionFromTheReturnOptionDropDown(int returnOption , String OptionName){
        wouldYouLikeToReturnsModel.selectReturnReasonOptionTheDropDown(returnOption, OptionName);
    }

}
