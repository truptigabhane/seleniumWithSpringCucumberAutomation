package com.techwith.ui.pages;

import com.techwith.ui.models.RoleManage_OReturns_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoleManage_OReturns_Methods {

    @Autowired
    public RoleManage_OReturns_Model roleManage_oReturns_model;

    public void ClickOnAddRole(){
        roleManage_oReturns_model.ClickAddRole();
    }
    public void ClickOnViewRole(){
        roleManage_oReturns_model.ClickViewRole();
    }
    public void CheckModuleAccess(){
        roleManage_oReturns_model.CheckModuleAccess();
    }

    public void FillAddRoleDetails(String company , String role , String description) {
        roleManage_oReturns_model.selectCompany(company);
        roleManage_oReturns_model.enterRole(role);
        roleManage_oReturns_model.enterDescription(description);
    }
}
