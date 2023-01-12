package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.Refundid;
import com.techwith.ui.models.customUtils.DropdownEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.*;

@Component
public class Refundid_Model {

    @Autowired
    public Refundid refundid;

    public void selectStore(String storeName){
        DropDownBySelect((refundid.SelectStore), DropdownEnum.VISIBLE_TEXT() , storeName);
    }

    public void enterOrderNo(String orderNo){
        SendKeyBy(refundid.EnterOrderNo , orderNo);
    }

    public void enterEmail(String email){
        SendKeyBy(refundid.EnterEmail , email);
    }

    public void clickContinueButton(){
        ClickBy(refundid.ClickContinueButton);
    }
}
