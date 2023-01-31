package com.techwith.steps.ui;

import com.techwith.ui.LocatorsPage.OuterReport_ORPS;
import com.techwith.ui.models.CompaniesManage_OReturns_Model;
import com.techwith.ui.models.customUtils.elementCommonUtils;
import com.techwith.ui.pages.OuterReport_ORPS_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

import static com.techwith.webdriver.WebDriverFactory.getDriver;

public class OuterReport_ORPS_Steps {

    @Autowired
    public OuterReport_ORPS_Methods outerReport_orps_methods;
    @Autowired
    public CompaniesManage_OReturns_Model companiesManage_oReturns_model;
    @Autowired
    public OuterReport_ORPS outerReport_orps;

    @And("Enter Search Details To Search Outer")
    public void EnterSearchDetailsToSearchOuter(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String search = mapData.get("Search");
            String outerStatus = mapData.get("OuterStatus");
            String retailer = mapData.get("Retailer");
            String hub = mapData.get("Hub");
            String reports = mapData.get("Reports");
            outerReport_orps_methods.FillSearchDetails(search , outerStatus , retailer , hub , reports);
        }
    }
    @And("Click On Search Button In Outer Reports")
    public void clickOnSearchButtonInOuterReports() {
        outerReport_orps_methods.ClickSearchBtn();
    }
    @And("Click On Cancel Button In Outer Report")
    public void clickOnCancelButtonInOuterReport() {
        outerReport_orps_methods.ClickOnCancelButtonInOuterReport();
    }
    @And("Click On X Button In Outer Report")
    public void clickOnXButtonInOuterReport() {
        outerReport_orps_methods.ClickOnXButtonInOuterReport();
    }
    @And("Click On Confirm Button In Outer Report")
    public void clickOnConfirmButtonInOuterReport() {
        outerReport_orps_methods.ClickOnConfirmButtonInOuterReport();
    }
    @Then("Validate Success Alert For Outers")
    public void validateCreateANewOuterMessage() {
        getDriver().findElement(By.xpath("//div[@id='outer_msg']")).isDisplayed();
    }
    @And("Click On Outer Review Icon")
    public void clickOnOuterReviewIcon() {
        outerReport_orps_methods.ClickOnOuterReviewIcon();
    }
    @And("Click On Download Outer Manifest Icon")
    public void clickOnDownloadOuterManifestIcon() {
        outerReport_orps_methods.ClickOnDownloadOuterManifestIcon();
    }
    @And("Click On Mark as Delivered Icon")
    public void clickOnMarkAsDeliveredIcon() throws InterruptedException {
        outerReport_orps_methods.ClickOnMarkAsDeliveredIcon();
        Thread.sleep(2000);
    }
    @Then("Validate Searched Outer Details")
    public void validateSearchedOuterDetails(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String outerId = mapData.get("OuterId");
            String outerStatus = mapData.get("OuterStatus");
            String hub = mapData.get("Hub");
            companiesManage_oReturns_model.ValidateChangeType(outerId);
            companiesManage_oReturns_model.ValidateChangeType(outerStatus);
            companiesManage_oReturns_model.ValidateChangeType(hub);
        }
    }
    @Then("Validate Close Outer Details")
    public void validateCloseOuterDetails(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String outerId = mapData.get("OuterId");
            String outerStatus = mapData.get("OuterStatus");
            String hub = mapData.get("Hub");
            String outerCannote = mapData.get("OuterCannote");
            companiesManage_oReturns_model.ValidateChangeType(outerCannote);
            companiesManage_oReturns_model.ValidateChangeType(outerId);
            companiesManage_oReturns_model.ValidateChangeType(outerStatus);
            companiesManage_oReturns_model.ValidateChangeType(hub);
            Thread.sleep(2000);
        }
    }
    @Then("Validate Close Outer Details In Hub")
    public void validateCloseOuterDetailsInHub(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String outerId = mapData.get("OuterId");
            String outerStatus = mapData.get("OuterStatus");
            String hub = mapData.get("Hub");
            companiesManage_oReturns_model.ValidateChangeType(outerId);
            companiesManage_oReturns_model.ValidateChangeType(outerStatus);
            companiesManage_oReturns_model.ValidateChangeType(hub);
            Thread.sleep(2000);
        }
    }
    @And("Click Create Outer Consignment Dropdown Menu")
    public void clickCreateOuterConsignmentDropdownMenu() throws InterruptedException {
        outerReport_orps_methods.ClickCreateOuterConsignmentDropdownMenu();
        Thread.sleep(1000);
    }
    @And("Click Processing Dropdown Menu")
    public void clickProcessingDropdownMenu() throws InterruptedException {
        outerReport_orps_methods.ClickProcessingDropdownMenu();
        Thread.sleep(1000);
    }
    @And("Click On Sender Reset Button")
    public void clickOnSenderResetButton() throws InterruptedException {
        outerReport_orps_methods.ClickOnSenderResetButton();
        Thread.sleep(2000);
    }
    @And("Click On Receiver Reset Button")
    public void clickOnReceiverResetButton() throws InterruptedException {
        outerReport_orps_methods.ClickOnReceiverResetButton();
        Thread.sleep(2000);
    }

    @Then("Validate Sender Fields Are Empty")
    public void validateSenderFieldsAreEmpty() {
        var country = getDriver().findElement(outerReport_orps.EnterCountry);
        var name = getDriver().findElement(outerReport_orps.EnterName);
        var building = getDriver().findElement(outerReport_orps.EnterBuilding);
        var street = getDriver().findElement(outerReport_orps.EnterStreet);
        var suburb = getDriver().findElement(outerReport_orps.EnterSuburb);
        var stateCity = getDriver().findElement(outerReport_orps.EnterStateCity);
        var postcode = getDriver().findElement(outerReport_orps.EnterPostcode);
        var contact = getDriver().findElement(outerReport_orps.EnterContact);
        var phone = getDriver().findElement(outerReport_orps.EnterPhone);
        var email = getDriver().findElement(outerReport_orps.EnterEmail);

        elementCommonUtils.inputFieldIsEmptyOrNot(country);
        elementCommonUtils.inputFieldIsEmptyOrNot(name);
        elementCommonUtils.inputFieldIsEmptyOrNot(building);
        elementCommonUtils.inputFieldIsEmptyOrNot(street);
        elementCommonUtils.inputFieldIsEmptyOrNot(suburb);
        elementCommonUtils.inputFieldIsEmptyOrNot(stateCity);
        elementCommonUtils.inputFieldIsEmptyOrNot(postcode);
        elementCommonUtils.inputFieldIsEmptyOrNot(contact);
        elementCommonUtils.inputFieldIsEmptyOrNot(phone);
        elementCommonUtils.inputFieldIsEmptyOrNot(email);
    }
    @Then("Validate Receiver Fields Are Empty")
    public void validateReceiverFieldsAreEmpty() {
        var country = getDriver().findElement(outerReport_orps.EnterReceiverCountry);
        var name = getDriver().findElement(outerReport_orps.EnterReceiverName);
        var building = getDriver().findElement(outerReport_orps.EnterReceiverBuilding);
        var street = getDriver().findElement(outerReport_orps.EnterReceiverStreet);
        var suburb = getDriver().findElement(outerReport_orps.EnterReceiverSuburb);
        var stateCity = getDriver().findElement(outerReport_orps.EnterReceiverStateCity);
        var postcode = getDriver().findElement(outerReport_orps.EnterReceiverPostcode);
        var contact = getDriver().findElement(outerReport_orps.EnterReceiverContact);
        var phone = getDriver().findElement(outerReport_orps.EnterReceiverPhone);
        var email = getDriver().findElement(outerReport_orps.EnterReceiverEmail);
        var deliveryInstructions = getDriver().findElement(outerReport_orps.EnterReceiverDeliveryInstructions);

        elementCommonUtils.inputFieldIsEmptyOrNot(country);
        elementCommonUtils.inputFieldIsEmptyOrNot(name);
        elementCommonUtils.inputFieldIsEmptyOrNot(building);
        elementCommonUtils.inputFieldIsEmptyOrNot(street);
        elementCommonUtils.inputFieldIsEmptyOrNot(suburb);
        elementCommonUtils.inputFieldIsEmptyOrNot(stateCity);
        elementCommonUtils.inputFieldIsEmptyOrNot(postcode);
        elementCommonUtils.inputFieldIsEmptyOrNot(contact);
        elementCommonUtils.inputFieldIsEmptyOrNot(phone);
        elementCommonUtils.inputFieldIsEmptyOrNot(email);
        elementCommonUtils.inputFieldIsEmptyOrNot(deliveryInstructions);
    }
    @And("Enter Search Details To Search Outer In Hub User")
    public void enterSearchDetailsToSearchOuterInHubUser(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String search = mapData.get("Search");
            String outerStatus = mapData.get("OuterStatus");
            String retailer = mapData.get("Retailer");
            String reports = mapData.get("Reports");
            outerReport_orps_methods.FillSearchDetailsInHubUser(search , outerStatus , retailer , reports);
        }
    }
}
