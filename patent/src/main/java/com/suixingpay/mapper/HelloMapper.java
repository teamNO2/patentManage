package com.suixingpay.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.context.annotation.SessionScope;

@Mapper
public interface HelloMapper {

    @Select("")
    public int getId();
}
