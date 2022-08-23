package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class ConfirmYourDetails_OReturns {

    public By EnterFullName = By.xpath("//input[@id='fullname']");
    public By EnterReturnOption = By.xpath("//input[@id='fullname']");
    public By SelectCountry = By.xpath("//select[@id='country-list']");

    public By EnterZipCode = By.xpath("//input[@id='postalcode']");

    public By EnterBuilding = By.xpath("//input[@id='Building']");

    public By EnterStreet = By.xpath("//input[@id='Street']");

    public By EnterCity = By.xpath("//input[@id='city_id']");

    public By EnterState = By.xpath("//input[@id='state']");

    public By EnterContactNumber = By.xpath("//input[@id='contact']");

    public By EnterCouponCode = By.xpath("//input[@id='couponcode']");

    public By EnterTestExtraField = By.xpath("//input[@placeholder='Test Extra Field']");



}
