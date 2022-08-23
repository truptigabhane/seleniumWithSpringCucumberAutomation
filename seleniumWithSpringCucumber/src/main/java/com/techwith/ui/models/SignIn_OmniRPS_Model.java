package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.SignIn_OmniRPS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;
import static com.techwith.ui.models.customUtils.elementCommonUtils.SendKeyBy;

@Component
public class SignIn_OmniRPS_Model {

    @Autowired
    public SignIn_OmniRPS signIn_omniRPS;

    public void enterUserName(String userName){
        SendKeyBy(signIn_omniRPS.EnterUserName , userName);
    }
    public void enterPassword(String password){
        SendKeyBy(signIn_omniRPS.EnterPassword , password);
    }
    public void ClickOnSignInBtn(){
        ClickBy(signIn_omniRPS.ClickSignInButton);
    }
}
