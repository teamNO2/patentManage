package com.suixingpay.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.annotation.SessionScope;

@Mapper
public interface HelloMapper {

    @Select("select name from user where id = #{id}")
    public String getName(int id);
}
