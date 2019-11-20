package com.suixingpay.controller;

import com.suixingpay.entities.Patent;
import com.suixingpay.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/checkPatent")
    public List<Patent> checkPatent(){
        return adminService.getCheckPatent();
    }
}
