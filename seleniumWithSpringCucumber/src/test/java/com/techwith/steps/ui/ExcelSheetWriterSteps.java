package com.techwith.steps.ui;

import com.techwith.excel.ExcelWriter;
import com.techwith.webdriver.WebDriverFactory;
import io.cucumber.java.en.Given;

public class ExcelSheetWriterSteps extends WebDriverFactory {
    @Given("Writing WorkBook")
    public void writingWorkBook() {

        ExcelWriter reader = new ExcelWriter("D:/pd/OmniParcelReturns.xlsx");
        String sheetName = "YourReturn";

        System.out.println("Cell data : " + reader.getCellData(sheetName, "orderNo", 3));
        String data = reader.getCellData(sheetName, 1, 2);
        System.out.println("Cell data : " + data);

        int rowCount = reader.getRowCount(sheetName);
        System.out.println("Total rows: " + (rowCount-1));

//        reader.addColumn(sheetName, "status");

        if(! reader.isSheetExist("Regsitration")){
            reader.addSheet("Regsitration");
        }
//        reader.removeSheet("Regsitration");

        System.out.println("Cell Row Number of given data : " + reader.getCellRowNum(sheetName, "orderNo", "SS1111"));

        reader.setCellData(sheetName, "status", 2, "PASS");

        System.out.println("Column Count : " + reader.getColumnCount(sheetName));

        reader.removeColumn(sheetName, 3);

        System.out.println("Cell data : " + reader.getCellData(sheetName, "orderNo", 2));
        System.out.println("Cell data : " + reader.getCellData(sheetName, "email", 2));


    }
}
