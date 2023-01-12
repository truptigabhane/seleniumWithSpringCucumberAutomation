package com.techwith.steps.ui;

import com.techwith.ui.models.CompaniesManage_OReturns_Model;
import com.techwith.ui.pages.ModuleManage_OReturns_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class ModuleManage_OReturns_Steps {

    @Autowired
    public ModuleManage_OReturns_Methods moduleManage_oReturns_methods;
    @Autowired
    public CompaniesManage_OReturns_Model companiesManage_oReturns_model;

    @And("Click On Add Module")
    public void clickOnAddCompany() throws InterruptedException {
        moduleManage_oReturns_methods.ClickOnAddModule();
        Thread.sleep(2000);
    }
    @Then("Check And Validate Mandatory Required Fields Error In Add Module")
    public void checkAndValidateMandatoryRequiredFieldsErrorInAddModule(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {

            String moduleName = mapData.get("ModuleName");
            companiesManage_oReturns_model.ValidateErrorDisplay(moduleName);

            String description = mapData.get("Description");
            companiesManage_oReturns_model.ValidateErrorDisplay(description);

            Thread.sleep(3000);
        }
    }
    @And("Add Module By Adding Data Fields")
    public void addModuleByAddingDataFields(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String moduleName = mapData.get("ModuleName");
            String description = mapData.get("Description");
            moduleManage_oReturns_methods.FillAddModuleDeatils(moduleName , description);
        }
    }
    @And("Click On View Module")
    public void clickOnViewModule() {
        moduleManage_oReturns_methods.ClickOnViewModule();
    }
    @Then("Validate Created Module Details")
    public void validateCreatedModuleDetails(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String moduleName = mapData.get("ModuleName");
            String description = mapData.get("Description");
            companiesManage_oReturns_model.ValidateChangeType(moduleName);
            companiesManage_oReturns_model.ValidateChangeType(description);
        }
    }
}
