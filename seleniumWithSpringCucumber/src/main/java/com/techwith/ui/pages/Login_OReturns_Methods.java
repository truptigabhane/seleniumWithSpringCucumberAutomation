package com.techwith.ui.pages;

import com.techwith.ui.models.Login_OReturns_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Login_OReturns_Methods {

    @Autowired
    public Login_OReturns_Model login_oReturns_model;

    public void EnterEmailAddressAndPassword(String emailAddress , String password) {
        login_oReturns_model.enterEmailAddress(emailAddress);
        login_oReturns_model.enterPassword(password);
    }

    public void ClickLogInButton(){
        login_oReturns_model.ClickLogInBtn();
    }
}
