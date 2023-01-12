package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.OuterReport_ORPS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;
import static com.techwith.ui.models.customUtils.elementCommonUtils.SendKeyBy;

@Component
public class OuterReport_ORPS_Model {

    @Autowired
    public OuterReport_ORPS outerReport_orps;

    public void EnterSearch(String Search){ SendKeyBy(outerReport_orps.EnterSearch , Search);}
    public void ClickSearchBtn(){
        ClickBy(outerReport_orps.ClickSearchBtn);
    }
    public void ClickCreateOuterConsignmentDropdownMenu(){
        ClickBy(outerReport_orps.ClickCreateOuterConsignmentDropdownMenu);
    }
    public void ClickProcessingDropdownMenu(){
        ClickBy(outerReport_orps.ClickProcessingDropdownMenu);
    }
    public void ClickOnSenderResetButton(){
        ClickBy(outerReport_orps.ClickOnSenderResetButton);
    }
    public void ClickOnReceiverResetButton(){
        ClickBy(outerReport_orps.ClickOnReceiverResetButton);
    }
}
