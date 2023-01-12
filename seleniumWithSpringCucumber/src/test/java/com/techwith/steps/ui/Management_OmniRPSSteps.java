package com.techwith.steps.ui;

import com.techwith.ui.LocatorsPage.Management_OmniRPS;
import com.techwith.ui.models.Management_OmniRPS_Model;
import com.techwith.ui.models.TrackingAndHistory_OmniRPS_Model;
import com.techwith.ui.models.customUtils.elementCommonUtils;
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

    @Autowired
    public Management_OmniRPS_Model management_omniRPS_model;

    @When("Click on Management to Check Report")
    public void clickOnManagementToCheckReport(){
        management_omniRPS_methods.ClickOnTrackingAndHistoryMenu();
    }

    @And("Enter Searching Data and Click on Search Button in Management")
    public void enterSearchingDataAndClickOnSearchButtonInManagement(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data) {
            String search = mapData.get("Search");
            String processingStatus = mapData.get("ProcessingStatus");
            management_omniRPS_methods.EnterSearch(search);
            trackingAndHistory_omniRPS_methods.SelectTheProcessingStatusForDepotScan(processingStatus);

            management_omniRPS_methods.ClickSearchButton();
            Thread.sleep(2000);

            management_omniRPS_model.ValidateDisplay(search);
        }
    }

    @And("Enter Searching Data and Click on Search Button in Management For Single Scan")
    public void enterSearchingDataAndClickOnSearchButtonInManagementForSingleScan(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data){
            String search = mapData.get("Search");
            String processingStatus = mapData.get("ProcessingStatus");
            String dateRange = mapData.get("DateRange");
            management_omniRPS_methods.EnterSearch(search);
            trackingAndHistory_omniRPS_methods.SelectTheProcessingStatusForDepotScan(processingStatus);
            trackingAndHistory_omniRPS_methods.EnterDateRange(dateRange);

            management_omniRPS_methods.ClickSearchButton();
            Thread.sleep(2000);

            management_omniRPS_model.ValidateDisplay(search);

        }
    }
}
