package com.ppp.factory.simplefactory.pizzastore.pizza;

/**
 * @auther ppp
 * @create 2021-06-29 20:43
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 给胡椒披萨准备原材料 ");
    }
}
