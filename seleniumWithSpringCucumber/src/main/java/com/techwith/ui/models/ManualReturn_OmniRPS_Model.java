package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.ManualReturn_OmniRPS;
import com.techwith.ui.models.customUtils.DropdownEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.*;

@Component
public class ManualReturn_OmniRPS_Model {

    @Autowired
    public ManualReturn_OmniRPS manualReturn_omniRPS;

//    public void SelectScanRetailer(String OptionName){
//        SendKeyBy(manualReturn_omniRPS.SelectScanRetailer , OptionName);
//    }

//    public void SelectScanRetailer(String OptionName){
//        DropDownBySelect((manualReturn_omniRPS.SelectScanRetailer), DropdownEnum.VISIBLE_TEXT() , OptionName);
//    }

    public void clickOnScanRetailerDropDown(String ScanRetailerDropDownNo){
        elementFromString(manualReturn_omniRPS.PreClickOnReturnReasonDropDown,ScanRetailerDropDownNo, manualReturn_omniRPS.Post2).click();
    }

    public void selectScanRetailerFromTheDropDown(String ScanRetailer){
        elementFromString(manualReturn_omniRPS.PreSelectReasonFromDropDown , ScanRetailer , manualReturn_omniRPS.PostReasonFromDropDown).click();
    }

    public void enterOrderNo(String orderNo){
        SendKeyBy(manualReturn_omniRPS.EnterOrderNo , orderNo);
    }

    public void selectReturnAction(String ReturnAction){
        DropDownBySelect((manualReturn_omniRPS.SelectReturnAction), DropdownEnum.VISIBLE_TEXT() , ReturnAction);
    }
}
