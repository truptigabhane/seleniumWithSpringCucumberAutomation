package com.techwith.ui.pages;

import com.techwith.ui.models.ReturnProcessing_OmniRPS_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReturnProcessing_OmniRPS_Methods {

    @Autowired
    public ReturnProcessing_OmniRPS_Model returnProcessing_omniRPS_model;

    public void ClickProcessingMenu(){
        returnProcessing_omniRPS_model.ClickOnProcessingMenu();
    }

    public void ClickProcessingSubMenu(){
        returnProcessing_omniRPS_model.ClickOnSubProcessingMenu();
    }

    public void FillConsignment(String consignmentNo) {
        returnProcessing_omniRPS_model.enterConsignment(consignmentNo);
    }
}
