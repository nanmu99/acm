package com.ppp.factory.factorymethod.pizzastore.pizza;

/**
 * @auther ppp
 * @create 2021-06-29 21:03
 */
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        setName("北京的奶酪pizza");
        System.out.println(" 北京的奶酪pizza 准备原材料");
    }

}
