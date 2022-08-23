package com.techwith.ui.LocatorsPage;


import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class Management_OmniRPS {

    public By ClickManagement = By.xpath("//a[normalize-space()='Management']");
    public By SelectReturnReason = By.xpath("//select[@id='return_reason']");
    public By SelectReturnAction = By.xpath("//select[@id='returnaction']");
    public By SelectReturnStatus = By.xpath("//select[@id='returnstatus']");
    public By SelectHub = By.xpath("//select[@id='hubs']");
    public By SelectProcessingStatus = By.xpath("//select[@id='not_processed']");
    public By SelectFileType = By.xpath("//select[@id='export_booking_change']");
}
