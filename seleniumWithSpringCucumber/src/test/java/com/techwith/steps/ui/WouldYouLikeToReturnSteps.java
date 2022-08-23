package com.techwith.steps.ui;

import com.techwith.ui.pages.RetailerReturns_Methods;
import com.techwith.ui.pages.WouldYouLikeToReturns_Methods;
import com.techwith.webdriver.WebDriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class WouldYouLikeToReturnSteps extends WebDriverFactory {

    @Autowired
    public WouldYouLikeToReturns_Methods wouldYouLikeToReturnsMethods;

    @Autowired
    public RetailerReturns_Methods retailerReturnsMethods;


    @And("Validate the Order Number and EmailID are Same or Not")
    public void validateTheOrderNumberAndEmailIDAreSameOrNot(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String orderNumber = mapData.get("OrderNumber");
            String emailID = mapData.get("EmailID");
            wouldYouLikeToReturnsMethods.validateTheOrderNumber(orderNumber);
            wouldYouLikeToReturnsMethods.validateTheEmailID(emailID + "@sstechsystem.com");
        }

    }

    @And("Select Product with its Return Reason and Return Option")
    public void selectProductWithItsReturnReasonAndReturnOption(DataTable dataTable) throws InterruptedException {
        wouldYouLikeToReturnsMethods.selectProductCheckBox("1");
        wouldYouLikeToReturnsMethods.clickOnProductReturnReasonDropDown("0");
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String returnReason = mapData.get("ReturnReason");
            wouldYouLikeToReturnsMethods.selectReasonFromTheDropDown(returnReason);
        }
        wouldYouLikeToReturnsMethods.clickOnReturnOptionDropDown("0");
        for (Map<String,String> mapData:data) {
            String returnOption = mapData.get("ReturnOption");
            wouldYouLikeToReturnsMethods.selectOptionFromTheReturnOptionDropDown(0, returnOption);
        }
        retailerReturnsMethods.clickOnNextArrowButton();
    }
}
