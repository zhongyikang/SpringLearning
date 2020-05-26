package com.example1.externalPropertiesFile;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * 创建数据库连接
 * @author zhongyikang
 * @create 2020-05-24 17:02
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cax
                = new ClassPathXmlApplicationContext("externalPFConfig.xml");
        DataSource source = (DataSource) cax.getBean("dataSource");
        System.out.println("OK");
        try {
            System.out.println(source.getConnection());
        } catch (SQLException e) {
            System.out.println("wrong");
            e.printStackTrace();
        }

    }
}
