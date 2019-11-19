package com.suixingpay.entities;


import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Builder
public class User {
    private int id;
    private String name;
    private String password;
    private int status;
}
