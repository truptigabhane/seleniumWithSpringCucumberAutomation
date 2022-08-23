package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class ReturnDetails_OmniRPS {

    public By SelectHub = By.xpath("//select[@name='HubId']");
    public By EnterConsignment = By.xpath("//input[@id='consignment']");
    public By ClickSubmitButton = By.xpath("//button[normalize-space()='Submit']");

}
