package com.suixingpay.service.serviceImpl;

import com.suixingpay.entities.Patent;
import com.suixingpay.mapper.AdminMapper;
import com.suixingpay.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public List<Patent> getCheckPatent() {
        return adminMapper.getCheckPatent();
    }

    @Override
    public List<Patent> getLikeSelectAll(String name, String inventorName, String caseNumber, String applyNumber, String lawStatus, String applyDate) {
        System.out.println("1111");
        return adminMapper.likeSelectAll(name,inventorName,caseNumber,applyNumber,lawStatus,applyDate);

    }
}
