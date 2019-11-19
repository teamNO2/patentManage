package com.suixingpay.entities;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Builder
public class Hello {
    private int id;
    private String name;
}
