package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.Login_ORPS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;
import static com.techwith.ui.models.customUtils.elementCommonUtils.SendKeyBy;

@Component
public class Login_ORPS_Model {

    @Autowired
    public Login_ORPS login_orps;

    public void enterEmailAddress(String emailAddress){
        SendKeyBy(login_orps.EnterEmailAddress , emailAddress);
    }
    public void enterPassword(String emailAddress){
        SendKeyBy(login_orps.EnterPassword , emailAddress);
    }
    public void clickSignInButton(){
        ClickBy(login_orps.ClickSignInButton);
    }
    public void ClickOnOutersMenu(){
        ClickBy(login_orps.ClickOnOutersMenu);
    }
    public void ClickCreateOuterDropdownMenu(){
        ClickBy(login_orps.ClickCreateOuterDropdownMenu);
    }
    public void ClickOuterReportsDropdownMenu(){
        ClickBy(login_orps.ClickOuterReportsDropdownMenu);
    }
    public void ClickMAWBOuterConsolidations(){
        ClickBy(login_orps.ClickMAWBOuterConsolidations);
    }
    public void ClickOnProcessingMenu(){
        ClickBy(login_orps.ClickOnProcessingMenu);
    }
}
