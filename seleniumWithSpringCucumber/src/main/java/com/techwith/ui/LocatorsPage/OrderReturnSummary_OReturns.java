package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import java.sql.Driver;

import static com.techwith.webdriver.WebDriverFactory.getDriver;

@Component
public class OrderReturnSummary_OReturns {

    public By ClickBackButton = By.xpath("//div[@class='backbtntext']");
    public By ValidateOrderNumber = By.xpath("//h5[contains(text(), 'Order Number')]//parent::div//following-sibling::div//h5 ");
    public By ValidateProductName = By.xpath(" //h5[contains(text(), 'Product Name')]//parent::div//following-sibling::div//h5 ");
    public By ValidateReturnReason = By.xpath(" //h5[contains(text(), 'Return Reason')]//parent::div//following-sibling::div//h5 ");
    public By ValidateReturnOption = By.xpath("  //h5[contains(text(), 'Return Option')]//parent::div//following-sibling::div//h5 ");

    // Select Refund Type
    public String PreRefundType = "//input[@refundtype='";
    public String PostRefundType= "']";

    //Select Services
    public String PreClickGenericReturnButton = "(//h5[contains(text(), '";
    public String MidClickGenericReturnButton = "')]//parent::td//preceding-sibling::td//h5//input[@id='carrier'])[";
    public String PostClickGenericReturnButton = "]";

    public By ClickSubmitButton = By.xpath("//input[@id='PrepaidSubmit']");

    public By EnterCardNumber = By.xpath("//input[@placeholder='Card number']");
    public By EnterExpDate = By.xpath("//input[@name='exp-date']");
    public By EnterCVC = By.xpath("//input[@name='cvc']");
    public By EnterZip = By.xpath("//input[@name='postal']");

    public By ClickPayNowButton = By.xpath("//button[@id='submitStripePayment']");

    public By ClickOnSelectStore = By.xpath("//td[@id='ub1402']/descendant::input");

    public By ClickHappyReturnsIcon = By.xpath("//i[@class='fa fa-question-circle hapretmyImg']");

}
