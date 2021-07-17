package com.ppp.adapter.objectadapter;



/**
 * @auther ppp
 * @create 2021-06-30 19:02
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(" === 对象适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
