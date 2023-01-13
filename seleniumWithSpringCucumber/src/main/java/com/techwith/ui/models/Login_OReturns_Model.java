package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.Login_OReturns;
import com.techwith.ui.models.customUtils.elementCommonUtils;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;
import static com.techwith.ui.models.customUtils.elementCommonUtils.SendKeyBy;
import static com.techwith.webdriver.WebDriverFactory.getDriver;

@Component
public class Login_OReturns_Model {

    @Autowired
    public Login_OReturns login_oReturns;

    public void enterEmailAddress(String emailAddress){
        SendKeyBy(login_oReturns.EnterEmailAddress , emailAddress);
    }
    public void enterEmailAddressForReset(String emailAddress){
        SendKeyBy(login_oReturns.EnterEmailAddressForReset , emailAddress);
    }
    public void enterPassword(String password){
        SendKeyBy(login_oReturns.EnterPassword , password);
    }
    public void enterConfirmPassword(String confirmPassword){
        SendKeyBy(login_oReturns.EnterConfirmPassword , confirmPassword);
    }
    public void ClickLogInBtn(){
        ClickBy(login_oReturns.ClickLogInButton);
    }

    public boolean ValidateTheErrorMessage(String Search) {
        Boolean value = getDriver().findElement(By.xpath(login_oReturns.ValidateError + Search + login_oReturns.PostValidateError)).isDisplayed();
        return value;
    }
    public void ValidateErrorDisplay(String Error) {
        Boolean ErrorValidation = ValidateTheErrorMessage(Error);
        elementCommonUtils.assertBoolValues(Boolean.TRUE, ErrorValidation);
    }
    public void ClickOnForgetPassword(){
        ClickBy(login_oReturns.ClickForgetPassword);
    }
    public void ClickOnSubmitButton(){
        ClickBy(login_oReturns.ClickSubmitButton);
    }
    public void ClickOnLoginLink(){
        ClickBy(login_oReturns.ClickLoginLink);
    }

}
