package com.techwith.steps.ui;

import com.techwith.ui.pages.SignIn_OmniRPS_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class SignIn_OmniRPSSteps {

    @Autowired
    public SignIn_OmniRPS_Methods signIn_omniRPS_methods;

    @When("Enter UserName And Password and Click On SignIn Button")
    public void enterUserNameAndPasswordAndClickOnSignInButton(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data){
            String userName = mapData.get("UserName");
            String password = mapData.get("Password");
            signIn_omniRPS_methods.EnterUserNameAndPassword(userName  + "@sstechsystem.com", password);
        }
        signIn_omniRPS_methods.ClickOnSignInButton();
    }
}
