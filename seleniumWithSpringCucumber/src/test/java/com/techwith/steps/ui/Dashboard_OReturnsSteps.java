package com.techwith.steps.ui;

import com.techwith.ui.pages.Dashboard_OReturns_Methods;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class Dashboard_OReturnsSteps {

    @Autowired
    public Dashboard_OReturns_Methods dashboard_oReturns_methods;

    @When("Select Reporting to see Transaction Report")
    public void selectReportingToSeeTransactionReport() {
        dashboard_oReturns_methods.ClickOnReportingMenu();
        dashboard_oReturns_methods.SelectTheReportingToSearchOrderAndConsignmentNo();
    }
}
