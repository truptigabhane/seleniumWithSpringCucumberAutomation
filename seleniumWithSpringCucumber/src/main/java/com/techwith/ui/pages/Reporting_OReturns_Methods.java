package com.techwith.ui.pages;

import com.techwith.ui.models.Reporting_OReturns_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Reporting_OReturns_Methods {

    @Autowired
    public Reporting_OReturns_Model reporting_oReturns_model;

    public void ClickOnExportButton(){
        reporting_oReturns_model.ClickExportButton();
    }
}
