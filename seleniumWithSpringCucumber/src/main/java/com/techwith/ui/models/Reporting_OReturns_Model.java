package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.Reporting_OReturns;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;

@Component
public class Reporting_OReturns_Model {

    @Autowired
    public Reporting_OReturns reporting_oReturns;

    public void ClickExportButton(){ ClickBy(reporting_oReturns.ClickExportButton);}
}
