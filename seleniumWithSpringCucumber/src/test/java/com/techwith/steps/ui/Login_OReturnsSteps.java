package com.techwith.steps.ui;

import com.techwith.helper.GenericHelper;
import com.techwith.ui.models.CompaniesManage_OReturns_Model;
import com.techwith.ui.models.Login_OReturns_Model;
import com.techwith.ui.pages.Login_OReturns_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import static com.techwith.webdriver.WebDriverFactory.getDriver;

public class Login_OReturnsSteps {

    @Autowired
    public Login_OReturns_Methods login_oReturns_methods;
    @Autowired
    public Login_OReturns_Model login_oReturns_model;
    @Autowired
    public CompaniesManage_OReturns_Model companiesManage_oReturns_model;

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

    @Given("Enter EmailAddress And Password and Click On LogIn Button")
    public void enterEmailAddressAndPasswordAndClickOnLogInButton() throws FileNotFoundException {
        GenericHelper helper = new GenericHelper();

        login_oReturns_methods.EnterEmailAddressAndPassword((helper.readJsonFile2("userManagement","userManagementTest.json","username")) , (helper.readJsonFile2("userManagement","userManagementTest.json","password")));

        login_oReturns_methods.ClickLogInButton();
    }

    @Given("Without Entering EmailAddress And Password and Click On LogIn Button")
    public void withoutEnteringEmailAddressAndPasswordAndClickOnLogInButton() {
        login_oReturns_methods.ClickLogInButton();
    }
    @Given("Without Entering Password Click On LogIn Button")
    public void withoutEnteringPasswordClickOnLogInButton(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data){
            String emailID = mapData.get("EmailID");
            login_oReturns_methods.EnterEmailAddress(emailID + "@sstechsystem.com" );
        }
        login_oReturns_methods.ClickLogInButton();
    }
    @Given("Without Entering EmailAddress Click On LogIn Button")
    public void withoutEnteringEmailAddressClickOnLogInButton(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data){
            String password = mapData.get("Password");
            login_oReturns_methods.EnterPassword(password);
        }
        login_oReturns_methods.ClickLogInButton();
    }
    @Then("Validate Message")
    public void validateMessage(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {
            String error = mapData.get("Error");
            login_oReturns_model.ValidateErrorDisplay(error);
        }
    }
    @Given("Click On Forget Password")
    public void clickOnForgetPassword() {
        login_oReturns_model.ClickOnForgetPassword();
    }
    @Given("Click On Login Link")
    public void clickOnLoginLink() {
        login_oReturns_model.ClickOnLoginLink();
    }
    @Given("Click On Submit Button On Forget Password Page")
    public void clickOnSubmitButtonOnForgetPasswordPage() {
        login_oReturns_model.ClickOnSubmitButton();
    }
    @Given("Login With Wrong EmailAddress And Password And Click On LogIn Button")
    public void loginWithWrongEmailAddressAndPasswordAndClickOnLogInButton(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data){
            String emailID = mapData.get("EmailID");
            String password = mapData.get("Password");
            login_oReturns_methods.EnterEmailAddressAndPassword(emailID + "@sstechsystem.com" , password);
        }
        login_oReturns_methods.ClickLogInButton();
    }
    @Given("Login With Valid EmailAddress And Password And Click On LogIn Button")
    public void loginWithValidEmailAddressAndPasswordAndClickOnLogInButton(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data){
            String emailID = mapData.get("EmailID");
            String password = mapData.get("Password");
            login_oReturns_methods.EnterEmailAddressAndPassword(emailID + "@sstechsystem.com" , password);
        }
        login_oReturns_methods.ClickLogInButton();
    }
    @Given("Enter Invalid Email Address And Click On Submit Button")
    public void enterInvalidEmailAddressAndClickOnSubmitButton(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data){
            String emailID = mapData.get("EmailID");
            login_oReturns_methods.EnterEmailAddressForReset(emailID + "@sstechsystem.com");
        }
    }
    @Given("Open Reset Password Link")
    public void openResetPasswordLink(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data){
            String linkOnEmail = mapData.get("LinkOnEmail");
            getDriver().get(linkOnEmail);
        }
    }
    @Then("Check And Validate Mandatory Required Field")
    public void checkAndValidateMandatoryRequiredField(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {

            String newPassword = mapData.get("NewPassword");
            companiesManage_oReturns_model.ValidateErrorDisplay(newPassword);

            String confirmPassword = mapData.get("ConfirmPassword");
            companiesManage_oReturns_model.ValidateErrorDisplay(confirmPassword);
        }
    }
    @Then("Check And Validate Mandatory Required Password Field For Confirm Password")
    public void checkAndValidateMandatoryRequiredPasswordFieldForConfirmPassword(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {

            String confirmPassword = mapData.get("ConfirmPassword");
            companiesManage_oReturns_model.ValidateErrorDisplay(confirmPassword);
        }
    }
    @Then("Check And Validate Mandatory Required Password Field For Password")
    public void checkAndValidateMandatoryRequiredPasswordFieldForPassword(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> mapData : data) {

            String newPassword = mapData.get("NewPassword");
            companiesManage_oReturns_model.ValidateErrorDisplay(newPassword);
        }
    }
    @Given("Enter Confirm Password")
    public void enterConfirmPassword(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data){
            String confirmPassword = mapData.get("ConfirmPassword");
            login_oReturns_methods.EnterConfirmPassword(confirmPassword);
        }
    }
    @Given("Enter Password")
    public void enterPassword(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data){
            String password = mapData.get("Password");
            login_oReturns_methods.EnterPassword(password);
        }
    }
    @Given("Enter Password And Confirm Password")
    public void enterPasswordAndConfirmPassword(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData:data){
            String password = mapData.get("Password");
            String confirmPassword = mapData.get("ConfirmPassword");
            login_oReturns_methods.EnterPassword(password);
            login_oReturns_methods.EnterConfirmPassword(confirmPassword);
        }
    }
}