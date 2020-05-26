package com.example1.BeanLife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author zhongyikang
 * @create 2020-05-24 18:28
 */
public class IOCPreExecution implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor tell you that "
                + beanName + " will be init...");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor tell you that "
                + beanName + " will be destory...");
        return null;
    }
}
