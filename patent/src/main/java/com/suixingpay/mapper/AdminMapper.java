package com.suixingpay.mapper;

import com.suixingpay.entities.Patent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
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
     *@Author ${张佳鑫}
     *@Date ${2019.11.19} ${11:00}
     *@Version 1.0
     */
    @Select("select id,name,proposerName,caseNumber,inventorName,applyNumber,technicalPerson,remark" +
            ",applyDate,lawStatus,patentType,status,batch from patent where status = 0 union select id," +
            "name,proposerName,caseNumber,inventorName,applyNumber,technicalPerson,remark" +
            ",applyDate,lawStatus,patentType,status,batch from patent where status = 4")
    public List<Patent> getCheckPatent();

    /**
     *@ClassName ${}
     *@Description 根据案件文号修改待审核专利状态
     *@Author ${张佳鑫}
     *@Date ${2019.11.19} ${11:00}
     *@Version 1.0
     */

    @Update("update patent set status = (status+1) where caseNumber = 0")
    public int updateCheckPatentStatus1();

    @Update("update patent set status = (status+2) where caseNumber = 0")
    public int updateCheckPatentStatus2();

    @Update("update patent set status = 1 where caseNumber = 0")
    public int updateCheckPatentStatus();

    /**
     *@ClassName ${}
     *@Description 根据案件文号查询待审核专利状态
     *@Author ${张佳鑫}
     *@Date ${2019.11.19} ${11:00}
     *@Version 1.0
     */
    @Select("Select status from patent where caeNumber = 0")
    public int getCheckPatentStatus();
}
