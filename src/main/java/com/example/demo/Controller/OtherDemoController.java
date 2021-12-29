package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.OtherDemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class OtherDemoController {

    @Autowired
    OtherDemoService otherdemoService;

    @GetMapping(value = { "/otherHola" })
    public String getHola() {
        String s = otherdemoService.getOtherResponse("Other Holas x1");
        return s;
    }

    @PostMapping(value = { "/otherHola" })
    public String postHola() {
        String s = otherdemoService.postOtherResponse("Other Holas x2");
        return s;
    }

}
