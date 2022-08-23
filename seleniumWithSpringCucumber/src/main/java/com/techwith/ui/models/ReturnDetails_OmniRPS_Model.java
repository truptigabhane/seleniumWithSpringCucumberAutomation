package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.ReturnDetails_OmniRPS;
import com.techwith.ui.models.customUtils.DropdownEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.*;

@Component
public class ReturnDetails_OmniRPS_Model {

    @Autowired
    public ReturnDetails_OmniRPS returnDetails_omniRPS;

    public void selectHub(String OptionName){
        DropDownBySelect((returnDetails_omniRPS.SelectHub), DropdownEnum.VISIBLE_TEXT() , OptionName);
    }

    public void enterConsignment(String Consignment){
        SendKeyBy(returnDetails_omniRPS.EnterConsignment , Consignment);
    }

    public void ClickOnSubmitBtn(){
        ClickBy(returnDetails_omniRPS.ClickSubmitButton);
    }

}
