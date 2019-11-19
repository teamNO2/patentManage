package com.suixingpay.mapper.adminmapperimpl;

import com.suixingpay.entities.Patent;
import com.suixingpay.entities.Target;

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
        StringBuffer sql=new StringBuffer("select id,name,caseNumber,applyNumber,applyDate,inventorName,lawStatus,proposerName from Patent  where 1=1");
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
    public String likeSelectTarget(Target target, Patent patent){
        StringBuffer sql = new StringBuffer("select t.name, p.name, proposerName, inventorName, lawStatus, applyDate from Target t,Patent p where t.patentId = p.id and 1=1");
        if (!target.getName().equals("-1")){
            sql.append("  t.name like '%"+target.getName()+"%' ");
        }
        if (!patent.getName().equals("-1")){
            sql.append(" and p.name like '%"+patent.getName()+"%' ");
        }

        if (!patent.getProposerName().equals("-1")){
            sql.append(" and proposerName like '%"+patent.getProposerName()+"%' ");
        }

        if (!patent.getInventorName().equals("-1")){
            sql.append(" and inventorName like '%"+patent.getInventorName()+"%' ");
        }

        if (!patent.getLawStatus().equals("-1")){
            sql.append(" and lawStatus like '%"+patent.getLawStatus()+"%' ");
        }

        if (!patent.getApplyDate().equals(new Date(1,2,3).toString())){
            sql.append(" and applyDate like '%"+patent.getApplyDate()+"%' ");
        }
        System.out.println(sql.toString());
        return sql.toString();
    }
}