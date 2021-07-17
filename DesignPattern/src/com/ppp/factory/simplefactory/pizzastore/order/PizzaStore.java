package com.ppp.factory.simplefactory.pizzastore.order;

/**
 * @auther ppp
 * @create 2021-06-29 20:56
 */
public class PizzaStore {
    public static void main(String[] args) {
        //使用简单工厂模式
        new OrderPizza(new SimpleFactory());
        System.out.println("~~退出程序~~");
    }
}
