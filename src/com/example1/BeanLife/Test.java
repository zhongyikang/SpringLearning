package com.example1.BeanLife;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhongyikang
 * @create 2020-05-24 16:19
 */
public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanLifeConfig.xml");

        Person xiaoliu = (Person) applicationContext.getBean("liu");

        System.out.println(xiaoliu);

        applicationContext.close();
    }
}
