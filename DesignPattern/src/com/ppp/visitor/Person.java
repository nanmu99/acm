package com.ppp.visitor;

/**
 * @auther ppp
 * @create 2021-07-03 22:36
 */
public abstract class Person {
    //提供一个方法，让访问者可以访问
    public abstract void accept(Action action);
}
