package com.ppp.decorator;

/**
 * @auther ppp
 * @create 2021-07-01 19:47
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDes(" 巧克力 ");
        setPrice(3.0f); // 调味品 的价格
    }
}
