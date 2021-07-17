package com.ppp.factory.simplefactory.pizzastore.order;

import com.ppp.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.ppp.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.ppp.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.ppp.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @auther ppp
 * @create 2021-06-29 20:46
 */
//简单工厂类
public class SimpleFactory {

    //更加orderType 返回对应的Pizza 对象
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工程模式");
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");

        }else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }
}
