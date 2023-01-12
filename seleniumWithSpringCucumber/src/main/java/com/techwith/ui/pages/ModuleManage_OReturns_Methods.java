package com.techwith.ui.pages;

import com.techwith.ui.models.ModuleManage_OReturns_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ModuleManage_OReturns_Methods {

    @Autowired
    public ModuleManage_OReturns_Model moduleManage_oReturns_model;

    public void ClickOnAddModule(){
        moduleManage_oReturns_model.ClickAddModule();
    }
    public void FillAddModuleDeatils(String moduleName , String description) {
        moduleManage_oReturns_model.enterModuleName(moduleName);
        moduleManage_oReturns_model.enterDescription(description);
    }
    public void ClickOnViewModule(){ moduleManage_oReturns_model.clickOnViewModule();}
}
