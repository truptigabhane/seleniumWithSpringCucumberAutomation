package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.Success_OReturns;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.*;

@Component
public class Success_OReturns_Model {

    @Autowired
    public Success_OReturns success_oReturns;

    public String ValidateTheOrderNumber_Success(){

        return getDataValueByAttribute(success_oReturns.ValidateOrderNumber_Success_take);
    }

    public String ValidateTheName_Success(){
        return getDataValueByAttribute(success_oReturns.ValidateName_Success_take);
    }
}
