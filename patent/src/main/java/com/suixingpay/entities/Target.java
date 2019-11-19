package com.suixingpay.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Target {
    private int id;
    private String name;
    private int patentId;
}
