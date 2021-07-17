package com.ppp.factory.absfactory.pizzastore.order;

/**
 * @auther ppp
 * @create 2021-06-29 21:28
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new LDFactory());
    }
}
