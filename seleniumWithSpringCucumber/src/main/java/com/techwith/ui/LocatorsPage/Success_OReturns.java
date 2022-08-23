package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;


@Component
public class Success_OReturns {

    public By ValidateOrderNumber_Success_take = By.xpath("(//div[contains(@class,'maindetail')]//following-sibling::div)[1]");
    public By ValidateName_Success_take = By.xpath("(//div[contains(@class,'maindetail')]//following-sibling::div)[2]");

//    String ValidateOrderNumber_Success_forSplit = ValidateOrderNumber_Success_take.toString();
//    String ValidateName_Success_forSplit = ValidateName_Success_take.toString();
//
//    String[] ValidateOrderNumber_split = ValidateOrderNumber_Success_forSplit.split(":");
//    String[] ValidateName_split = ValidateName_Success_forSplit.split(":");
//
//    public String OrderNumber = ValidateOrderNumber_split[1];
//    public String Name = ValidateName_split[1];
//
//    public By ValidateOrderNumber_Success = By.id(OrderNumber);
//    public By ValidateName_Success = By.id(Name);


}
