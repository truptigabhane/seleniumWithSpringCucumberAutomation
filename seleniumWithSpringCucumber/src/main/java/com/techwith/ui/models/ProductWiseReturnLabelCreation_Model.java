package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.ProductWiseReturnLabelCreation;
import com.techwith.ui.models.customUtils.DropdownEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.DropDownBySelect;
import static com.techwith.ui.models.customUtils.elementCommonUtils.SendKeyBy;

@Component
public class ProductWiseReturnLabelCreation_Model {

    @Autowired
    public ProductWiseReturnLabelCreation productWiseReturnLabelCreation;

    public void enterProductValue(String productValue){
        SendKeyBy(productWiseReturnLabelCreation.EnterProductValue , productValue);
    }

    public void selectDescription(String description){
        DropDownBySelect((productWiseReturnLabelCreation.SelectDescription), DropdownEnum.VISIBLE_TEXT() , description);
    }

    public void selectWhyAreYouReturning(String returnReason){
        DropDownBySelect((productWiseReturnLabelCreation.SelectWhyAreYouReturning), DropdownEnum.VISIBLE_TEXT() , returnReason);
    }


    public void selectReturnAction(String returnAction){
        DropDownBySelect((productWiseReturnLabelCreation.SelectReturnAction), DropdownEnum.VISIBLE_TEXT() , returnAction);
    }
}
