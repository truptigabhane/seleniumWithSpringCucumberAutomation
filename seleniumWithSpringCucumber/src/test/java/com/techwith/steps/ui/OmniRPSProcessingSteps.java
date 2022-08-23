package com.techwith.steps.ui;

import com.techwith.ui.pages.ReturnProcessing_OmniRPS_Methods;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class OmniRPSProcessingSteps {

    @Autowired
    public ReturnProcessing_OmniRPS_Methods returnProcessing_omniRPS_methods;

    @When("Select Processing for OmniRPS Processing")
    public void selectProcessingForOmniRPSProcessing (){
            returnProcessing_omniRPS_methods.ClickProcessingMenu();
            returnProcessing_omniRPS_methods.ClickProcessingSubMenu();
    }
}
