package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class BookReturns_OReturns {

    public By SearchRetailer = By.xpath("//input[@id = 'ordernumber']");
    public By ClickOnSekoDemoStore_41 = By.xpath("//a[contains(@href, '41')]//following-sibling::h3[contains(text(), 'Seko Demo')]");


}
