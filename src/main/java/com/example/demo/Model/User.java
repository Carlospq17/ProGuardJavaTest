package com.example.demo.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class User {
    public User() {
    }

    private String user;
    private String pwd;
    private String token;

}