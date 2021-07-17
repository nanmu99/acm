package com.ppp.decorator;

/**
 * @auther ppp
 * @create 2021-07-01 19:46
 */
public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDes(" 豆浆  ");
        setPrice(1.5f);
    }
}
