package com.example1.annotation;

import org.springframework.stereotype.Repository;

/**
 * @author zhongyikang
 * @create 2020-05-26 17:26
 */

@Repository
public class UserDao {

    public UserDao() {
        System.out.println("userDao init...");
    }

    public void save() {
        System.out.println("DB:保存用户！");
    }
}
