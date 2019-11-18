package com.suixingpay.service.serviceImpl;

import com.suixingpay.mapper.HelloMapper;
import com.suixingpay.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloMapper helloMapper;

    @Override
    public String getName(int id) {
        String name = helloMapper.getName(id);
        return name;
    }
}
