package com.techwith.steps.ui;

import com.techwith.ui.LocatorsPage.GroupManage_OReturns;
import com.techwith.ui.LocatorsPage.RoleManage_OReturns;
import com.techwith.ui.models.CompaniesManage_OReturns_Model;
import com.techwith.ui.models.customUtils.elementCommonUtils;
import com.techwith.ui.pages.GroupManage_OReturns_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

import static com.techwith.webdriver.WebDriverFactory.getDriver;

public class GroupManage_OReturns_Steps {

    @Autowired
    public  GroupManage_OReturns_Methods groupManage_oReturns_methods;
    @Autowired
    public CompaniesManage_OReturns_Model companiesManage_oReturns_model;
    @Autowired
    public GroupManage_OReturns groupManage_oReturns;
    @Autowired
    public RoleManage_OReturns roleManage_oReturns;

    @And("Click On Add Group")
    public void clickOnAddGroup() throws InterruptedException {
        groupManage_oReturns_methods.clickOnAddGroup();
        Thread.sleep(2000);
    }
    @Then("Check And Validate Mandatory Required Fields Error In Add Group")
    public void checkAndValidateMandatoryRequiredFieldsErrorInAddGroup(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {

            String groupName = mapData.get("GroupName");
            companiesManage_oReturns_model.ValidateErrorDisplay(groupName);

            String company = mapData.get("Company");
            companiesManage_oReturns_model.ValidateErrorDisplay(company);

            String retailer = mapData.get("Retailer");
            companiesManage_oReturns_model.ValidateErrorDisplay(retailer);

            Thread.sleep(3000);
        }
    }
    @And("Add Group By Adding Data Fields")
    public void addGroupByAddingDataFields(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String groupName = mapData.get("GroupName");
            String company = mapData.get("Company");
            String retailer = mapData.get("Retailer");
            groupManage_oReturns_methods.FillAddGroupDeatils(groupName , company , retailer );
        }
    }
    @And("Add Group By Adding Data Fields To Update")
    public void addGroupByAddingDataFieldsToUpdate(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String groupName = mapData.get("GroupName");
            String company = mapData.get("Company");
            String retailer = mapData.get("Retailer");
            groupManage_oReturns_methods.FillAddGroupDeatilsForUpdate(groupName , company , retailer );
        }
    }
    @Then("Validate Fields Are Empty In Add Group")
    public void validateFieldsAreEmptyInAddGroup() {
        var companyName = getDriver().findElement(groupManage_oReturns.EnterGroupName);
        var country = getDriver().findElement(roleManage_oReturns.SelectCompany);
        var suburb = getDriver().findElement(groupManage_oReturns.EnterRetailer);

        elementCommonUtils.inputFieldIsEmptyOrNot(companyName);
        elementCommonUtils.inputFieldIsEmptyOrNot(country);
        elementCommonUtils.inputFieldIsEmptyOrNot(suburb);
    }
    @And("Click On View Group")
    public void clickOnViewGroup() {
        groupManage_oReturns_methods.ClickOnViewGroup();
    }
    @And("Click On Edit Icon In Group")
    public void clickOnEditIconInGroup() {
        groupManage_oReturns_methods.clickOnEditIconInGroup();
    }
    @And("Click On Delete Icon In Group")
    public void clickOnDeleteIconInGroup() {
        groupManage_oReturns_methods.clickOnDeleteIconInGroup();
    }
    @Then("Validate Created Group Details")
    public void validateCreateGroupDetails(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String groupName = mapData.get("GroupName");
            String retailer = mapData.get("Retailer");
            companiesManage_oReturns_model.ValidateChangeType(groupName);
            companiesManage_oReturns_model.ValidateChangeType(retailer);
        }
    }
}
