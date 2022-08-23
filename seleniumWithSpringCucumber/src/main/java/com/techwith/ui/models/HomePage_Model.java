package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.HomePage_OReturns;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;
import static com.techwith.webdriver.WebDriverFactory.getDriver;


@Component
public class HomePage_Model {

    @Autowired
    public HomePage_OReturns homePageOReturns;


    public void CreateAReturn(){
        ClickBy(homePageOReturns.CreateAReturnButton);
    }



}
