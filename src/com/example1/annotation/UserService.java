package com.example1.annotation;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhongyikang
 * @create 2020-05-26 17:26
 */

@Service
public class UserService {

    @Resource(name = "userDao")
    private UserDao userDao;

    public UserService() {
        System.out.println("userService init...");
    }

    public void save() {
        userDao.save();
    }
}
