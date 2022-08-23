package com.techwith.steps.ui;

import com.techwith.helper.GenericHelper;
import com.techwith.ui.pages.Login_OReturns_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Login_OReturnsSteps {

    @Autowired
    public Login_OReturns_Methods login_oReturns_methods;

//    @Given("Enter EmailAddress And Password and Click On LogIn Button")
//    public void enterEmailAddressAndPasswordAndClickOnLogInButton(DataTable dataTable) {
//        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
//        for (Map<String,String> mapData:data){
//            String emailID = mapData.get("EmailID");
//            String password = mapData.get("Password");
//            login_oReturns_methods.EnterEmailAddressAndPassword(emailID + "@sstechsystem.com" , password);
//        }
//        login_oReturns_methods.ClickLogInButton();
//    }
//}


    @Given("Enter EmailAddress And Password and Click On LogIn Button")
    public void enterEmailAddressAndPasswordAndClickOnLogInButton() throws FileNotFoundException {
        GenericHelper helper = new GenericHelper();

        login_oReturns_methods.EnterEmailAddressAndPassword((helper.readJsonFile2("userManagement","userManagementTest.json","username")) , (helper.readJsonFile2("userManagement","userManagementTest.json","password")));


        login_oReturns_methods.ClickLogInButton();
    }


}