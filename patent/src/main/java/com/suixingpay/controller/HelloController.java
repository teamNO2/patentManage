package com.suixingpay.controller;

import com.suixingpay.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello/{id}")
    public String hello(@PathVariable("id") Integer id){
        String name = helloService.getName(id);
        return name;
    }
}
