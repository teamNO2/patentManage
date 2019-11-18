package com.suixingpay.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Hello {
    private int id;
    private String name;
}
