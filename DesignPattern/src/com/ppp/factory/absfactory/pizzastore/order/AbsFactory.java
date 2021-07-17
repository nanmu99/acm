package com.ppp.factory.absfactory.pizzastore.order;

import com.ppp.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @auther ppp
 * @create 2021-06-29 21:23
 */
//一个抽象工厂模式的抽象层(接口)
public interface AbsFactory {
    //让下面的工厂子类来 具体实现
    public Pizza createPizza(String orderType);
}
