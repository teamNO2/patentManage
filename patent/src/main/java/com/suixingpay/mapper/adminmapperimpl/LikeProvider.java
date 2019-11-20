package com.suixingpay.mapper.adminmapperimpl;

import java.util.Date;

/**
 * @Description: 拼接模糊查询字符串
 * @Param: [name, inventorName, caseNumber, applyNumber, lawStatus, applyDate]
 * @return: java.lang.String
 * @Author: lichanghao
 * @Date: 2019/11/19
 */
public class LikeProvider {
    public String likeSelectAll(String name, String inventorName, String caseNumber, String applyNumber, String lawStatus, String applyDate){
        System.out.println("开始查询");
        StringBuffer sql=new StringBuffer("select id,name,caseNumber,applyNumber,applyDate,inventorName,lawStatus,proposerName from Patent  where ");
        if (!name.equals("-1")){
            sql.append("  name like '%"+name+"%' ");
        }
        if (!inventorName.equals("-1")){
            sql.append(" and inventorName like '%"+inventorName+"%' ");
        }

        if (!caseNumber.equals("-1")){
            sql.append(" and caseNumber like '%"+caseNumber+"%' ");
        }

        if (!applyNumber.equals("-1")){
            sql.append(" and applyNumber like '%"+applyNumber+"%' ");
        }

        if (!lawStatus.equals("-1")){
            sql.append(" and lawStatus like '%"+lawStatus+"%' ");
        }

        if (!applyDate.equals(new Date(1,2,3).toString())){
            sql.append(" and applyDate like '%"+applyDate+"%' ");
        }
        System.out.println(sql.toString());
        return sql.toString();
    }
}