package com.techwith.ui.pages;

import com.techwith.ui.models.CreateOuter_ORPS_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateOuter_ORPS_Methods {

    @Autowired
    public CreateOuter_ORPS_Model createOuter_orps_model;

    public void SelectRetailer(String retailer) {
        createOuter_orps_model.SelectRetailer(retailer);
    }
    public void ClickCreateOuterButton(){
        createOuter_orps_model.ClickCreateOuterButton();
    }
    public void ClickConfirmButton(){
        createOuter_orps_model.ClickConfirmButton();
    }
    public void ClickCloseIcon(){
        createOuter_orps_model.ClickCloseIcon();
    }
}
