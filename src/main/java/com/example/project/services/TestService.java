package com.example.project.services;

import com.example.project.utils.TestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private static final Logger logger = LoggerFactory.getLogger(TestService.class);

    public String testFunction(String leadId) {
        logger.info("Checking palindrome for leadId: {}", leadId);
        if(TestUtils.isPalindrome(leadId))
            return "leadId is palindrome";
        return "Not palindrome";
    }

    public String getReverse(String leadId) {
        String rev = "";
        for(int i=leadId.length()-1; i>=0; i--)
            rev += leadId.charAt(i);
        return rev;
    }

}
