package com.techwith.steps.ui;

import com.techwith.ui.pages.ManualReturn_OmniRPS_Methods;
import com.techwith.ui.pages.ReturnCreated_OmniRPS_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

import static com.techwith.webdriver.WebDriverFactory.getDriver;

public class ManualReturn_OmniRPSSteps {

    @Autowired
    public ManualReturn_OmniRPS_Methods manualReturn_omniRPS_methods;

    @Autowired
    public ReturnCreated_OmniRPS_Methods returnCreated_omniRPS_methods;

    @And("Enter Manual Return Details to Successfully Receive Return")
    public void enterManualReturnDetailsToSuccessfullyReceiveReturn(DataTable dataTable) throws InterruptedException {
        manualReturn_omniRPS_methods.clickOnScanRetailerDropDown("");
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String retailer = mapData.get("Retailer");
            String orderNo = mapData.get("OrderNo");
            String quantity = mapData.get("Quantity");
            String rma = mapData.get("RMA");
            String locationBarcode = mapData.get("LocationBarcode");
            String warehouseLocation = mapData.get("WarehouseLocation");
            String misc_1 = mapData.get("MISC_1");
            String misc_3 = mapData.get("MISC_3");
            String misc_2 = mapData.get("MISC_2");
            String notes = mapData.get("Notes");
            String style = mapData.get("Style");
            String itemNo = mapData.get("ItemNo");
            String customerComment= mapData.get("CustomerComment");
            String totalWeight = mapData.get("TotalWeight");
            String chtComment = mapData.get("ChtComment");
            String sku = mapData.get("Sku");
            String description = mapData.get("Description");
            String value = mapData.get("Value");
            String reason = mapData.get("Reason");
            String subReason = mapData.get("SubReason");
            String condition = mapData.get("Condition");
            String returnAction = mapData.get("ReturnAction");
            manualReturn_omniRPS_methods.selectScanRetailerFromTheDropDown(retailer);

            manualReturn_omniRPS_methods.FillTheManualReturnDetails( orderNo , quantity , rma , locationBarcode , warehouseLocation , misc_1 , misc_3 , misc_2 , notes , style , itemNo , customerComment , totalWeight , chtComment , sku , description , value , reason , subReason , condition , returnAction);
            Thread.sleep(3000);

            WebElement upload_file = getDriver().findElement(By.xpath("//input[@id='ItemPhoto']"));
            upload_file.sendKeys("D:/SSTech.png");

        }
        returnCreated_omniRPS_methods.ClickOnSubmitButton();
    }
}
