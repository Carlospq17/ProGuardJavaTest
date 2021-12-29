package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class DemoModel {
    public DemoModel() {
    }

    private String name;
    private String lastName;
}
