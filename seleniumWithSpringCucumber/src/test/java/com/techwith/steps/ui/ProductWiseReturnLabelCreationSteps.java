package com.techwith.steps.ui;

import com.techwith.ui.pages.ProductWiseReturnLabelCreation_Methods;
import com.techwith.ui.pages.RetailerReturns_Methods;
import com.techwith.webdriver.WebDriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class ProductWiseReturnLabelCreationSteps extends WebDriverFactory {

    @Autowired
    public ProductWiseReturnLabelCreation_Methods productWiseReturnLabelCreation_methods;

    @Autowired
    public RetailerReturns_Methods retailerReturnsMethods;

    @And("Enter Confirm Your Details For Order Wise Return Label Creation")
    public void EnterConfirmYourDetailsForOrderWiseReturnLabelCreation(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data){
            String productValue = mapData.get("ProductValue");
            String description = mapData.get("Description");
            String returnReason = mapData.get("ReturnReason");
            String returnAction = mapData.get("ReturnAction");
            String fullName = mapData.get("FullName");
            String country = mapData.get("Country");
            String zipcode = mapData.get("ZipCode");
            String building = mapData.get("Building");
            String street = mapData.get("Street");
            String city = mapData.get("City");
            getDriver().switchTo().defaultContent();
            String state = mapData.get("State");
            getDriver().switchTo().defaultContent();
            String phoneNumber = mapData.get("PhoneNumber");
            getDriver().switchTo().defaultContent();
            String extraField = mapData.get("ExtraField");
            System.out.println(productValue+description + returnReason +returnAction + fullName+ country+ zipcode+ building+ street+ city+ state+ phoneNumber);
            productWiseReturnLabelCreation_methods.FillFormDetails(productValue,description ,returnReason ,returnAction , fullName, country, zipcode, building, street, city, state, phoneNumber);
        }
        retailerReturnsMethods.clickOnNextArrowButton();
    }
}
