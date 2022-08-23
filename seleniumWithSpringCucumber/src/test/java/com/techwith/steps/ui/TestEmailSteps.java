package com.techwith.steps.ui;


import com.techwith.helper.Email;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.an.E;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class TestEmailSteps {

@Autowired
    Email email;
    @Given("Testing Email with gmail")
    public void testingEmailWithGmail(DataTable  dataTable) throws Exception {


        List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
        for (Map<String,String> mapData : data) {
            String to = mapData.get("To");
            String from = mapData.get("From");
            String location = mapData.get("Location");
            String name = mapData.get("Name");

          email.emailSend(to,from,location,name);

        }}
}

