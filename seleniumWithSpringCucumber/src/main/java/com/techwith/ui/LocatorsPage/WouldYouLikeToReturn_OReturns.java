package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class WouldYouLikeToReturn_OReturns {

    public By ValidateOrderNumber = By.xpath("//input[@id='ordernumber']");

    public By ValidateEmailID = By.xpath("//input[@id='email']");

    public String SingleOrderCheckBox = "(//span[@class='toggle__label'])[";

    public String PreClickOnReturnReasonDropDown = "//input[@id='reasonbox-";

    public String PreSelectReasonFromDropDown = "//li[contains(text(), '";

    public String PreClickOnReturnReasonOptionDropDown = "//*[@id='p-customerreturnaction-";

    public String PreSelectOptionsRefund = "//select[@id='p-customerreturnaction-";

    public String Post = "]";

    public String Post2 = "']";

    public String PostReasonFromDropDown = "')]";

    public String PreClickOnProductConditionOptionDropDown = "//*[@id='p-customerreturnaction-";
    public String PreSelectProductCondition = "//*[@id='p-customerreturnaction-";

}
