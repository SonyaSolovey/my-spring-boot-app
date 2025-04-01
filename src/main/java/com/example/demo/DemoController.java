package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @Autowired
    private PhoneNumberService phoneNumberService;

    @RequestMapping("/")
    public String DisplayMessage(){
        return "index.html";
    }

    @PostMapping("/submitPhoneNumber")
    @ResponseBody
    public String submitPhoneNumber(@RequestParam String phoneNumber) {
        phoneNumberService.savePhoneNumber(phoneNumber);
        return "success";
    }
}