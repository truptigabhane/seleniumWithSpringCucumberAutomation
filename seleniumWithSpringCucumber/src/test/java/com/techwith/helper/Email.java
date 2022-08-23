package com.techwith.helper;

import org.springframework.stereotype.Component;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.FileNotFoundException;
import java.util.Properties;

@Component
public class Email {
    public void emailSend (String to, String from, String location , String name) throws FileNotFoundException {

        GenericHelper helper=new GenericHelper();
        String html1= helper.readHtmlFile();

        final String username=helper.readJsonFile2("userManagement","userEmailSend.json","username");
        final String password = helper.readJsonFile2("userManagement","userEmailSend.json","password");

        String host = "smtp.gmail.com";

        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.smtp.auth", "true");


        Session session = Session.getInstance(props,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            // Create a default MimeMessage object.
            Message message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));


            // Set Subject: header field
            message.setSubject("Testing Subject");

            // Send the actual HTML message, as big as you like
            message.setContent(html1, "text/html");

            // Send message
            Transport.send(message);


        } catch (MessagingException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }


    }


