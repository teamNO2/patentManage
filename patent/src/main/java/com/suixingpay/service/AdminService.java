package com.suixingpay.service;

import com.suixingpay.entities.Patent;

import java.util.List;

public interface AdminService {

    /**
     *@ClassName ${}
     *@Description 根据状态查询待审核详细专利
     *@Author ${张佳鑫}
     *@Date ${2019.11.19} ${11:00}
     *@Version 1.0
     */
    public List<Patent> getCheckPatent();
    /**
     *@ClassName ${}
     *@Description 根据案件文号修改待审核专利状态
     *@Author ${张佳鑫}
     *@Date ${2019.11.19} ${11:00}
     *@Version 1.0
     */
    public int updateCheckPatentStatus(int a);
    

}
