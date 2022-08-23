package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.Login_OReturns;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;
import static com.techwith.ui.models.customUtils.elementCommonUtils.SendKeyBy;

@Component
public class Login_OReturns_Model {

    @Autowired
    public Login_OReturns login_oReturns;

    public void enterEmailAddress(String emailAddress){
        SendKeyBy(login_oReturns.EnterEmailAddress , emailAddress);
    }
    public void enterPassword(String password){
        SendKeyBy(login_oReturns.EnterPassword , password);
    }
    public void ClickLogInBtn(){
        ClickBy(login_oReturns.ClickLogInButton);
    }
}
