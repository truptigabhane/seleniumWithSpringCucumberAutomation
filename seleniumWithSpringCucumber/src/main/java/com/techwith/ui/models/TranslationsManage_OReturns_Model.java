package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.TranslationsManage_OReturns;
import com.techwith.ui.models.customUtils.DropdownEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.*;

@Component
public class TranslationsManage_OReturns_Model {

    @Autowired
    public TranslationsManage_OReturns translationsManage_oReturns;

    public void ClickOnAddTranslation(){ ClickBy(translationsManage_oReturns.ClickAddTranslation);}
    public void ClickOnViewTranslation(){ ClickBy(translationsManage_oReturns.ClickViewTranslation);}
    public void ClickOnDeleteButton(){ ClickBy(translationsManage_oReturns.ClickDeleteButton);}
    public void ClickOnEditButton(){ ClickBy(translationsManage_oReturns.ClickEditButton);}
    public void ClickOnSubmitButton(){ ClickBy(translationsManage_oReturns.ClickSubmitButton);}
    public void enterFrench(String french){ SendKeyBy(translationsManage_oReturns.EnterFrench , french);}
    public void enterGerman(String german){ SendKeyBy(translationsManage_oReturns.EnterGerman , german);}
    public void enterSpanish(String spanish){ SendKeyBy(translationsManage_oReturns.EnterSpanish , spanish);}
    public void selectType(String type){
        DropDownBySelect((translationsManage_oReturns.SelectType), DropdownEnum.VISIBLE_TEXT() , type);
    }
    public void selectItem(String item){
        DropDownBySelect((translationsManage_oReturns.SelectItem), DropdownEnum.VISIBLE_TEXT() , item);
    }
    public void selectField(String field){
        DropDownBySelect((translationsManage_oReturns.SelectField), DropdownEnum.VISIBLE_TEXT() , field);
    }
}
