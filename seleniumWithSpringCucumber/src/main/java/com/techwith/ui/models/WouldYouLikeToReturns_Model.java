package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.WouldYouLikeToReturn_OReturns;
import com.techwith.ui.models.customUtils.DropdownEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.*;

@Component
public class WouldYouLikeToReturns_Model {

    @Autowired
    public WouldYouLikeToReturn_OReturns wouldYouLikeToReturnOReturns;


    public String FetchAndValidateOrderNumber() {
        return fetchDataByInput(wouldYouLikeToReturnOReturns.ValidateOrderNumber);
    }

    public String FetchAndValidateEmailID() {
        return fetchDataByInput(wouldYouLikeToReturnOReturns.ValidateEmailID);
    }

    public void selectOrderNumberCheckbox(String ProductNumber){
        ClickByJavaScript(wouldYouLikeToReturnOReturns.SingleOrderCheckBox , ProductNumber , wouldYouLikeToReturnOReturns.Post);
    }

    public void clickOnReturnReasonDropDown(String ReturnReasonDropDownNo){
        elementFromString(wouldYouLikeToReturnOReturns.PreClickOnReturnReasonDropDown,ReturnReasonDropDownNo, wouldYouLikeToReturnOReturns.Post2).click();
    }

    public void selectReturnReasonFromTheDropDown(String ReturnReason){
        elementFromString(wouldYouLikeToReturnOReturns.PreSelectReasonFromDropDown , ReturnReason , wouldYouLikeToReturnOReturns.PostReasonFromDropDown).click();
    }

    public void clickOnReturnReasonOptionDropDown(String ReturnReasonOptionDropDownNo){
        elementFromString(wouldYouLikeToReturnOReturns.PreClickOnReturnReasonOptionDropDown , ReturnReasonOptionDropDownNo , wouldYouLikeToReturnOReturns.Post2).click();
    }

    public void selectReturnReasonOptionTheDropDown(int ReturnReasonOptionDropDownNo , String OptionName){
        DropDownBySelect(StringToByWithIntegerForXpath(wouldYouLikeToReturnOReturns.PreSelectOptionsRefund , ReturnReasonOptionDropDownNo , wouldYouLikeToReturnOReturns.Post2), DropdownEnum.VISIBLE_TEXT() , OptionName);

    }
}
