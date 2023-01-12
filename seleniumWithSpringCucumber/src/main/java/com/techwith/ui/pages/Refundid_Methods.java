package com.techwith.ui.pages;

import com.techwith.ui.models.Refundid_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Refundid_Methods {

    @Autowired
    public Refundid_Model refundid_model;

    public void EnterRefundidDetails(String storeName , String orderNo , String email) {
        refundid_model.selectStore(storeName);
        refundid_model.enterOrderNo(orderNo);
        refundid_model.enterEmail(email);
    }

    public void ClickContinueBtn(){
        refundid_model.clickContinueButton();
    }
}
