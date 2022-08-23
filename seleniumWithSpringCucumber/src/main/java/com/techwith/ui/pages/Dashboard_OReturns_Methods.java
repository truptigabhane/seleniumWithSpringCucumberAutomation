package com.techwith.ui.pages;

import com.techwith.ui.models.Dashboard_OReturns_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dashboard_OReturns_Methods {

    @Autowired
    public Dashboard_OReturns_Model dashboard_oReturns_model;

    public void ClickOnReportingMenu(){
        dashboard_oReturns_model.ClickReportingMenu();
    }

    public void SelectTheReportingToSearchOrderAndConsignmentNo(){
        dashboard_oReturns_model.SelectTheReportingToSearch();
    }
}
