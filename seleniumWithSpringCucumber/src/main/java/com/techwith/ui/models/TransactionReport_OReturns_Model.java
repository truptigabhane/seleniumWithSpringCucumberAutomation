package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.TransactionReport_OReturns;
import com.techwith.ui.models.customUtils.DropdownEnum;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.*;
import static com.techwith.webdriver.WebDriverFactory.getDriver;

@Component
public class TransactionReport_OReturns_Model {

    @Autowired
    public TransactionReport_OReturns transactionReport_oReturns;

    @Autowired
    public com.techwith.ui.models.customUtils.elementCommonUtils elementCommonUtils;

    public void enterSearch(String Search){
        SendKeyBy(transactionReport_oReturns.EnterSearch , Search);
    }

    public void SelectTheCompany(String Company){
        DropDownBySelect((transactionReport_oReturns.SelectCompany), DropdownEnum.VISIBLE_TEXT() , Company);
    }

    public void EnterTheSearchRetailer(String SearchRetailer){
        SendKeyBy(transactionReport_oReturns.EnterSearchRetailer , SearchRetailer);
    }

    public void EnterTheStartDate(String StartDate){
        SendKeyBy(transactionReport_oReturns.EnterStartDate , StartDate);
    }

    public void EnterTheEndDate(String EndDate){
        SendKeyBy(transactionReport_oReturns.EnterEndDate , EndDate);
    }

    public void ClickExportToExcelBtn(){
        ClickBy(transactionReport_oReturns.ClickExportToExcelButton);
    }

    public void ClickSearchBtn(){
        ClickBy(transactionReport_oReturns.ClickSearchButton);
    }

}
