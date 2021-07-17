package com.ppp.factory.simplefactory.pizzastore.pizza;

/**
 * @auther ppp
 * @create 2021-06-29 20:44
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 给希腊披萨 准备原材料 ");
    }
}
