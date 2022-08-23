package com.techwith.steps.ui;

import com.techwith.ui.pages.ReturnProcessing_OmniRPS_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

import static com.techwith.webdriver.WebDriverFactory.getDriver;

public class ReturnProcessing_OmniRPSSteps {

    @Autowired
    public ReturnProcessing_OmniRPS_Methods returnProcessing_omniRPS_methods;

    @And("Enter Consignment And Press Enter")
    public void enterConsignmentAndPressEnter (DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data){
            String consignment = mapData.get("Consignment");
            returnProcessing_omniRPS_methods.FillConsignment(consignment);
        }
        WebElement textbox = getDriver().findElement(By.id("Consignment_No"));
        textbox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }
}
