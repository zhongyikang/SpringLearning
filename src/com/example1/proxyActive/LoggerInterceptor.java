package com.example1.proxyActive;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhongyikang
 * @create 2020-05-26 15:48
 */
public class LoggerInterceptor implements InvocationHandler {

    //这个是传入的委托类。
   private AppService appService;

    public LoggerInterceptor(AppService appService) {
        this.appService = appService;
    }

    /**
     * //当Proxy返回的类调用方法的时候， 实际调用的是此方法
     * @param proxy  类本身
     * @param method 调用的方法
     * @param args 方法里面的参数
     * @return 一般是类本身， 也就是proxy
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("即将调用" + method.getName() + "方法");
        System.out.println("start...");
        Boolean res = (Boolean) method.invoke(appService, args);
        System.out.println("end...");
        return res;
    }
}
