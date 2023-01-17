package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class Processing_ORPS {

    public By EnterConsignmentNo = By.xpath("//input[@id='Consignment_No']");
    public String PreClickOnReturnReasonDropDown = "//input[@id='retailer";
    public String Post2 = "']";
    public String PreSelectReasonFromDropDown = "//li[@id='";
    public By selectHubFromTheDropDown = By.xpath("//select[@id='HubId']");
    public By EnterMISC_1 = By.xpath("//input[@id='MISC_1']");
    public By EnterMISC_3 = By.xpath("//input[@id='MISC_3']");
    public By EnterOrderNo = By.xpath("//input[@id='OrderNo']");
    public By EnterMISC_2 = By.xpath("//input[@id='MISC_2']");
    public By ClickSubmitAndClosOuterButton = By.xpath("//button[@id='submit_close']");
    public By SelectOuterId = By.xpath("//select[@id='OuterId']");
    public By EnterConsignmentNumber = By.xpath("//input[@id='ConsignmentNo']");
    public By ClickOnResetFormButton = By.xpath("//a[normalize-space()='RESET FORM']");
    public By ClickOnCreateOuterButton = By.xpath("//button[@id='cr_outer']");
    public By ClickOnCreateOuterButtonInProcessing = By.xpath("//button[normalize-space()='CREATE OUTER']");
    public By ClickOnCancelButton = By.xpath("//button[@id='cancle']");
    public By SelectHub = By.xpath("//select[@id='Hubdrop']");
    public By SelectRetailer = By.xpath("//select[@id='Retailerdrop']");
    public By ClickOnCLICKHEREToPrintTemporaryLabel = By.xpath("//a[normalize-space()='CLICK HERE']");
}
