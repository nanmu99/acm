package com.ppp.decorator;

/**
 * @auther ppp
 * @create 2021-07-01 19:44
 */
public class Decorator extends Drink {

    private Drink obj;

    public Decorator(Drink obj) {//组合
        this.obj = obj;
    }

    @Override
    public float cost() {
        // getPrice 自己价格
        return super.getPrice()+obj.getPrice();
    }

    @Override
    public String getDes() {
        return des + " " + getPrice() + " && " + obj.getDes();
    }
}
