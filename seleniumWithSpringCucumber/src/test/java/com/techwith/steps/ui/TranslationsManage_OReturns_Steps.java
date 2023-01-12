package com.techwith.steps.ui;

import com.techwith.ui.models.CompaniesManage_OReturns_Model;
import com.techwith.ui.models.UserManage_OReturns_Model;
import com.techwith.ui.pages.TransactionReport_OReturns_Methods;
import com.techwith.ui.pages.TranslationsManage_OReturns_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class TranslationsManage_OReturns_Steps {

    @Autowired
    public TranslationsManage_OReturns_Methods translationsManage_oReturns_methods;
    @Autowired
    public CompaniesManage_OReturns_Model companiesManage_oReturns_model;
    @Autowired
    public UserManage_OReturns_Model userManage_oReturns_model;
    @Autowired
    public TransactionReport_OReturns_Methods transactionReport_oReturns_methods;

    @And("Click On Add Translation")
    public void clickOnAddTranslation() throws InterruptedException {
        translationsManage_oReturns_methods.clickAddTranslation();
        Thread.sleep(2000);
    }
    @And("Click On View Translation")
    public void clickOnViewTranslation() throws InterruptedException {
        translationsManage_oReturns_methods.ClickViewTranslation();
        Thread.sleep(2000);
    }
    @And("Click On Delete Button")
    public void ClickOnDeleteButton() throws InterruptedException {
        translationsManage_oReturns_methods.ClickOnDeleteBtn();
        Thread.sleep(2000);
    }
    @And("Take Inputs To Update Translations")
    public void takeInputsToUpdateTranslations(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String type = mapData.get("Type");
            String item = mapData.get("Item");
            String field = mapData.get("Field");
            String french = mapData.get("French");
            String german = mapData.get("German");
            String spanish = mapData.get("Spanish");
            translationsManage_oReturns_methods.FillAddTranslationsDetails(type , item , field , french , german , spanish );
        }
    }
    @And("Click On Edit Button")
    public void ClickOnEditButton() throws InterruptedException {
        translationsManage_oReturns_methods.ClickOnEditBtn();
        Thread.sleep(2000);
    }
    @And("Click On Submit Btn")
    public void ClickOnSubmitBtn() throws InterruptedException {
        translationsManage_oReturns_methods.ClickOnSubmitButton();
        Thread.sleep(2000);
    }
    @Then("Validate Searched Translation Details")
    public void validateSearchedTranslationDetails(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String type = mapData.get("Type");
            String field = mapData.get("Field");
            userManage_oReturns_model.ValidateDisplay(type);
            userManage_oReturns_model.ValidateDisplay(field);
        }
    }
    @Then("Check And Validate Mandatory Required Fields Error In Translations")
    public void checkAndValidateMandatoryRequiredFieldsErrorInTranslations(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {

            String type = mapData.get("Type");
            companiesManage_oReturns_model.ValidateErrorDisplay(type);

            String item = mapData.get("Item");
            companiesManage_oReturns_model.ValidateErrorDisplay(item);

            String field = mapData.get("Field");
            companiesManage_oReturns_model.ValidateErrorDisplay(field);

            String french = mapData.get("French");
            companiesManage_oReturns_model.ValidateErrorDisplay(french);

            String german = mapData.get("German");
            companiesManage_oReturns_model.ValidateErrorDisplay(german);

            String spanish = mapData.get("Spanish");
            companiesManage_oReturns_model.ValidateErrorDisplay(spanish);

            Thread.sleep(3000);
        }
    }
}
