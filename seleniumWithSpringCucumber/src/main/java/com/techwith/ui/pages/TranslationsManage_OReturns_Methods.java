package com.techwith.ui.pages;

import com.techwith.ui.models.TranslationsManage_OReturns_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TranslationsManage_OReturns_Methods {

    @Autowired
    public TranslationsManage_OReturns_Model translationsManage_oReturns_model;

    public void clickAddTranslation(){
        translationsManage_oReturns_model.ClickOnAddTranslation();
    }
    public void ClickViewTranslation(){
        translationsManage_oReturns_model.ClickOnViewTranslation();
    }
    public void ClickOnDeleteBtn(){
        translationsManage_oReturns_model.ClickOnDeleteButton();
    }
    public void ClickOnEditBtn(){
        translationsManage_oReturns_model.ClickOnEditButton();
    }
    public void ClickOnSubmitButton(){
        translationsManage_oReturns_model.ClickOnSubmitButton();
    }
    public void FillAddTranslationsDetails(String type , String item , String field , String french , String german , String spanish ) {
        translationsManage_oReturns_model.selectType(type);
        translationsManage_oReturns_model.selectItem(item);
        translationsManage_oReturns_model.selectField(field);
        translationsManage_oReturns_model.enterFrench(french);
        translationsManage_oReturns_model.enterGerman(german);
        translationsManage_oReturns_model.enterSpanish(spanish);
    }
}
