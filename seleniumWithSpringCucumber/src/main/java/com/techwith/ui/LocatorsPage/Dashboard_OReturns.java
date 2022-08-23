package com.techwith.ui.LocatorsPage;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class Dashboard_OReturns {
    public By ClickReporting = By.xpath("//body/div[@class='container body']/div[@class='main_container']/div[@class='col-md-3 left_col']/div[@class='left_col scroll-view']/div[@id='sidebar-menu']/div[@class='menu_section active']/ul[@class='nav side-menu']/li[2]/a[1]");
    public By SelectReportingToSearch = By.xpath("//a[@href='https://test.omniparcelreturns.com/admin/returns']");

}
