package com.techwith.steps.ui;

import com.techwith.ui.pages.ReturnCreated_OmniRPS_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class ReturnCreated_OmniRPSSteps {

    @Autowired
    public ReturnCreated_OmniRPS_Methods returnCreated_omniRPS_methods;

    @And("Validate Order and Consignment No and Enter Details to Successfully Receive Return")
    public void validateOrderAndConsignmentNoAndEnterDetailsToSuccessfullyReceiveReturn(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData : data) {
            String consignment = mapData.get("Consignment");
            String orderNo = mapData.get("OrderNo");
            String hub = mapData.get("Hub");
            String quantity = mapData.get("Quantity");
            String rma = mapData.get("RMA");
            String warehouseLocation = mapData.get("WarehouseLocation");
            String misc_1 = mapData.get("MISC_1");
            String misc_2 = mapData.get("MISC_2");
            String misc_3 = mapData.get("MISC_3");
            String notes = mapData.get("Notes");
            String style = mapData.get("Style");
            String itemNo = mapData.get("ItemNo");
            String sku = mapData.get("Sku");
            String description = mapData.get("Description");
            String value = mapData.get("Value");
            String reason = mapData.get("Reason");
            String subReason = mapData.get("SubReason");
            String condition = mapData.get("Condition");
            String reviewDescription = mapData.get("ReviewDescription");
//            String returnAction =  mapData.get("ReturnAction");

//            returnCreated_omniRPS_methods.ValidateConsignmentNo(consignment);
//            returnCreated_omniRPS_methods.ValidateOrderNumber(orderNo);
//            returnCreated_omniRPS_methods.FillTheReturnCreatedDetails(hub , quantity , rma , warehouseLocation , misc_1 , misc_2 , misc_3 , notes , style , itemNo , sku , description , value , reason , subReason , condition , reviewDescription);
            returnCreated_omniRPS_methods.FillTheReturnCreatedDetails(hub , quantity , style , itemNo , sku , description , value , reason);

        }
        returnCreated_omniRPS_methods.ClickOnSubmitButton();
    }
}
