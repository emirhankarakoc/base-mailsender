package com.mailsend.karakoc.utils;


import jakarta.annotation.security.PermitAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service

public class MailManager implements MailService{
    private  JavaMailSender mailSender;

    @Autowired
    public MailManager(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }


    @Override
    public String sendMail() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        simpleMailMessage.setFrom("applicaion.properties dosyasina yazdiginiz mail adresini yazin. yoksa gitmez.");
        simpleMailMessage.setTo("gonderilecek kisinin mail adresi @gmail olmalidir.");
        simpleMailMessage.setText("Selamlar. bu otomatik gonderilmis bir mail adresidir.");
        simpleMailMessage.setSubject("Konu, Onemlidir.");
        mailSender.send(simpleMailMessage);



        return "Gonderildi";
    }


}
