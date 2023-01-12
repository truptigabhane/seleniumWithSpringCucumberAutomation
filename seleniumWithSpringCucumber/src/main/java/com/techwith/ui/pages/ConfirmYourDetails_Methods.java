package com.techwith.ui.pages;

import com.techwith.ui.models.ConfirmYourDetails_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ConfirmYourDetails_Methods {

    @Autowired
    public ConfirmYourDetails_Model confirmYourDetailsModel;

    public void FillTheFormDetails(String fullName , String country , String zipCode , String building , String street , String city , String state , String contactNumber) throws InterruptedException {
        confirmYourDetailsModel.enterFullName(fullName);
        confirmYourDetailsModel.selectCountry(country);
        confirmYourDetailsModel.enterZipCode(zipCode);
        confirmYourDetailsModel.enterBuilding(building);
        confirmYourDetailsModel.enterStreet(street);
        Thread.sleep(2000);
        confirmYourDetailsModel.enterCity(city);
        Thread.sleep(2000);
        confirmYourDetailsModel.enterState(state);
        confirmYourDetailsModel.enterContactNumber(contactNumber);
//        confirmYourDetailsModel.enterTestExtraField(extraField);
    }
}
