package com.techwith.steps.ui;

import com.techwith.ui.pages.ConfirmYourDetails_Methods;
import com.techwith.ui.pages.RetailerReturns_Methods;
import com.techwith.webdriver.WebDriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class ConfirmYourDetailsSteps extends WebDriverFactory {

    @Autowired
    public ConfirmYourDetails_Methods confirmYourDetailsMethods;

    @Autowired
    public RetailerReturns_Methods retailerReturnsMethods;

    @And("Enter Confirm Your Details")
    public void enterConfirmYourDetails(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data){
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
            String extraField = mapData.get("ExtraField");
            confirmYourDetailsMethods.FillTheFormDetails(fullName, country, zipcode, building, street, city, state, phoneNumber, extraField);
        }
        retailerReturnsMethods.clickOnNextArrowButton();
    }
}
