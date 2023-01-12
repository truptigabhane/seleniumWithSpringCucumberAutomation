package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class TranslationsManage_OReturns {

    public By ClickAddTranslation = By.xpath("//a[normalize-space()='Add Translation']");
    public By ClickViewTranslation = By.xpath("//a[normalize-space()='View Translations']");
    public By ClickDeleteButton = By.xpath("(//a[contains(text(),'Delete')])[1]");
    public By ClickEditButton = By.xpath("(//a[contains(text(),'Edit')])[1]");
    public By ClickSubmitButton = By.xpath("//button[normalize-space()='Submit']");
    public By EnterFrench = By.xpath("//textarea[@id='Text_fr']");
    public By EnterGerman = By.xpath("//textarea[@id='Text_de']");
    public By EnterSpanish = By.xpath("//textarea[@id='Text_es']");
    public By SelectType = By.xpath("//select[@id='Type']");
    public By SelectItem = By.xpath("//select[@id='TypeId']");
    public By SelectField = By.xpath("//select[@id='FieldName']");
}
