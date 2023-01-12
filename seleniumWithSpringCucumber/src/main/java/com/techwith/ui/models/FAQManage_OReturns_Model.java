package com.techwith.ui.models;

import com.techwith.ui.LocatorsPage.FAQManage_OReturns;
import com.techwith.ui.models.customUtils.DropdownEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.techwith.ui.models.customUtils.elementCommonUtils.*;

@Component
public class FAQManage_OReturns_Model {

    @Autowired
    public FAQManage_OReturns faqManage_oReturns;

    public void ClickViewFAQs(){ ClickBy(faqManage_oReturns.ClickViewFAQs);}
    public void ClickAddFAQ(){ ClickBy(faqManage_oReturns.ClickAddFAQ);}
    public void selectCompany(String company){
        DropDownBySelect((faqManage_oReturns.selectCompany), DropdownEnum.VISIBLE_TEXT() , company);
    }
    public void selectCategory(String category){
        DropDownBySelect((faqManage_oReturns.selectCategory), DropdownEnum.VISIBLE_TEXT() , category);
    }
    public void selectStatus(String status){
        DropDownBySelect((faqManage_oReturns.selectStatus), DropdownEnum.VISIBLE_TEXT() , status);
    }
    public void enterQuestion(String question){ SendKeyBy(faqManage_oReturns.enterQuestion , question);}
    public void enterAnswer(String answer){ SendKeyBy(faqManage_oReturns.enterAnswer , answer);}
    public void enterDisplayOrder(String displayOrder){ SendKeyBy(faqManage_oReturns.enterDisplayOrder , displayOrder);}
}
