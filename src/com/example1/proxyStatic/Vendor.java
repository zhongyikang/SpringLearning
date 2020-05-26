package com.example1.proxyStatic;

/**
 * 委托类
 * @author zhongyikang
 * @create 2020-05-26 15:39
 */
public class Vendor implements Sell{

    @Override
    public void sell() {
        System.out.println("In sell method");
    }

    @Override
    public void ad() {
        System.out.println("ad method");
    }
}
