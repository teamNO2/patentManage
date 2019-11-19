package com.suixingpay.controller;

import com.suixingpay.entities.Patent;
import com.suixingpay.service.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatentController {
    //前端页面的控制
    @Autowired
    private PatentService patentService;
    @GetMapping("/Patent")
    @ResponseBody
    public List<Patent> getPatent(){
        return patentService.getPatent();
    }
}
