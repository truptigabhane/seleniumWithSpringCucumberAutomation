package com.techwith.steps;

import com.techwith.webdriver.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;

public class CucumberHooks {

    /**
     * Runs before each test(features)
     */
    @Before("@ui")
    public void beforeEach() {
        WebDriverFactory.createDriver();
    }

    /**
     * Runs before each test(features)
     */
    @After("@ui")
    public void afterEach(Scenario scenario) {
        if (scenario.isFailed()) {
            Allure.addAttachment(scenario.getName(), "image/png", new ByteArrayInputStream(
                    ((TakesScreenshot) WebDriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES)), "png");
        }
        WebDriverFactory.cleanUpDriver();
    }
}
