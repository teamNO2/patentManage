package com.suixingpay.mapper;

import com.suixingpay.entities.Patent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

/**
 * @Description: 管理员mapper层
 * @Param:
 * @return:
 * @Author: lichanghao
 * @Date: 2019/11/19
 */
@Mapper
public interface AdminMapper {

    /**
     *@ClassName ${}
     *@Description 根据状态查询待审核详细专利
     *@Author ${zhangjiaxin}
     *@Date ${2019.11.19} ${11:00}
     *@Version 1.0
     */
    @Select("select id,name,proposerName,caseNumber,inventorName,applyNumber,technicalPerson,remark" +
            ",applyDate,lawStatus,patentType,status,batch from patent where status = 0 union select id," +
            "name,proposerName,caseNumber,inventorName,applyNumber,technicalPerson,remark" +
            ",applyDate,lawStatus,patentType,status,batch from patent where status = 4")
    public List<Patent> getCheckPatent();

}
