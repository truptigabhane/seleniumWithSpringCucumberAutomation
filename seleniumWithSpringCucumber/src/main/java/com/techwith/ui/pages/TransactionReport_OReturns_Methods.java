package com.techwith.ui.pages;

import com.techwith.ui.models.TransactionReport_OReturns_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionReport_OReturns_Methods {

    @Autowired
    public TransactionReport_OReturns_Model transactionReport_oReturns_model;

    public void FillSearch(String Search) {
        transactionReport_oReturns_model.enterSearch(Search);
    }

    public void SelectTheCompanyToSearch(String company ) {
        transactionReport_oReturns_model.SelectTheCompany(company);
    }

    public void EnterTheSearchRetailerToSearch(String searchRetailer ) {
        transactionReport_oReturns_model.EnterTheSearchRetailer(searchRetailer);
    }

    public void EnterTheStartDateToSearch(String startDate ) {
        transactionReport_oReturns_model.EnterTheStartDate(startDate);
    }

    public void EnterTheEndDateToSearch(String endDate ) {
        transactionReport_oReturns_model.EnterTheEndDate(endDate);
    }

    public void ClickExportToExcelButton(){
        transactionReport_oReturns_model.ClickExportToExcelBtn();
    }

    public void ClickSearchButton(){
        transactionReport_oReturns_model.ClickSearchBtn();
    }
}
