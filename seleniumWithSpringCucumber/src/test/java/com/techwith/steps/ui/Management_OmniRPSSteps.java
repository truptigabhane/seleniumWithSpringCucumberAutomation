package com.techwith.steps.ui;

import com.techwith.ui.pages.Management_OmniRPS_Methods;
import com.techwith.ui.pages.TrackingAndHistory_OmniRPS_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class Management_OmniRPSSteps {

    @Autowired
    public Management_OmniRPS_Methods management_omniRPS_methods;

    @Autowired
    TrackingAndHistory_OmniRPS_Methods trackingAndHistory_omniRPS_methods;

    @When("Click on Management to Check Report")
    public void clickOnManagementToCheckReport(){
        management_omniRPS_methods.ClickOnTrackingAndHistoryMenu();
    }

    @And("Enter Searching Data and Click on Search Button in Management")
    public void enterSearchingDataAndClickOnSearchButtonInManagement(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data){
            String search = mapData.get("Search");
            String processingStatus = mapData.get("ProcessingStatus");
            management_omniRPS_methods.EnterSearch(search);
            trackingAndHistory_omniRPS_methods.SelectTheProcessingStatusForDepotScan(processingStatus);
        }
        management_omniRPS_methods.ClickSearchButton();
        Thread.sleep(2000);
    }
}
