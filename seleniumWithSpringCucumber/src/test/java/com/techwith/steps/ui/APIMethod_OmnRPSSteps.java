package com.techwith.steps.ui;

import com.techwith.ui.pages.ReturnCreated_OmniRPS_Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class APIMethod_OmnRPSSteps {

    @Autowired
    public ReturnCreated_OmniRPS_Methods returnCreated_omniRPS_methods;

    @And("API Method Details to Successfully Receive Return")
    public void APIMethodDetailsToSuccessfullyReceivReturn() {
        returnCreated_omniRPS_methods.ClickOnSubmitButton();
    }
}
