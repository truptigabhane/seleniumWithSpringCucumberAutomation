package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.ReturnProcessing_OmniRPS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;
import static com.techwith.ui.models.customUtils.elementCommonUtils.SendKeyBy;

@Component
public class ReturnProcessing_OmniRPS_Model {

    @Autowired
    public ReturnProcessing_OmniRPS returnProcessing_omniRPS;

    public void ClickOnProcessingMenu(){
        ClickBy(returnProcessing_omniRPS.ClickOnProcessing);
    }
    public void ClickOnSubProcessingMenu(){
        ClickBy(returnProcessing_omniRPS.ClickOnSubProcessing);
    }
    public void enterConsignment(String ConsignmentNo){
        SendKeyBy(returnProcessing_omniRPS.EnterConsignmentNo , ConsignmentNo);
    }
}
