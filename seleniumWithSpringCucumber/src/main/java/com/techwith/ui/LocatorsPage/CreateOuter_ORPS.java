package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class CreateOuter_ORPS {

    public By SelectRetailer = By.xpath("//select[@id='retailerId']");
    public By ClickCreateOuter = By.xpath("//button[normalize-space()='CREATE OUTER']");
    public By ClickConfirm = By.xpath("//button[normalize-space()='CONFIRM']");
    public By ClickCloseIcon = By.xpath("//button[normalize-space()='×']");
    public By ClickToPrintTemporaryLabel = By.xpath("//a[normalize-space()='Click here']");
    public String ValidateError = "//p[@class='";
    public String PostValidateError = "']";
}
