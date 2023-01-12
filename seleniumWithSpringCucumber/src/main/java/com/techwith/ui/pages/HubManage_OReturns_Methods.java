package com.techwith.ui.pages;

import com.techwith.ui.models.CompaniesManage_OReturns_Model;
import com.techwith.ui.models.HubManage_OReturns_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HubManage_OReturns_Methods {

    @Autowired
    public HubManage_OReturns_Model hubManage_oReturns_model;
    @Autowired
    public CompaniesManage_OReturns_Model companiesManage_oReturns_model;
    public void ClickOnAddHub(){
        hubManage_oReturns_model.ClickAddHub();
    }

    public void ClickOnHubChangeLog(){
        hubManage_oReturns_model.ClickHubChangeLog();
    }

    public void FillAddHubDeatils(String company , String name , String country , String suburb , String state_City , String postcode , String email) {
        hubManage_oReturns_model.selectCompany(company);
        hubManage_oReturns_model.enterName(name);
        companiesManage_oReturns_model.enterCountry(country);
        companiesManage_oReturns_model.enterSuburb(suburb);
        companiesManage_oReturns_model.enterState_City(state_City);
        companiesManage_oReturns_model.enterPostcode(postcode);
        companiesManage_oReturns_model.enterEmail(email);
    }
    public void ClickOnViewHubs(){ hubManage_oReturns_model.clickOnViewHubs();}
    public void UpdateHubDeatils( String name) {
        hubManage_oReturns_model.enterName(name);
    }
}
