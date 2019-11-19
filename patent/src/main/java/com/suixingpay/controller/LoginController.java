package com.suixingpay.controller;

import com.suixingpay.entities.User;
import com.suixingpay.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Author 孙克强
 * @Date 2019/11/19 10:56
 * @Version 1.0
 */
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    /**
     * 孙克强
     * @param user
     * @param request
     * @return
     */
    @PostMapping("/login")
    @ResponseBody
    public User login(User user, HttpServletRequest request) {
        String userName = user.getName();
        String password = user.getPassword();
        User loginUser = loginService.login(userName, password);
        request.getSession().setAttribute("user", loginUser);
        return loginUser;
    }
}
