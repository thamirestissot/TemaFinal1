package com.cloud.desafioFinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/desafioFinal")
public class MensagemController {

    @Autowired
    private MensagemService service;

    @GetMapping("/")
    public ResponseEntity getMensagem() {
        return ResponseEntity.ok(service.getMensagem());
    }
}