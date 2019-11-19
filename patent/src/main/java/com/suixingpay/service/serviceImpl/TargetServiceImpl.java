package com.suixingpay.service.serviceImpl;

import com.suixingpay.entities.Patent;
import com.suixingpay.entities.Target;
import com.suixingpay.mapper.TargetMapper;
import com.suixingpay.service.TargetService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TargetServiceImpl implements TargetService {
    @Autowired
    private TargetMapper targetMapper;




    /**
     * @Description: 指标模糊查询：service
     * @Param: [target, patent]
     * @return: java.util.List
     * @Author: lichanghao
     * @Date: 2019/11/19
     */

    @Override
    public List getLikeSelectTarget(Target target, Patent patent) {
        return targetMapper.likeSelectTarget(target,patent);
    }
}
