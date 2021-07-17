package com.ppp.interpreter;

import java.util.HashMap;

/**
 * 变量的解释器
 * @auther ppp
 * @create 2021-07-05 21:34
 */
public class VarExpression extends Expression {

    private String key; // key=a,key=b,key=c

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
