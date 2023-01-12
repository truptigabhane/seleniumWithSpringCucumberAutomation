package com.techwith.steps.ui;

import com.techwith.ui.models.Dashboard_OReturns_Model;
import com.techwith.ui.models.customUtils.elementCommonUtils;
import com.techwith.ui.pages.Dashboard_OReturns_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

import static com.techwith.webdriver.WebDriverFactory.getDriver;

public class Dashboard_OReturnsSteps {

    @Autowired
    public Dashboard_OReturns_Methods dashboard_oReturns_methods;

    @Autowired
    public Dashboard_OReturns_Model dashboard_oReturns_model;

    @When("Select Companies Option From Manage Dropdown")
    public void selectCompaniesOptionFromManageDropdown() {
        dashboard_oReturns_methods.ClickOnManageMenuDropDown();
        dashboard_oReturns_methods.SelectTheCompaniesMenu();
    }

    @When("Select Translations Option From Manage Dropdown")
    public void selectTranslationsOptionFromManageDropdown() {
        dashboard_oReturns_methods.ClickOnManageMenuDropDown();
        dashboard_oReturns_methods.SelectTheTranslationsMenu();
    }

    @When("Select Groups Option From Manage Dropdown")
    public void selectGroupsOptionFromManageDropdown() {
        dashboard_oReturns_methods.ClickOnManageMenuDropDown();
        dashboard_oReturns_methods.SelectTheGroupsMenu();
    }
    @When("Select FAQ Option From Manage Dropdown")
    public void selectFAQOptionFromManageDropdown() {
        dashboard_oReturns_methods.ClickOnManageMenuDropDown();
        dashboard_oReturns_methods.SelectTheFAQMenu();
    }

    @When("Select Hub Option From Manage Dropdown")
    public void selectHubOptionFromManageDropdown() {
        dashboard_oReturns_methods.ClickOnManageMenuDropDown();
        dashboard_oReturns_methods.SelectTheHubMenu();
    }

    @When("Select Retailer Option From Manage Dropdown")
    public void selectRetailerOptionFromManageDropdown() {
        dashboard_oReturns_methods.ClickOnManageMenuDropDown();
        dashboard_oReturns_methods.SelectTheRetailerMenu();
    }

    @When("Select Carriers Option From Manage Dropdown")
    public void selectCarriersOptionFromManageDropdown() {
        dashboard_oReturns_methods.ClickOnManageMenuDropDown();
        dashboard_oReturns_methods.SelectTheCarriersMenu();
    }
    @When("Select Module Option From Manage Dropdown")
    public void selectModuleOptionFromManageDropdown() {
        dashboard_oReturns_methods.ClickOnManageMenuDropDown();
        dashboard_oReturns_methods.SelectTheModuleMenu();
    }

    @When("Select Role Option From Manage Dropdown")
    public void selectRoleOptionFromManageDropdown() {
        dashboard_oReturns_methods.ClickOnManageMenuDropDown();
        dashboard_oReturns_methods.SelectTheRoleMenu();
    }

    @When("Select User Option From Manage Dropdown")
    public void selectUserOptionFromManageDropdown() {
        dashboard_oReturns_methods.ClickOnManageMenuDropDown();
        dashboard_oReturns_methods.SelectTheUserMenu();
    }

    @When("Select Reporting to see Returns Report")
    public void selectReportingToSeeReturnsReport() {
        dashboard_oReturns_methods.ClickOnReportingMenuDropDown();
        dashboard_oReturns_methods.SelectTheReportingToSearchOrderAndConsignmentNo();
    }

    @When("Select Returns Pending Review to see Returns Report")
    public void selectReturnsPendingReviewToSeeReturnsReport() {
        dashboard_oReturns_methods.ClickOnReportingMenuDropDown();
        dashboard_oReturns_methods.SelectTheReturnsPendingReviewMenu();
    }

    @And("Validate Companies Page URL")
    public void validateCompaniesPageURL() {
        String url = getDriver().getCurrentUrl();
        System.out.println("Companies page url:"+url);
        elementCommonUtils.assertStringValues(url, "https://stage.omniparcelreturns.com/admin/companies");
    }

    @Then("Validate The Open Page")
    public void validateTheOpenPage(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String heading = mapData.get("Heading");
            dashboard_oReturns_model.ValidateDisplay(heading);
        }
    }
}

