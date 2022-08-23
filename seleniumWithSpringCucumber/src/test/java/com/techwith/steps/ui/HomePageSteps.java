package com.techwith.steps.ui;

import com.techwith.ui.pages.BookReturns_Methods;
import com.techwith.ui.pages.HomePage_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;


public class HomePageSteps {

    @Autowired
    public HomePage_Methods homePageMethods;

    @Autowired
    public BookReturns_Methods bookReturnsMethods;

    @Given("Click on Create Return Find the Mentioned Retailer Name and Open It")
    public void clickOnCreateReturnFindTheMentionedRetailerNameAndOpenIt(DataTable dataTable) {
        homePageMethods.ClickOnCreateAReturnButton();
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data){
            String retailerName = mapData.get("RetailerName");
            bookReturnsMethods.SearchAndSelectRetailer(retailerName);
        }

    }


}
