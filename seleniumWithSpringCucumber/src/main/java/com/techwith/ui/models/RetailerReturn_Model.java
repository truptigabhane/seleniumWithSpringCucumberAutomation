package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.Retailer_Return_OReturns;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.*;

@Component
public class RetailerReturn_Model {

    @Autowired
    public Retailer_Return_OReturns retailerReturnOReturns;


    public void enterOrderNumber(String enterOrderNumber){
        SendKeyBy(retailerReturnOReturns.EnterOrderNumber , enterOrderNumber);
    }

    public void enterEmailID(String EmailID){
        SendKeyBy(retailerReturnOReturns.EnterEmailID,EmailID);
    }

    public void ClickOnNextArrowButton(){
        ScrollIntoElement(ElementBy(retailerReturnOReturns.ClickOnNextArrowButton));
        ClickBy(retailerReturnOReturns.ClickOnNextArrowButton);
    }

}
