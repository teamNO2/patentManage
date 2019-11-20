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

    /**
     *@ClassName ${}
     *@Description 根据状态查询待审核详细专利
     *@Author ${张佳鑫}
     *@Date ${2019.11.19} ${11:00}
     *@Version 1.0
     */
    @GetMapping("/checkPatent")
    public List<Patent> checkPatent(){
        return adminService.getCheckPatent();
    }

    /**
     *@ClassName ${}
     *@Description 根据案件文号修改待审核详细专利
     *@Author ${张佳鑫}
     *@Date ${2019.11.19} ${11:00}
     *@Version 1.0
     * **
     */
    @GetMapping("/updatecheckPatentStatus")
    public int updateCheckPatentStatus(){return adminService.updateCheckPatentStatus(0);}

}
