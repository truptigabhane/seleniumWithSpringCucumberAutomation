package com.techwith.ui.pages;

import com.techwith.ui.models.ConfirmYourDetails_Model;
import com.techwith.ui.models.ProductWiseReturnLabelCreation_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.webdriver.WebDriverFactory.getDriver;

@Component
public class ProductWiseReturnLabelCreation_Methods {

    @Autowired
    public ProductWiseReturnLabelCreation_Model productWiseReturnLabelCreation_model;

    @Autowired
    public ConfirmYourDetails_Model confirmYourDetailsModel;

    public void FillFormDetails(String productValue , String description , String returnReason , String returnAction , String fullName , String country , String zipCode , String building , String street , String city , String state , String contactNumber) throws InterruptedException {
        productWiseReturnLabelCreation_model.enterProductValue(productValue);
        productWiseReturnLabelCreation_model.selectDescription(description);
        productWiseReturnLabelCreation_model.selectWhyAreYouReturning(returnReason);
        productWiseReturnLabelCreation_model.selectReturnAction(returnAction);
        confirmYourDetailsModel.enterFullName(fullName);
        confirmYourDetailsModel.selectCountry(country);
        confirmYourDetailsModel.enterZipCode(zipCode);
        confirmYourDetailsModel.enterBuilding(building);
        confirmYourDetailsModel.enterStreet(street);
        confirmYourDetailsModel.enterCity(city);
        confirmYourDetailsModel.enterState(state);
//        getDriver().switchTo().defaultContent();
        confirmYourDetailsModel.enterContactNumber(contactNumber);
//        confirmYourDetailsModel.enterTestExtraField(extraField);
    }
}
