package com.techwith.ui.pages;

import com.techwith.ui.models.OrderReturnSummary_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Component
public class OrderReturnSummary_Methods {

    @Autowired
    public OrderReturnSummary_Model orderReturnSummaryModel;

    public void ValidateOrderNumber(String ExpectedOrderNumber){
        String OrderNumber = orderReturnSummaryModel.ValidateTheOrderNumber();
        assertEquals(ExpectedOrderNumber , OrderNumber);
    }

    public void ValidateProductName(String ExpectedProductName , int i){
        String ProductName = orderReturnSummaryModel.ValidateTheProductName(i);
        assertEquals(ExpectedProductName , ProductName);
    }

    public void ValidateReturnReason(String ExpectedReturnReason , int i){
        String ReturnReason = orderReturnSummaryModel.ValidateTheReturnReason(i);
        assertEquals(ExpectedReturnReason , ReturnReason);
    }

    public void ValidateReturnOption(String ExpectedReturnOption , int i ){
        String ReturnOption = orderReturnSummaryModel.ValidateTheReturnOption(i);
        assertEquals(ExpectedReturnOption , ReturnOption);
    }


    public void SelectRefundOption(String refundType){
        orderReturnSummaryModel.selectRefundType(refundType);
    }

    public void SelectService(String serviceName , int i){
        orderReturnSummaryModel.selectServices(serviceName , i);
    }

    public void ClickOnSubmitButton(){
        orderReturnSummaryModel.ClickOnSubmitBtn();
    }

    public void enterPaymentDetailsOnOrderReturnSummary(String CardNumber, String ExpDate, String CVC, String Zip ){
        orderReturnSummaryModel.enterCardNumber(CardNumber);
        orderReturnSummaryModel.enterExpDate(ExpDate);
        orderReturnSummaryModel.enterCVC(CVC);
        orderReturnSummaryModel.EnterZip(Zip);
    }
    public void ClickOnPayNowBtn(){
        orderReturnSummaryModel.ClickOnPayNowBtn();
    }

    public void ClickOnSelectStoreOption(){
        orderReturnSummaryModel.ClickOnSelectStoreBtn();
    }

    public void ClickHappyReturnsIcon(){
        orderReturnSummaryModel.ClickOnHappyReturnsIcon();
    }
}
