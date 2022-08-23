package com.techwith.steps.ui;

import com.techwith.ui.pages.ReturnDetails_OmniRPS_Methods;
import com.techwith.ui.pages.ReturnProcessing_OmniRPS_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class ReturnDetails_OmniRPSSteps {

    @Autowired
    public ReturnDetails_OmniRPS_Methods returnDetails_omniRPS_methods;

    @When("Select Hub and Enter Consignment to Add Depot Scan Event")
    public void selectHubAndEnterConsignmentToAddDepotScanEvent(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data) {
            String hub = mapData.get("Hub");
            String consignment = mapData.get("Consignment");
            returnDetails_omniRPS_methods.FillTheFormDetails(hub , consignment);
        }
        returnDetails_omniRPS_methods.ClickOnSubmitButton();
    }
}
