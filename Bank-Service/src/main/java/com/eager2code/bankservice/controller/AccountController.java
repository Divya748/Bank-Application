package com.eager2code.bankservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AccountController {


    /**
     * Gets the account details.
     *
     * @return the account details
     */
    @GetMapping("/myAccount")
    public String getAccountDetails() {
            return "Account details";
    }
}
