package com.techwith.ui.pages;

import com.techwith.ui.models.SignIn_OmniRPS_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignIn_OmniRPS_Methods {

    @Autowired
    public SignIn_OmniRPS_Model signIn_omniRPS_model;

    public void EnterUserNameAndPassword(String userName , String password) {
        signIn_omniRPS_model.enterUserName(userName);
        signIn_omniRPS_model.enterPassword(password);
    }

    public void ClickOnSignInButton(){
        signIn_omniRPS_model.ClickOnSignInBtn();
    }
}
