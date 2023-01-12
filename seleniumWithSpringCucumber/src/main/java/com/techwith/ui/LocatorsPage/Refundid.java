package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class Refundid {

    public By SelectStore = By.xpath("//input[@id='merchant_id']");
    public By EnterOrderNo = By.xpath("//input[@id='order_number']");
    public By EnterEmail = By.xpath("//input[@id='email']");
    public By ClickContinueButton = By.xpath("//button[normalize-space()='Continue']");
}
