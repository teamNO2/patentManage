package com.suixingpay.entities;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;
@Data
@Builder
public class History {
    private int id;
    private Date curDate;
    private String term;
    private String person;
}
