package com.techwith.ui.pages;

import com.techwith.ui.models.FAQManage_OReturns_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FAQManage_OReturns_Methods {

    @Autowired
    public FAQManage_OReturns_Model faqManage_oReturns_model;

    public void ClickOnViewFAQs(){
        faqManage_oReturns_model.ClickViewFAQs();
    }
    public void ClickAddFAQ(){
        faqManage_oReturns_model.ClickAddFAQ();
    }
    public void FillAddFAQDetails(String company , String category , String question , String answer , String displayOrder , String status) {
        faqManage_oReturns_model.selectCompany(company);
        faqManage_oReturns_model.selectCategory(category);
        faqManage_oReturns_model.enterQuestion(question);
        faqManage_oReturns_model.enterAnswer(answer);
        faqManage_oReturns_model.enterDisplayOrder(displayOrder);
        faqManage_oReturns_model.selectStatus(status);
    }
}
