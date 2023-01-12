package com.techwith.steps.ui;

import com.techwith.ui.pages.Refundid_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class Refundid_Steps {

    @Autowired
    public Refundid_Methods refundid_methods;

    @And("Enter Refundid Details and Click On Continue Button")
    public void enterRefundidDetailsAndClickOnContinueButton (DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data){
            String storeName = mapData.get("StoreName");
            String orderNo = mapData.get("OrderNo");
            String email = mapData.get("Email");
            refundid_methods.EnterRefundidDetails(storeName , orderNo , email  + "@sstechsystem.com");
        }
        refundid_methods.ClickContinueBtn();
    }
}
