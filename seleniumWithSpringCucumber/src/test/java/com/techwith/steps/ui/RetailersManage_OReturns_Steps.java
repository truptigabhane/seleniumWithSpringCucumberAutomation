package com.techwith.steps.ui;

import com.techwith.ui.models.CompaniesManage_OReturns_Model;
import com.techwith.ui.pages.CompaniesManage_OReturns_Methods;
import com.techwith.ui.pages.RetailersManage_OReturns_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

import static com.techwith.webdriver.WebDriverFactory.getDriver;

public class RetailersManage_OReturns_Steps {

    @Autowired
    public RetailersManage_OReturns_Methods retailersManage_oReturns_methods;

    @Autowired
    public CompaniesManage_OReturns_Methods companiesManage_oReturns_methods;

    @Autowired
    public CompaniesManage_OReturns_Model companiesManage_oReturns_model;

    @And("Search Retailers")
    public void searchRetailers(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String search = mapData.get("Search");
            String company = mapData.get("Company");
            companiesManage_oReturns_methods.FillSearch(search);
            companiesManage_oReturns_methods.selectCompany(company);
            companiesManage_oReturns_methods.ClickSearchButton();
        }
    }

    @And("Click On Add Retailer")
    public void clickOnAddRetailer() throws InterruptedException {
        retailersManage_oReturns_methods.ClickOnAddRetailer();
        Thread.sleep(1000);
    }

    @And("Click On Retailer Change Log")
    public void clickOnRetailerChangeLog() throws InterruptedException {
        retailersManage_oReturns_methods.ClickOnRetailerChangeLog();
        Thread.sleep(1000);
    }

    @And("Click On Seko Demo Retailer")
    public void clickOnSekoDemoRetailer() {
        retailersManage_oReturns_methods.ClickOnEditBtnRetailer41();
    }

    @And("Click On Assign Hub")
    public void clickOnAssignHub() {
        retailersManage_oReturns_methods.ClickOnAssignHub();
    }

    @And("Click On Country Fees")
    public void clickOnCountryFees() {
        retailersManage_oReturns_methods.ClickOnCountryFees();
    }

    @And("Click On Payment Gateway")
    public void clickOnPaymentGateway() {
        retailersManage_oReturns_methods.ClickOnPaymentGateway();
    }

    @And("Click On View Retailers")
    public void clickOnViewRetailers(){
        retailersManage_oReturns_methods.ClickOnViewRetailers();
    }
    @And("Open Navigated Page After Navigation")
    public void openNavigatedPageAfterNavigation() throws InterruptedException {
            getDriver().navigate().forward();
            Thread.sleep(2000);
    }
    @And("Click On Save And Next Button")
    public void clickOnSaveAndNextButton(){
        retailersManage_oReturns_methods.ClickOnSaveAndNextButton();
    }
    @And("Delete Retailer By Clicking On Delete")
    public void deleteRetailerByClickingOnDelete(){
        retailersManage_oReturns_methods.ClickOnDeleteButton();
    }
    @And("Click Save And Next Button")
    public void clickSaveAndNextButton(){
        retailersManage_oReturns_methods.ClickOnTheSaveAndNextButton();
    }
    @And("Click Save And Next Btn")
    public void clickSaveAndNextBtn(){
        retailersManage_oReturns_methods.clickSaveAndNextBtn();
    }
    @And("Click Save And Publish Button")
    public void clickSaveAndPublishButton(){
        retailersManage_oReturns_methods.ClickSaveAndPublishButton();
    }
    @And("Click Retailer Preview Button")
    public void clickRetailerPreviewButton(){
        retailersManage_oReturns_methods.ClickRetailerPreviewButton();
    }
    @And("Click On Save Button")
    public void clickOnSaveButton(){
        retailersManage_oReturns_methods.ClickOnSaveButton();
    }

    @Then("Check And Validate Mandatory Required Fields")
    public void checkAndValidateMandatoryRequiredFields(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {

            String company = mapData.get("Company");
            companiesManage_oReturns_model.ValidateErrorDisplay(company);

            String logo = mapData.get("Logo");
            companiesManage_oReturns_model.ValidateErrorDisplay(logo);

            String retailerName = mapData.get("RetailerName");
            companiesManage_oReturns_model.ValidateErrorDisplay(retailerName);

            Thread.sleep(3000);
        }
    }

    @And("Add Retailer By Adding Data Fields")
    public void addRetailerByAddingDataFields(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String company = mapData.get("Company");
            String logo = mapData.get("Logo");
            String retailerName = mapData.get("RetailerName");
            retailersManage_oReturns_methods.FillAddRetailerDetails(company , logo , retailerName);
        }
    }
    @And("Assign Hubs")
    public void assignHubs(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String addHub = mapData.get("AddHub");
            String omniParcelKey = mapData.get("OmniParcelKey");
            retailersManage_oReturns_methods.FillAssignHubsDetails(addHub , omniParcelKey);
        }
    }
    @And("Fill Assigned Hub Details")
    public void fillAssignedHubDetails(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String multiLanguage = mapData.get("MultiLanguage");
            String gatewayType = mapData.get("GatewayType");
            String preRootGateWay = mapData.get("PreRootGateWay");
            String postRootGateWay = mapData.get("PostRootGateWay");
            String subGateWay = mapData.get("SubGateWay");
            String priority = mapData.get("Priority");
            String rootGateWay = preRootGateWay+" | "+postRootGateWay;
            retailersManage_oReturns_methods.FillAssignedHubDetails(multiLanguage , gatewayType , rootGateWay , subGateWay ,priority);
        }
    }
    @And("Validate And Fill Country Fees Details")
    public void validateAndFillCountryFeesDetails(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String preHubName = mapData.get("PreHubName");
            String postHubName = mapData.get("PostHubName");
            String carrier = mapData.get("Carrier");
            String returnType = mapData.get("ReturnType");
            String storeCredit = mapData.get("StoreCredit");
            String exchange = mapData.get("Exchange");
            String suburbLabel = mapData.get("SuburbLabel");
            String stateCityLabel = mapData.get("StateCityLabel");
            String postcodeLabel = mapData.get("PostcodeLabel");
            String hubName = preHubName+" | "+postHubName;
            retailersManage_oReturns_methods.ValidateAndFillCountryFeesDetails(returnType , storeCredit , exchange , suburbLabel , stateCityLabel , postcodeLabel);
        }
    }
    @And("Update Retailer By Modifying Data Fields")
    public void updateRetailerByModifyingDataFields(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String backgroundImage = mapData.get("BackgroundImage");
            String favicon = mapData.get("Favicon");
            String orderMethod = mapData.get("OrderMethod");
            retailersManage_oReturns_methods.FillEditRetailerDetails(backgroundImage , favicon , orderMethod);
        }
    }
}
