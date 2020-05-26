package com.example1.beanAsJava;

import com.example1.annotation.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestConstructor;

/**
 * @author zhongyikang
 * @create 2020-05-26 18:38
 */

//用此注释加载配置类的信息
@ContextConfiguration(classes = Configuration.class)
public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext cpxa = new ClassPathXmlApplicationContext("com/example1/beanAsJava/beanAsJava.xml");

        UserDao userDao = (UserDao) cpxa.getBean("userDao1");
        System.out.println("OK");
        System.out.println(userDao);

    }
}
