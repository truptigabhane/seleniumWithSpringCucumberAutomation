package com.techwith.steps.ui;

import com.techwith.ui.models.CompaniesManage_OReturns_Model;
import com.techwith.ui.pages.FAQManage_OReturns_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class FAQManage_OReturns_Steps {

    @Autowired
    public FAQManage_OReturns_Methods faqManage_oReturns_methods;
    @Autowired
    public CompaniesManage_OReturns_Model companiesManage_oReturns_model;

    @And("Click On View FAQs")
    public void ClickOnViewFAQs() throws InterruptedException {
        faqManage_oReturns_methods.ClickOnViewFAQs();
        Thread.sleep(2000);
    }
    @And("Click On Add FAQ")
    public void ClickOnAddFAQ() throws InterruptedException {
        faqManage_oReturns_methods.ClickAddFAQ();
        Thread.sleep(2000);
    }
    @Then("Check And Validate Mandatory Required Fields Error In Add FAQ")
    public void checkAndValidateMandatoryRequiredFieldsErrorInAddFAQ(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {

            String company = mapData.get("Company");
            companiesManage_oReturns_model.ValidateErrorDisplay(company);

            String category = mapData.get("Category");
            companiesManage_oReturns_model.ValidateErrorDisplay(category);

            String question = mapData.get("Question");
            companiesManage_oReturns_model.ValidateErrorDisplay(question);

            String answer = mapData.get("Answer");
            companiesManage_oReturns_model.ValidateErrorDisplay(answer);

            Thread.sleep(3000);
        }
    }
    @Then("Check And Validate Mandatory Required Fields Error In Add Category")
    public void checkAndValidateMandatoryRequiredFieldsErrorInAddCategory(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {

            String company = mapData.get("Company");
            companiesManage_oReturns_model.ValidateErrorDisplay(company);

            String name = mapData.get("Name");
            companiesManage_oReturns_model.ValidateErrorDisplay(name);

            Thread.sleep(3000);
        }
    }
    @And("Take Inputs To Update FAQ")
    public void takeInputsToUpdateFAQ(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String company = mapData.get("Company");
            String category = mapData.get("Category");
            String question = mapData.get("Question");
            String answer = mapData.get("Answer");
            String displayOrder = mapData.get("DisplayOrder");
            String status = mapData.get("Status");
            faqManage_oReturns_methods.FillAddFAQDetails(company , category , question , answer , displayOrder , status );
        }
    }
}
