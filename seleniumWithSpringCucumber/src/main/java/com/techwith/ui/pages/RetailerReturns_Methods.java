package com.techwith.ui.pages;

import com.techwith.ui.models.RetailerReturn_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RetailerReturns_Methods {

    @Autowired
    public RetailerReturn_Model retailerReturnModel;

    public void findTheReturnFromTheShopifyOrderNumber(String OrderNumber, String EmailID ){
        retailerReturnModel.enterOrderNumber(OrderNumber);
        retailerReturnModel.enterEmailID(EmailID);
    }

    public void clickOnNextArrowButton(){
        retailerReturnModel.ClickOnNextArrowButton();
    }
}
