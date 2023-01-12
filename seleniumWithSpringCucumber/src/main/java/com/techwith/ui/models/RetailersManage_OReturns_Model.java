package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.RetailersManage_OReturns;
import com.techwith.ui.models.customUtils.DropdownEnum;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.*;
import static com.techwith.webdriver.WebDriverFactory.getDriver;

@Component
public class RetailersManage_OReturns_Model {

    @Autowired
    public RetailersManage_OReturns retailersManage_oReturns;

    public void ClickAddRetailer(){ ClickBy(retailersManage_oReturns.ClickAddRetailer);}
    public void ClickRetailerChangeLog(){ ClickBy(retailersManage_oReturns.ClickRetailerChangeLog);}
    public void ClickEditBtnRetailer41(){ ClickBy(retailersManage_oReturns.ClickEditBtnRetailer41);}
    public void ClickAssignHub(){ ClickBy(retailersManage_oReturns.ClickAssignHub);}
    public void ClickCountryFees(){ ClickBy(retailersManage_oReturns.ClickCountryFees);}
    public void ClickPaymentGateway(){ ClickBy(retailersManage_oReturns.ClickPaymentGateway);}
    public void ClickOnViewRetailers(){ ClickBy(retailersManage_oReturns.ClickViewRetailers);}
    public void ClickSaveAndNextButton(){ ClickBy(retailersManage_oReturns.ClickSaveAndNextBtn);}
    public void ClickDeleteButton(){ ClickBy(retailersManage_oReturns.ClickDeleteButton);}
    public void ClickOnTheSaveAndNextButton(){ ClickBy(retailersManage_oReturns.ClickOnTheSaveAndNextButton);}
    public void ClickOnSaveAndNextBtn(){ ClickBy(retailersManage_oReturns.ClickOnSaveAndNextBtn);}
    public void ClickOnSaveAndPublishButton(){ ClickBy(retailersManage_oReturns.ClickOnSaveAndPublishButton);}
    public void ClickRetailerPreviewButton(){ ClickBy(retailersManage_oReturns.ClickRetailerPreviewButton);}
    public void ClickSaveButton(){ ClickBy(retailersManage_oReturns.ClickSaveButton);}
    public void selectName(String name){
        DropDownBySelect((retailersManage_oReturns.SelectName), DropdownEnum.VISIBLE_TEXT() , name);
    }
    public void selectInputLogoFile(String logo){
        WebElement fileInput = getDriver().findElement(retailersManage_oReturns.InputLogoFile);
        fileInput.sendKeys(logo);
        }
    public void enterRetailerName(String retailerName){ SendKeyBy(retailersManage_oReturns.EnterRetailerName , retailerName);}
    public void selectHub(String addHub){
        ClickBy(retailersManage_oReturns.ClickAddHub);
        SendKeyBy(retailersManage_oReturns.ClickAddHub , addHub);
        ClickBy(retailersManage_oReturns.SelectHub);
        ClickBy(retailersManage_oReturns.ClickLabelOmniParcelKey);
    }
    public void enterOmniParcelKey(String omniParcelKey){ SendKeyBy(retailersManage_oReturns.EnterOmniParcelKey , omniParcelKey);}
    public void selectMultiLanguage(String multiLanguage){
        DropDownBySelect((retailersManage_oReturns.selectMultiLanguage), DropdownEnum.VISIBLE_TEXT() , multiLanguage);
    }
    public void selectGatewayType(String gatewayType){
        DropDownBySelect((retailersManage_oReturns.selectGatewayType), DropdownEnum.VISIBLE_TEXT() , gatewayType);
    }
    public void selectRootGateWay(String rootGateWay){
        DropDownBySelect((retailersManage_oReturns.selectRootGateWay), DropdownEnum.VISIBLE_TEXT() , rootGateWay);
    }
    public void selectSubGateWay(String subGateWay){
        DropDownBySelect((retailersManage_oReturns.selectSubGateWay), DropdownEnum.VISIBLE_TEXT() , subGateWay);
    }
    public void selectPriority(String priority){
        DropDownBySelect((retailersManage_oReturns.selectPriority), DropdownEnum.VISIBLE_TEXT() , priority);
    }
    public void selectReturnType(String returnType){
        DropDownBySelect((retailersManage_oReturns.selectReturnType), DropdownEnum.VISIBLE_TEXT() , returnType);
    }
    public void selectStoreCredit(String storeCredit){
        DropDownBySelect((retailersManage_oReturns.selectStoreCredit), DropdownEnum.VISIBLE_TEXT() , storeCredit);
    }
    public void selectExchange(String exchange){
        DropDownBySelect((retailersManage_oReturns.selectExchange), DropdownEnum.VISIBLE_TEXT() , exchange);
    }
    public void selectSuburbLabel(String suburbLabel){
        DropDownBySelect((retailersManage_oReturns.selectSuburbLabel), DropdownEnum.VISIBLE_TEXT() , suburbLabel);
    }
    public void selectStateCityLabel(String stateCityLabel){
        DropDownBySelect((retailersManage_oReturns.selectStateCityLabel), DropdownEnum.VISIBLE_TEXT() , stateCityLabel);
    }
    public void selectPostcodeLabel(String postcodeLabel){
        DropDownBySelect((retailersManage_oReturns.selectPostcodeLabel), DropdownEnum.VISIBLE_TEXT() , postcodeLabel);
    }
    public void selectBackgroundImageFile(String backgroundImage){
        WebElement fileInput = getDriver().findElement(retailersManage_oReturns.selectBackgroundImageFile);
        fileInput.sendKeys(backgroundImage);
    }
    public void selectFaviconFile(String favicon){
        WebElement fileInput = getDriver().findElement(retailersManage_oReturns.selectFaviconFile);
        fileInput.sendKeys(favicon);
    }
    public void selectOrderMethod(String orderMethod){
        DropDownBySelect((retailersManage_oReturns.selectOrderMethod), DropdownEnum.VISIBLE_TEXT() , orderMethod);
    }
}
