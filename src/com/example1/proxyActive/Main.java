package com.example1.proxyActive;

import java.lang.reflect.Proxy;
/**
 * 1. 动态代理的四个要素： 接口， 接口的实现类，InvocationHandler接口的实现类， Proxy代理类
 * 2. Proxy代理的主要运行规律：
 *      a. 通过newInstance()静态方法， 获取一个接口的引用。 其中有三个参数：
 *          i. 类的加载器。
 *          ii. 类的父接口。 ---返回的对象就是这个接口类型。
 *          iii. InvocationHandler接口的实现类 ---实现了invoke()方法。
 *      b. 具体运行逻辑：
 *           Proxy监控了返回的对象，当其调用方法的时候，
 *           Proxy会收集对象信息、调用方法、方法参数三个变量作为参数传入invoke方法中，
 *           invoke方法通过反射调用对应的实现类方法。
 *
 * 3. 动态代理和静态代理的区别：
 *      a. 静态代理需要更多的代理类。---同一个接口， 有n个实现类， 静态代理需要n个代理，
 *          动态代理（InvocationHandler实现类）只需要1个。静态代理的代理类数量和实现类有关，
 *          动态代理的代理类数量和接口数量有关。
 *
 *          动态代理： 代理类和委托类： 一对多； 静态： 一对一。
 *
 *      b.动态代理需要Proxy类和InvocationHandler类， Proxy通过newInstance()方法，
 *      返回一个接口的引用对象， 同时监控。当这个对象调用方法的时候，
 *      其实调用的是对应的InvocationHandler实现类的invoke()方法， 它通过反射调用实现类的方法。
 *      而静态代理是代理类和委托类实现的是同一个接口， 二者一一对应。
 *
 * 4. 动态代理和静态代理的相同点：
 *      a. 都需要接口， 和委托类。
 *      b. 代理的目的相同： 可以在委托类对应方法调用的时候， 在前后添加一些额外的操作， 如日志、记录、验证。
 *
 */



/**
 * @author zhongyikang
 * @create 2020-05-26 15:54
 */
public class Main {
    public static void main(String[] args) {
        AppServiceImpl appService = new AppServiceImpl();

        AppService instance = (AppService) Proxy.newProxyInstance(appService.getClass().getClassLoader(),
                appService.getClass().getInterfaces(),
                new LoggerInterceptor(appService));

        boolean result = instance.createApp("淘宝");
        System.out.println(result);
    }
}
