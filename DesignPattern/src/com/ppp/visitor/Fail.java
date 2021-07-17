package com.ppp.visitor;

/**
 * @auther ppp
 * @create 2021-07-03 22:39
 */
public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println(" 男人给的评价该歌手失败 !");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(" 女人给的评价该歌手失败 !");
    }
}
