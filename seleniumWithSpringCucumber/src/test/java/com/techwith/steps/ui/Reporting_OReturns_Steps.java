package com.techwith.steps.ui;

import com.techwith.ui.models.UserManage_OReturns_Model;
import com.techwith.ui.pages.Reporting_OReturns_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class Reporting_OReturns_Steps {

    @Autowired
    public Reporting_OReturns_Methods reporting_oReturns_methods;
    @Autowired
    public UserManage_OReturns_Model userManage_oReturns_model;

    @Then("Validate Returns Report Details")
    public void validateReturnsReportDetails(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String retailer = mapData.get("Retailer");
            String name = mapData.get("Name");
            userManage_oReturns_model.ValidateDisplay(retailer);
            userManage_oReturns_model.ValidateDisplay(name);
        }
    }
    @And("Click On Export Button")
    public void clickOnExportButton() throws InterruptedException {
        reporting_oReturns_methods.ClickOnExportButton();
        Thread.sleep(2000);
    }
}
