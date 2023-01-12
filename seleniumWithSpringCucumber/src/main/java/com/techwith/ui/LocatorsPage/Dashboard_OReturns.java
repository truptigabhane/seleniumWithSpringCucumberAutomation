package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class Dashboard_OReturns {
    public By ClickManage = By.xpath("//a[normalize-space()='Manage']");
    public By SelectCompanies = By.xpath("//a[normalize-space()='Companies']");
    public By SelectTranslations = By.xpath("//a[normalize-space()='Translations']");

    public By ClickHub = By.xpath("//a[normalize-space()='Hub']");

    public By ClickRetailer = By.xpath("//a[normalize-space()='Retailer']");
    public By ClickCarriers = By.xpath("//a[normalize-space()='Carriers']");
    public By ClickModule = By.xpath("//a[normalize-space()='Module']");
    public By SelectRole = By.xpath("//a[normalize-space()='Role']");
    public By ClickGroups = By.xpath("//a[normalize-space()='Groups']");
    public By ClickFAQ = By.xpath("//a[normalize-space()='FAQ']");

    public By ClickUser = By.xpath("//a[normalize-space()='User']");

    public By ClickReporting = By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Reporting']");
    public By SelectReporting = By.xpath("//a[@href='https://stage.omniparcelreturns.com/admin/returns']");
    public By SelectReturnsPendingReviewMenu = By.xpath("//a[normalize-space()='Returns Pending Review']");

    public String ValidateHeading = "//h2[normalize-space()='";
    public String PostValidateHeading = "']";

}
