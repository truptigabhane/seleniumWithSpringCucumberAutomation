package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.CompaniesManage_OReturns;
import com.techwith.ui.models.customUtils.elementCommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;
import static com.techwith.ui.models.customUtils.elementCommonUtils.SendKeyBy;
import static com.techwith.webdriver.WebDriverFactory.getDriver;

@Component
public class CompaniesManage_OReturns_Model {

    @Autowired
    public CompaniesManage_OReturns companiesManage_oReturns;

    public void enterSearch(String Search){ SendKeyBy(companiesManage_oReturns.SearchCompany , Search);}

    public void ClickSearchBtn(){ ClickBy(companiesManage_oReturns.ClickSearchButton);}
    public void ClickExportBtn(){ ClickBy(companiesManage_oReturns.ClickExportButton);}

    public void ClickAddCompany(){ ClickBy(companiesManage_oReturns.ClickAddCompany);}
    public void ClickCompanyChangeLog(){ ClickBy(companiesManage_oReturns.ClickCompanyChangeLog);}
    public void enterSearchKey(String Search){ SendKeyBy(companiesManage_oReturns.SearchKey , Search);}
    public void enterText(String ChangeTypeText){ SendKeyBy(companiesManage_oReturns.EnterChangeTypeText , ChangeTypeText);}
    public void enterStartDate(String StartDate){ SendKeyBy(companiesManage_oReturns.EnterStartDate , StartDate);}

    public void selectStartDateToSearch(String StartDate) throws InterruptedException {
        String pickDate = "";
        String pickMonthYear = "";

        String date = StartDate;
        String[] dateSplit = date.split("\\,");
        for (int i=0; i < dateSplit.length; i++){

            if(dateSplit[i] == dateSplit[0]){
                pickDate = dateSplit[0];
                System.out.println("Pick Date :"+pickDate);
            }
            else{
                pickMonthYear = dateSplit[1];
                System.out.println("Pick MonthYear :"+pickMonthYear);
            }
        }

        getDriver().findElement(companiesManage_oReturns.EnterStartDate).click();
        WebElement dateWidget = getDriver().findElement(By.xpath("(//div[@class='calendar first single right'])[1]"));

//        Thread.sleep(1000);

        String flag = "False";


        while(flag=="False") {

            if(getDriver().findElements(By.xpath(companiesManage_oReturns.SelectStartMonthAndYear + pickMonthYear + companiesManage_oReturns.PostValidateChangeType)).size()>0) {

                List<WebElement> columns = dateWidget.findElements(By.tagName("td"));

                for (WebElement cell: columns){
                    if (cell.getText().equals(pickDate)){
                        cell.findElement(By.xpath(companiesManage_oReturns.SelectStartDate + pickDate + companiesManage_oReturns.PostSelectStartDate)).click();
                        break;
                    }
                }

                flag="True";
//                Thread.sleep(1000);
            }

            else {
//                Thread.sleep(1000);
                getDriver().findElement(By.xpath("(//i)[2]")).click();
            }

        }
    }

    public void selectEndDateToSearch(String EndDate) throws InterruptedException {
        String pickDate = "";
        String pickMonthYear = "";

        String date = EndDate;
        String[] dateSplit = date.split("\\,");
        for (int i=0; i < dateSplit.length; i++){

            if(dateSplit[i] == dateSplit[0]){
                pickDate = dateSplit[0];
                System.out.println("Pick Date :"+pickDate);
            }
            else{
                pickMonthYear = dateSplit[1];
                System.out.println("Pick MonthYear :"+pickMonthYear);
            }
        }

        getDriver().findElement(companiesManage_oReturns.EnterEndDate).click();
        WebElement dateWidget = getDriver().findElement(By.xpath("(//div[@class='calendar first single right'])[2]"));

//        Thread.sleep(1000);

        String flag = "False";


        while(flag=="False") {
            if(getDriver().findElements(By.xpath(companiesManage_oReturns.SelectStartMonthAndYear + pickMonthYear + companiesManage_oReturns.PostValidateChangeType)).size()>0) {
//            if(getDriver().findElements(By.xpath(companiesManage_oReturns.SelectEndMonthAndYear + pickMonthYear + companiesManage_oReturns.PostSelectEndMonthAndYear)).size()>0) {
                List<WebElement> columns = dateWidget.findElements(By.tagName("td"));

                for (WebElement cell: columns){
                    if (cell.getText().equals(pickDate)){
                        cell.findElement(By.xpath(companiesManage_oReturns.SelectStartDate + pickDate + companiesManage_oReturns.PostSelectEndDate)).click();
                        break;
                    }
                }

                flag="True";
//                Thread.sleep(1000);
            }

            else {
//                Thread.sleep(1000);
                getDriver().findElement(By.xpath("(//i[@class='fa fa-arrow-left icon icon-arrow-left glyphicon glyphicon-arrow-left'])[3]")).click();
            }

        }
    }

