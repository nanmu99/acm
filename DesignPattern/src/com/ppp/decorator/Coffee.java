package com.ppp.decorator;

/**
 * @auther ppp
 * @create 2021-07-01 19:39
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
