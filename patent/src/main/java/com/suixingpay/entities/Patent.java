package com.suixingpay.entities;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Patent {
    private int id;
    private String name;

    //申请人中文名称（撰写人）
    private String proposerName;

    //案件文号
    private String caseNumber;

    //发明人中文名称
    private String inventorName;

    //申请号
    private String applyNumber;

    //技术联系人
    private String technicalPerson;

    //备注
    private String remark;

    //申请日期
    private LocalDateTime applyDate;

    //法律状态0：发明初合1：结案2：未提交
    private int lawStatus;

    //专利类型主键id
    private int patentType;

    //0:待审核1：审核未通过2：审核通过，未认领3：已被认领 4：交底书撰写5：
    private int status;
}
