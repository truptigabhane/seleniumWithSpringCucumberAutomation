package com.techwith.ui.pages;

import com.techwith.ui.models.Dashboard_OReturns_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dashboard_OReturns_Methods {

    @Autowired
    public Dashboard_OReturns_Model dashboard_oReturns_model;

    public void ClickOnManageMenuDropDown(){
        dashboard_oReturns_model.ClickManageDropDown();
    }
    public void SelectTheGroupsMenu(){
        dashboard_oReturns_model.SelectGroupsMenu();
    }
    public void SelectTheFAQMenu(){
        dashboard_oReturns_model.SelectFAQMenu();
    }
    public void SelectTheCompaniesMenu(){ dashboard_oReturns_model.SelectCompaniesMenu();}
    public void SelectTheTranslationsMenu(){ dashboard_oReturns_model.SelectTranslationsMenu();}


    public void SelectTheHubMenu(){ dashboard_oReturns_model.SelectHubMenu();}

    public void SelectTheRetailerMenu(){ dashboard_oReturns_model.SelectRetailerMenu();}
    public void SelectTheCarriersMenu(){ dashboard_oReturns_model.SelectCarriersMenu();}
    public void SelectTheModuleMenu(){ dashboard_oReturns_model.SelectModuleMenu();}
    public void SelectTheRoleMenu(){ dashboard_oReturns_model.SelectRoleMenu();}

    public void SelectTheUserMenu(){ dashboard_oReturns_model.SelectUserMenu();}

    public void ClickOnReportingMenuDropDown(){
        dashboard_oReturns_model.ClickReportingDropDown();
    }
    public void SelectTheReportingToSearchOrderAndConsignmentNo(){
        dashboard_oReturns_model.SelectReportingMenu();
    }
    public void SelectTheReturnsPendingReviewMenu(){
        dashboard_oReturns_model.SelectReturnsPendingReviewMenu();
    }
}
