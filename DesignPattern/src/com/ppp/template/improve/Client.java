package com.ppp.template.improve;

/**
 * @auther ppp
 * @create 2021-07-03 22:15
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("----制作红豆豆浆----");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("----制作花生豆浆----");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

        System.out.println("----制作纯豆浆----");
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
