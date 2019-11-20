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

    /**
     *@ClassName ${}
     *@Description 根据状态查询待审核详细专利
     *@Author ${张佳鑫}
     *@Date ${2019.11.19} ${11:00}
     *@Version 1.0
     */
    @Override
    public List<Patent> getCheckPatent() {
        return adminMapper.getCheckPatent();
    }

    /**
     *@ClassName ${}
     *@Description 根据案件文号修改待审核专利状态
     *@Author ${张佳鑫}
     *@Date ${2019.11.19} ${11:00}
     *@Version 1.0
     * **
     */
    @Override
    //1没过 2过
    public int updateCheckPatentStatus(int a) {
        if (a==1) {
            return adminMapper.updateCheckPatentStatus();
        }else{
            if(adminMapper.getCheckPatentStatus()==0){
                return adminMapper.updateCheckPatentStatus2();
            }else{
                return adminMapper.updateCheckPatentStatus1();
            }
        }
    }



    /**
     * @Description: 管理员模糊查询：service实现
     * @Param: [patent]
     * @return: java.util.List<com.suixingpay.entities.Patent>
     * @Author: lichanghao
     * @Date: 2019/11/20
     */
    @Override
    public List<Patent> getLikeSelectAll(String name, String inventorName, String caseNumber, String applyNumber, String lawStatus, String applyDate) {
        System.out.println("1111");
        return adminMapper.likeSelectAll(name,  inventorName,  caseNumber,  applyNumber,  lawStatus,  applyDate);

    }

}
