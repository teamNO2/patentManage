package com.suixingpay.entities;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Document {
    private int id;
    private int documentType;
    private Date curDate;
    private String documentPath;

    public Document() {
    }

    public Document(int id, int documentType, Date curDate, String documentPath) {
        this.id = id;
        this.documentType = documentType;
        this.curDate = curDate;
        this.documentPath = documentPath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDocumentType() {
        return documentType;
    }

    public void setDocumentType(int documentType) {
        this.documentType = documentType;
    }

    public Date getCurDate() {
        return curDate;
    }

    public void setCurDate(Date curDate) {
        this.curDate = curDate;
    }

    public String getDocumentPath() {
        return documentPath;
    }

    public void setDocumentPath(String documentPath) {
        this.documentPath = documentPath;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", documentType=" + documentType +
                ", curDate=" + curDate +
                ", documentPath='" + documentPath + '\'' +
                '}';
    }
}
