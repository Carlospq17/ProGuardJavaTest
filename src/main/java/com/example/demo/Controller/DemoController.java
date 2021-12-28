package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(value = { "/hola" })
    public Object getHola() {
        String s = "hola";
        System.out.println(s);
        return s;
    }

}
