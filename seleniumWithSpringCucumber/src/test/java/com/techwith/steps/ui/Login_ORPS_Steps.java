package com.techwith.steps.ui;

import com.techwith.ui.models.UserManage_OReturns_Model;
import com.techwith.ui.pages.Login_ORPS_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class Login_ORPS_Steps {

    @Autowired
    public Login_ORPS_Methods login_orps_methods;
    @Autowired
    public UserManage_OReturns_Model userManage_oReturns_model;

    @Given("Enter EmailAddress And Password and Click On LogIn Btn")
    public void enterEmailAddressAndPasswordAndClickOnLogInBtn(DataTable dataTable) {List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data){
            String emailID = mapData.get("EmailID");
            String password = mapData.get("Password");
            login_orps_methods.EnterEmailAddressAndPassword(emailID + "@sstechsystem.com" , password);
        }
        login_orps_methods.ClickSignInButton();
    }
    @And("Click on Outers Menu")
    public void clickOnOutersMenu() throws InterruptedException {
        login_orps_methods.ClickOnOutersMenu();
        Thread.sleep(1000);
    }
    @And("Click Create Outer Dropdown Menu")
    public void clickCreateOuterDropdownMenu() throws InterruptedException {
        login_orps_methods.ClickCreateOuterDropdownMenu();
        Thread.sleep(1000);
    }
    @And("Click Outer Reports Dropdown Menu")
    public void clickOuterReportsDropdownMenu() throws InterruptedException {
        login_orps_methods.ClickOuterReportsDropdownMenu();
        Thread.sleep(1000);
    }
    @And("Click MAWB - Outer Consolidations")
    public void clickMAWBOuterConsolidations() throws InterruptedException {
        login_orps_methods.ClickMAWBOuterConsolidations();
        Thread.sleep(1000);
    }
    @And("Click on Processing Menu")
    public void clickOnProcessingMenu() throws InterruptedException {
        login_orps_methods.clickOnProcessingMenu();
        Thread.sleep(1000);
    }
    @Then("Validate Details")
    public void validateDetails(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String mode = mapData.get("Mode");
            userManage_oReturns_model.ValidateDisplay(mode);
        }
    }
}
