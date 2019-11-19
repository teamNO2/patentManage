package com.suixingpay.service;

import com.suixingpay.entities.Patent;
import com.suixingpay.entities.Target;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TargetService {

    /**
     * @Description:
     * @Param: []
     * @return: java.util.List
     * @Author: lichanghao
     * @Date: 2019/11/19
     */
    public List getLikeSelectTarget(Target target, Patent patent);
}
