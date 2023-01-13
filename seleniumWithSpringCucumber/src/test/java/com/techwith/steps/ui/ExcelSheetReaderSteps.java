package com.techwith.steps.ui;

import com.techwith.excel.ExcelReader;
import com.techwith.ui.pages.RetailerReturns_Methods;
import com.techwith.webdriver.WebDriverFactory;
import io.cucumber.java.en.Given;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelSheetReaderSteps extends WebDriverFactory {

    @Autowired
    public RetailerReturns_Methods retailerReturnsMethods;

    @Given("User fills the form from given Sheetname {string} and Rownumber {int}")
    public void user_fills_the_form_from_given_Sheetname_and_Rownumber(String sheetName, Integer rowNumber) throws IOException, InvalidFormatException {
        ExcelReader reader = new ExcelReader();
        List<Map<String,String>> testData =
                reader.getData("D:/OmniParcelReturns.xlsx", sheetName);

        String orderNumber = testData.get(rowNumber).get("orderNo");
        String email = testData.get(rowNumber).get("email");

        retailerReturnsMethods.findTheReturnFromTheShopifyOrderNumber(orderNumber , email);

    }
}
