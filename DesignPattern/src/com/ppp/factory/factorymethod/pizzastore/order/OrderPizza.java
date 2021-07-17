package com.ppp.factory.factorymethod.pizzastore.order;



import com.ppp.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @auther ppp
 * @create 2021-06-29 21:06
 */
public abstract class OrderPizza {
    //定义一个抽象方法，createPizza，让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    //构造器
    public OrderPizza(){
        Pizza pizza = null;
        String orderType;//订购披萨的类型
        do{
            orderType = getType();
            pizza = createPizza(orderType);
            if (pizza != null){
                //输出pizza 制作过程
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                break;
            }

        }while (true);

    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
