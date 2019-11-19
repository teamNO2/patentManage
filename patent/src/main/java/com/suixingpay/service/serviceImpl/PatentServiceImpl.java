package com.suixingpay.service.serviceImpl;

import com.suixingpay.entities.Patent;
import com.suixingpay.mapper.PatentMapper;
import com.suixingpay.service.PatentService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatentServiceImpl implements PatentService {

    @Autowired
    private PatentMapper patentMapper;
    //未被领取的方法的实现
    @Override
    public List<Patent> getPatent(){
        return patentMapper.getPatent();
    }
}
