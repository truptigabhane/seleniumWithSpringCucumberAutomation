package com.techwith.steps.ui;

import com.techwith.ui.LocatorsPage.CreateOuterConsignment;
import com.techwith.ui.models.CompaniesManage_OReturns_Model;
import com.techwith.ui.models.CreateOuterConsignment_Model;
import com.techwith.ui.models.Dashboard_OReturns_Model;
import com.techwith.ui.models.UserManage_OReturns_Model;
import com.techwith.ui.models.customUtils.elementCommonUtils;
import com.techwith.ui.pages.CreateOuterConsignment_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;
import static com.techwith.webdriver.WebDriverFactory.getDriver;

public class CreateOuterConsignment_Steps {

    @Autowired
    public CreateOuterConsignment_Methods createOuterConsignment_methods;
    @Autowired
    public CreateOuterConsignment createOuterConsignment;
    @Autowired
    public CreateOuterConsignment_Model createOuterConsignment_model;
    @Autowired
    public CompaniesManage_OReturns_Model companiesManage_oReturns_model;
    @Autowired
    public UserManage_OReturns_Model userManage_oReturns_model;
    @Autowired
    public Dashboard_OReturns_Model dashboard_oReturns_model;

    @And("Click Create Outer Consignment Menu")
    public void ClickCreateOuterConsignmentMenu() throws InterruptedException {
        createOuterConsignment_methods.ClickCreateOuterConsignmentMenu();
        Thread.sleep(1000);
    }
    @And("Click Add Outers To MAWB")
    public void clickAddOutersToMAWB() throws InterruptedException {
        createOuterConsignment_methods.ClickAddOutersToMAWB();
        Thread.sleep(1000);
    }
    @And("Click On Processing Dropdown")
    public void clickOnProcessingDropdown() throws InterruptedException {
        createOuterConsignment_methods.ClickOnProcessingDropdown();
        Thread.sleep(1000);
    }
    @And("Select Hub From Dropdown")
    public void selectHubFromDropdown(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String hub = mapData.get("Hub");
            createOuterConsignment_methods.SelectHub(hub);
            Thread.sleep(1000);
        }
    }
    @And("Select Outer Id From Dropdown")
    public void selectOuterIdFromDropdown(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String outer = mapData.get("Outer");
            createOuterConsignment_methods.SelectOuter(outer);
            Thread.sleep(1000);
        }
    }
    @Then("Validate Populated Hub Data")
    public void validatePopulatedHubData() {
        var country = getDriver().findElement(createOuterConsignment.EnterCountry);
        var name = getDriver().findElement(createOuterConsignment.EnterName);
        var building = getDriver().findElement(createOuterConsignment.EnterBuilding);
        var street = getDriver().findElement(createOuterConsignment.EnterStreet);
        var suburb = getDriver().findElement(createOuterConsignment.EnterSuburb);
        var state_City = getDriver().findElement(createOuterConsignment.EnterState_City);
        var postcode = getDriver().findElement(createOuterConsignment.EnterPostcode);
        var contact = getDriver().findElement(createOuterConsignment.EnterContact);
        var phone = getDriver().findElement(createOuterConsignment.EnterPhone);
        var email = getDriver().findElement(createOuterConsignment.EnterEmail);

        elementCommonUtils.inputFieldIsEmptyOrNot(country);
        elementCommonUtils.inputFieldIsEmptyOrNot(name);
        elementCommonUtils.inputFieldIsEmptyOrNot(building);
        elementCommonUtils.inputFieldIsEmptyOrNot(street);
        elementCommonUtils.inputFieldIsEmptyOrNot(suburb);
        elementCommonUtils.inputFieldIsEmptyOrNot(state_City);
        elementCommonUtils.inputFieldIsEmptyOrNot(postcode);
        elementCommonUtils.inputFieldIsEmptyOrNot(contact);
        elementCommonUtils.inputFieldIsEmptyOrNot(phone);
        elementCommonUtils.inputFieldIsEmptyOrNot(email);
    }
    @Then("Validate Populated Receiver Data")
    public void validatePopulatedReceiverData() {
        var country = getDriver().findElement(createOuterConsignment.EnterReceiverCountry);
        var name = getDriver().findElement(createOuterConsignment.EnterReceiverName);
        var building = getDriver().findElement(createOuterConsignment.EnterReceiverBuilding);
        var street = getDriver().findElement(createOuterConsignment.EnterReceiverStreet);
        var suburb = getDriver().findElement(createOuterConsignment.EnterReceiverSuburb);
        var state_City = getDriver().findElement(createOuterConsignment.EnterReceiverStateCity);
        var postcode = getDriver().findElement(createOuterConsignment.EnterReceiverPostcode);
        var contact = getDriver().findElement(createOuterConsignment.EnterReceiverContact);
        var phone = getDriver().findElement(createOuterConsignment.EnterReceiverPhone);
        var email = getDriver().findElement(createOuterConsignment.EnterReceiverEmail);

        elementCommonUtils.inputFieldIsEmptyOrNot(country);
        elementCommonUtils.inputFieldIsEmptyOrNot(name);
        elementCommonUtils.inputFieldIsEmptyOrNot(building);
        elementCommonUtils.inputFieldIsEmptyOrNot(street);
        elementCommonUtils.inputFieldIsEmptyOrNot(suburb);
        elementCommonUtils.inputFieldIsEmptyOrNot(state_City);
        elementCommonUtils.inputFieldIsEmptyOrNot(postcode);
        elementCommonUtils.inputFieldIsEmptyOrNot(contact);
        elementCommonUtils.inputFieldIsEmptyOrNot(phone);
        elementCommonUtils.inputFieldIsEmptyOrNot(email);
    }
    @And("Enter Commodities Declaration Info")
    public void enterCommoditiesDeclarationInfo(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String description = mapData.get("Description");
            String manfCountry = mapData.get("ManfCountry");
            String totalKg = mapData.get("TotalKg");
            String units = mapData.get("Units");
            String totalValue = mapData.get("TotalValue");
            String currency = mapData.get("Currency");
            createOuterConsignment_methods.FillCommoditiesDetails(description , manfCountry , totalKg , units , totalValue , currency);
        }
    }
    @And("Enter Sender Email")
    public void enterSenderEmail(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String email = mapData.get("Email");
            createOuterConsignment_methods.EnterSenderEmail(email);
        }
    }
    @And("Enter Receiver Email")
    public void enterReceiverEmail(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String email = mapData.get("Email");
            createOuterConsignment_methods.EnterReceiverEmail(email);
        }
    }
    @And("Enter Packages Info")
    public void enterPackagesInfo(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String units = mapData.get("Units");
            String length = mapData.get("Length");
            String width = mapData.get("Width");
            String height = mapData.get("Height");
            String kg = mapData.get("KG");
            createOuterConsignment_methods.FillPackagesDetails(units , length , width , height , kg);
        }
    }
    @And("Fill Use External Connote")
    public void fillUseExternalConnote(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String connote = mapData.get("Connote");
            String trackingURL = mapData.get("TrackingURL");
            createOuterConsignment_methods.FillUseExternalConnote(connote , trackingURL);
        }
    }
    @And("Click Calculate Freight Button")
    public void clickCalculateFreightButton() throws InterruptedException {
        createOuterConsignment_methods.ClickCalculateFreightButton();
        Thread.sleep(1000);
    }
    @And("Click Remove Icon")
    public void clickRemoveIcon() throws InterruptedException {
        createOuterConsignment_methods.ClickRemoveIcon();
        Thread.sleep(1000);
    }
    @And("Click Remove Commodity Row Icon")
    public void clickRemoveCommodityRowIcon() throws InterruptedException {
        createOuterConsignment_methods.ClickRemoveCommodityRowIcon();
        Thread.sleep(1000);
    }
    @And("Click On Save Btn")
    public void clickOnSaveBtn() throws InterruptedException {
        createOuterConsignment_methods.ClickOnSaveBtn();
        Thread.sleep(1000);
    }
    @And("Select Carrier Service")
    public void selectCarrierService() throws InterruptedException {
        createOuterConsignment_methods.SelectCarrierService();
        Thread.sleep(1000);
    }
    @And("Click On Use Eternal Cannote")
    public void clickOnUseEternalCannote() throws InterruptedException {
        createOuterConsignment_methods.ClickOnUseEternalCannote();
        Thread.sleep(1000);
    }
    @And("Fill Add Outers Details And Search")
    public void fillAddOutersDetailsAndSearch(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String hub = mapData.get("Hub");
            String retailer = mapData.get("Retailer");
            createOuterConsignment_methods.FillAddOutersDetails(hub , retailer);
        }
    }
    @And("Fill Outers Consolidations Details")
    public void fillOutersConsolidationsDetails(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String search = mapData.get("Search");
            String originFacility = mapData.get("OriginFacility");
            String destinationPort = mapData.get("DestinationPort");
            String retailer = mapData.get("Retailer");
            String subRetailer = mapData.get("SubRetailer");
            createOuterConsignment_methods.FillOutersConsolidationsDetails(search , originFacility , destinationPort , retailer , subRetailer);
        }
    }
    @Then("Validate PopUp")
    public void validatePopUp(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String popUp = mapData.get("PopUp");
            createOuterConsignment_model.ValidatePopUpHead(popUp);
        }
    }
    @Then("Validate PopUp Head")
    public void validatePopUpHead(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String popUp = mapData.get("PopUp");
            createOuterConsignment_model.ValidatHead(popUp);
        }
    }
    @And("Click On Search Btn")
    public void clickOnSearchBtn() throws InterruptedException {
        createOuterConsignment_methods.ClickSearch();
        Thread.sleep(1000);
    }
    @And("Select Item To Export")
    public void selectItemToExport() throws InterruptedException {
        createOuterConsignment_methods.CheckItem();
        Thread.sleep(1000);
    }
    @And("Click On Export Btn")
    public void ClickOnExportBtn() throws InterruptedException {
        createOuterConsignment_methods.ClickExport();
        Thread.sleep(1000);
    }
    @Then("Validate The Page Heading")
    public void validateThePageHeading(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String heading = mapData.get("Heading");
            dashboard_oReturns_model.ValidateDisplay(heading);
        }
    }
    @And("Click On Close Button")
    public void clickOnCloseButton() throws InterruptedException {
        createOuterConsignment_methods.ClickOnCloseButton();
        Thread.sleep(1000);
    }
    @And("Click On Close Btn")
    public void clickOnCloseBtn() throws InterruptedException {
        createOuterConsignment_methods.ClickOnCloseBtn();
        Thread.sleep(1000);
    }
    @And("Click Close Btn")
    public void ClickCloseBtn() throws InterruptedException {
        createOuterConsignment_methods.ClickCloseBtn();
        Thread.sleep(1000);
    }
    @And("Click Create MAWB Button")
    public void clickCreateMAWBButton() throws InterruptedException {
        createOuterConsignment_methods.ClickCreateMAWBButton();
        Thread.sleep(1000);
    }
    @Then("Check And Validate Mandatory Required Fields Error In Creating Create MAWB")
    public void checkAndValidateMandatoryRequiredFieldsErrorInCreatingCreateMAWB(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {

            String weight = mapData.get("Weight");
            companiesManage_oReturns_model.ValidateErrorDisplay(weight);

            String transitMode = mapData.get("TransitMode");
            companiesManage_oReturns_model.ValidateErrorDisplay(transitMode);

            String originCountry = mapData.get("OriginCountry");
            companiesManage_oReturns_model.ValidateErrorDisplay(originCountry);

            String originPort = mapData.get("OriginPort");
            companiesManage_oReturns_model.ValidateErrorDisplay(originPort);

            String originAgent = mapData.get("OriginAgent");
            companiesManage_oReturns_model.ValidateErrorDisplay(originAgent);

            String destinationCountry = mapData.get("DestinationCountry");
            companiesManage_oReturns_model.ValidateErrorDisplay(destinationCountry);

            String destinationPort = mapData.get("DestinationPort");
            companiesManage_oReturns_model.ValidateErrorDisplay(destinationPort);

            String destinationAgent = mapData.get("DestinationAgent");
            companiesManage_oReturns_model.ValidateErrorDisplay(destinationAgent);

            String vesselNumber = mapData.get("VesselNumber");
            companiesManage_oReturns_model.ValidateErrorDisplay(vesselNumber);
            Thread.sleep(3000);
        }
    }
    @And("Create MAWB By Adding Data Fields")
    public void createMAWBByAddingDataFields(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String weight = mapData.get("Weight");
            String transitMode = mapData.get("TransitMode");
            String originCountry = mapData.get("OriginCountry");
            String originPort = mapData.get("OriginPort");
            String originAgent = mapData.get("OriginAgent");
            String destinationCountry = mapData.get("DestinationCountry");
            String destinationPort = mapData.get("DestinationPort");
            String destinationAgent = mapData.get("DestinationAgent");
            String vesselNumber = mapData.get("VesselNumber");
            String mawb_1 = mapData.get("MAWB_1");
            String mawb_2 = mapData.get("MAWB_2");
            createOuterConsignment_methods.FillAddMAWBDeatils(weight , transitMode , originCountry , originPort , originAgent , destinationCountry , destinationPort , destinationAgent , vesselNumber , mawb_1 , mawb_2 );
        }
    }
    @Then("Validate Searched Detail")
    public void validateSearchedDetail(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String retailer = mapData.get("Retailer");
            userManage_oReturns_model.ValidateDisplay(retailer);
        }
    }
    @And("Enter Outer Connote For Scan To Tick")
    public void enterOuterConnoteForScanToTick(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String scanToTick = mapData.get("ScanToTick");
            createOuterConsignment_methods.EnterOuterConnoteForScanToTick(scanToTick );
        }
    }
    @Then("Validate Outer Connote Checkbox")
    public void validateCloseOuterDetails(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String outerConnote = mapData.get("OuterConnote");
            createOuterConsignment_methods.ValidateCloseOuterDetails(outerConnote);
        }
    }
    @Then("Validate Scan To Tick Box Error")
    public void validateScanToTickBoxError() {
        getDriver().findElement(By.xpath("//input[@id='OuterScanToTick' and @style='border-color: red; border-width: medium;']")).isDisplayed();
    }
    @Then("Validate Scan To Tick Green Box")
    public void validateScanToTickGreenBox () {
        getDriver().findElement(By.xpath("//input[@id='OuterScanToTick' and @style='border-color: green; border-width: medium;']")).isDisplayed();
    }
    @Then("Validate Scan To Tick Box Is Empty")
    public void validateScanToTickBoxIsEmpty() {
        var scanToTick = getDriver().findElement(createOuterConsignment.ValidateScanToTickBoxIsEmpty);
        elementCommonUtils.inputFieldIsEmptyOrNot(scanToTick);
    }
    @Then("Uncheck Outer Connote Checkbox")
    public void uncheckOuterConnoteCheckbox(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String outerConnote = mapData.get("OuterConnote");
            createOuterConsignment_methods.ClickToUncheck(outerConnote);
            Thread.sleep(3000);
        }
    }
    @Then("Validate Readonly Units")
    public void validateReadonlyUnits () throws InterruptedException {
        getDriver().findElement(By.xpath("//input[@id='Units']")).isDisplayed();
        Thread.sleep(2000);
    }
    @Then("Validate Searched Company Details In MAWB Outer Consolidations")
    public void validateSearchedCompanyDetailsInMAWBOuterConsolidations(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String origin = mapData.get("Origin");
            String destinationMode = mapData.get("DestinationMode");
            String mode = mapData.get("Mode");
            String mawb = mapData.get("MAWB");
            companiesManage_oReturns_model.ValidateChangeType(origin);
            companiesManage_oReturns_model.ValidateChangeType(destinationMode);
            companiesManage_oReturns_model.ValidateChangeType(mode);
            companiesManage_oReturns_model.ValidateChangeType(mawb);
        }
    }
}
