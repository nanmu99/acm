package com.ppp.java1;

import java.io.Serializable;

/**
 * @auther ppp
 * @create 2021-06-27 18:11
 */
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    private void breath(){
        System.out.println("生物呼吸");
    }

    public void eat(){
        System.out.println("生物吃东西");
    }

}
