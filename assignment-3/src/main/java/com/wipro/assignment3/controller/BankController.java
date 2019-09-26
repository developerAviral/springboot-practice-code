package com.wipro.assignment3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/wipro")
public class BankController {
    /*
     * This method returns Bank name
     * */
    @RequestMapping("/get-bank-branches")
    public String getBankName(Model model){

        List<String> branchList = new ArrayList<>();

        for(int i =0; i<10;i++){
            branchList.add("Branch-Name"+ i);
        }

        model.addAttribute("bankName","HSBC");
        model.addAttribute("branchList",branchList);



        return "bank-details";
    }

    /*
     * This method returns Bank address
     * */
    @RequestMapping("/get-bank-services")
    public String getBankAddress(Model model){

        List<String> bankServicesList = new ArrayList<>();

        for(int i =0; i<10;i++){
            bankServicesList.add("Service-"+ i);
        }

        model.addAttribute("bankName","HSBC");
        model.addAttribute("bankServicesList",bankServicesList);

        return "bank-services";
    }
}
