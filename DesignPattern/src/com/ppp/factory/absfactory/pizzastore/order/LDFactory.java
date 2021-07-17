package com.ppp.factory.absfactory.pizzastore.order;

import com.ppp.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.ppp.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import com.ppp.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @auther ppp
 * @create 2021-06-29 21:25
 */
public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }

}
