package com.techwith.steps.ui;

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

    @When("Click on Tracking And History to Check Report")
    public void clickOnTrackingAndHistoryToCheckReport(){
        trackingAndHistory_omniRPS_methods.ClickOnTrackingAndHistoryMenu();
    }

    @And("Enter Searching Data And Click on Search Button Tracking And History")
    public void enterSearchingDataAndClickOnSearchButtonTrackingAndHistory(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data){
            String search = mapData.get("Search");
            String processingStatus = mapData.get("ProcessingStatus");
            trackingAndHistory_omniRPS_methods.EnterSearch(search);
            trackingAndHistory_omniRPS_methods.SelectTheProcessingStatusForDepotScan(processingStatus);
        }
        trackingAndHistory_omniRPS_methods.ClickSearchButton();
        Thread.sleep(2000);
    }
}
