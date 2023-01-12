package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.CompaniesManage_OReturns;
import com.techwith.ui.LocatorsPage.UserManage_OReturns;
import com.techwith.ui.models.customUtils.elementCommonUtils;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;
import static com.techwith.ui.models.customUtils.elementCommonUtils.SendKeyBy;
import static com.techwith.webdriver.WebDriverFactory.getDriver;

@Component
public class UserManage_OReturns_Model {

    @Autowired
    public UserManage_OReturns userManage_oReturns;
    @Autowired
    public CompaniesManage_OReturns companiesManage_oReturns;

    public void ClickAddUser(){ ClickBy(userManage_oReturns.ClickAddUser);}

    public void enterSearch(String Search){
        SendKeyBy(userManage_oReturns.EnterSearch , Search);
    }
    public void enterFirstName(String Search){
        ClickBy(userManage_oReturns.EnterFirstName);
        SendKeyBy(userManage_oReturns.EnterFirstName , Search);
    }
    public void enterLastName(String Search){
        ClickBy(userManage_oReturns.EnterLastName);
        SendKeyBy(userManage_oReturns.EnterLastName , Search);
    }
    public void enterEmail(String Search){
        ClickBy(userManage_oReturns.EnterEmail);
        SendKeyBy(userManage_oReturns.EnterEmail , Search);
    }
    public void enterPassword(String Search){
        ClickBy(userManage_oReturns.EnterPassword);
        SendKeyBy(userManage_oReturns.EnterPassword , Search);
    }
    public void clickOnViewUser(){ ClickBy(userManage_oReturns.ClickOnViewUser);}
    public void clickExportToExelButton(){ ClickBy(userManage_oReturns.ClickExportToExelButton);}
    public void ClickOnDelete(){ ClickBy(userManage_oReturns.ClickOnDelete);}
    public void ClickOnYes(){ ClickBy(userManage_oReturns.ClickOnYes);}
    public void ClickOnNo(){ ClickBy(userManage_oReturns.ClickOnNo);}
    public void clickOnUserChangeLog(){ ClickBy(userManage_oReturns.ClickOnUserChangeLog);}
    public boolean ValidateChangeTypeTableDetails(String Search) {
        Boolean value = getDriver().findElement(By.xpath(companiesManage_oReturns.SelectStartDate + Search + companiesManage_oReturns.PostSelectStartDate)).isDisplayed();
        return value;
    }
    public void ValidateDisplay(String ChangeType) {
        Boolean ChangeTypeValidation = ValidateChangeTypeTableDetails(ChangeType);
        elementCommonUtils.assertBoolValues(Boolean.TRUE, ChangeTypeValidation);
    }
    public boolean ValidateTableDetails(String Search) {
        Boolean value = getDriver().findElement(By.xpath(userManage_oReturns.ValidateDataTable + Search + userManage_oReturns.PostValidateDataTable)).isDisplayed();
        return value;
    }
    public void ValidateTableDisplay(String ChangeType) {
        Boolean ChangeTypeValidation = ValidateTableDetails(ChangeType);
        elementCommonUtils.assertBoolValues(Boolean.TRUE, ChangeTypeValidation);
    }
}
