package com.techwith.ui.pages;

import com.techwith.ui.models.RetailersManage_OReturns_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RetailersManage_OReturns_Methods {

    @Autowired
    public RetailersManage_OReturns_Model retailersManage_oReturns_model;

    public void ClickOnAddRetailer(){ retailersManage_oReturns_model.ClickAddRetailer(); }

    public void ClickOnRetailerChangeLog(){
        retailersManage_oReturns_model.ClickRetailerChangeLog();
    }

    public void ClickOnEditBtnRetailer41(){ retailersManage_oReturns_model.ClickEditBtnRetailer41(); }
    public void ClickOnAssignHub(){ retailersManage_oReturns_model.ClickAssignHub(); }
    public void ClickOnCountryFees(){ retailersManage_oReturns_model.ClickCountryFees(); }
    public void ClickOnPaymentGateway(){ retailersManage_oReturns_model.ClickPaymentGateway(); }
    public void ClickOnViewRetailers(){ retailersManage_oReturns_model.ClickOnViewRetailers(); }
    public void ClickOnSaveAndNextButton(){ retailersManage_oReturns_model.ClickSaveAndNextButton(); }
    public void ClickOnDeleteButton(){ retailersManage_oReturns_model.ClickDeleteButton(); }
    public void ClickOnTheSaveAndNextButton(){ retailersManage_oReturns_model.ClickOnTheSaveAndNextButton(); }
    public void clickSaveAndNextBtn(){ retailersManage_oReturns_model.ClickOnSaveAndNextBtn(); }
    public void ClickSaveAndPublishButton(){ retailersManage_oReturns_model.ClickOnSaveAndPublishButton(); }
    public void ClickRetailerPreviewButton(){ retailersManage_oReturns_model.ClickRetailerPreviewButton(); }
    public void ClickOnSaveButton(){ retailersManage_oReturns_model.ClickSaveButton(); }
    public void FillAddRetailerDetails( String name , String logo , String retailerName) {
        retailersManage_oReturns_model.selectName(name);
        retailersManage_oReturns_model.selectInputLogoFile(logo);
        retailersManage_oReturns_model.enterRetailerName(retailerName);
    }
    public void FillAssignHubsDetails( String addHub , String omniParcelKey) {
        retailersManage_oReturns_model.selectHub(addHub);
        retailersManage_oReturns_model.enterOmniParcelKey(omniParcelKey);
    }
    public void FillAssignedHubDetails(String multiLanguage , String gatewayType , String rootGateWay , String subGateWay , String priority) {
        retailersManage_oReturns_model.selectMultiLanguage(multiLanguage);
        retailersManage_oReturns_model.selectGatewayType(gatewayType);
        retailersManage_oReturns_model.selectRootGateWay(rootGateWay);
        retailersManage_oReturns_model.selectSubGateWay(subGateWay);
        retailersManage_oReturns_model.selectPriority(priority);
    }
    public void ValidateAndFillCountryFeesDetails(String returnType , String storeCredit , String exchange , String suburbLabel , String stateCityLabel , String postcodeLabel) {
//        retailersManage_oReturns_model.validateHubName(hubName);
//        retailersManage_oReturns_model.ValidateCarrier(carrier);
        retailersManage_oReturns_model.selectReturnType(returnType);
        retailersManage_oReturns_model.selectStoreCredit(storeCredit);
        retailersManage_oReturns_model.selectExchange(exchange);
        retailersManage_oReturns_model.selectSuburbLabel(suburbLabel);
        retailersManage_oReturns_model.selectStateCityLabel(stateCityLabel);
        retailersManage_oReturns_model.selectPostcodeLabel(postcodeLabel);
    }
    public void FillEditRetailerDetails( String backgroundImage , String favicon , String orderMethod) {
        retailersManage_oReturns_model.selectBackgroundImageFile(backgroundImage);
        retailersManage_oReturns_model.selectFaviconFile(favicon);
        retailersManage_oReturns_model.selectOrderMethod(orderMethod);
    }
}
