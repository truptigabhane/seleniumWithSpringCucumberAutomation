package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.RoleManage_OReturns;
import com.techwith.ui.models.customUtils.DropdownEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.*;

@Component
public class RoleManage_OReturns_Model {

    @Autowired
    public RoleManage_OReturns roleManage_oReturns;

    public void ClickAddRole(){ ClickBy(roleManage_oReturns.ClickAddRole);}
    public void ClickViewRole(){ ClickBy(roleManage_oReturns.ClickViewRole);}
    public void CheckModuleAccess(){ ClickBy(roleManage_oReturns.CheckModuleAccess);}
    public void selectCompany(String company){
        DropDownBySelect((roleManage_oReturns.SelectCompany), DropdownEnum.VISIBLE_TEXT() , company);
    }
    public void enterRole(String role){ SendKeyBy(roleManage_oReturns.EnterRole , role);}
    public void enterDescription(String description){ SendKeyBy(roleManage_oReturns.EnterDescription , description);}
}
