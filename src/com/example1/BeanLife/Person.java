package com.example1.BeanLife;

/**
 * @author zhongyikang
 * @create 2020-05-24 16:38
 */
public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public void init() {
        System.out.println("Bean Person init...");
    }

    public void destory() {
        System.out.println("Bean Person destory...");
    }
}
