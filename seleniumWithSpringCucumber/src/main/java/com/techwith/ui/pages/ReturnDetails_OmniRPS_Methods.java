package com.techwith.ui.pages;

import com.techwith.ui.models.ReturnDetails_OmniRPS_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReturnDetails_OmniRPS_Methods {

    @Autowired
    public ReturnDetails_OmniRPS_Model returnDetails_omniRPS_model;

    public void FillTheFormDetails(String hub , String consignment) {
        returnDetails_omniRPS_model.selectHub(hub);
        returnDetails_omniRPS_model.enterConsignment(consignment);
    }

    public void ClickOnSubmitButton(){
        returnDetails_omniRPS_model.ClickOnSubmitBtn();
    }
}
