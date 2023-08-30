package com.test.sprongboot.catalogo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class WhatsAppController {

    @GetMapping("/whatsapp-link")
    public ResponseEntity<String> getWhatsAppLink() {
        String phoneNumber = "TU_NUMERO_DE_TELEFONO";
        String whatsappLink = "https://api.whatsapp.com/send?phone=" + phoneNumber;
        return ResponseEntity.ok(whatsappLink);
    }
}
