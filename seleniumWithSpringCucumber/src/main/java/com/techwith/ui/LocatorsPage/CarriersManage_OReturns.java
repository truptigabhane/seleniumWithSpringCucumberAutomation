package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class CarriersManage_OReturns {

    public By ClickAddCarriers = By.xpath("//a[normalize-space()='Add Carriers']");
    public By ClickViewCarriers = By.xpath("//a[normalize-space()='View Carriers']");
    public By enterCarrierName = By.xpath("//input[@id='Name']");
    public By enterOmniParcelID = By.xpath("//input[@id='OPCarrierID']");
    public By enterOmniParcelCarrierName = By.xpath("//input[@id='OPCarrierName']");
    public By CheckHub = By.xpath("(//input[@id='Hubs'])[49]");
    public By enterSearch = By.xpath("//input[@id='search_flag']");
    public String ValidateError = "(//p[@id='";
    public String PostValidateError = "'])[1]";
    public By ClickEditIconToEdit = By.xpath("(//i[@class='fa fa-fw fa-edit'])[1]");
    public By ClickCarrierChangeLog = By.xpath("//a[normalize-space()='Carrier Change Log']");
    public By ClickChangeTypeDropDown = By.xpath("(//span[@id='select2-ChangesType-container'])[1]");
    public By ClickCompanyDropDown = By.xpath("//span[@id='select2-IdCompany-container']");
    public String ValidatePopUpHead = "//h3[@id='";
    public String PostValidatePopUpHead = "']";
}
