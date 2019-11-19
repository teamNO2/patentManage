package com.suixingpay.mapper;

import com.suixingpay.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 孙克强
 */
@Mapper
public interface UserMapper {
    @Select("select id,name,password,status from user where name = #{username} and password = #{password}")
    public User login(String username,String password);
}
