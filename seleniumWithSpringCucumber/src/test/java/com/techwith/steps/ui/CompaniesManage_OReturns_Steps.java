package com.techwith.steps.ui;

import com.techwith.excel.ExcelReader;
import com.techwith.ui.LocatorsPage.CompaniesManage_OReturns;
import com.techwith.ui.models.CompaniesManage_OReturns_Model;
import com.techwith.ui.models.customUtils.elementCommonUtils;
import com.techwith.ui.pages.CompaniesManage_OReturns_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static com.techwith.webdriver.WebDriverFactory.getDriver;

public class CompaniesManage_OReturns_Steps {

    @Autowired
    public CompaniesManage_OReturns_Methods companiesManage_oReturns_methods;
    @Autowired
    public CompaniesManage_OReturns_Model companiesManage_oReturns_model;
    @Autowired
    public CompaniesManage_OReturns companiesManage_oReturns;
    @Autowired
    public elementCommonUtils elementCommonUtils;

    @And("Search From Input")
    public void searchFromInput(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String search = mapData.get("Search");
            companiesManage_oReturns_methods.FillSearch(search);
            companiesManage_oReturns_methods.ClickSearchButton();
        }
    }
    @And("Export From Input")
    public void exportFromInput(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String search = mapData.get("Search");
            companiesManage_oReturns_methods.FillSearch(search);
            companiesManage_oReturns_methods.ClickExportButton();
        }
    }
    @Given("user fills the form from given sheetname {string} and rownumber {int}")
    public void user_fills_the_form_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws IOException, InvalidFormatException {
        ExcelReader reader = new ExcelReader();
        List<Map<String,String>> testData =
                reader.getData("D:/OmniParcelReturns.xlsx", sheetName);

        String orderNumber = testData.get(rowNumber).get("orderNo");
        String email = testData.get(rowNumber).get("email");

//        retailerReturnsMethods.findTheReturnFromTheShopifyOrderNumber(orderNumber , email);

    }

    @And("Click On Add Company")
    public void clickOnAddCompany() throws InterruptedException {
            companiesManage_oReturns_methods.ClickOnAddCompany();
            Thread.sleep(2000);
    }

    @And("Click On Company Change Log")
    public void clickOnCompanyChangeLog() throws InterruptedException {
            companiesManage_oReturns_methods.ClickOnCompanyChangeLog();
            Thread.sleep(2000);
    }

    @And("Enter Change Log Details to Search")
    public void enterChangeLogDetailsToSearch(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String search = mapData.get("Search");
            String changeType = mapData.get("ChangeType");
            String company = mapData.get("Company");
            String startDate = mapData.get("StartDate");
            String endDate = mapData.get("EndDate");
//            companiesManage_oReturns_methods.FillChangeLogDetailsToSearch(search , changeType , company , startDate , endDate);
            companiesManage_oReturns_methods.FillChangeLogDetails(search , changeType , company);
            companiesManage_oReturns_methods.SelectDateToSearch(startDate , endDate );
            companiesManage_oReturns_methods.ClickSearchButton();
        }
    }

    @And("Enter Disabled Company Name And Validate No Result Found")
    public void enterDisabledCompanyNameAndValidateNoResultFound(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String company = mapData.get("Company");
            companiesManage_oReturns_methods.selectCompanyToCheckNotFound(company);
            Thread.sleep(3000);
            getDriver().findElement(By.xpath("//li[@role='treeitem']")).isDisplayed();
        }
    }

    @And("Click On Search Details To See Log Details")
    public void clickOnSearchDetailsToSeeLogDetails() throws InterruptedException {
        companiesManage_oReturns_methods.ClickSearchDetails();
//        getDriver().findElement(By.xpath("(//i[@class='fa fa-search'])[1]")).click();
        Thread.sleep(3000);
    }
    @And("Click On Close Button To Close The Log Details")
    public void clickOnCloseButtonToCloseTheLogDetails() {
        companiesManage_oReturns_methods.ClickCloseSearchDetails();
    }

    @And("Click On View Company To Search Added Company")
    public void clickOnViewCompanyToSearchAddedCompany() {
        companiesManage_oReturns_methods.ClickOnViewCompany();
    }

    @And("Click On Submit Button")
    public void clickOnSubmitButton() throws InterruptedException {
        companiesManage_oReturns_methods.ClickOnSubmitButton();
        Thread.sleep(2000);
    }

    @And("Click View Categories")
    public void clickViewCategories() throws InterruptedException {
        companiesManage_oReturns_methods.ClickViewCategories();
        Thread.sleep(2000);
    }

    @And("Click Add Category")
    public void clickAddCategory() throws InterruptedException {
        companiesManage_oReturns_methods.ClickAddCategory();
        Thread.sleep(2000);
    }

    @And("Click On Search Button")
    public void clickOnSearchButton() throws InterruptedException {
        companiesManage_oReturns_methods.ClickOnSearchButton();
        Thread.sleep(2000);
    }

    @And("Click On Reset Button")
    public void clickOnResetButton() throws InterruptedException {
        companiesManage_oReturns_methods.ClickOnResetButton();
        Thread.sleep(2000);
    }

    @Then("Check And Validate Mandatory Required Fields Error")
    public void checkAndValidateMandatoryRequiredFieldsError(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            getDriver().findElement(By.xpath("//label[normalize-space()='Description']")).click();

            String companyName = mapData.get("CompanyName");
            companiesManage_oReturns_model.ValidateErrorDisplay(companyName);

            String country = mapData.get("Country");
            companiesManage_oReturns_model.ValidateErrorDisplay(country);

            String suburb = mapData.get("Suburb");
            companiesManage_oReturns_model.ValidateErrorDisplay(suburb);

            String state_City = mapData.get("State/City");
            companiesManage_oReturns_model.ValidateErrorDisplay(state_City);

            String postcode = mapData.get("Postcode");
            companiesManage_oReturns_model.ValidateErrorDisplay(postcode);

            String contactNumber = mapData.get("ContactNumber");
            companiesManage_oReturns_model.ValidateErrorDisplay(contactNumber);

            String email = mapData.get("Email");
            companiesManage_oReturns_model.ValidateErrorDisplay(email);

            String returnPortalDomain = mapData.get("ReturnPortalDomain");
            companiesManage_oReturns_model.ValidateErrorDisplay(returnPortalDomain);

            String siteURL = mapData.get("SiteURL");
            companiesManage_oReturns_model.ValidateErrorDisplay(siteURL);
            Thread.sleep(3000);
        }
    }

    @And("Add Company By Adding Data Fields")
    public void addCompanyByAddingDataFields(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String companyName = mapData.get("CompanyName");
            String country = mapData.get("Country");
            String suburb = mapData.get("Suburb");
            String state_City = mapData.get("State/City");
            String postcode = mapData.get("Postcode");
            String contactNumber = mapData.get("ContactNumber");
            String email = mapData.get("Email");
            String returnPortalDomain = mapData.get("ReturnPortalDomain");
            String siteURL = mapData.get("SiteURL");
            companiesManage_oReturns_methods.FillAddCompanyDeatils(companyName , country , suburb , state_City , postcode , contactNumber , email , returnPortalDomain , siteURL );
        }
    }

    @Then("Validate Fields Are Empty")
    public void validateFieldsAreEmpty() {
        var companyName = getDriver().findElement(companiesManage_oReturns.enterCompanyName);
        var country = getDriver().findElement(companiesManage_oReturns.enterCountry);
        var suburb = getDriver().findElement(companiesManage_oReturns.enterSuburb);
        var state_City = getDriver().findElement(companiesManage_oReturns.enterState_City);
        var postcode = getDriver().findElement(companiesManage_oReturns.enterPostcode);
        var contactNumber = getDriver().findElement(companiesManage_oReturns.enterContactNumber);
        var email = getDriver().findElement(companiesManage_oReturns.enterEmail);
        var returnPortalDomain = getDriver().findElement(companiesManage_oReturns.enterReturnPortalDomain);
        var siteURL = getDriver().findElement(companiesManage_oReturns.enterSiteURL);

        elementCommonUtils.inputFieldIsEmptyOrNot(companyName);
        elementCommonUtils.inputFieldIsEmptyOrNot(country);
        elementCommonUtils.inputFieldIsEmptyOrNot(suburb);
        elementCommonUtils.inputFieldIsEmptyOrNot(state_City);
        elementCommonUtils.inputFieldIsEmptyOrNot(postcode);
        elementCommonUtils.inputFieldIsEmptyOrNot(contactNumber);
        elementCommonUtils.inputFieldIsEmptyOrNot(email);
        elementCommonUtils.inputFieldIsEmptyOrNot(returnPortalDomain);
        elementCommonUtils.inputFieldIsEmptyOrNot(siteURL);
    }

    @And("Update Company By Modifying Data Fields")
    public void updateCompanyByModifyingDataFields(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String contactNumber = mapData.get("ContactNumber");
            companiesManage_oReturns_methods.UpadateCompanyDeatils(contactNumber );
        }
    }

    @Then("Validate Searched Company Change Log Details")
    public void validateSearchedCompanyChangeLogDetails(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String company = mapData.get("Company");
            String changeType = mapData.get("ChangeType");
            companiesManage_oReturns_model.ValidateChangeType(company);
            companiesManage_oReturns_model.ValidateChangeType(changeType);
        }
    }

    @Then("Validate Log Details PopUp")
    public void validateLogDetailsPopUp(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String popUp = mapData.get("PopUp");
            companiesManage_oReturns_model.ValidatePopUpHead(popUp);
        }
    }

    @Then("Validate Searched Company Details")
    public void validateSearchedCompanyDetails(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String company = mapData.get("Company");
            String country = mapData.get("Country");
            String domain = mapData.get("Domain");
            String email = mapData.get("Email");
            companiesManage_oReturns_model.ValidateChangeType(company);
            companiesManage_oReturns_model.ValidateChangeType(country);
            companiesManage_oReturns_model.ValidateChangeType(domain);
            companiesManage_oReturns_model.ValidateChangeType(email);
        }
    }

    @And("Disable Company By Modifying Data Field")
    public void disableCompanyByModifyingDataField() {
        companiesManage_oReturns_methods.ClickOnDisableRadioButton();
    }

    @And("Click On Edit To Update Company Details")
    public void clickOnEditToUpdateCompanyDetails() {
        companiesManage_oReturns_methods.ClickOnEdit();
    }
    @And("Click On Update Button")
    public void clickOnUpdateButton() {
        companiesManage_oReturns_methods.ClickOnSubmitButton();
    }
    @And("Click On Update Button To Update Company")
    public void clickOnUpdateButtonToUpdateCompany() {
        companiesManage_oReturns_methods.ClickOnUpdateButton();
    }

}
