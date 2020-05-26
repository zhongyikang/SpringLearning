package com.example1.proxyStatic;

/**
 * @author zhongyikang
 * @create 2020-05-26 15:45
 */
public class Main {
    public static void main(String[] args) {
        BusinessAgent agent = new BusinessAgent(new Vendor());
        agent.sell();
        agent.ad();
    }
}
