package com.ppp.template;

/**
 * @auther ppp
 * @create 2021-07-03 22:10
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("----制作红豆豆浆----");
        RedBeanSoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("----制作花生豆浆----");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

    }
}
