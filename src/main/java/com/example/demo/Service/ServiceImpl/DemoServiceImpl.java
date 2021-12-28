package com.example.demo.Service.ServiceImpl;

import com.example.demo.Service.DemoService;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String getResponse(String s) {
        System.out.println(s);
        return "This get message is: " + s;
    }

    @Override
    public String postResponse(String s) {
        System.out.println(s);
        return "This post message is: " + s;
    }

}
