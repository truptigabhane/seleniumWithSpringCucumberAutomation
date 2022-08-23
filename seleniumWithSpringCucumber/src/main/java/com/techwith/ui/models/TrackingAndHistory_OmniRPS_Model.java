package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.TrackingAndHistory_OmniRPS;
import com.techwith.ui.models.customUtils.DropdownEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.*;

@Component
public class TrackingAndHistory_OmniRPS_Model {

    @Autowired
    public TrackingAndHistory_OmniRPS trackingAndHistory_omniRPS;

    public void ClickTrackingAndHistoryMenu(){
        ClickBy(trackingAndHistory_omniRPS.ClickTrackingAndHistory);
    }

    public void EnterTheSearch(String Search){
        SendKeyBy(trackingAndHistory_omniRPS.EnterSearch , Search);
    }

    public void SelectTheConvertToTimezone(String ConvertToTimezone){
        DropDownBySelect((trackingAndHistory_omniRPS.SelectConvertToTimezone), DropdownEnum.VISIBLE_TEXT() , ConvertToTimezone);
    }

    public void SelectTheProcessingStatus(String ProcessingStatus){
        DropDownBySelect((trackingAndHistory_omniRPS.SelectProcessingStatus), DropdownEnum.VISIBLE_TEXT() , ProcessingStatus);
    }

    public void SelectTheReturnReason(String ReturnReason){
        DropDownBySelect((trackingAndHistory_omniRPS.SelectReturnReason), DropdownEnum.VISIBLE_TEXT() , ReturnReason);
    }

    public void ClickSearchBtn(){
        ClickBy(trackingAndHistory_omniRPS.ClickSearchButton);
    }

    public void SelectTheRetailer(String Retailer){
        DropDownBySelect((trackingAndHistory_omniRPS.SelectRetailer), DropdownEnum.VISIBLE_TEXT() , Retailer);
    }

    public void SelectTheSubRetailer(String SubRetailer){
        DropDownBySelect((trackingAndHistory_omniRPS.SelectSubRetailer), DropdownEnum.VISIBLE_TEXT() , SubRetailer);
    }

    public void SelectTheHub(String Hub){
        DropDownBySelect((trackingAndHistory_omniRPS.SelectHub), DropdownEnum.VISIBLE_TEXT() , Hub);
    }

    public void ClickExportBtn(){
        ClickBy(trackingAndHistory_omniRPS.ClickExportButton);
    }
}
