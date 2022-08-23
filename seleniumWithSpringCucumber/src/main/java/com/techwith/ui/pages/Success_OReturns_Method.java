package com.techwith.ui.pages;

import com.techwith.ui.models.Success_OReturns_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.SplitTheString;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Component
public class Success_OReturns_Method {

    @Autowired
    public Success_OReturns_Model success_oReturns_model;

    public void ValidateOrderNumber_Success(String ExpectedOrderNumber){
        String OrderNumber = success_oReturns_model.ValidateTheOrderNumber_Success();
        System.out.println(OrderNumber);
        String finalOrderNumber = SplitTheString(OrderNumber);
        assertEquals(ExpectedOrderNumber , finalOrderNumber);
    }

    public void ValidateName_Success(String ExpectedName){
        String Name = success_oReturns_model.ValidateTheName_Success();
        System.out.println(Name);
        String finalName = SplitTheString(Name);
        assertEquals(ExpectedName , finalName);
    }

}
