package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class ProductWiseReturnLabelCreation {

    public By EnterProductValue = By.xpath("//input[@placeholder='Product Value ($)*']");
    public By SelectDescription = By.xpath("//select[@id='commodities_desc']");
    public By SelectWhyAreYouReturning = By.xpath("//select[@id='reasonid']");
    public By SelectReturnAction = By.xpath("//select[@id='CustomerReturnAction']");

}
