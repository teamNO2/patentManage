package com.suixingpay.controller;

import com.suixingpay.entities.Patent;
import com.suixingpay.service.AdminService;
import com.suixingpay.service.serviceImpl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private AdminServiceImpl adminServiceImpl;

    @GetMapping("/checkPatent")
    public List<Patent> checkPatent(){
        return adminService.getCheckPatent();
    }

    @PostMapping("/getAll")
    public List<Patent> getAll(@RequestBody Patent patent){
        System.out.println("10000");
        String name = patent.getName();
        if(name==null){
            name="-1";
        }
        System.out.println("20000");
        String inventorName = patent.getInventorName();
        if(inventorName==null){
            inventorName="-1";
        }
        System.out.println("30000");
        String caseNumber = patent.getCaseNumber();
        if(caseNumber==null){
            caseNumber="-1";
        }
        System.out.println("40000");
        String applyNumber = patent.getApplyNumber();
        if(applyNumber==null){
            applyNumber="-1";
        }
        System.out.println("50000");
        String lawStatus = patent.getLawStatus();
        if(lawStatus==null){
            lawStatus="-1";
        }
        System.out.println("60000");


        if(patent.getApplyDate()==null){
            patent.setApplyDate(new Date(1,2,3));
            System.out.println(patent.getApplyDate());
        }
        String applyDate = patent.getApplyDate().toString();

        System.out.println("70000");
        System.out.println(name+inventorName+caseNumber+applyNumber+lawStatus+applyDate);
        return  adminServiceImpl.getLikeSelectAll( name,  inventorName,  caseNumber,  applyNumber,  lawStatus,  applyDate);
    }
}
