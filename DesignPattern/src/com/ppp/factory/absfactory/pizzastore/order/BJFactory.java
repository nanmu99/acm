package com.ppp.factory.absfactory.pizzastore.order;

import com.ppp.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.ppp.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.ppp.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @auther ppp
 * @create 2021-06-29 21:24
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        // TODO Auto-generated method stub
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
