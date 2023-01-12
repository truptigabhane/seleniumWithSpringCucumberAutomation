package com.techwith.steps.ui;

import com.techwith.webdriver.WebDriverFactory;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Value;

public class BasePageSteps extends WebDriverFactory {
    @Value("${test.AppUrl}")
    public String testUrl;

    @Value("${web3.AppUrl}")
    public String web3Url;

    @Value("${test.AppUrlTransactionReport}")
    public String testUrlTransactionReport;

    @Value("${test.AppUrlOmniRPS}")
    public String testUrlOmniRPS;

    @Value("${stage.AppUrl}")
    public String stageUrl;

    @Value("${stage.AppUrlOmniReturn}")
    public String stageUrlOnmiReturn;

    @Value("${stage.AppUrlOmniRPS}")
    public String stageUrlOmniRPS;

    @Given("Open the Url Of Omni Parcel Return Application")
    public void openTheUrlOfOmniParcelReturnApplication() {
        getDriver().get(testUrl);
    }

    @Given("Open the Url Of Omni Parcel Return Application For Transaction Report")
    public void openTheUrlOfOmniParcelReturnApplicationForTransactionReport(){getDriver().get(testUrlTransactionReport);}

    @Given("Open the Url Of OmniRPS Application")
    public void openTheUrlOfOmniRPSApplication(){
        getDriver().get(testUrlOmniRPS);
    }

    @Given("Open the Url Of Omni Parcel Return Application In Stage")
    public void openTheUrlOfOmniParcelReturnApplicationInStage() {
        getDriver().get(stageUrl);
    }

    @Given("Open the Url Of Omni Return Application")
    public void openTheUrlOfOmniReturnApplication(){getDriver().get(stageUrlOnmiReturn);}

    @Given("Open the Url Of OmniRPS Application For Stage Environment")
    public void openTheUrlOfOmniRPSApplicationForStageEnvironment(){
        getDriver().get(stageUrlOmniRPS);
    }
}
