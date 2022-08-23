package com.techwith.steps.ui;

import com.techwith.ui.pages.RetailerReturns_Methods;
import com.techwith.webdriver.WebDriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class RetailerReturnsSteps extends WebDriverFactory {

    @Autowired
    public RetailerReturns_Methods retailerReturnsMethods;


    @When("Enter the Order Number and EmailID and Click On Next")
    public void enterTheOrderNumberAndEmailIDAndClickOnNext(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data){
            String orderNumber = mapData.get("OrderNumber");
            String emailID = mapData.get("EmailID");
            retailerReturnsMethods.findTheReturnFromTheShopifyOrderNumber(orderNumber , emailID + "@sstechsystem.com");
        }
        retailerReturnsMethods.clickOnNextArrowButton();
    }

}
