package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class ManualReturn_OmniRPS {

    public By SelectScanRetailer = By.xpath("//input[@id='retailer");
    public By EnterOrderNo = By.xpath("//input[@id='OrderNo']");
    public String PreClickOnReturnReasonDropDown = "//input[@id='retailer";
    public String PreSelectReasonFromDropDown = "//li[@id='";
    public String Post2 = "']";
    public String PostReasonFromDropDown = "']";
    public By SelectReturnAction = By.xpath("//select[@id='ReturnAction']");
}
