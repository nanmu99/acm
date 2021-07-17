package com.ppp.list;

import java.util.Stack;

/**
 * @auther ppp
 * @create 2021-03-17 14:48
 */
public class TestStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.add("jack");
        stack.add("tom");
        stack.add("smith");

        //出栈
        while(stack.size()>0){
            System.out.println(stack.pop());
        }
    }

}
