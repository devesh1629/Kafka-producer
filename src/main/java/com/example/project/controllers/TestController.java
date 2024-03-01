package com.example.project.controllers;

import com.example.project.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class TestController {

//    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService testService;

    @PostMapping(value = "/leads/{leadId}")
    public String testPalindrome(@PathVariable(value = "leadId") String leadId) {
        return testService.testFunction(leadId);
    }

    @GetMapping(value = "/getLeads/{leadId}")
    public String getReverse(@PathVariable(value = "leadId") String leadId) {
        return testService.getReverse(leadId);
    }



}