    public void enterEndDate(String EndDate){ SendKeyBy(companiesManage_oReturns.EnterEndDate , EndDate);}
    public void selectEndDate(String EndDate){
        SendKeyBy(companiesManage_oReturns.EnterEndDate , EndDate);
    }

    public void clickSearchDetails(){ ClickBy(companiesManage_oReturns.ClickSearchDetails);}
    public void clickCloseSearchDetails(){ ClickBy(companiesManage_oReturns.ClickCloseSearchDetails);}
    public void clickOnViewCompany(){ ClickBy(companiesManage_oReturns.ClickOnViewCompany);}

    public void ClickSubmitBtn(){ ClickBy(companiesManage_oReturns.ClickSubmitBtn);}
    public void ClickOnViewCategories(){ ClickBy(companiesManage_oReturns.ClickViewCategories);}
    public void ClickOnAddCategory(){ ClickBy(companiesManage_oReturns.ClickAddCategory);}
    public void ClickSearchButton(){ ClickBy(companiesManage_oReturns.ClickOnSearchButton);}
//    public void ClickEditIcon(){ ClickBy(companiesManage_oReturns.ClickEditIcon);}
    public void ClickOnResetBtn(){ ClickBy(companiesManage_oReturns.ClickOnResetBtn);}
    public void ClickOnTheEdit(){ ClickBy(companiesManage_oReturns.ClickOnEdit);}
    public void ClickOnTheDisableRadioButton(){ ClickBy(companiesManage_oReturns.ClickOnDisableRadioButton);}
    public void ClickOnTheUpdateButton(){ ClickBy(companiesManage_oReturns.ClickOnUpdateButton);}

    public boolean ValidateTheErrorMessage(String Search) {
        Boolean value = getDriver().findElement(By.xpath(companiesManage_oReturns.ValidateError + Search + companiesManage_oReturns.PostValidateError)).isDisplayed();
        return value;
    }
    public void ValidateErrorDisplay(String Heading) {
        Boolean ErrorValidation = ValidateTheErrorMessage(Heading);
        elementCommonUtils.assertBoolValues(Boolean.TRUE, ErrorValidation);
    }

    public void enterCompanyName(String companyName){ SendKeyBy(companiesManage_oReturns.enterCompanyName , companyName);}
    public void enterCountry(String country){ SendKeyBy(companiesManage_oReturns.enterCountry , country);}
    public void enterSuburb(String suburb){ SendKeyBy(companiesManage_oReturns.enterSuburb , suburb);}
    public void enterState_City(String state_City){ SendKeyBy(companiesManage_oReturns.enterState_City , state_City);}
    public void enterPostcode(String postcode){ SendKeyBy(companiesManage_oReturns.enterPostcode , postcode);}
    public void enterContactNumber(String contactNumber){ SendKeyBy(companiesManage_oReturns.enterContactNumber , contactNumber);}
    public void enterEmail(String email){ SendKeyBy(companiesManage_oReturns.enterEmail , email);}
    public void enterReturnPortalDomain(String returnPortalDomain){ SendKeyBy(companiesManage_oReturns.enterReturnPortalDomain , returnPortalDomain);}
    public void enterSiteURL(String siteURL){ SendKeyBy(companiesManage_oReturns.enterSiteURL , siteURL);}

    public boolean ValidateLogDtailPopUp(String Search) {
        Boolean value = getDriver().findElement(By.xpath(companiesManage_oReturns.ValidatePopUpHead + Search + companiesManage_oReturns.PostValidatePopUpHead)).isDisplayed();
        return value;
    }
    public void ValidatePopUpHead(String PopUp) {
        Boolean PopUpHeading = ValidateLogDtailPopUp(PopUp);
        elementCommonUtils.assertBoolValues(Boolean.TRUE, PopUpHeading);
    }

    public boolean ValidateChangeTypeTableDetails(String Search) {
        Boolean value = getDriver().findElement(By.xpath(companiesManage_oReturns.ValidateChangeType + Search + companiesManage_oReturns.PostValidateChangeType)).isDisplayed();
        return value;
    }
    public void ValidateChangeType(String ChangeType) {
        Boolean ChangeTypeValidation = ValidateChangeTypeTableDetails(ChangeType);
        elementCommonUtils.assertBoolValues(Boolean.TRUE, ChangeTypeValidation);
    }

}
