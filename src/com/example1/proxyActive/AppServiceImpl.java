package com.example1.proxyActive;

/**
 * @author zhongyikang
 * @create 2020-05-26 15:47
 */
public class AppServiceImpl implements AppService {


    @Override
    public boolean createApp(String name) {
        System.out.println("App[" + "name" + "] has been created.");
        return true;
    }
}
