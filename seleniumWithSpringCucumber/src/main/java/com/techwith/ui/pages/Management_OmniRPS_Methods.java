package com.techwith.ui.pages;


import com.techwith.ui.models.Management_OmniRPS_Model;
import com.techwith.ui.models.TrackingAndHistory_OmniRPS_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Management_OmniRPS_Methods {

    @Autowired
    public TrackingAndHistory_OmniRPS_Model trackingAndHistory_omniRPS_model;

    @Autowired
    public Management_OmniRPS_Model management_omniRPS_model;

    public void ClickOnTrackingAndHistoryMenu(){
        management_omniRPS_model.ClickManagementMenu();
    }

    public void EnterSearch(String Search) {
        trackingAndHistory_omniRPS_model.EnterTheSearch(Search);
    }

    public void ClickSearchButton(){
        trackingAndHistory_omniRPS_model.ClickSearchBtn();
    }
}
