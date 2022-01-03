package com.example.demo.Service;

import com.example.demo.dto.Model.DemoModelDto;

public interface DemoService {
    public DemoModelDto getResponse(String s);

    public String postResponse(String s);
}
