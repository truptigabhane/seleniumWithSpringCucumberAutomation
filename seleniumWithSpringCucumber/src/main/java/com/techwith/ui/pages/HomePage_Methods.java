package com.techwith.ui.pages;

import com.techwith.ui.models.HomePage_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomePage_Methods {

    @Autowired
    public HomePage_Model homePageModel;

    public void ClickOnCreateAReturnButton(){
        homePageModel.CreateAReturn();
    }
}
