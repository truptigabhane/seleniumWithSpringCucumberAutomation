package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.OrderReturnSummary_OReturns;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Nullable;

import java.sql.Driver;

import static com.techwith.ui.models.customUtils.elementCommonUtils.*;

@Component
public class OrderReturnSummary_Model {

    @Autowired
    public OrderReturnSummary_OReturns orderReturnSummaryOReturns;

    public String ValidateTheOrderNumber(){
       return fetchDataByGetText(orderReturnSummaryOReturns.ValidateOrderNumber);
    }

    public String ValidateTheProductName(int i){
        return fetchDataByGetTexts(orderReturnSummaryOReturns.ValidateProductName , i);
    }

    public String ValidateTheReturnReason(int i){
        return fetchDataByGetTexts(orderReturnSummaryOReturns.ValidateReturnReason , i);
    }

    public String ValidateTheReturnOption(int i){
        return fetchDataByGetTexts(orderReturnSummaryOReturns.ValidateReturnOption , i);
    }

    public void selectRefundType(String RefundType){
        elementFromString(orderReturnSummaryOReturns.PreRefundType, RefundType , orderReturnSummaryOReturns.PostRefundType).click();
//        ScrollIntoElement(ElementBy(orderReturnSummaryOReturns.ClickPayNowButton));
    }

    public void selectServices(String serviceName , int i){
//        ScrollIntoElement(ElementBy(orderReturnSummaryOReturns.ClickSubmitButton));
        ScrollIntoElement(ElementBy(orderReturnSummaryOReturns.ClickPayNowButton));
        elementFromStringX4(orderReturnSummaryOReturns.PreClickGenericReturnButton,serviceName , orderReturnSummaryOReturns.MidClickGenericReturnButton,
                i,orderReturnSummaryOReturns.PostClickGenericReturnButton).click();
    }

    public void ClickOnSubmitBtn(){
        ClickBy(orderReturnSummaryOReturns.ClickSubmitButton);
    }

    public void enterCardNumber(String CardNumber){
        SendKeyBy(orderReturnSummaryOReturns.EnterCardNumber,CardNumber);
    }

    public void enterExpDate(String ExpDate){
        SendKeyBy(orderReturnSummaryOReturns.EnterExpDate,ExpDate);
    }
    public void enterCVC(String CVC){
        SendKeyBy(orderReturnSummaryOReturns.EnterCVC,CVC);
    }
    public void EnterZip(String Zip){
        SendKeyBy(orderReturnSummaryOReturns.EnterZip,Zip);
    }

    public void ClickOnPayNowBtn(){
        ClickBy(orderReturnSummaryOReturns.ClickPayNowButton);
    }

    public void ClickOnSelectStoreBtn(){
        ClickBy(orderReturnSummaryOReturns.ClickOnSelectStore);
    }

    public void ClickOnHappyReturnsIcon(){
        ClickBy(orderReturnSummaryOReturns.ClickHappyReturnsIcon);
    }

}
