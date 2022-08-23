package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class ReturnProcessing_OmniRPS {

    public By ClickOnProcessing = By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Processing']");
    public By ClickOnSubProcessing = By.xpath("//a[@href='https://test.omnirps.com/return_receipt/processing_cons']");
    public By EnterConsignmentNo = By.xpath("//input[@id='Consignment_No']");
}
