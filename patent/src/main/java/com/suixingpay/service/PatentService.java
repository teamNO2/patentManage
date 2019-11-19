package com.suixingpay.service;

import com.suixingpay.entities.Patent;

import java.util.List;

/*
* Author:柴宇航
* */
//此接口表示查询未被领取专利的方法
public interface PatentService {
    public List<Patent> getPatent();
}
