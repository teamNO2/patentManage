package com.suixingpay.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName MyMvcConfiguration
 * @Description TODO
 * @Author 孙克强
 * @Date 2019/11/19 10:43
 * @Version 1.0
 */
@Configuration
public class MyMvcConfiguration implements WebMvcConfigurer {
    public void addInterceptors(InterceptorRegistry registry) {
    }
}
