package com.suixingpay.entities;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Data
@Builder
public class Document {
    private int id;
    private int documentType;
    private Date curDate;
    private String documentPath;
}
