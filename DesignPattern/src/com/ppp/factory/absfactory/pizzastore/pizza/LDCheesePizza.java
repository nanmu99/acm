package com.ppp.factory.absfactory.pizzastore.pizza;

/**
 * @auther ppp
 * @create 2021-06-29 21:04
 */
public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        setName("伦敦的奶酪pizza");
        System.out.println(" 伦敦的奶酪pizza 准备原材料");
    }
}
