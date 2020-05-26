package com.example1.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhongyikang
 * @create 2020-05-24 16:19
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanConfig.xml");

        Person xiaoliu = (Person) applicationContext.getBean("xiaoliu");

        System.out.println(xiaoliu);
    }
}
