package com.example1.proxyStatic;

/**
 * @author zhongyikang
 * @create 2020-05-26 15:40
 */
public class BusinessAgent implements Sell{
    private Sell vendor;

    //用构造器传入委托类。
    public BusinessAgent(Sell vendor) {
        this.vendor = vendor;
    }

    /*
        代理类实现了接口， 代理类实现的方法里面， 有委托类的同名方法。
        代理类的作用是， 可以在实现委托类的同时， 添加其他方法。
     */
    @Override
    public void sell() {
        System.out.println("before");
        vendor.sell();
        System.out.println("after");
    }

    @Override
    public void ad() {
        System.out.println("before");
        vendor.ad();
        System.out.println("after");
    }
}
