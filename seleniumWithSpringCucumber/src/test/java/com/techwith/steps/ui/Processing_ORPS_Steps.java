package com.techwith.steps.ui;

import com.techwith.ui.LocatorsPage.Processing_ORPS;
import com.techwith.ui.models.customUtils.elementCommonUtils;
import com.techwith.ui.pages.Processing_ORPS_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

import static com.techwith.webdriver.WebDriverFactory.getDriver;

public class Processing_ORPS_Steps {

    @Autowired
    public Processing_ORPS_Methods processing_orps_methods;
    @Autowired
    public Processing_ORPS processing_orps;

    @Given("Enter Consignment Number And Press Enter")
    public void enterConsignmentNumberAndPressEnter(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data){
            String consignmentNo = mapData.get("ConsignmentNo");
            processing_orps_methods.EnterConsignmentNo(consignmentNo);
            getDriver().findElement(processing_orps.EnterConsignmentNo).sendKeys(Keys.ENTER);
            Thread.sleep(3000);
        }
    }
    @And("Select ScanRetailer And Hub")
    public void selectScanRetailerAndHub(DataTable dataTable) throws InterruptedException {
        processing_orps_methods.clickOnScanRetailerDropDown("");
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String scanRetailer = mapData.get("ScanRetailer");
            String hub = mapData.get("Hub");
            processing_orps_methods.selectScanRetailerFromTheDropDown(scanRetailer);
            processing_orps_methods.selectHubFromTheDropDown(hub);

            Thread.sleep(1000);
        }
    }
    @And("Enter Manual Return Process Details")
    public void enterManualReturnProcessDetails(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String misc_1 = mapData.get("MISC_1");
            String misc_3 = mapData.get("MISC_3");
            String orderNo = mapData.get("OrderNo");
            String misc_2 = mapData.get("MISC_2");
            processing_orps_methods.FillManualReturnProcessDetails(misc_1 , misc_3 , orderNo , misc_2);
            Thread.sleep(2000);
        }
    }
    @And("Click Submit And Close Outer Button")
    public void clickSubmitAndClosOuterButton() throws InterruptedException {
        processing_orps_methods.ClickSubmitAndClosOuterButton();
        Thread.sleep(1000);
    }
    @And("Click On Reset Form Button")
    public void clickOnResetFormButton() throws InterruptedException {
        processing_orps_methods.ClickOnResetFormButton();
        Thread.sleep(1000);
    }
    @Then("Validate Outer Id")
    public void validateOuterId() {
        getDriver().findElement(By.xpath("(//h3[@class='box-title'])[3]")).isDisplayed();
    }
    @Then("Validate Create Outer Button")
    public void validateCreateOuterButton() {
        getDriver().findElement(By.xpath("//button[@id='cr_outer']")).isDisplayed();
    }
    @Then("Validate Populated Outer Id And Consignment No")
    public void validatePopulatedOuterIdAndConsignmentNo() {
        var country = getDriver().findElement(processing_orps.SelectOuterId);
        var name = getDriver().findElement(processing_orps.EnterConsignmentNumber);
        elementCommonUtils.inputFieldIsEmptyOrNot(country);
        elementCommonUtils.inputFieldIsEmptyOrNot(name);
    }
    @And("Click On Cancel Button")
    public void clickOnCancelButton() throws InterruptedException {
        processing_orps_methods.ClickOnCancelButton();
        Thread.sleep(1000);
    }
    @And("Click On Create Outer Button")
    public void clickOnCreateOuterButton() throws InterruptedException {
        processing_orps_methods.ClickOnCreateOuterButton();
        Thread.sleep(1000);
    }
}
