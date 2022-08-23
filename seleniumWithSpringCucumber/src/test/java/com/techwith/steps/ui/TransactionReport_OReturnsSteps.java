package com.techwith.steps.ui;

import com.techwith.ui.pages.ReturnProcessing_OmniRPS_Methods;
import com.techwith.ui.pages.TransactionReport_OReturns_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class TransactionReport_OReturnsSteps {

    @Autowired
    public TransactionReport_OReturns_Methods transactionReport_oReturns_methods;

    @And("Search Created Order and Consignment No")
    public void searchCreatedOrderAndConsignmentNo(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String consignment = mapData.get("Consignment");
            transactionReport_oReturns_methods.FillSearch(consignment);
        }
        transactionReport_oReturns_methods.ClickSearchButton();
        Thread.sleep(2000);
    }
}