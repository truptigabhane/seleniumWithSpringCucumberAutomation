package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.Management_OmniRPS;
import com.techwith.ui.models.customUtils.DropdownEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.ClickBy;
import static com.techwith.ui.models.customUtils.elementCommonUtils.DropDownBySelect;

@Component
public class Management_OmniRPS_Model {

    @Autowired
    public Management_OmniRPS management_omniRPS;

    public void ClickManagementMenu(){
        ClickBy(management_omniRPS.ClickManagement);
    }

    public void SelectTheReturnReason(String ReturnReason){
        DropDownBySelect((management_omniRPS.SelectReturnReason), DropdownEnum.VISIBLE_TEXT() , ReturnReason);
    }

    public void SelectTheReturnAction(String ReturnAction){
        DropDownBySelect((management_omniRPS.SelectReturnAction), DropdownEnum.VISIBLE_TEXT() , ReturnAction);
    }

    public void SelectTheReturnStatus(String ReturnStatus){
        DropDownBySelect((management_omniRPS.SelectReturnStatus), DropdownEnum.VISIBLE_TEXT() , ReturnStatus);
    }

    public void SelectTheHub(String Hub){
        DropDownBySelect((management_omniRPS.SelectHub), DropdownEnum.VISIBLE_TEXT() , Hub);
    }

    public void SelectTheProcessingStatus(String ProcessingStatus){
        DropDownBySelect((management_omniRPS.SelectProcessingStatus), DropdownEnum.VISIBLE_TEXT() , ProcessingStatus);
    }

    public void SelectTheFileType(String FileType){
        DropDownBySelect((management_omniRPS.SelectFileType), DropdownEnum.VISIBLE_TEXT() , FileType);
    }


}
