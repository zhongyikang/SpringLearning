package com.example1.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.naming.Name;

/**
 * @author zhongyikang
 * @create 2020-05-26 17:26
 */

@Controller
public class userAction {

    @Resource(name = "userService")
    private UserService userService;

    public userAction() {
        System.out.println("userAction init...");
    }

    public String execute() {
        userService.save();

        return null;
    }

}
