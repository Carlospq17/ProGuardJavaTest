package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ServiceImpl.DemoServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class DemoController {

    @Autowired
    DemoServiceImpl demoService;

    @GetMapping(value = { "/hola" })
    public String getHola() {
        String s = demoService.getResponse("Holas x1");
        return s;
    }

    @PostMapping(value = { "/hola" })
    public String postHola() {
        String s = demoService.getResponse("Holas x2");
        return s;
    }

}
