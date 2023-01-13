package com.techwith.steps.ui;

import com.techwith.ui.pages.OrderReturnSummary_Methods;
import com.techwith.webdriver.WebDriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class OrderReturnSummarySteps extends WebDriverFactory {

    @Autowired
    public OrderReturnSummary_Methods orderReturnSummaryMethods;

    @And("Validate the Order Summary and Process the Order To Create Consignment")
    public void validateTheOrderSummaryAndProcessTheOrderToCreateConsignment(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data) {
            String orderNumber = mapData.get("OrderNumber");
            String productName = mapData.get("ProductName");
            String returnReason = mapData.get("ReturnReason");
            String returnOption = mapData.get("ReturnOption");
            String refundType = mapData.get("RefundType");
            String service = mapData.get("Service");
            orderReturnSummaryMethods.ValidateOrderNumber(orderNumber);
            orderReturnSummaryMethods.ValidateProductName(productName , 0);
            orderReturnSummaryMethods.ValidateReturnReason(returnReason , 0);
//            orderReturnSummaryMethods.ValidateReturnOption(returnOption , 0);
//            orderReturnSummaryMethods.SelectRefundOption(refundType);
            orderReturnSummaryMethods.SelectService(service , 1);

            WebElement iframe = getDriver().findElement(By.xpath("//iframe[@title='Secure card payment input frame']"));
            getDriver().switchTo().frame(iframe);
            String cardNumber = mapData.get("CardNumber");
            String expDate = mapData.get("ExpDate");
            String cvc = mapData.get("CVC");
            String zip = mapData.get("Zip");
            orderReturnSummaryMethods.enterPaymentDetailsOnOrderReturnSummary(cardNumber,expDate,cvc,zip);
            getDriver().switchTo().defaultContent();
//            System.out.println(orderNumber + productName + returnReason + returnOption + refundType + service + cardNumber);
        }
        orderReturnSummaryMethods.ClickOnPayNowBtn();
//        Thread.sleep(3000);
//        orderReturnSummaryMethods.ClickOnSubmitButton();
    }


    @And("Validate the Order Summary and Process the Order To Create Consignment Using Happy Returns")
    public void validateTheOrderSummaryAndProcessTheOrderToCreateConsignmentUsingHappyReturns(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data) {
            String orderNumber = mapData.get("OrderNumber");
            String productName = mapData.get("ProductName");
            String returnReason = mapData.get("ReturnReason");
            String returnOption = mapData.get("ReturnOption");
//            String refundType = mapData.get("RefundType");
            String service = mapData.get("Service");
            orderReturnSummaryMethods.ValidateOrderNumber(orderNumber);
            orderReturnSummaryMethods.ValidateProductName(productName , 0);
            orderReturnSummaryMethods.ValidateReturnReason(returnReason , 0);
            orderReturnSummaryMethods.ValidateReturnOption(returnOption , 0);

//            getDriver().findElement(By.xpath("//input[@refundtype='refundid']")).click();
//            orderReturnSummaryMethods.SelectRefundOption(refundType , 1);
//            orderReturnSummaryMethods.ClickRefundTypeIcon();
//            getDriver().findElement(By.xpath("//div[@id='refundmyModal']//img[1]")).click();
//            Thread.sleep(3000);

            orderReturnSummaryMethods.SelectService(service , 1);
            orderReturnSummaryMethods.ClickHappyReturnsIcon();
            getDriver().findElement(By.xpath("//div[@id='happyreturnmyModal']//img[1]")).click();
            orderReturnSummaryMethods.ClickOnSelectStoreOption();
            Thread.sleep(3000);

            WebElement iframe = getDriver().findElement(By.xpath("//iframe[@title='Secure card payment input frame']"));
            getDriver().switchTo().frame(iframe);
            String cardNumber = mapData.get("CardNumber");
            String expDate = mapData.get("ExpDate");
            String cvc = mapData.get("CVC");
            String zip = mapData.get("Zip");
            orderReturnSummaryMethods.enterPaymentDetailsOnOrderReturnSummary(cardNumber,expDate,cvc,zip);
            getDriver().switchTo().defaultContent();

//            System.out.println(orderNumber + productName + returnReason + returnOption + refundType + service + cardNumber);
        }
        orderReturnSummaryMethods.ClickOnPayNowBtn();

//        Thread.sleep(3000);
//        orderReturnSummaryMethods.ClickOnSubmitButton();
//        orderReturnSummaryMethods.ClickOnRefundidSubmitButton();
    }

    @And("Validate the Order Summary and Process the Order To Create Consignment Using DHL Returns")
    public void validateTheOrderSummaryAndProcessTheOrderToCreateConsignmentUsingDHLReturns(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data) {
            String orderNumber = mapData.get("OrderNumber");
            String productName = mapData.get("ProductName");
            String returnReason = mapData.get("ReturnReason");
            String returnOption = mapData.get("ReturnOption");
            String service = mapData.get("Service");
            orderReturnSummaryMethods.ValidateOrderNumber(orderNumber);
            orderReturnSummaryMethods.ValidateProductName(productName , 0);
            orderReturnSummaryMethods.ValidateReturnReason(returnReason , 0);
            orderReturnSummaryMethods.ValidateReturnOption(returnOption , 0);

            orderReturnSummaryMethods.SelectService(service , 1);

//            WebElement iframe = getDriver().findElement(By.xpath("//iframe[@title='Secure card payment input frame']"));
//            getDriver().switchTo().frame(iframe);
//            String cardNumber = mapData.get("CardNumber");
//            String expDate = mapData.get("ExpDate");
//            String cvc = mapData.get("CVC");
//            String zip = mapData.get("Zip");
//            orderReturnSummaryMethods.enterPaymentDetailsOnOrderReturnSummary(cardNumber,expDate,cvc,zip);
//            getDriver().switchTo().defaultContent();
        }
        orderReturnSummaryMethods.ClickOnSubmitButton();
//        orderReturnSummaryMethods.ClickOnPayNowBtn();
    }
}
