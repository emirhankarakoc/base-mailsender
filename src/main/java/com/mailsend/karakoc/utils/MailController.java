package com.mailsend.karakoc.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mail")
public class MailController {
    private final MailService service;
    @Autowired
    public MailController(MailService service) {
        this.service = service;
    }git init
    @GetMapping("/sendMailWithoutAttachment")
    public String sendMailWithoutAttachment(){
        return service.sendMail();
    }
}
