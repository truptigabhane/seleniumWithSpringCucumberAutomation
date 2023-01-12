package com.techwith.steps.ui;

import com.techwith.ui.models.CompaniesManage_OReturns_Model;
import com.techwith.ui.pages.RoleManage_OReturns_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class RoleManage_OReturns_Steps {

    @Autowired
    public RoleManage_OReturns_Methods roleManage_oReturns_methods;
    @Autowired
    public CompaniesManage_OReturns_Model companiesManage_oReturns_model;

    @And("Click On Add Role")
    public void ClickOnAddRole() throws InterruptedException {
        roleManage_oReturns_methods.ClickOnAddRole();
        Thread.sleep(2000);
    }
    @And("Click On View Role")
    public void ClickOnViewRole() throws InterruptedException {
        roleManage_oReturns_methods.ClickOnViewRole();
        Thread.sleep(2000);
    }
    @Then("Check And Validate Mandatory Required Fields Error In Add Role")
    public void checkAndValidateMandatoryRequiredFieldsErrorInAddRole(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {

            String company = mapData.get("Company");
            companiesManage_oReturns_model.ValidateErrorDisplay(company);

            String role = mapData.get("Role");
            companiesManage_oReturns_model.ValidateErrorDisplay(role);

            String description = mapData.get("Description");
            companiesManage_oReturns_model.ValidateErrorDisplay(description);

            Thread.sleep(3000);
        }
    }
    @And("Add Role By Adding Data Fields")
    public void addRoleByAddingDataFields(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String company = mapData.get("Company");
            String role = mapData.get("Role");
            String description = mapData.get("Description");
            roleManage_oReturns_methods.FillAddRoleDetails(company , role , description);
//            roleManage_oReturns_methods.CheckModuleAccess();
        }
    }
    @Then("Validate Created Role Details")
    public void validateCreatedRoleDetails(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String role = mapData.get("Role");
            String description = mapData.get("Description");
            companiesManage_oReturns_model.ValidateChangeType(role);
            companiesManage_oReturns_model.ValidateChangeType(description);
        }
    }

}
