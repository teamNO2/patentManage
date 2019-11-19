package com.suixingpay.service.serviceImpl;

import com.suixingpay.entities.User;
import com.suixingpay.mapper.UserMapper;
import com.suixingpay.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName LoginServiceImpl
 * @Description TODO
 * @Author sunkeqiang
 * @Date 2019/11/19 11:17
 * @Version 1.0
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String username, String password) {
        User user = userMapper.login(username, password);
        return user;
    }
}
