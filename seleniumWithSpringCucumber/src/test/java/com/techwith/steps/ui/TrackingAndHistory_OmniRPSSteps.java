package com.techwith.steps.ui;

import com.techwith.ui.models.TrackingAndHistory_OmniRPS_Model;
import com.techwith.ui.pages.TrackingAndHistory_OmniRPS_Methods;
import com.techwith.webdriver.WebDriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class TrackingAndHistory_OmniRPSSteps extends WebDriverFactory {

    @Autowired
    TrackingAndHistory_OmniRPS_Methods trackingAndHistory_omniRPS_methods;

    @Autowired
    TrackingAndHistory_OmniRPS_Model trackingAndHistory_omniRPS_model;

    @When("Click on Tracking And History to Check Report")
    public void clickOnTrackingAndHistoryToCheckReport(){
        trackingAndHistory_omniRPS_methods.ClickOnTrackingAndHistoryMenu();
    }

    @And("Enter Searching Data And Click on Search Button Tracking And History")
    public void enterSearchingDataAndClickOnSearchButtonTrackingAndHistory(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data) {
            String search = mapData.get("Search");
            String processingStatus = mapData.get("ProcessingStatus");
            trackingAndHistory_omniRPS_methods.EnterSearch(search);
            trackingAndHistory_omniRPS_methods.SelectTheProcessingStatusForDepotScan(processingStatus);

            trackingAndHistory_omniRPS_methods.ClickSearchButton();
            Thread.sleep(2000);

            trackingAndHistory_omniRPS_model.ValidateDisplay(search);
        }
    }

    @And("Enter Searching Data And Click on Search Button Tracking And History For Single Scan")
    public void enterSearchingDataAndClickOnSearchButtonTrackingAndHistoryForSingleScan(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data){
            String search = mapData.get("Search");
            String processingStatus = mapData.get("ProcessingStatus");
            String dateRange = mapData.get("DateRange");
            trackingAndHistory_omniRPS_methods.EnterSearch(search);
            trackingAndHistory_omniRPS_methods.SelectTheProcessingStatusForDepotScan(processingStatus);
            trackingAndHistory_omniRPS_methods.EnterDateRange(dateRange);

            trackingAndHistory_omniRPS_methods.ClickSearchButton();
            Thread.sleep(2000);

            trackingAndHistory_omniRPS_model.ValidateDisplay(search);
        }
    }
}
