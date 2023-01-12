package com.techwith.ui.pages;

import com.techwith.ui.LocatorsPage.UserManage_OReturns;
import com.techwith.ui.models.CompaniesManage_OReturns_Model;
import com.techwith.ui.models.UserManage_OReturns_Model;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;
import static com.techwith.webdriver.WebDriverFactory.getDriver;

@Component
public class UserManage_OReturns_Methods {

    @Autowired
    public UserManage_OReturns_Model userManage_oReturns_model;
    @Autowired
    public CompaniesManage_OReturns_Methods companiesManage_oReturns_methods;
    @Autowired
    public UserManage_OReturns userManage_oReturns;
    @Autowired
    public CompaniesManage_OReturns_Model companiesManage_oReturns_model;

    public void ClickOnAddUser(){
        userManage_oReturns_model.ClickAddUser();
    }
    public void selectCompany(String Company){
    ClickBy(userManage_oReturns.SelectCompanyDropDown);
    companiesManage_oReturns_model.enterText(Company);
    getDriver().findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);
    }
    public void SelectRole(String Role){
        ClickBy(userManage_oReturns.SelectRoleDropDown);
        companiesManage_oReturns_model.enterText(Role);
        getDriver().findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);
    }
    public void SelectRetailer(String Retailer){
        ClickBy(userManage_oReturns.SelectRetailerDropDown);
        companiesManage_oReturns_model.enterText(Retailer);
        getDriver().findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);
    }
    public void SelectGroup(String Group){
        ClickBy(userManage_oReturns.SelectGroupDropDown);
        companiesManage_oReturns_model.enterText(Group);
        getDriver().findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);
    }
    public void FillAddUserDetails(String firstName ,String lastName , String email , String password , String company , String role , String retailer ) throws InterruptedException {
        userManage_oReturns_model.enterFirstName(firstName);
        userManage_oReturns_model.enterLastName(lastName);
        userManage_oReturns_model.enterEmail(email);
        userManage_oReturns_model.enterPassword(password);
        selectCompany(company);
        SelectRole(role);
        Thread.sleep(2000);
        SelectRetailer(retailer);
        Thread.sleep(2000);
//        SelectGroup(group);
    }
    public void SelectCompany(String Company){
        ClickBy(userManage_oReturns.SelectCompanyDropDownToSearch);
        companiesManage_oReturns_model.enterText(Company);
        getDriver().findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);
    }
    public void ClickOnViewUser(){ userManage_oReturns_model.clickOnViewUser();}
    public void ClickOnExportToExelButton(){ userManage_oReturns_model.clickExportToExelButton();}
    public void FillSearch(String Search) {
        userManage_oReturns_model.enterSearch(Search);
    }
    public void clickOnUserChangeLog(){ userManage_oReturns_model.clickOnUserChangeLog();}
}
