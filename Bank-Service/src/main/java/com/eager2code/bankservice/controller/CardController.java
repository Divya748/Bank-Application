package com.eager2code.bankservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CardController {

    @GetMapping("/myCards")
    public String getCardDetails() {
        return "Card details";
    }
}