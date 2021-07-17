package com.ppp.visitor;

/**
 * @auther ppp
 * @create 2021-07-03 22:37
 */
public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
