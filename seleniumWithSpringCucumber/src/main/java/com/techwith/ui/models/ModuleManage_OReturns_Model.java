package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.ModuleManage_OReturns;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;
import static com.techwith.ui.models.customUtils.elementCommonUtils.SendKeyBy;

@Component
public class ModuleManage_OReturns_Model {

    @Autowired
    public ModuleManage_OReturns moduleManage_oReturns;

    public void ClickAddModule(){ ClickBy(moduleManage_oReturns.ClickAddModule);}
    public void enterModuleName(String moduleName){ SendKeyBy(moduleManage_oReturns.EnterModuleName , moduleName);}
    public void enterDescription(String description){ SendKeyBy(moduleManage_oReturns.EnterDescription , description);}
    public void clickOnViewModule(){ ClickBy(moduleManage_oReturns.ClickOnViewModule);}
}
