package com.techwith.steps.ui;

import com.techwith.ui.models.CarriersManage_OReturns_Model;
import com.techwith.ui.models.CompaniesManage_OReturns_Model;
import com.techwith.ui.pages.CarriersManage_OReturns_Methods;
import com.techwith.ui.pages.CompaniesManage_OReturns_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class CarriersManage_OReturns_Steps {

    @Autowired
    public CarriersManage_OReturns_Methods carriersManage_oReturns_methods;
    @Autowired
    public CompaniesManage_OReturns_Model companiesManage_oReturns_model;
    @Autowired
    public CarriersManage_OReturns_Model carriersManage_oReturns_model;
    @Autowired
    public CompaniesManage_OReturns_Methods companiesManage_oReturns_methods;

    @And("Click On Add Carriers")
    public void clickOnAddCarriers() throws InterruptedException {
        carriersManage_oReturns_methods.ClickOnAddCarriers();
        Thread.sleep(2000);
    }
    @And("Click On View Carriers")
    public void clickOnViewCarriers() throws InterruptedException {
        carriersManage_oReturns_methods.ClickOnViewCarriers();
        Thread.sleep(2000);
    }
    @Then("Check And Validate Mandatory Required Fields Error In Add Carriers")
    public void checkAndValidateMandatoryRequiredFieldsErrorInAddCarriers(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {

            String carrierName = mapData.get("CarrierName");
            companiesManage_oReturns_model.ValidateErrorDisplay(carrierName);

            String omniParcelID = mapData.get("OmniParcelID");
            companiesManage_oReturns_model.ValidateErrorDisplay(omniParcelID);

            String omniParcelCarrierName = mapData.get("OmniParcelCarrierName");
            companiesManage_oReturns_model.ValidateErrorDisplay(omniParcelCarrierName);

            String hub = mapData.get("Hub");
            companiesManage_oReturns_model.ValidateErrorDisplay(hub);

            Thread.sleep(3000);
        }
    }
    @And("Add Carriers By Adding Data Fields")
    public void addCarriersByAddingDataFields(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String carrierName = mapData.get("CarrierName");
            String omniParcelID = mapData.get("OmniParcelID");
            String omniParcelCarrierName = mapData.get("OmniParcelCarrierName");
            carriersManage_oReturns_methods.FillAddCarriersDetails(carrierName , omniParcelID , omniParcelCarrierName);
        }
    }
    @And("Enter Carrier Details To Search Carrier In View Carriers")
    public void enterCarrierDetailsToSearchCarrierInViewCarriers(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String search = mapData.get("Search");
            carriersManage_oReturns_methods.FillSearchCarriersDetails(search);
        }
    }
    @Then("Validate Searched Carrier Details In View Carrier")
    public void validateSearchedCarrierDetailsInViewCarrier(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String OPCarrierID = mapData.get("OPCarrierID");
            String hub = mapData.get("Hub");
            companiesManage_oReturns_model.ValidateChangeType(OPCarrierID);
            companiesManage_oReturns_model.ValidateChangeType(hub);
        }
    }
    @Then("Validate Error Message")
    public void validateErrorMessage(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String error = mapData.get("Error");
            carriersManage_oReturns_model.ValidateDuplicateErrorDisplay(error);
        }
    }
    @And("Click On Edit Icon")
    public void clickOnEditIcon() throws InterruptedException {
        carriersManage_oReturns_methods.ClickOnEditIcon();
        Thread.sleep(2000);
    }
    @And("Click On Carrier Change Log")
    public void clickOnCarrierChangeLog() throws InterruptedException {
        carriersManage_oReturns_methods.clickOnCarrierChangeLog();
        Thread.sleep(2000);
    }
    @And("Enter Carrier Change Log Details to Search")
    public void enterCarrierChangeLogDetailsToSearch(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String search = mapData.get("Search");
            String changeType = mapData.get("ChangeType");
            String company = mapData.get("Company");
            String startDate = mapData.get("StartDate");
            String endDate = mapData.get("EndDate");
            carriersManage_oReturns_methods.FillChangeLogDetails(search , changeType , company);
            companiesManage_oReturns_methods.SelectDateToSearch(startDate , endDate );
            companiesManage_oReturns_methods.ClickSearchButton();
        }
    }
    @Then("Validate Log Details PopUp In Carriers")
    public void validateLogDetailsPopUpInCarriers(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String popUp = mapData.get("PopUp");
            carriersManage_oReturns_model.ValidatePopUpHead(popUp);
        }
    }
    @Then("Validate Searched Carrier Change Log Details")
    public void validateSearchedCarrierChangeLogDetails(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String logType = mapData.get("LogType");
            String changeType = mapData.get("ChangeType");
            companiesManage_oReturns_model.ValidateChangeType(logType);
            companiesManage_oReturns_model.ValidateChangeType(changeType);
        }
    }
}
