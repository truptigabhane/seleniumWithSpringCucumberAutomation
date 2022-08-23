package com.techwith.steps.ui;

import com.techwith.ui.pages.Success_OReturns_Method;
import com.techwith.webdriver.WebDriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class SuccessOReturnsSteps extends WebDriverFactory {

    @Autowired
    public Success_OReturns_Method success_oReturns_method;

    @And("Validate the Success Return and Create Consignment")
    public void validateTheSuccessReturnAndCreateConsignment(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String orderNumber = mapData.get("OrderNumber");
            String name = mapData.get("Name");
            success_oReturns_method.ValidateOrderNumber_Success(orderNumber);
            success_oReturns_method.ValidateName_Success(name);
        }
        Thread.sleep(3000);
    }
}
