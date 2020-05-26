package com.example1.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhongyikang
 * @create 2020-05-24 16:19
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ScopeConfig.xml");

        Person liu1 = (Person) applicationContext.getBean("xiaoliu");
        Person liu2 = (Person) applicationContext.getBean("xiaoliu");

        System.out.println("-----Example one-----");
        //如果返回true，说明从IOC中获取的bean是同一个对象。
        System.out.println(liu1 == liu2);

        Person zhong1 = (Person) applicationContext.getBean("zhong");
        Person zhong2 = (Person) applicationContext.getBean("zhong");

        System.out.println("-----Example two with scope=prototype-----");
        //如果返回true，说明从IOC中获取的bean是同一个对象；反之， 多个对象
        System.out.println(zhong1 == zhong2);
    }
}
