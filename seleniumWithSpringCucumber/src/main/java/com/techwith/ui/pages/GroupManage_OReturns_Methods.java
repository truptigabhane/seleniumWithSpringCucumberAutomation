package com.techwith.ui.pages;

import com.techwith.ui.models.CarriersManage_OReturns_Model;
import com.techwith.ui.models.GroupManage_OReturns_Model;
import com.techwith.ui.models.RoleManage_OReturns_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GroupManage_OReturns_Methods {

    @Autowired
    public GroupManage_OReturns_Model groupManage_oReturns_model;
    @Autowired
    public RoleManage_OReturns_Model roleManage_oReturns_model;
    @Autowired
    public CarriersManage_OReturns_Model carriersManage_oReturns_model;

    public void clickOnAddGroup(){
        groupManage_oReturns_model.ClickAddGroup();
    }
    public void ClickOnViewGroup(){
        groupManage_oReturns_model.ClickViewGroup();
    }
    public void FillAddGroupDeatils( String groupName , String company , String retailer) {
        groupManage_oReturns_model.enterGroupName(groupName);
        roleManage_oReturns_model.selectCompany(company);
        groupManage_oReturns_model.enterRetailer(retailer);
    }
    public void FillAddGroupDeatilsForUpdate( String groupName , String company , String retailer) {
        carriersManage_oReturns_model.enterCarrierName(groupName);
        roleManage_oReturns_model.selectCompany(company);
//        groupManage_oReturns_model.enterRetailer(retailer);
    }
    public void clickOnEditIconInGroup(){
        groupManage_oReturns_model.clickEditIconInGroup();
    }
    public void clickOnDeleteIconInGroup(){
        groupManage_oReturns_model.clickDeleteIconInGroup();
    }
}
