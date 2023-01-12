package com.techwith.ui.pages;

import com.techwith.ui.models.TrackingAndHistory_OmniRPS_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackingAndHistory_OmniRPS_Methods {

    @Autowired
    public TrackingAndHistory_OmniRPS_Model trackingAndHistory_omniRPS_model;

    public void ClickOnTrackingAndHistoryMenu(){
        trackingAndHistory_omniRPS_model.ClickTrackingAndHistoryMenu();
    }

    public void EnterSearch(String Search) {
        trackingAndHistory_omniRPS_model.EnterTheSearch(Search);
    }

    public void SelectTheProcessingStatusForDepotScan(String ProcessingStatus) {
        trackingAndHistory_omniRPS_model.SelectTheProcessingStatus(ProcessingStatus);
    }

    public void EnterDateRange(String DateRange) {
        trackingAndHistory_omniRPS_model.EnterTheDateRange(DateRange);
    }

    public void ClickSearchButton(){
        trackingAndHistory_omniRPS_model.ClickSearchBtn();
    }

}
