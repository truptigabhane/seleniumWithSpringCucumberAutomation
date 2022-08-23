package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.BookReturns_OReturns;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;
import static com.techwith.ui.models.customUtils.elementCommonUtils.SendKeyBy;

@Component
public class BookReturns_Model {

    @Autowired
    public BookReturns_OReturns bookReturnsOReturns;

    public void SearchWithRetailerName(String RetailerName){
        SendKeyBy(bookReturnsOReturns.SearchRetailer , RetailerName);
    }

    public void ClickOnSekoDemoStore_41(){
       ClickBy(bookReturnsOReturns.ClickOnSekoDemoStore_41);
    }

}
