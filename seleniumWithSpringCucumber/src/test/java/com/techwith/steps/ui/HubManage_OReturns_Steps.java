package com.techwith.steps.ui;

import com.techwith.ui.LocatorsPage.CompaniesManage_OReturns;
import com.techwith.ui.LocatorsPage.HubManage_OReturns;
import com.techwith.ui.models.CompaniesManage_OReturns_Model;
import com.techwith.ui.models.customUtils.elementCommonUtils;
import com.techwith.ui.pages.CompaniesManage_OReturns_Methods;
import com.techwith.ui.pages.HubManage_OReturns_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

import static com.techwith.webdriver.WebDriverFactory.getDriver;

public class HubManage_OReturns_Steps {

    @Autowired
    public HubManage_OReturns_Methods hubManage_oReturns_methods;
    @Autowired
    public CompaniesManage_OReturns_Model companiesManage_oReturns_model;
    @Autowired
    public CompaniesManage_OReturns_Methods companiesManage_oReturns_methods;
    @Autowired
    public HubManage_OReturns hubManage_oReturns;
    @Autowired
    public CompaniesManage_OReturns companiesManage_oReturns;
    @Autowired
    public elementCommonUtils elementCommonUtils;

    @And("Click On Add Hub")
    public void clickOnAddHub() throws InterruptedException {
        hubManage_oReturns_methods.ClickOnAddHub();
        Thread.sleep(1000);
    }
    @And("Click On Hub Change Log")
    public void clickOnHubChangeLog() throws InterruptedException {
        hubManage_oReturns_methods.ClickOnHubChangeLog();
        Thread.sleep(1000);
    }
    @And("Validate Page URL")
    public void validatePageURL(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String ActualURL = mapData.get("URL");
            String url = getDriver().getCurrentUrl();
            System.out.println("Companies page url:" + url);
            elementCommonUtils.assertStringValues(url, ActualURL);

        }
    }

    @Then("Check And Validate Mandatory Required Fields Errors")
    public void checkAndValidateMandatoryRequiredFieldsErrors(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {

            String companyName = mapData.get("CompanyName");
            companiesManage_oReturns_model.ValidateErrorDisplay(companyName);

            String name = mapData.get("Name");
            companiesManage_oReturns_model.ValidateErrorDisplay(name);

            String country = mapData.get("Country");
            companiesManage_oReturns_model.ValidateErrorDisplay(country);

            String suburb = mapData.get("Suburb");
            companiesManage_oReturns_model.ValidateErrorDisplay(suburb);

            String state_City = mapData.get("State/City");
            companiesManage_oReturns_model.ValidateErrorDisplay(state_City);

            String email = mapData.get("Email");
            companiesManage_oReturns_model.ValidateErrorDisplay(email);
        }
    }
    @And("Add Hub By Adding Data Fields")
    public void addHubByAddingDataFields(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String company = mapData.get("Company");
            String name = mapData.get("Name");
            String country = mapData.get("Country");
            String suburb = mapData.get("Suburb");
            String state_City = mapData.get("State/City");
            String postcode = mapData.get("Postcode");
            String email = mapData.get("Email");
            hubManage_oReturns_methods.FillAddHubDeatils(company , name , country , suburb , state_City , postcode , email);
        }
    }
    @Then("Validate Fields Are Empty Or Not")
    public void validateFieldsAreEmptyOrNot() {
        var company = getDriver().findElement(hubManage_oReturns.SelectCompany);
        var name = getDriver().findElement(hubManage_oReturns.EnterName);
        var country = getDriver().findElement(companiesManage_oReturns.enterCountry);
        var suburb = getDriver().findElement(companiesManage_oReturns.enterSuburb);
        var state_City = getDriver().findElement(companiesManage_oReturns.enterState_City);
        var postcode = getDriver().findElement(companiesManage_oReturns.enterPostcode);
        var email = getDriver().findElement(companiesManage_oReturns.enterEmail);

        elementCommonUtils.inputFieldIsEmptyOrNot(company);
        elementCommonUtils.inputFieldIsEmptyOrNot(name);
        elementCommonUtils.inputFieldIsEmptyOrNot(country);
        elementCommonUtils.inputFieldIsEmptyOrNot(suburb);
        elementCommonUtils.inputFieldIsEmptyOrNot(state_City);
        elementCommonUtils.inputFieldIsEmptyOrNot(postcode);
        elementCommonUtils.inputFieldIsEmptyOrNot(email);
    }
    @Then("Validate Success Alert")
    public void validateSuccessAlert(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String successAlert = mapData.get("SuccessAlert");
            String message = getDriver().findElement(By.xpath("//div[@class='alert alert-success']")).getText();
            elementCommonUtils.assertStringValues(successAlert, message);
        }
    }
    @Then("Validate Failed Alert")
    public void validateFailedAlert(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String failedAlert = mapData.get("FailedAlert");
            String message = getDriver().findElement(By.xpath("//strong[normalize-space()='Email already exists with this email.']")).getText();
            elementCommonUtils.assertStringValues(failedAlert, message);
        }
    }
    @Then("Validate Searched Hub Change Log Details")
    public void validateSearchedHubChangeLogDetails(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String company = mapData.get("Company");
            String hub = mapData.get("Hub");
            String changeType = mapData.get("ChangeType");
            companiesManage_oReturns_model.ValidateChangeType(company);
            companiesManage_oReturns_model.ValidateChangeType(hub);
            companiesManage_oReturns_model.ValidateChangeType(changeType);
        }
    }
    @And("Click On View Hubs To Search Added Hub")
    public void clickOnViewHubsToSearchAddedHub() {
        hubManage_oReturns_methods.ClickOnViewHubs();
    }
    @And("Search From Input In Hub")
    public void searchFromInputInHub(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String search = mapData.get("Search");
            String company = mapData.get("Company");
            companiesManage_oReturns_methods.FillSearch(search);
            companiesManage_oReturns_methods.selectCompany(company);
            companiesManage_oReturns_methods.ClickSearchButton();
        }
    }
    @Then("Validate Searched Hub Details")
    public void validateSearchedHubDetails(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String company = mapData.get("Company");
            String name = mapData.get("Name");
            companiesManage_oReturns_model.ValidateChangeType(company);
            companiesManage_oReturns_model.ValidateChangeType(name);
        }
    }
    @And("Update Hub By Modifying Data Fields")
    public void updateHubByModifyingDataFields(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String name = mapData.get("Name");
            hubManage_oReturns_methods.UpdateHubDeatils(name);
        }
    }
}
