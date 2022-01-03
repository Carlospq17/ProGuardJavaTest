package com.example.demo.Service.ServiceImpl;

import com.example.demo.Service.DemoService;
import com.example.demo.dto.Model.DemoModelDto;
import com.example.demo.Model.DemoModel;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public DemoModelDto getResponse(String s) {
        System.out.println(s);
        DemoModel model = new DemoModel("Carlos", "Pool");
        DemoModelDto dto = new DemoModelDto();
        dto.setName(model.getName());
        dto.setLastName(model.getLastName());
        System.out.println("Objeto: " + dto.toString());
        return dto;
    }

    @Override
    public String postResponse(String s) {
        System.out.println(s);
        DemoModelDto model = new DemoModelDto();
        model.setName("Paulina");
        model.setLastName("Pool");
        return "This get message is: " + model.toString();
    }

}
