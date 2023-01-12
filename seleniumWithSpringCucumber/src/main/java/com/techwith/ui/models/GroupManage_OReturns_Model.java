package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.GroupManage_OReturns;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;
import static com.techwith.ui.models.customUtils.elementCommonUtils.SendKeyBy;
import static com.techwith.webdriver.WebDriverFactory.getDriver;

@Component
public class GroupManage_OReturns_Model {

    @Autowired
    public GroupManage_OReturns groupManage_oReturns;

    public void ClickAddGroup(){ ClickBy(groupManage_oReturns.ClickAddGroup);}
    public void ClickViewGroup(){ ClickBy(groupManage_oReturns.ClickViewGroup);}
    public void enterGroupName(String groupName){ SendKeyBy(groupManage_oReturns.EnterGroupName , groupName);}
    public void enterRetailer(String retailer){
        getDriver().findElement(By.xpath("//ul[@class='select2-selection__rendered']")).click();
        getDriver().findElement(By.xpath("//input[@role='textbox']")).click();
        getDriver().findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);
//        SendKeyBy(groupManage_oReturns.EnterRetailer , retailer);
//        getDriver().findElement(groupManage_oReturns.EnterRetailer).sendKeys(Keys.ENTER);
    }
    public void addRetailer(String retailer){
        ClickBy(groupManage_oReturns.AddRetailer);
        SendKeyBy(groupManage_oReturns.AddRetailer , retailer);
        getDriver().findElement(groupManage_oReturns.AddRetailer).sendKeys(Keys.ENTER);
    }
    public void clickEditIconInGroup(){ ClickBy(groupManage_oReturns.ClickEditIconInGroup);}
    public void clickDeleteIconInGroup(){ ClickBy(groupManage_oReturns.ClickDeleteIconInGroup);}
}
