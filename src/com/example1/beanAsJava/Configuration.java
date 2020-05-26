package com.example1.beanAsJava;

import com.example1.annotation.UserDao;
import org.springframework.context.annotation.Bean;

/**
 * @author zhongyikang
 * @create 2020-05-26 18:36
 */
//使用Configuration配置的就是配置类
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public UserDao userDao1() {
        UserDao dao = new UserDao();
        System.out.println("我是在Configuration中配置的" + dao);
        return dao;
    }

}
