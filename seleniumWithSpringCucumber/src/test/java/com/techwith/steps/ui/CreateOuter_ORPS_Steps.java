package com.techwith.steps.ui;

import com.techwith.ui.models.CompaniesManage_OReturns_Model;
import com.techwith.ui.models.CreateOuterConsignment_Model;
import com.techwith.ui.models.CreateOuter_ORPS_Model;
import com.techwith.ui.pages.CreateOuterConsignment_Methods;
import com.techwith.ui.pages.CreateOuter_ORPS_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

import static com.techwith.webdriver.WebDriverFactory.getDriver;

public class CreateOuter_ORPS_Steps {

    @Autowired
    public CreateOuter_ORPS_Methods createOuter_orps_methods;
    @Autowired
    public CreateOuterConsignment_Methods createOuterConsignment_methods;
    @Autowired
    public CreateOuterConsignment_Model createOuterConsignment_model;
    @Autowired
    public CreateOuter_ORPS_Model createOuter_orps_model;
    @Autowired
    public CompaniesManage_OReturns_Model companiesManage_oReturns_model;

    @And("Select Hub And Retailer To Create Outer")
    public void selectHubAndRetailerToCreateOuter(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String hub = mapData.get("Hub");
            String retailer = mapData.get("Retailer");
            createOuterConsignment_methods.SelectHub(hub);
            createOuter_orps_methods.SelectRetailer(retailer);
            Thread.sleep(1000);
        }
    }
    @And("Select Hub To Create Outer")
    public void selectHubToCreateOuter(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String hub = mapData.get("Hub");
            createOuterConsignment_methods.SelectHub(hub);
            Thread.sleep(1000);
        }
    }
    @And("Select Retailer To Create Outer")
    public void selectRetailerToCreateOuter(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String retailer = mapData.get("Retailer");
            createOuter_orps_methods.SelectRetailer(retailer);
            Thread.sleep(1000);
        }
    }
    @And("Click Create Outer Button And If Outer Is Already Open Then Validate Popup And Confirm To Open Another Outer")
    public void clickCreateOuterButtonAndIfOuterIsAlreadyOpenThenValidatePopupAndConfirmToOpenAnotherOuter(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            createOuter_orps_methods.ClickCreateOuterButton();
            Thread.sleep(1000);

            String popUp = mapData.get("PopUp");
            if(getDriver().findElement(By.xpath("//h4[normalize-space()='OUTER ALREADY OPEN']")).isDisplayed()){
                createOuterConsignment_model.ValidatePopUpHead(popUp);
                createOuter_orps_methods.ClickConfirmButton();
            }
        }
    }
    @And("Click Create Outer Button Then Validate And Close Alert Popup While Outer Is Already Open")
    public void clicCreateOuterButtonThenValidateAndCloseAlertPopupWhileOuterIsAlreadyOpen(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            createOuter_orps_methods.ClickCreateOuterButton();
            Thread.sleep(1000);

            String popUp = mapData.get("PopUp");
            if(getDriver().findElement(By.xpath("//h4[normalize-space()='OUTER ALREADY OPEN']")).isDisplayed()){
                createOuterConsignment_model.ValidatePopUpHead(popUp);
                createOuter_orps_methods.ClickCloseIcon();
            }
        }
    }
    @And("Click Create Outer Button")
    public void clickCreateOuterButton() {
            createOuter_orps_methods.ClickCreateOuterButton();
    }
    @Then("Validate Success Message")
    public void validateSuccessMessage() {
        getDriver().findElement(By.xpath("//strong[@class='success_msg']")).isDisplayed();
    }
    @Then("Validate Success Message Alert")
    public void validateSuccessMessageAlert() {
        getDriver().findElement(By.xpath("//div[@role='alert']")).isDisplayed();
    }
    @Then("Validate Mandatory Required Field")
    public void validateMandatoryRequiredField(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String error = mapData.get("Error");
            createOuter_orps_model.ValidateErrorDisplay(error);
        }
    }
    @Then("Validate Mandatory Required Fields")
    public void validateMandatoryRequiredFields(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String error = mapData.get("Error");
            companiesManage_oReturns_model.ValidateErrorDisplay(error);
        }
    }
}
