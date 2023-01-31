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
    public void ClickOnCancelButtonInOuterReport(){
        ClickBy(outerReport_orps.ClickOnCancelButtonInOuterReport);
    }
    public void ClickOnXButtonInOuterReport(){
        ClickBy(outerReport_orps.ClickOnXButtonInOuterReport);
    }
    public void ClickOnConfirmButtonInOuterReport(){
        ClickBy(outerReport_orps.ClickOnConfirmButtonInOuterReport);
    }
    public void ClickOnOuterReviewIcon(){
        ClickBy(outerReport_orps.ClickOnOuterReviewIcon);
    }
    public void ClickOnDownloadOuterManifestIcon(){
        ClickBy(outerReport_orps.ClickOnDownloadOuterManifestIcon);
    }
    public void ClickOnMarkAsDeliveredIcon(){
        ClickBy(outerReport_orps.ClickOnMarkAsDeliveredIcon);
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
