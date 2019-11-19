package com.suixingpay.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Patent {
    private int id;
    private String name;

    //申请人中文名称（撰写人）
    private String proposerName;

    //案件文号
    private String caseNumber;

    //发明人中文名称
    private String inventorName ;

    //申请号
    private String applyNumber;

    //技术联系人
    private String technicalPerson;

    //备注
    private String remark;

    //申请日期
    private Date applyDate;

    //法律状态(直接写汉字就行)
    private String lawStatus;

    //专利类型(直接写汉字就行)
    private String patentType;

    //0:待审核1：审核未通过2：审核通过，未认领3：已被认领 4：交底书撰写5：
    private int status;

    //批次
    private String batch;


}
