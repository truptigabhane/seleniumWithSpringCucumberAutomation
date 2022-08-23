package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.ConfirmYourDetails_OReturns;
import com.techwith.ui.models.customUtils.DropdownEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.*;

@Component
public class ConfirmYourDetails_Model {

    @Autowired
    public ConfirmYourDetails_OReturns confirmYourDetailsOReturns;


    public void enterFullName(String fullName){
        SendKeyBy(confirmYourDetailsOReturns.EnterFullName , fullName);
    }

    public void enterReturnOption(String returnOption){
        SendKeyBy(confirmYourDetailsOReturns.EnterReturnOption , returnOption);
    }


    public void selectCountry(String OptionName){
        DropDownBySelect((confirmYourDetailsOReturns.SelectCountry), DropdownEnum.VISIBLE_TEXT() , OptionName);
    }

    public void enterZipCode(String zipCode){
        SendKeyBy(confirmYourDetailsOReturns.EnterZipCode , zipCode);
    }

    public void enterBuilding(String building){
        SendKeyBy(confirmYourDetailsOReturns.EnterBuilding , building);
    }

    public void enterStreet(String street){
        SendKeyBy(confirmYourDetailsOReturns.EnterStreet , street);
    }

    public void enterCity(String city){
        SendKeyBy(confirmYourDetailsOReturns.EnterCity , city);
    }

    public void enterState(String state){
        SendKeyBy(confirmYourDetailsOReturns.EnterState , state);
    }

    public void enterContactNumber(String contactNumber){
        SendKeyBy(confirmYourDetailsOReturns.EnterContactNumber , contactNumber);
    }

    public void enterCouponCode(String couponCode){
        SendKeyBy(confirmYourDetailsOReturns.EnterCouponCode , couponCode);
    }

    public void enterTestExtraField(String extraField){
        SendKeyBy(confirmYourDetailsOReturns.EnterTestExtraField , extraField);
    }








}
