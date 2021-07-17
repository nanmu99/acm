package com.ppp.template.improve;

/**
 * @auther ppp
 * @create 2021-07-03 22:14
 */
public class PureSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        //空实现
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
