package com.wipro.assignment1.com.wipro.assignment1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wipro")
public class BankController {

    /*
    * This method returns Bank name
    * */
    @RequestMapping("/get-bank-name")
    public String getBankName(){
        return "HSBC";
    }

    /*
     * This method returns Bank address
     * */
    @RequestMapping("/get-bank-address")
    public String getBankAddress(){
        return "Pune, Maharashtra";
    }
}
