package com.ppp.decorator;

/**
 * @auther ppp
 * @create 2021-07-01 19:45
 */
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
