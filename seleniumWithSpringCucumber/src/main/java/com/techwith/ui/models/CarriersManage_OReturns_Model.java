package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.CarriersManage_OReturns;
import com.techwith.ui.models.customUtils.elementCommonUtils;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;
import static com.techwith.ui.models.customUtils.elementCommonUtils.SendKeyBy;
import static com.techwith.webdriver.WebDriverFactory.getDriver;

@Component
public class CarriersManage_OReturns_Model {

    @Autowired
    public CarriersManage_OReturns carriersManage_oReturns;

    public void ClickAddCarriers(){ ClickBy(carriersManage_oReturns.ClickAddCarriers);}
    public void ClickViewCarriers(){ ClickBy(carriersManage_oReturns.ClickViewCarriers);}
    public void enterCarrierName(String carrierName){ SendKeyBy(carriersManage_oReturns.enterCarrierName , carrierName);}
    public void enterOmniParcelID(String omniParcelID){ SendKeyBy(carriersManage_oReturns.enterOmniParcelID , omniParcelID);}
    public void enterOmniParcelCarrierName(String omniParcelCarrierName){ SendKeyBy(carriersManage_oReturns.enterOmniParcelCarrierName , omniParcelCarrierName);}
    public void checkHub(){ ClickBy(carriersManage_oReturns.CheckHub);}
    public void enterSearch(String search){ SendKeyBy(carriersManage_oReturns.enterSearch , search);}

    public boolean ValidateTheError(String Search) {
        Boolean value = getDriver().findElement(By.xpath(carriersManage_oReturns.ValidateError + Search + carriersManage_oReturns.PostValidateError)).isDisplayed();
        return value;
    }
    public void ValidateDuplicateErrorDisplay(String Error) {
        Boolean ErrorValidation = ValidateTheError(Error);
        elementCommonUtils.assertBoolValues(Boolean.TRUE, ErrorValidation);
    }

    public void ClickEditIconToEdit(){ ClickBy(carriersManage_oReturns.ClickEditIconToEdit);}
    public void ClickCarrierChangeLog(){ ClickBy(carriersManage_oReturns.ClickCarrierChangeLog);}

    public boolean ValidateLogDtailPopUp(String Search) {
        Boolean value = getDriver().findElement(By.xpath(carriersManage_oReturns.ValidatePopUpHead + Search + carriersManage_oReturns.PostValidatePopUpHead)).isDisplayed();
        return value;
    }
    public void ValidatePopUpHead(String PopUp) {
        Boolean PopUpHeading = ValidateLogDtailPopUp(PopUp);
        elementCommonUtils.assertBoolValues(Boolean.TRUE, PopUpHeading);
    }
}
