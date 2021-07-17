package com.ppp.factory.factorymethod.pizzastore.order;

/**
 * @auther ppp
 * @create 2021-06-29 21:17
 */
public class PizzaStore {
    public static void main(String[] args) {
        String loc = "bj";
        if (loc.equals("bj")) {
            //创建北京口味的各种Pizza
            new BJOrderPizza();
        } else {
            //创建伦敦口味的各种Pizza
            new LDOrderPizza();
        }
    }
}
