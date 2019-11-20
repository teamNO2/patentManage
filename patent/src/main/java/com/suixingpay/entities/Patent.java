package com.suixingpay.entities;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
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

    private int userId;

    public Patent(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Patent() {
    }

    public Patent(int id, String name, String proposerName, String caseNumber, String inventorName, String applyNumber, String technicalPerson, String remark, Date applyDate, String lawStatus, String patentType, int status, String batch,int userId) {
        this.id = id;
        this.name = name;
        this.proposerName = proposerName;
        this.caseNumber = caseNumber;
        this.inventorName = inventorName;
        this.applyNumber = applyNumber;
        this.technicalPerson = technicalPerson;
        this.remark = remark;
        this.applyDate = applyDate;
        this.lawStatus = lawStatus;
        this.patentType = patentType;
        this.status = status;
        this.batch = batch;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProposerName() {
        return proposerName;
    }

    public void setProposerName(String proposerName) {
        this.proposerName = proposerName;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getInventorName() {
        return inventorName;
    }

    public void setInventorName(String inventorName) {
        this.inventorName = inventorName;
    }

    public String getApplyNumber() {
        return applyNumber;
    }

    public void setApplyNumber(String applyNumber) {
        this.applyNumber = applyNumber;
    }

    public String getTechnicalPerson() {
        return technicalPerson;
    }

    public void setTechnicalPerson(String technicalPerson) {
        this.technicalPerson = technicalPerson;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getLawStatus() {
        return lawStatus;
    }

    public void setLawStatus(String lawStatus) {
        this.lawStatus = lawStatus;
    }

    public String getPatentType() {
        return patentType;
    }

    public void setPatentType(String patentType) {
        this.patentType = patentType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "Patent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", proposerName='" + proposerName + '\'' +
                ", caseNumber='" + caseNumber + '\'' +
                ", inventorName='" + inventorName + '\'' +
                ", applyNumber='" + applyNumber + '\'' +
                ", technicalPerson='" + technicalPerson + '\'' +
                ", remark='" + remark + '\'' +
                ", applyDate=" + applyDate +
                ", lawStatus='" + lawStatus + '\'' +
                ", patentType='" + patentType + '\'' +
                ", status=" + status +
                ", batch='" + batch + '\'' +
                ", userId=" + userId +
                '}';
    }
}
