package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.Dashboard_OReturns;
import com.techwith.ui.models.customUtils.elementCommonUtils;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;
import static com.techwith.webdriver.WebDriverFactory.getDriver;

@Component
public class Dashboard_OReturns_Model {

    @Autowired
    public Dashboard_OReturns dashboard_oReturns;

    public void ClickManageDropDown(){ ClickBy(dashboard_oReturns.ClickManage);}
    public void SelectGroupsMenu(){ ClickBy(dashboard_oReturns.ClickGroups);}
    public void SelectFAQMenu(){ ClickBy(dashboard_oReturns.ClickFAQ);}
    public void SelectCompaniesMenu(){ ClickBy(dashboard_oReturns.SelectCompanies);}
    public void SelectTranslationsMenu(){ ClickBy(dashboard_oReturns.SelectTranslations);}

    public void SelectHubMenu(){ ClickBy(dashboard_oReturns.ClickHub);}

    public void SelectRetailerMenu(){ ClickBy(dashboard_oReturns.ClickRetailer);}
    public void SelectCarriersMenu(){ ClickBy(dashboard_oReturns.ClickCarriers);}
    public void SelectModuleMenu(){ ClickBy(dashboard_oReturns.ClickModule);}
    public void SelectRoleMenu(){ ClickBy(dashboard_oReturns.SelectRole);}

    public void SelectUserMenu(){ ClickBy(dashboard_oReturns.ClickUser);}

    public void ClickReportingDropDown(){ClickBy(dashboard_oReturns.ClickReporting);}
    public void SelectReportingMenu(){ ClickBy(dashboard_oReturns.SelectReporting);}
    public void SelectReturnsPendingReviewMenu(){ ClickBy(dashboard_oReturns.SelectReturnsPendingReviewMenu);}

    public boolean ValidateTheHeading(String Search) {
        Boolean value = getDriver().findElement(By.xpath(dashboard_oReturns.ValidateHeading + Search + dashboard_oReturns.PostValidateHeading)).isDisplayed();
        return value;
    }

    public void ValidateDisplay(String Heading) {
        Boolean HeadingValidation = ValidateTheHeading(Heading);
        elementCommonUtils.assertBoolValues(Boolean.TRUE, HeadingValidation);
    }
}
