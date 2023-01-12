package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class UserManage_OReturns {

    public By ClickAddUser = By.xpath("//a[normalize-space()='Add User']");
    public By EnterSearch = By.xpath("//input[@id='search_flag']");
    public By EnterFirstName = By.xpath("//input[@id='Name']");
    public By EnterLastName = By.xpath("//input[@id='LastName']");
    public By EnterEmail = By.xpath("//input[@id='Email']");
    public By EnterPassword = By.xpath("//input[@id='Password']");
    public By SelectCompanyDropDown = By.xpath("(//span[@id='select2-IdCompany-container'])[1]");
    public By SelectRoleDropDown = By.xpath("(//span[@id='select2-RoleId-container'])[1]");
    public By SelectRetailerDropDown = By.xpath("(//span[@id='select2-IdRetailer-container'])[1]");
    public By SelectGroupDropDown = By.xpath("(//span[@id='select2-GroupId-container'])[1]");
    public By ClickOnViewUser = By.xpath("//a[normalize-space()='View Users']");
    public By ClickExportToExelButton = By.xpath("//button[@id='export_booking']");
    public By SelectCompanyDropDownToSearch = By.xpath("(//span[@id='select2-CompanyId-container'])[1]");
    public String ValidateDataTable = "//td[@class='";
    public String PostValidateDataTable = "']";
    public By ClickOnDelete = By.xpath("(//a[@class='delete fa fa-trash-o'])[1]");
    public By ClickOnYes = By.xpath("//button[@id='submit']");
    public By ClickOnNo = By.xpath("(//button[@type='button'][normalize-space()='No'])[1]");

    public By ClickOnUserChangeLog = By.xpath("//a[normalize-space()='User Change Log']");
}
