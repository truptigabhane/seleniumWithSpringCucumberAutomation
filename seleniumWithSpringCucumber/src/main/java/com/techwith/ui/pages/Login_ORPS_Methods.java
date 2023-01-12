package com.techwith.ui.pages;

import com.techwith.ui.models.Login_ORPS_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Login_ORPS_Methods {

    @Autowired
    public Login_ORPS_Model login_orps_model;

    public void EnterEmailAddressAndPassword(String emailAddress , String password) {
        login_orps_model.enterEmailAddress(emailAddress);
        login_orps_model.enterPassword(password);
    }
    public void ClickSignInButton(){
        login_orps_model.clickSignInButton();
    }
    public void ClickOnOutersMenu(){
        login_orps_model.ClickOnOutersMenu();
    }
    public void ClickCreateOuterDropdownMenu(){
        login_orps_model.ClickCreateOuterDropdownMenu();
    }
    public void ClickOuterReportsDropdownMenu(){
        login_orps_model.ClickOuterReportsDropdownMenu();
    }
    public void ClickMAWBOuterConsolidations(){
        login_orps_model.ClickMAWBOuterConsolidations();
    }
    public void clickOnProcessingMenu(){
        login_orps_model.ClickOnProcessingMenu();
    }
}
