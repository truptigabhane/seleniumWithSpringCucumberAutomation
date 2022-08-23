package com.techwith.steps.ui;

import com.techwith.ui.pages.ManualReturn_OmniRPS_Methods;
import com.techwith.ui.pages.ReturnCreated_OmniRPS_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class ManualReturn_OmniRPSSteps {

    @Autowired
    public ManualReturn_OmniRPS_Methods manualReturn_omniRPS_methods;

    @Autowired
    public ReturnCreated_OmniRPS_Methods returnCreated_omniRPS_methods;

    @And("Enter Manual Return Details to Successfully Receive Return")
    public void enterManualReturnDetailsToSuccessfullyReceiveReturn(DataTable dataTable) {
        manualReturn_omniRPS_methods.clickOnScanRetailerDropDown("");
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String retailer = mapData.get("Retailer");
            String orderNo = mapData.get("OrderNo");
            String quantity = mapData.get("Quantity");
            String rma = mapData.get("RMA");
            String itemNo = mapData.get("ItemNo");
            String sku = mapData.get("Sku");
            String value = mapData.get("Value");
            String condition = mapData.get("Condition");
            String returnAction = mapData.get("ReturnAction");
            manualReturn_omniRPS_methods.selectScanRetailerFromTheDropDown(retailer);

            manualReturn_omniRPS_methods.FillTheManualReturnDetails( orderNo , quantity , rma , itemNo , sku , value , condition , returnAction);
        }
        returnCreated_omniRPS_methods.ClickOnSubmitButton();
    }
}
