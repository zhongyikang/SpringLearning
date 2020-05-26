package com.example1.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhongyikang
 * @create 2020-05-26 17:26
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("com/example1/annotation/annotationConfig.xml");

        userAction userAction = (userAction) classPathXmlApplicationContext.getBean("userAction");

        System.out.println(userAction.execute());
    }
}
