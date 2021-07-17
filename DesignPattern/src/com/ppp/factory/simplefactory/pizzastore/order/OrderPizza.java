package com.ppp.factory.simplefactory.pizzastore.order;

import com.ppp.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @auther ppp
 * @create 2021-06-29 20:50
 */
public class OrderPizza {

    //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    //构造器
    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory){

        String orderType = "";//用户输入
        this.simpleFactory = simpleFactory;//设置简单工厂对象
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
            else{
                System.out.println(" 订购披萨失败 ");
                break;
            }

        }while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType(){

        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";

    }
}
