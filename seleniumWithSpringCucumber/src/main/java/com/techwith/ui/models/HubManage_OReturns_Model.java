package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.HubManage_OReturns;
import com.techwith.ui.models.customUtils.DropdownEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.*;

@Component
public class HubManage_OReturns_Model {

    @Autowired
    public HubManage_OReturns hubManage_oReturns;

    public void ClickAddHub(){ ClickBy(hubManage_oReturns.ClickAddHub);}
    public void ClickHubChangeLog(){ ClickBy(hubManage_oReturns.ClickHubChangeLog);}
    public void enterName(String name){ SendKeyBy(hubManage_oReturns.EnterName , name);}
    public void selectCompany(String company){
        DropDownBySelect((hubManage_oReturns.SelectCompany), DropdownEnum.VISIBLE_TEXT() , company);
    }
    public void clickOnViewHubs(){ ClickBy(hubManage_oReturns.ClickOnViewHubs);}
}
