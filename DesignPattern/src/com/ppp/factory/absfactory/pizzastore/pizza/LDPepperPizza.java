package com.ppp.factory.absfactory.pizzastore.pizza;

/**
 * @auther ppp
 * @create 2021-06-29 21:04
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        setName("伦敦的胡椒pizza");
        System.out.println(" 伦敦的胡椒pizza 准备原材料");
    }
}
