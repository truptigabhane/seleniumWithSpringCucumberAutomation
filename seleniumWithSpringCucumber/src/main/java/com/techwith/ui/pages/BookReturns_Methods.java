package com.techwith.ui.pages;

import com.techwith.ui.models.BookReturns_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class BookReturns_Methods {

    @Autowired
    public BookReturns_Model bookReturnsModel;

    public void SearchAndSelectRetailer(String retailerName) {
        bookReturnsModel.SearchWithRetailerName(retailerName);
        if (Objects.equals(retailerName, "Seko Demo Store")) {
            bookReturnsModel.ClickOnSekoDemoStore_41();
        }
    }

}
