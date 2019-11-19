package com.suixingpay.service;

import com.suixingpay.entities.Patent;

import java.util.List;

public interface AdminService {

    public List<Patent> getCheckPatent();

    /**
     * @Description: 管理员模糊查询 Service层
     * @Param: []
     * @return: java.util.List<com.suixingpay.entities.Patent>
     * @Author: lichanghao
     * @Date: 2019/11/19
     */
    public List<Patent> getLikeSelectAll(String name, String inventorName, String caseNumber, String applyNumber, String lawStatus, String applyDate);
}
