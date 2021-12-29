package com.example.demo.Service.ServiceImpl;

import com.example.demo.Model.DemoModel;
import com.example.demo.Service.DemoService;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String getResponse(String s) {
        System.out.println(s);
        DemoModel model = new DemoModel();
        model.setName("Carlos");
        model.setLastName("Pool");
        return "This get message is: " + model.toString();
    }

    @Override
    public String postResponse(String s) {
        System.out.println(s);
        DemoModel model = new DemoModel();
        model.setName("Paulina");
        model.setLastName("Pool");
        return "This get message is: " + model.toString();
    }

}
