package com.ppp.adapter.classadapter;

/**
 * @auther ppp
 * @create 2021-06-30 18:55
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(" === 类适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
