package com.suixingpay.mapper;

import com.suixingpay.entities.Patent;
import com.suixingpay.mapper.adminmapperimpl.LikeProvider;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.Mapping;

import java.util.ArrayList;
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
     * **
     */

    @Update("update patent set status = (status+1) where caseNumber = 0")
    public int updateCheckPatentStatus1();

    @Update("update patent set status = (status+2) where caseNumber = 0")
    public int updateCheckPatentStatus2();

    @Update("update patent set status = 1 where caseNumber = 0")
    public int updateCheckPatentStatus();




    /**
     * @Description: 管理员模糊查询
     * @Param: [name, inventorName, caseNumber, applyNumber, lawStatus, applyDate]
     * @return: java.util.List<com.suixingpay.entities.Patent>
     * @Author: lichanghao
     * @Date: 2019/11/19
     */
    @SelectProvider(type = LikeProvider.class,method = "likeSelectAll")
    List<Patent> likeSelectAll(String name, String inventorName, String caseNumber, String applyNumber, String lawStatus, String applyDate);




    /**
     *@ClassName ${}
     *@Description 根据案件文号查询待审核专利状态
     *@Author ${张佳鑫}
     *@Date ${2019.11.19} ${11:00}
     *@Version 1.0
     */
    @Select("Select status from patent where caeNumber = 0")
    public int getCheckPatentStatus();

   /**
   * @Description: 管理页面展示所有的专利信息
   * @Param: []
   * @return: java.util.List<com.suixingpay.entities.Patent>
   * @Author: 文状
   * @Date: 2019/11/20
   */
    @Select("select id,name,caseNumber,applyNumber,applyDate,inventorName," +
            "lawStatus,proposerName from patent where status=2 or status=3" +
            " order by status asc")
    public List<Patent> getAllPatent();






}
