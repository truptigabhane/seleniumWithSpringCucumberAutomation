package com.techwith.steps.ui;

import com.techwith.ui.LocatorsPage.UserManage_OReturns;
import com.techwith.ui.models.CompaniesManage_OReturns_Model;
import com.techwith.ui.models.UserManage_OReturns_Model;
import com.techwith.ui.models.customUtils.elementCommonUtils;
import com.techwith.ui.pages.CompaniesManage_OReturns_Methods;
import com.techwith.ui.pages.UserManage_OReturns_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

import static com.techwith.webdriver.WebDriverFactory.getDriver;

public class UserManage_OReturns_Steps {

    @Autowired
    public UserManage_OReturns_Methods userManage_oReturns_methods;
    @Autowired
    public CompaniesManage_OReturns_Model companiesManage_oReturns_model;
    @Autowired
    public UserManage_OReturns userManage_oReturns;
    @Autowired
    public CompaniesManage_OReturns_Methods companiesManage_oReturns_methods;
    @Autowired
    public UserManage_OReturns_Model userManage_oReturns_model;

    @And("Click On Add User")
    public void clickOnAddUser() throws InterruptedException {
        userManage_oReturns_methods.ClickOnAddUser();
        Thread.sleep(2000);
    }
    @Then("Check And Validate Mandatory Required Fields Error In Add User")
    public void checkAndValidateMandatoryRequiredFieldsErrorInAddUser(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {

            String firstName = mapData.get("FirstName");
            companiesManage_oReturns_model.ValidateErrorDisplay(firstName);

            String email = mapData.get("Email");
            companiesManage_oReturns_model.ValidateErrorDisplay(email);

            String password = mapData.get("Password");
            companiesManage_oReturns_model.ValidateErrorDisplay(password);

            String company = mapData.get("Company");
            companiesManage_oReturns_model.ValidateErrorDisplay(company);

            String role = mapData.get("Role");
            companiesManage_oReturns_model.ValidateErrorDisplay(role);

            String retailer = mapData.get("Retailer");
            companiesManage_oReturns_model.ValidateErrorDisplay(retailer);

            String group = mapData.get("Group");
            companiesManage_oReturns_model.ValidateErrorDisplay(group);

            Thread.sleep(3000);
        }
    }
    @Then("Validate Fields Are Empty By Clicking On Reset Button")
    public void validateFieldsAreEmptyByClickingOnResetButton() {
        var firstName = getDriver().findElement(userManage_oReturns.EnterFirstName);
        var lastName = getDriver().findElement(userManage_oReturns.EnterLastName);
        var email = getDriver().findElement(userManage_oReturns.EnterEmail);
        var password = getDriver().findElement(userManage_oReturns.EnterPassword);
        var company = getDriver().findElement(userManage_oReturns.SelectCompanyDropDown);
        var role = getDriver().findElement(userManage_oReturns.SelectRoleDropDown);
        var retailer = getDriver().findElement(userManage_oReturns.SelectRetailerDropDown);
        var group = getDriver().findElement(userManage_oReturns.SelectGroupDropDown);

        elementCommonUtils.inputFieldIsEmptyOrNot(firstName);
        elementCommonUtils.inputFieldIsEmptyOrNot(lastName);
        elementCommonUtils.inputFieldIsEmptyOrNot(email);
        elementCommonUtils.inputFieldIsEmptyOrNot(password);
        elementCommonUtils.inputFieldIsEmptyOrNot(company);
        elementCommonUtils.inputFieldIsEmptyOrNot(role);
        elementCommonUtils.inputFieldIsEmptyOrNot(retailer);
        elementCommonUtils.inputFieldIsEmptyOrNot(group);
    }
    @And("Add User By Adding Data Fields")
    public void AddUserByAddingDataFields(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String firstName = mapData.get("FirstName");
            String lastName = mapData.get("LastName");
            String email = mapData.get("Email");
            String password = mapData.get("Password");
            String company = mapData.get("Company");
            String role = mapData.get("Role");
            String retailer = mapData.get("Retailer");
//            String group = mapData.get("Group");
            userManage_oReturns_methods.FillAddUserDetails(firstName , lastName , email , password , company , role , retailer);
        }
    }
    @And("Click On View User To Search Added User")
    public void clickOnViewUserToSearchAddedUser() {
        userManage_oReturns_methods.ClickOnViewUser();
    }
    @And("Click On Export To Exel Button")
    public void clickOnExportToExelButton() {
        userManage_oReturns_methods.ClickOnExportToExelButton();
    }
    @And("Search User From Input")
    public void searchUserFromInput(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String search = mapData.get("Search");
            String company = mapData.get("Company");
            String role = mapData.get("Role");
            userManage_oReturns_methods.FillSearch(search);
            userManage_oReturns_methods.SelectCompany(company);
            userManage_oReturns_methods.SelectRole(role);
            companiesManage_oReturns_methods.ClickSearchButton();
        }
    }
    @And("Click On Search Button To Search")
    public void clickOnSearchButtonToSearch() {
            companiesManage_oReturns_methods.ClickSearchButton();
    }
    @Then("Validate Searched User Details")
    public void validateSearchedUserDetails(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String firstName = mapData.get("FirstName");
            String lastName = mapData.get("LastName");
            String company = mapData.get("Company");
            String role = mapData.get("Role");
            userManage_oReturns_model.ValidateDisplay(firstName);
            userManage_oReturns_model.ValidateDisplay(lastName);
            userManage_oReturns_model.ValidateDisplay(company);
            userManage_oReturns_model.ValidateDisplay(role);
        }
    }
    @Then("Validate No Data Available Message")
    public void validateNoDataAvailableMessage(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String validateDataTable = mapData.get("DataTable");
            userManage_oReturns_model.ValidateTableDisplay(validateDataTable);
        }
    }
    @And("Click On Delete Icon")
    public void clickOnDeleteIcon() {
        userManage_oReturns_model.ClickOnDelete();
    }
    @And("Click On Yes Button To Confirm Delete")
    public void clickOnYesButtonToConfirmDelete () {
        userManage_oReturns_model.ClickOnYes();
    }
    @And("Click On No Button To Confirm No Delete")
    public void clickOnNoButtonToConfirmNoDelete() {
        userManage_oReturns_model.ClickOnNo();
    }
    @And("Click On User Change Log")
    public void clickOnUserChangeLog() {
        userManage_oReturns_methods.clickOnUserChangeLog();
    }
    @And("Validate User Details Are Strikeout")
    public void validateUserDetailsAreStrikeout() throws InterruptedException {
            Thread.sleep(3000);
            getDriver().findElement(By.xpath("//tr[@class='odd strikeout' or @class='even strikeout']")).isDisplayed();
    }
}
