package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.CreateOuter_ORPS;
import com.techwith.ui.models.customUtils.DropdownEnum;
import com.techwith.ui.models.customUtils.elementCommonUtils;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;
import static com.techwith.ui.models.customUtils.elementCommonUtils.DropDownBySelect;
import static com.techwith.webdriver.WebDriverFactory.getDriver;

@Component
public class CreateOuter_ORPS_Model {

    @Autowired
    public CreateOuter_ORPS createOuter_orps;

    public void SelectRetailer(String retailer){
        DropDownBySelect((createOuter_orps.SelectRetailer), DropdownEnum.VISIBLE_TEXT() , retailer);
    }
    public void ClickCreateOuterButton(){
        ClickBy(createOuter_orps.ClickCreateOuter);
    }
    public void ClickConfirmButton(){
        ClickBy(createOuter_orps.ClickConfirm);
    }
    public void ClickCloseIcon(){
        ClickBy(createOuter_orps.ClickCloseIcon);
    }

    public boolean ValidateTheErrorMessage(String Search) {
        Boolean value = getDriver().findElement(By.xpath(createOuter_orps.ValidateError + Search + createOuter_orps.PostValidateError)).isDisplayed();
        return value;
    }
    public void ValidateErrorDisplay(String Heading) {
        Boolean ErrorValidation = ValidateTheErrorMessage(Heading);
        elementCommonUtils.assertBoolValues(Boolean.TRUE, ErrorValidation);
    }
}
