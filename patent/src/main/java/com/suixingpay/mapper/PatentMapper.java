package com.suixingpay.mapper;

import com.suixingpay.entities.Patent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
/*
    Author：柴宇航
    PatentMapper类代表查询用户专利
*/

@Mapper
public interface PatentMapper {
    //查询未被领取的专利的映射
    @Select("select id,name,caseNumber,applyNumber,applyDate,inventorName,lawStatus,proposerName from patent where status=2")
    public List<Patent> getPatent();
}
