package com.example.demo.Service.ServiceImpl;

import com.example.demo.Model.OtherDemoModel;
import com.example.demo.Service.OtherDemoService;

import org.springframework.stereotype.Service;

@Service
public class OtherDemoServiceImpl implements OtherDemoService {

    @Override
    public String getOtherResponse(String s) {
        System.out.println(s);
        OtherDemoModel model = new OtherDemoModel();
        model.setOtherName("Carlos");
        model.setOtherLastName("Pool");
        return "This get message is other: " + model.toString();
    }

    @Override
    public String postOtherResponse(String s) {
        System.out.println(s);
        OtherDemoModel model = new OtherDemoModel();
        model.setOtherName("Carlos");
        model.setOtherLastName("Pool");
        return "This get message is other: " + model.toString();
    }

}
