package com.suixingpay.entities;


import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Patent {
    private int id;
    private String name;

    //
    private String proposerName;

    //
    private String caseNumber;

    //
    private String inventorName ;
    private String applyNumber;
    private String technicalPerson;
    private String remark;
    private Date applyDate;
    private String lawStatus;
    private String patentType;
    private int status;
    private String batch;


}
