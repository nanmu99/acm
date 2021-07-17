package com.ppp.factory.factorymethod.pizzastore.order;

import com.ppp.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.ppp.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import com.ppp.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @auther ppp
 * @create 2021-06-29 21:16
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }
}
