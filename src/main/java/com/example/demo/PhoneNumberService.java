package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneNumberService {

    @Autowired
    private PhoneNumberRepository phoneNumberRepository;

    public PhoneNumber savePhoneNumber(String number) {
        PhoneNumber phoneNumber = new PhoneNumber(number);
        return phoneNumberRepository.save(phoneNumber);
    }
}